package org.minecraft.untitled.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final String MOD_ID = "untitled";
    public static ToolItem TUTRIAL_TOOL = new TutrialTool(new TutrialToolMaterial(),new Item.Settings());
    public static Item RegistryAutoAdd(String id,Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, id), item);
    }
    public static void registerItems() {
        RegistryAutoAdd(MOD_ID, TUTRIAL_TOOL);
    }
    public static void registerInventry(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> content.add(TUTRIAL_TOOL));
    }
}
