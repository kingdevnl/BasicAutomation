package nl.kingdev.basicautomation.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ModItems {

    private static List<Item> modItems = new ArrayList<>();

    public static ItemTest testItem = new ItemTest();

    public void init() {

        for(Field itemField : ModItems.class.getFields()) {
            try {

                Item item = (Item) itemField.get(Item.class);
                initItem(item);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }


    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        if(modItems.size() != 0) {
            event.getRegistry().registerAll(modItems.toArray(new Item[modItems.size()]));
        }


    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {
        for (Item item: modItems)
        {
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
    }



    public void initItem(Item item) {
        modItems.add(item);


    }



}
