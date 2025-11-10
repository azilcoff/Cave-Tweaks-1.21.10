package net.azilcoff.cavetweaks.tag;

import net.azilcoff.cavetweaks.CaveTweaks;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static net.azilcoff.cavetweaks.CaveTweaks.MOD_ID;

public class ModItemTags {
    public static final TagKey<Item> AMETHYST_TOOL_MATERIALS = createTag("amethyst_tool_materials");

    private static TagKey<Item> createTag (String name){
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(CaveTweaks.MOD_ID, name));
    }

    public static void registerModItemTags(){
        CaveTweaks.LOGGER.info("Registering Mod Item Tags For "+MOD_ID);
    }
}
