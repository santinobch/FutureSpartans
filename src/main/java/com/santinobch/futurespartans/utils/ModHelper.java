package com.santinobch.futurespartans.utils;

import com.santinobch.futurespartans.init.ItemRegistryFS;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;


public class ModHelper {

    // External Mods
    public static final String MOD_ID_FUTUREMC = "futuremc";

    protected static boolean loadedFutureMC = false;

    public static void preInit() {
        loadedFutureMC = Loader.isModLoaded(MOD_ID_FUTUREMC);
    }

    public static boolean isFutureMCLoaded() { return loadedFutureMC; }

    public static ItemStack getNetheriteStack() {
        Item icon = ItemRegistryFS.material;
        if (ItemRegistryFS.battleaxeNetherite != null)		        icon = ItemRegistryFS.battleaxeNetherite;
        else if (ItemRegistryFS.longswordNetherite != null)		    icon = ItemRegistryFS.longswordNetherite;
        else if (ItemRegistryFS.greatswordNetherite != null)	    icon = ItemRegistryFS.greatswordNetherite;
        else if (ItemRegistryFS.daggerNetherite != null)		    icon = ItemRegistryFS.daggerNetherite;
        else if (ItemRegistryFS.katanaNetherite != null)	    	icon = ItemRegistryFS.katanaNetherite;
        else if (ItemRegistryFS.saberNetherite != null)		     	icon = ItemRegistryFS.saberNetherite;
        else if (ItemRegistryFS.rapierNetherite != null)	    	icon = ItemRegistryFS.rapierNetherite;
        else if (ItemRegistryFS.hammerNetherite != null)		    icon = ItemRegistryFS.hammerNetherite;
        else if (ItemRegistryFS.warhammerNetherite != null)		    icon = ItemRegistryFS.warhammerNetherite;
        else if (ItemRegistryFS.spearNetherite != null)			    icon = ItemRegistryFS.spearNetherite;
        else if (ItemRegistryFS.halberdNetherite != null)		    icon = ItemRegistryFS.halberdNetherite;
        else if (ItemRegistryFS.pikeNetherite != null)			    icon = ItemRegistryFS.pikeNetherite;
        else if (ItemRegistryFS.lanceNetherite != null)			    icon = ItemRegistryFS.lanceNetherite;
        else if (ItemRegistryFS.longbowNetherite != null)			icon = ItemRegistryFS.longbowNetherite;
        else if (ItemRegistryFS.crossbowNetherite != null)		    icon = ItemRegistryFS.crossbowNetherite;
        else if (ItemRegistryFS.throwingKnifeNetherite != null)	    icon = ItemRegistryFS.throwingKnifeNetherite;
        else if (ItemRegistryFS.throwingAxeNetherite != null)		icon = ItemRegistryFS.throwingAxeNetherite;
        else if (ItemRegistryFS.javelinNetherite != null)			icon = ItemRegistryFS.javelinNetherite;
        else if (ItemRegistryFS.boomerangNetherite != null)		    icon = ItemRegistryFS.boomerangNetherite;

        else if (ItemRegistryFS.maceNetherite != null)			    icon = ItemRegistryFS.maceNetherite;
        else if (ItemRegistryFS.glaiveNetherite != null)			icon = ItemRegistryFS.glaiveNetherite;
        else if (ItemRegistryFS.staffNetherite != null)			    icon = ItemRegistryFS.staffNetherite;

        return new ItemStack(icon);
    }
}
