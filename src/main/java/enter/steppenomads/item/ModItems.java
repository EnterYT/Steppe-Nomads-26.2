package enter.steppenomads.item;

import enter.steppenomads.SteppeNomads;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item TORSYQ = registerItem("torsyq", Item::new);
    public static final TorsyqItem FILLED_TORSYQ = registerItem("filled_torsyq", TorsyqItem::new);



    private static <T extends Item> T registerItem(String name, Function<Item.Properties, T> factory) {
        return Registry.register(
                BuiltInRegistries.ITEM,
                Identifier.fromNamespaceAndPath(SteppeNomads.MOD_ID, name),
                factory.apply(new Item.Properties().setId(
                        ResourceKey.create(
                                Registries.ITEM,
                                Identifier.fromNamespaceAndPath(SteppeNomads.MOD_ID, name)
                        )
                ))
        );
    }

    public static void registerModItems() {
        SteppeNomads.LOGGER.info("Registering Mod Items for " + SteppeNomads.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(fabricCreativeModeTabOutput -> {
            fabricCreativeModeTabOutput.accept(FILLED_TORSYQ);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(fabricCreativeModeTabOutput -> {
            fabricCreativeModeTabOutput.accept(TORSYQ);
        });
    }

}
