package fr.frozerytb.tamamod;

import fr.frozerytb.tamamod.proxy.CommonProxy;
import fr.frozerytb.tamamod.utils.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.core.Logger;

@Mod(modid = Reference.MODID, name = Reference.NAME , version = Reference.VERSION )
public class Tamamod
{
    @Mod.Instance(Reference.MODID)
    public static Tamamod instance;

    @SidedProxy( clientSide = Reference.ClientProxy, serverSide = Reference.ServerProxy)
    public static CommonProxy proxy;

    public static org.apache.logging.log4j.Logger logger;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        logger = e.getModLog();

        proxy.preInit();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent e)
    {

        proxy.Init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        proxy.postInit();
    }




}
