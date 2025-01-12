package io.github.noololly.world.feature;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class MudWorldGeneration {
    public static void generateWorldGen() {
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.RIVER),
                GenerationStep.Feature.VEGETAL_DECORATION,
                MudPlacedFeatures.MUD_PATCH_PLACED_KEY
        );
    }
}
