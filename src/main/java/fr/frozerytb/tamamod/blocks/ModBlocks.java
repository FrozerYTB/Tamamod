package fr.frozerytb.tamamod.blocks;

import fr.frozerytb.tamamod.utils.Reference;
import fr.frozerytb.tamamod.blocks.ModBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class ModBlocks
{
    public static Block azurite_block;
    public static Block tamazium_block;

    public static void init()
    {
        azurite_block = ModBlock("azurite_block", Material.IRON);
        tamazium_block = ModBlock("tamazium_block", Material.IRON);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(azurite_block, tamazium_block);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                new ItemBlock(azurite_block).setRegistryName(azurite_block.getRegistryName()),
                new ItemBlock(tamazium_block).setRegistryName(tamazium_block.getRegistryName())
                );
    }

    public static void RegisterRenders(ModelRegistryEvent event)
    {
        registerRender(Item.getItemFromBlock(azurite_block));
        registerRender(Item.getItemFromBlock(tamazium_block));
    }

    private static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
