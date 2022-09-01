package com.santinobch.futurespartans.init;

import java.util.ArrayList;

import com.oblivioussp.spartanweaponry.item.*;
import com.santinobch.futurespartans.FutureSpartans;
import com.santinobch.futurespartans.client.gui.CreativeTabsSWA;
import com.santinobch.futurespartans.utils.LogHelper;
import com.santinobch.futurespartans.utils.ModHelper;
import com.santinobch.futurespartans.item.*;


import net.minecraft.item.Item;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import com.oblivioussp.spartanweaponry.api.SpartanWeaponryAPI;
import com.oblivioussp.spartanweaponry.api.ToolMaterialEx;
import com.oblivioussp.spartanweaponry.util.ConfigHandler;

import thedarkcolour.futuremc.item.FToolMaterial;


@EventBusSubscriber(modid = FutureSpartans.MOD_ID)
public class ItemRegistrySWA {

    public static ToolMaterialEx materialNetherite;

    public static ItemMultiSWA material = (ItemMultiSWA) new ItemMultiSWA("material", "handle_livingwood", "pole_livingwood", "handle_dreamwood", "pole_dreamwood", "crossbow_limb_dreamwood").setCreativeTab(CreativeTabsSWA.TAB_SWA);

    public static Item
            daggerNetherite,
            longswordNetherite,
            katanaNetherite,
            saberNetherite,
            rapierNetherite,
            greatswordNetherite,
            hammerNetherite,
            warhammerNetherite,
            spearNetherite,
            halberdNetherite,
            pikeNetherite,
            lanceNetherite,
            longbowNetherite,
            crossbowNetherite,
            throwingKnifeNetherite,
            throwingAxeNetherite,
            javelinNetherite,
            boomerangNetherite,
            battleaxeNetherite,
            maceNetherite,
            glaiveNetherite,
            staffNetherite,
            parryNetherite;

    public static ArrayList<Item> weapons = new ArrayList<>();

    protected static void addWeaponsToRegister(Item... weaponsToAdd) {
        for(Item weapon : weaponsToAdd) {
            if(weapon != null)
                weapons.add(weapon);
        }
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> ev) {

        if(ModHelper.isFutureMCLoaded()) {

            IForgeRegistry<Item> registry = ev.getRegistry();

            materialNetherite = new ToolMaterialEx("netherite", FToolMaterial.INSTANCE.getNETHERITE(), "ingotNetherite", FutureSpartans.MOD_ID, FToolMaterial.INSTANCE.getNETHERITE().getAttackDamage());

            registry.register(material);

            if (!ConfigHandler.disableBattleaxe) {
                battleaxeNetherite = new ItemBattleaxe("battleaxe_netherite", materialNetherite);
                addWeaponsToRegister(battleaxeNetherite);
            }

            if (!ConfigHandler.disableBoomerang && !ConfigHandler.woodenBoomerangOnly) {
                boomerangNetherite = new ItemBoomerang("boomerang_netherite", materialNetherite);
                addWeaponsToRegister(boomerangNetherite);
            }

            if (!ConfigHandler.disableCrossbow && !ConfigHandler.woodenCrossbowOnly) {
                crossbowNetherite = new ItemCrossbow("crossbow_netherite", materialNetherite);
                addWeaponsToRegister(crossbowNetherite);
            }

            if (!ConfigHandler.disableDagger) {
                daggerNetherite = new ItemDagger("dagger_netherite", materialNetherite);
                addWeaponsToRegister(daggerNetherite);
            }

            if (!ConfigHandler.disableGlaive) {
                glaiveNetherite = new ItemGlaive("glaive_netherite", materialNetherite);
                addWeaponsToRegister(glaiveNetherite);
            }

            if (!ConfigHandler.disableGreatsword) {
                greatswordNetherite = new ItemGreatsword("greatsword_netherite", materialNetherite);
                addWeaponsToRegister(greatswordNetherite);
            }

            if (!ConfigHandler.disableHalberd) {
                halberdNetherite = new ItemHalberd("halberd_netherite", materialNetherite);
                addWeaponsToRegister(halberdNetherite);
            }

            if (!ConfigHandler.disableHammer) {
                hammerNetherite = new ItemHammer("hammer_netherite", materialNetherite);
                addWeaponsToRegister(hammerNetherite);
            }

            if (!ConfigHandler.disableJavelin) {
                javelinNetherite = new ItemJavelin("javelin_netherite", materialNetherite);
                addWeaponsToRegister(javelinNetherite);
            }

            if (!ConfigHandler.disableKatana) {
                katanaNetherite = new ItemKatana("katana_netherite", materialNetherite);
                addWeaponsToRegister(katanaNetherite);
            }

            if (!ConfigHandler.disableLance) {
                lanceNetherite = new ItemLance("lance_netherite", materialNetherite);
                addWeaponsToRegister(lanceNetherite);
            }

            if (!ConfigHandler.disableLongbow && !ConfigHandler.woodenLongbowOnly) {
                longbowNetherite = new ItemLongbow("longbow_netherite", materialNetherite);
                addWeaponsToRegister(longbowNetherite);
            }

            if (!ConfigHandler.disableLongsword) {
                longswordNetherite = new ItemLongsword("longsword_netherite", materialNetherite);
                addWeaponsToRegister(longswordNetherite);
            }

            if (!ConfigHandler.disableMace) {
                maceNetherite = new ItemMace("mace_netherite", materialNetherite);
                addWeaponsToRegister(maceNetherite);
            }

            if (!ConfigHandler.disableParryingDagger) {
                parryNetherite = new ItemParryingDagger("parrying_dagger_netherite", materialNetherite);
                addWeaponsToRegister(parryNetherite);
            }

            if (!ConfigHandler.disablePike) {
                pikeNetherite = new ItemPike("pike_netherite", materialNetherite);
                addWeaponsToRegister(pikeNetherite);
            }

            if (!ConfigHandler.disableQuarterstaff) {
                staffNetherite = new ItemQuarterstaff("staff_netherite", materialNetherite);
                addWeaponsToRegister(staffNetherite);
            }

            if (!ConfigHandler.disableRapier) {
                rapierNetherite = new ItemRapier("rapier_netherite", materialNetherite);
                addWeaponsToRegister(rapierNetherite);
            }

            if (!ConfigHandler.disableSaber) {
                saberNetherite = new ItemSaber("saber_netherite", materialNetherite);
                addWeaponsToRegister(saberNetherite);
            }

            if (!ConfigHandler.disableSpear) {
                spearNetherite = new ItemSpear("spear_netherite", materialNetherite);
                addWeaponsToRegister(spearNetherite);
            }

            if (!ConfigHandler.disableThrowingAxe) {
                throwingAxeNetherite = new ItemThrowingAxe("throwing_axe_netherite", materialNetherite);
                addWeaponsToRegister(throwingAxeNetherite);
            }

            if (!ConfigHandler.disableThrowingKnife) {
                throwingKnifeNetherite = new ItemThrowingKnife("throwing_knife_netherite", materialNetherite);
                addWeaponsToRegister(throwingKnifeNetherite);
            }

            if (!ConfigHandler.disableWarhammer) {
                warhammerNetherite = new ItemWarhammer("warhammer_netherite", materialNetherite);
                addWeaponsToRegister(warhammerNetherite);
            }

            for(Item weapon : weapons) {
                registry.register(weapon);
                SpartanWeaponryAPI.addItemModelToRegistry(weapon);
            }
            LogHelper.info("Items Registered!");
        }
    }
}

