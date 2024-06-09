package net.aiseff.tutorialmod.item;

import net.aiseff.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe",
            new PickaxeItem(ModToolMaterial.EMERALD,1, -2.8f, new FabricItemSettings()),ModItemGroup.EMERALD);
    public static final Item EMERALD_AXE = registerItem("emerald_axe",
            new AxeItem(ModToolMaterial.EMERALD,4,-3, new FabricItemSettings()),ModItemGroup.EMERALD);
    public static final Item EMERALD_SWORD = registerItem("emerald_sword",
            new SwordItem(ModToolMaterial.EMERALD,4, -2.4f, new FabricItemSettings()),ModItemGroup.EMERALD);
    public static final Item EMERALD_HOE = registerItem("emerald_hoe",
            new HoeItem(ModToolMaterial.EMERALD,-4, 0, new FabricItemSettings()),ModItemGroup.EMERALD);
    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel",
            new ShovelItem(ModToolMaterial.EMERALD,1, -3f, new FabricItemSettings()),ModItemGroup.EMERALD);

    public static final Item EMERALD_CRYSTAL = registerItem("emerald_crystal",
            new Item(new FabricItemSettings()), ModItemGroup.EMERALD);

    private static Item registerItem(String name, Item item, ItemGroup group){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TutorialMod.LOGGER.debug("Registering Mod Items for" + TutorialMod.MOD_ID);
    }
}