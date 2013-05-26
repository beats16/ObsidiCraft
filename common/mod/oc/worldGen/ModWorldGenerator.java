package mod.oc.worldGen;

import java.util.Random;

import mod.oc.block.ModBlocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class ModWorldGenerator implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.dimensionId)
        {
            case -1: generateNether(world, random, chunkX * 16, chunkZ *16);break;
            case 0 : generateSurface(world, random, chunkX * 16, chunkZ *16);break;
            case 1 : generateEnd(world, random, chunkX * 16, chunkZ *16);
            
        }
    }

    private void generateEnd(World world, Random random, int i, int j)
    {
        
    }

    private void generateSurface(World world, Random random, int i, int j)
    {
        for(int x = 0; i < 8; x++)
        {
            int xcordinate = i + random.nextInt(16);
            int ycordinate = random.nextInt(100);
            int zcordinate = j + random.nextInt(16);
            
            (new WorldGenMinable(ModBlocks.obsidianInfusedGravel.blockID, 40)).generate(world, random,xcordinate,ycordinate,zcordinate);
        }
        System.out.println("finished for loop");
    }

    private void generateNether(World world, Random random, int i, int j)
    {
        for(int x = 0; i < 8; x++)
        {
            int xcordinate = i + random.nextInt(16);
            int ycordinate = random.nextInt(60);
            int zcordinate = j + random.nextInt(16);
            
            (new WorldGenMinable(ModBlocks.obsidianInfusedGravel.blockID, 12)).generate(world, random,xcordinate,ycordinate,zcordinate);
        }
        
        
        
    }

}
