package nl.kingdev.basicautomation.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import nl.kingdev.basicautomation.info.Reference;

public class ItemTest extends Item {

    public ItemTest() {
        this.setRegistryName(new ResourceLocation(Reference.MODID, "test"));
        this.setUnlocalizedName(this.getRegistryName().toString());
        this.setMaxStackSize(16);
        this.setCreativeTab(CreativeTabs.REDSTONE);
    }

}
