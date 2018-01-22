package com.mjr.extraplanets.planets.Kepler22b.worldgen.biome;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

import com.mjr.extraplanets.Config;
import com.mjr.extraplanets.Constants;
import com.mjr.extraplanets.blocks.ExtraPlanets_Blocks;
import com.mjr.extraplanets.planets.Kepler22b.worldgen.Kepler22bBiomes;

public class BiomeGenKepler22bGoldPlains extends Kepler22bBiomes {
	public BiomeGenKepler22bGoldPlains(BiomeProperties properties) {
		super(properties);
		Biome.registerBiome(Config.KEPLER22B_GOLD_PLAINS_BIOME_ID, Constants.TEXTURE_PREFIX + this.getBiomeName(), this);
		BiomeDictionary.addTypes(this, BiomeDictionary.Type.COLD, BiomeDictionary.Type.DRY, BiomeDictionary.Type.DENSE, BiomeDictionary.Type.LUSH);
		this.topBlock = ExtraPlanets_Blocks.GOLD_GRIT.getDefaultState();
		this.fillerBlock = ExtraPlanets_Blocks.GOLD_GRIT.getDefaultState();
		this.getBiomeDecorator().goldTreesPerChunk = 10;
		this.getBiomeDecorator().goldSpheresPerChunk = 2;
	}
}