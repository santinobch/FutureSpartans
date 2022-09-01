package com.santinobch.futurespartans.item;


import com.santinobch.futurespartans.client.gui.CreativeTabsFS;
import com.santinobch.futurespartans.utils.StringHelper;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemFS extends Item {

    public ItemFS(String unlocName) {
        super();
        this.setCreativeTab(CreativeTabsFS.TAB_SWA);
        this.setRegistryName(unlocName);
        this.setUnlocalizedName(unlocName);
    }

    @Override
    public String getUnlocalizedName()
    {
        return StringHelper.getItemUnlocalizedName(super.getUnlocalizedName());
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return StringHelper.getItemUnlocalizedName(super.getUnlocalizedName());
    }
}
