package fr.frozerytb.tamamod.proxy;

import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerItemRenderer(Item item, int meta) {
        super.registerItemRenderer(item, meta);
    }

    @Override
    public void registerVariantRenderer(Item item, int meta, String filename, String id) {
        super.registerVariantRenderer(item, meta, filename, id);
    }

    @Override
    public void registerEntityRenderers() {
        super.registerEntityRenderers();
    }

    @Override
    public void preInit()
    {
        super.preInit();
    }
}
