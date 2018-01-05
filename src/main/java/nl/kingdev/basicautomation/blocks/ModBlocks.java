package nl.kingdev.basicautomation.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    private static List<Block> modBlocks = new ArrayList<>();

    public static BlockTest blockTest = new BlockTest();

    public void init() {

        for(Field blockField : ModBlocks.class.getFields()) {
            try {
                Block block = (Block) blockField.get(Block.class);
                initBlock(block);

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

    }
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(modBlocks.toArray(new Block[modBlocks.size()]));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        for(Block block : modBlocks) {
            event.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName().toString()));
        }
    }

    public void initBlock(Block block) {
        System.out.println("ModBlocks.initBlock");
        modBlocks.add(block);
    }

}
