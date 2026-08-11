package enter.steppenomads.creativemodetab;

import enter.steppenomads.SteppeNomads;import enter.steppenomads.item.ModItems;import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;import net.minecraft.core.Registry;import net.minecraft.core.registries.BuiltInRegistries;import net.minecraft.network.chat.Component;import net.minecraft.resources.Identifier;import net.minecraft.world.item.CreativeModeTab;import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab STEPPE_NOMAD_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(SteppeNomads.MOD_ID, "steppe_nomads_tab"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TORSYQ))
                    .title(Component.translatable("creativemodetab.steppenomads.steppe_nomads_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.TORSYQ);
                        output.accept(ModItems.FILLED_TORSYQ);
                    }).build());


    public static void registerCreativeModeTabs() {
        SteppeNomads.LOGGER.info("Registering Creative Mode Tab for " + SteppeNomads.MOD_ID);
    }
}
