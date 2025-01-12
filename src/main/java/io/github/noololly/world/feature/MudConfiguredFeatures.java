package io.github.noololly.world.feature;

import io.github.noololly.Mud;
import io.github.noololly.MudBlocks;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;

public class MudConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUD_PATCH_KEY = RegistryKey.of(
            RegistryKeys.CONFIGURED_FEATURE,
            new Identifier(Mud.MOD_ID, "mud_patch"));


    public static final ConfiguredFeature<RandomPatchFeatureConfig, ?> MUD_PATCH = new ConfiguredFeature<>(
            Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32,
            6,
            2,
            (RegistryEntry<PlacedFeature>) MudPlacedFeatures.MUD_PATCH_PLACED_KEY
    )
    );

    public static void registerConfiguredFeatures() {
        // Register the configured feature with the appropriate namespace and value
        Registry.register(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Mud.MOD_ID, "mud_patch"), MUD_PATCH);
    }
}