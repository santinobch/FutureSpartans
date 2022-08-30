package com.santinobch.futurespartans;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = FutureSpartans.MOD_ID,
        name = FutureSpartans.NAME,
        version = FutureSpartans.VERSION,
        dependencies = FutureSpartans.DEPENDENCIES,
        acceptedMinecraftVersions = FutureSpartans.MCVERSION)
public class FutureSpartans
{
    public static final String MOD_ID = "futurespartans";
    public static final String NAME = "Future Spartans";
    public static final String VERSION = "1.0";
    public static final String DEPENDENCIES = "required-after:spartanweaponry@[1.4.0,);after:futuremc@[0.2.11,)";
    public static final String MCVERSION = "[1.12.2]";
    //public static final String NETWORKCHANNEL = "swarcana";

    @Mod.Instance(MOD_ID)
    public static FutureSpartans INSTANCE;


    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
