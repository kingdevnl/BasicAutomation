package nl.kingdev.basicautomation;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import nl.kingdev.basicautomation.blocks.ModBlocks;
import nl.kingdev.basicautomation.info.Reference;
import nl.kingdev.basicautomation.items.ModItems;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.MODVERSION)
public class BasicAutomation {

    @Mod.Instance
    public static BasicAutomation instance;
    public ModItems modItems = new ModItems();
    public ModBlocks modBlocks = new ModBlocks();

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent e) {
        modItems.init();
        modBlocks.init();
        MinecraftForge.EVENT_BUS.register(ModItems.class);
        MinecraftForge.EVENT_BUS.register(ModBlocks.class);
    }

    @Mod.EventHandler
    public void onInit(FMLInitializationEvent e) {

    }

    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent e) {

    }




}
