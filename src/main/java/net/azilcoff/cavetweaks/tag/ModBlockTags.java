package net.azilcoff.cavetweaks.tag;

import net.azilcoff.cavetweaks.CaveTweaks;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static net.azilcoff.cavetweaks.CaveTweaks.MOD_ID;

public class ModBlockTags {
    public static final TagKey<Block> INCORRECT_FOR_AMETHYST_TOOL = createTag("incorrect_for_amethyst_tool");

    private static TagKey<Block> createTag (String name){
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(CaveTweaks.MOD_ID, name));
    }

    public static void registerModBlockTags(){
        CaveTweaks.LOGGER.info("Registering Mod Block Tags For "+MOD_ID);
    }
}
