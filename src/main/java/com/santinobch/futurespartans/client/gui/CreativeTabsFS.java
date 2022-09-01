package com.santinobch.futurespartans.client.gui;


import com.santinobch.futurespartans.FutureSpartans;
import com.santinobch.futurespartans.utils.ModHelper;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class CreativeTabsFS {

    public static final CreativeTabs TAB_SWA = new CreativeTabs(FutureSpartans.MOD_ID + ":tabBasic.name") {
        @Override @Nonnull
        public ItemStack getTabIconItem() {
            return ModHelper.getNetheriteStack();
        }
    };

}
