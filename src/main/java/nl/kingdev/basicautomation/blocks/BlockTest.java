package nl.kingdev.basicautomation.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import nl.kingdev.basicautomation.info.Reference;

public class BlockTest extends Block {

    public BlockTest() {

        super(Material.ROCK);
        this.setRegistryName(new ResourceLocation(Reference.MODID, "blocktest"));
        this.setUnlocalizedName(this.getRegistryName().toString());
        this.setCreativeTab(CreativeTabs.REDSTONE);

    }
}
