package net.aiseff.tutorialmod.item;

import net.aiseff.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup EMERALD = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID))
            .displayName(Text.translatable("emerald_items"))
            .icon(() -> new ItemStack(ModItems.EMERALD_CRYSTAL))
            .build();
    public static void registerItemGroup(){
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
