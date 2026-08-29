package com.justin.better_gardening;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.justin.better_gardening.block.AdvancedComposterBlock;

public class BetterGardening implements ModInitializer {
	public static final String MOD_ID = "better_gardening";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Block ADVANCED_COMPOSTER = Registry.register(
			BuiltInRegistries.BLOCK,
			id("advanced_composter"),
			new AdvancedComposterBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COMPOSTER))
	);

	public static final Item ADVANCED_COMPOSTER_ITEM = Registry.register(
			BuiltInRegistries.ITEM,
			id("advanced_composter"),
			new BlockItem(ADVANCED_COMPOSTER, new Item.Properties())
	);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading Better Gardening: " + ADVANCED_COMPOSTER_ITEM.toString());

		LOGGER.info("Hello fabric!");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
