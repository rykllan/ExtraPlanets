package com.mjr.extraplanets.moons.Triton.worldgen.biomes;

import net.minecraftforge.common.BiomeDictionary;

import com.mjr.extraplanets.moons.Triton.worldgen.TritonBiomes;

public class BiomeGenTritonIceSea extends TritonBiomes {

	public BiomeGenTritonIceSea(BiomeProperties properties) {
		super(properties);
		BiomeDictionary.registerBiomeType(this, BiomeDictionary.Type.COLD, BiomeDictionary.Type.OCEAN);
	}
}
