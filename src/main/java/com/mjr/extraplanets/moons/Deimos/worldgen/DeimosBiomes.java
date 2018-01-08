package com.mjr.extraplanets.moons.Deimos.worldgen;

import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedCreeper;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedSkeleton;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedSpider;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedZombie;
import net.minecraft.world.biome.Biome;

import com.mjr.extraplanets.Constants;
import com.mjr.mjrlegendslib.world.biomes.BiomeGenBase;

public class DeimosBiomes extends BiomeGenBase {

	public static final BiomeGenBase deimos = new BiomeGenDeimos(new BiomeProperties("deimos").setBaseHeight(2.5F).setHeightVariation(0.4F).setRainfall(0.0F).setRainDisabled());

	protected DeimosBiomes(BiomeProperties properties) {
		super(properties);
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityEvolvedZombie.class, 8, 2, 3));
		this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityEvolvedSpider.class, 8, 2, 3));
		this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityEvolvedSkeleton.class, 8, 2, 3));
		this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityEvolvedCreeper.class, 8, 2, 3));
		this.setRegistryName(Constants.TEXTURE_PREFIX + this.getBiomeName());
	}

	@Override
	public float getSpawningChance() {
		return 0.01F;
	}
}
