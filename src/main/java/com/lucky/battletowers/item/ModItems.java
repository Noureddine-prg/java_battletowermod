package com.lucky.battletowers.item;

import com.lucky.battletowers.BattleTowers;
import com.lucky.battletowers.entity.ModEntityTypes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BattleTowers.MODID);

    public static final RegistryObject<Item> BATTLETOWERGOLEM_SPAWN_EGG = ITEMS.register("battle_tower_golem_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.BATTLETOWER_GOLEM, 1, 1,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
