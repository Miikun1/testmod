package org.minecraft.untitled;

import net.fabricmc.api.ModInitializer;
import org.minecraft.untitled.item.ModItems;

public class Untitled implements ModInitializer {
    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModItems.registerInventry();
    }
}
