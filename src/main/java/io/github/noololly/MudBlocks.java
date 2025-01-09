package io.github.noololly;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class MudBlocks {
    private static final Block MUD_BLOCK = register(
            new Block(AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.MUD)),
            "mud_block", true);

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(
                (itemGroup) -> itemGroup.add(MUD_BLOCK.asItem())
        );
    }

    private static Block register(Block block, String name, Boolean shouldRegister) {
        Identifier id = Identifier.of(Mud.MOD_ID, name);

        if (shouldRegister) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings().maxCount(64));
            Registry.register(Registries.ITEM, id, blockItem);
        }
        return Registry.register(Registries.BLOCK, id, block);
    }
}
