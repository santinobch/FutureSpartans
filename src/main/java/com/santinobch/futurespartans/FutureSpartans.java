package com.santinobch.futurespartans;

import com.santinobch.futurespartans.utils.LogHelper;
import com.santinobch.futurespartans.utils.ModHelper;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
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
    public static final String DEPENDENCIES = "required-after:spartanweaponry@[1.4.0,);after:futuremc@[0.2.0,)";
    public static final String MCVERSION = "[1.12.2]";
    //public static final String NETWORKCHANNEL = "swarcana";

    @Mod.Instance(MOD_ID)
    public static FutureSpartans INSTANCE;


    private static Logger logger;


    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        LogHelper.info("Starting up Spartan Weaponry Arcana!");
        ModHelper.preInit();
        LogHelper.debug(event.getModLog());

        LogHelper.debug("Finished preInit phase!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        LogHelper.debug("Finished init phase!");
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        LogHelper.debug("Finished postInit phase!");
    }
}
