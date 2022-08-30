package com.santinobch.futurespartans.utils;

import java.util.ArrayList;
import java.util.List;

import com.santinobch.futurespartans.FutureSpartans;

import com.santinobch.futurespartans.init.ItemRegistrySWA;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;


public class ModHelper {

    // External Mods
    public static final String MOD_ID_FUTUREMC = "futuremc";

    protected static boolean loadedFutureMC = false;

    public static void preInit() {
        loadedFutureMC = Loader.isModLoaded(MOD_ID_FUTUREMC);
    }

    public static boolean isFutureMCLoaded() { return loadedFutureMC; }

    public static ItemStack getTerrasteelStack() {
        Item icon = ItemRegistrySWA.material;
        if (ItemRegistrySWA.longswordTerrasteel != null)			icon = ItemRegistrySWA.longswordTerrasteel;
        else if (ItemRegistrySWA.greatswordTerrasteel != null)		icon = ItemRegistrySWA.greatswordTerrasteel;
        else if (ItemRegistrySWA.daggerTerrasteel != null)			icon = ItemRegistrySWA.daggerTerrasteel;
        else if (ItemRegistrySWA.katanaTerrasteel != null)			icon = ItemRegistrySWA.katanaTerrasteel;
        else if (ItemRegistrySWA.saberTerrasteel != null)			icon = ItemRegistrySWA.saberTerrasteel;
        else if (ItemRegistrySWA.rapierTerrasteel != null)			icon = ItemRegistrySWA.rapierTerrasteel;
        else if (ItemRegistrySWA.hammerTerrasteel != null)			icon = ItemRegistrySWA.hammerTerrasteel;
        else if (ItemRegistrySWA.warhammerTerrasteel != null)		icon = ItemRegistrySWA.warhammerTerrasteel;
        else if (ItemRegistrySWA.spearTerrasteel != null)			icon = ItemRegistrySWA.spearTerrasteel;
        else if (ItemRegistrySWA.halberdTerrasteel != null)			icon = ItemRegistrySWA.halberdTerrasteel;
        else if (ItemRegistrySWA.pikeTerrasteel != null)			icon = ItemRegistrySWA.pikeTerrasteel;
        else if (ItemRegistrySWA.lanceTerrasteel != null)			icon = ItemRegistrySWA.lanceTerrasteel;
        else if (ItemRegistrySWA.longbowTerrasteel != null)			icon = ItemRegistrySWA.longbowTerrasteel;
        else if (ItemRegistrySWA.crossbowTerrasteel != null)		icon = ItemRegistrySWA.crossbowTerrasteel;
        else if (ItemRegistrySWA.throwingKnifeTerrasteel != null)	icon = ItemRegistrySWA.throwingKnifeTerrasteel;
        else if (ItemRegistrySWA.throwingAxeTerrasteel != null)		icon = ItemRegistrySWA.throwingAxeTerrasteel;
        else if (ItemRegistrySWA.javelinTerrasteel != null)			icon = ItemRegistrySWA.javelinTerrasteel;
        else if (ItemRegistrySWA.boomerangTerrasteel != null)		icon = ItemRegistrySWA.boomerangTerrasteel;
        else if (ItemRegistrySWA.battleaxeTerrasteel != null)		icon = ItemRegistrySWA.battleaxeTerrasteel;
        else if (ItemRegistrySWA.maceTerrasteel != null)			icon = ItemRegistrySWA.maceTerrasteel;
        else if (ItemRegistrySWA.glaiveTerrasteel != null)			icon = ItemRegistrySWA.glaiveTerrasteel;
        else if (ItemRegistrySWA.staffTerrasteel != null)			icon = ItemRegistrySWA.staffTerrasteel;

        return new ItemStack(icon);
    }
}
