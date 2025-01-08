package io.github.noololly;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MudItems {
    public static final Item MUD = register(new Item(new Item.Settings().maxCount(64)), "mud");

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> itemGroup.add(MudItems.MUD));
    }

    public static Item register(Item item, String id) {
        //Creates identifier for the item
        Identifier itemID = Identifier.of(Mud.MOD_ID, id);

        //Register and return the item
        return Registry.register(Registries.ITEM, itemID, item);
    }
}
