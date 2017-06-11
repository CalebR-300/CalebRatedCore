package calebR.calebratedcore.worldgen;

import java.util.Random;

import calebR.calebratedcore.blocks.BlockOreBasic;
import calebR.calebratedcore.init.ModBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGen implements IWorldGenerator {


	//Copy line for each Block in OreGen
	private WorldGenerator zincOverworld;
	
	public OreGen(){
		//This line determines vein size - needed for each ore
		zincOverworld = new WorldGenMinable(ModBlocks.oreZinc.getDefaultState(),8);
	}
		//These blocks handle the generation, and prevent the world height limits being exceeded
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int ChancestoSpawn, int minHeight, int maxHeight) {
	if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
		throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	
    int heightDiff = maxHeight - minHeight + 1;
    for (int i = 0; i < ChancestoSpawn; i ++) {
        int x = chunk_X * 16 + rand.nextInt(16);
        int y = minHeight + rand.nextInt(heightDiff);
        int z = chunk_Z * 16 + rand.nextInt(16);
        generator.generate(world, rand, new BlockPos(x, y, z));
	}
}
	
	//Below needs to be run for each ore
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()){
		 //0=Overworld, 1=End -1=Nether
		case 0:
			//Last three digits - chances to spawn per chunk, minHeight, maxHeight
			this.runGenerator(zincOverworld, world, random, chunkX, chunkZ, 20, 40, 72);
		}
	}

}
