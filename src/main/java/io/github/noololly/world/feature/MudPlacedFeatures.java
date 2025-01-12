package io.github.noololly.world.feature;

import io.github.noololly.Mud;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;

import java.util.List;

public class MudPlacedFeatures {
    public static final RegistryKey<PlacedFeature> MUD_PATCH_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Mud.MOD_ID, "mud_patch_placed"));


    public static RegistryKey<?> getRegistryEntry(RegistryKey<?> registryKey, Registry<?> registry) {
        return registry.getEntry(registryKey);
}