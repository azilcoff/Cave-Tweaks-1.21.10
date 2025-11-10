package net.azilcoff.cavetweaks.item;

import net.azilcoff.cavetweaks.CaveTweaks;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import static net.azilcoff.cavetweaks.CaveTweaks.MOD_ID;

public class ModItems{

    public static <R extends Item> Item registerItem(String id, Function<Item.Settings, R> entry){
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, id), entry.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(MOD_ID, id)))));
    }

    private static Item.Settings getSwordSettings (Item.Settings settings){
        return settings.sword(ToolMaterial.DIAMOND, 3.0F, -2.4F);
    }

    public static void registerModItems(){
        CaveTweaks.LOGGER.info("Registering Mod Items For "+MOD_ID);
    }
}
