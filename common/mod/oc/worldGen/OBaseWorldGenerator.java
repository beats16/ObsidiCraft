package mod.oc.worldGen;

import java.util.Random;

import mod.oc.lib.BlockIDs;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OBaseWorldGenerator implements IWorldGenerator
{
    public OBaseWorldGenerator()
    {
        obsidianGravel = new WorldGenMinable(BlockIDs.obsdianGravel, 3, 8, Block.stone.blockID);
    }
    
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        if(world.provider.isSurfaceWorld())
        {
            generateOre(random, chunkX * 16, chunkZ * 16, world);
        }
    
    }
    
    public void generateOre(Random random, int xChunk, int zChunk, World world)
    {
        int xPos, yPos, zPos;
        
        for (int q = 0; q <= 12; q++)
        {
            xPos = xChunk + random.nextInt(16);
            yPos = 20 + random.nextInt(60 - 20);
            zPos = zChunk + random.nextInt(16);
            obsidianGravel.generate(world, random, xPos, yPos, zPos);
        }
    }
    
WorldGenMinable obsidianGravel;
}
