package me.froggyspk.myfirstmod.item;

import me.froggyspk.myfirstmod.MyFirstMod;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Optional;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MyFirstMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> AMONG_US = ITEMS.register("among_us",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(10)
                    .saturationModifier(0.5f)
                    .alwaysEdible()
                    .build())));

    public static final DeferredItem<Item> COOKED_AMONG_US = ITEMS.register("cooked_among_us",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(20)
                    .saturationModifier(0.5f)
                    .alwaysEdible()
                    .effect(() -> new MobEffectInstance(MobEffects.DARKNESS, 200, 2), 0.5f)
                    .build())));
}