package enter.steppenomads;

import enter.steppenomads.creativemodetab.ModCreativeModeTab;
import enter.steppenomads.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SteppeNomads implements ModInitializer {
	public static final String MOD_ID = "steppenomads";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModCreativeModeTab.registerCreativeModeTabs();

		ModItems.registerModItems();
	}



	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
