package kz.chesschicken.astolfomod;

import kz.chesschicken.astolfomod.block.AstolfoStatue;
import kz.chesschicken.astolfomod.item.ArmorAstolfo;
import kz.chesschicken.astolfomod.item.AstolfoTrapdoor;
import kz.chesschicken.astolfomod.item.smallpage.ItemSmallPage;
import kz.chesschicken.astolfomod.player.SoundPlayerHandler;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.BlockBase;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.client.model.JsonModel;
import net.modificationstation.stationapi.api.event.entity.player.PlayerEvent;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.recipe.CraftingRegistry;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.registry.ModID;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;
import net.modificationstation.stationapi.api.template.item.TemplateItemBase;
import net.modificationstation.stationapi.api.template.item.armour.TemplateArmour;
import net.modificationstation.stationapi.api.util.Null;

public class AstolfoListener {
    public static TemplateArmour astolfo_helmet;
    public static TemplateArmour astolfo_chestplate;
    public static TemplateArmour astolfo_leggings;
    public static TemplateArmour astolfo_boots;
    public static TemplateArmour astolfo_light_helmet;
    public static TemplateArmour astolfo_light_chestplate;
    public static TemplateArmour astolfo_light_leggings;
    public static TemplateArmour astolfo_light_boots;

    public static TemplateItemBase astolfo_page;
    public static TemplateItemBase astolfo_trapdoor;
    public static TemplateItemBase astolfo_gem;

    public static TemplateBlockBase astolfo_statue;
    
    public static JsonModel astolfoStatue;

    @Entrypoint.ModID
    public static ModID modID = Null.get();

    @SuppressWarnings("unused")
    @EventListener
    public void registerBlocks(BlockRegistryEvent event) {
        astolfo_statue = new AstolfoStatue(Identifier.of(modID, "astolfo_statue")).setTranslationKey(modID, "astolfo_statue");
    }

    @SuppressWarnings("unused")
    @EventListener
    public void registerItems(ItemRegistryEvent event)
    {
        astolfo_helmet = new ArmorAstolfo(Identifier.of(modID, "astolfo_helmet"), 0, 0).setTranslationKey(modID, "astolfo_helmet");
        astolfo_chestplate = new ArmorAstolfo(Identifier.of(modID, "astolfo_chestplate"),  1, 0).setTranslationKey(modID, "astolfo_chestplate");
        astolfo_leggings = new ArmorAstolfo(Identifier.of(modID, "astolfo_leggings"),  2, 0).setTranslationKey(modID, "astolfo_leggings");
        astolfo_boots = new ArmorAstolfo(Identifier.of(modID, "astolfo_boots"),  3, 0).setTranslationKey(modID, "astolfo_boots");
        astolfo_light_helmet = new ArmorAstolfo(Identifier.of(modID, "astolfo_light_helmet"), 0, 1).setTranslationKey(modID, "astolfo_light_helmet");
        astolfo_light_chestplate = new ArmorAstolfo(Identifier.of(modID, "astolfo_light_chestplate"),  1, 1).setTranslationKey(modID, "astolfo_light_chestplate");
        astolfo_light_leggings = new ArmorAstolfo(Identifier.of(modID, "astolfo_light_leggings"),  2, 1).setTranslationKey(modID, "astolfo_light_leggings");
        astolfo_light_boots = new ArmorAstolfo(Identifier.of(modID, "astolfo_light_boots"),  3, 1).setTranslationKey(modID, "astolfo_light_boots");
        astolfo_page = new ItemSmallPage(Identifier.of(modID, "page")).setTranslationKey(modID, "page");
        astolfo_trapdoor = new AstolfoTrapdoor(Identifier.of(modID, "trap_door")).setDurability(40).setTranslationKey(modID, "trap_door");
        astolfo_gem = new TemplateItemBase(Identifier.of(modID, "trap_gem")).setTranslationKey(modID, "trap_gem");
    }

    @SuppressWarnings("unused")
    @EventListener
    public void registerTextures(TextureRegisterEvent event)
    {
        astolfo_helmet.setTexture("/assets/astolfomod/textures/item/astolfo_armored_helmet.png");
        astolfo_chestplate.setTexture("/assets/astolfomod/textures/item/astolfo_armored_chestplate.png");
        astolfo_leggings.setTexture("/assets/astolfomod/textures/item/astolfo_armored_leggings.png");
        astolfo_boots.setTexture("/assets/astolfomod/textures/item/astolfo_armored_boots.png");
        astolfo_light_helmet.setTexture("/assets/astolfomod/textures/item/astolfo_lightweight_helmet.png");
        astolfo_light_chestplate.setTexture("/assets/astolfomod/textures/item/astolfo_lightweight_chestplate.png");
        astolfo_light_leggings.setTexture("/assets/astolfomod/textures/item/astolfo_lightweight_leggings.png");
        astolfo_light_boots.setTexture("/assets/astolfomod/textures/item/astolfo_lightweight_boots.png");

        astolfo_page.setTexture("/assets/astolfomod/textures/item/astolfo_paper.png");
        astolfo_trapdoor.setTexture("/assets/astolfomod/textures/item/astolfo_trapdoor.png");
        astolfo_gem.setTexture("/assets/astolfomod/textures/item/astolfo_gem.png");
        
        astolfoStatue = new JsonModel(Identifier.of(modID, "astolfo_statue"));
    }

    @SuppressWarnings({"unused", "UnnecessaryBoxing"})
    @EventListener
    public void registerRecipes(RecipeRegisterEvent event)
    {
        switch (RecipeRegisterEvent.Vanilla.fromType(event.recipeId))
        {
            case CRAFTING_SHAPED: {
                CraftingRegistry.addShapedRecipe(new ItemInstance(astolfo_trapdoor, 1, 0), new Object[]{
                        "XXX", "UWU", "HSH",
                        Character.valueOf('X'), new ItemInstance(ItemBase.dyePowder, 1, 9),
                        Character.valueOf('U'), ItemBase.diamond,
                        Character.valueOf('W'), BlockBase.TRAPDOOR,
                        Character.valueOf('H'), ItemBase.ironIngot,
                        Character.valueOf('S'), ItemBase.bed
                });

                CraftingRegistry.addShapedRecipe(new ItemInstance(astolfo_light_helmet), new Object[]{
                        "XXX", "XWX", "HHH",
                        Character.valueOf('X'), new ItemInstance(ItemBase.dyePowder, 1, 9),
                        Character.valueOf('W'), BlockBase.WOOL,
                        Character.valueOf('H'), new ItemInstance(astolfo_gem, 1, 1)
                });

                CraftingRegistry.addShapedRecipe(new ItemInstance(astolfo_light_chestplate), new Object[]{
                        "XXX", "WWW", "HHH",
                        Character.valueOf('X'), new ItemInstance(ItemBase.dyePowder, 1, 5),
                        Character.valueOf('W'), BlockBase.WOOL,
                        Character.valueOf('H'), new ItemInstance(astolfo_gem, 1, 1)
                });

                CraftingRegistry.addShapedRecipe(new ItemInstance(astolfo_light_leggings), new Object[]{
                        "XHX", "WHW", "HWH",
                        Character.valueOf('X'), new ItemInstance(ItemBase.dyePowder, 1, 0),
                        Character.valueOf('W'), BlockBase.WOOL,
                        Character.valueOf('H'), new ItemInstance(astolfo_gem, 1, 1)
                });

                CraftingRegistry.addShapedRecipe(new ItemInstance(astolfo_light_boots), new Object[]{
                        "XHX", "HHH",
                        Character.valueOf('X'), new ItemInstance(ItemBase.dyePowder, 1, 0),
                        Character.valueOf('W'), BlockBase.WOOL,
                        Character.valueOf('H'), new ItemInstance(astolfo_gem, 1, 1)
                });

                CraftingRegistry.addShapedRecipe(new ItemInstance(astolfo_boots), new Object[]{
                        "XXX", "XWX", "XXX",
                        Character.valueOf('X'), new ItemInstance(astolfo_gem, 1, 1),
                        Character.valueOf('W'), ItemBase.ironBoots
                });

                CraftingRegistry.addShapedRecipe(new ItemInstance(astolfo_chestplate), new Object[]{
                        "XXX", "XWX", "XXX",
                        Character.valueOf('X'), new ItemInstance(astolfo_gem, 1, 1),
                        Character.valueOf('W'), ItemBase.ironChestplate
                });

                CraftingRegistry.addShapedRecipe(new ItemInstance(astolfo_leggings), new Object[]{
                        "XXX", "XWX", "XXX",
                        Character.valueOf('X'), new ItemInstance(astolfo_gem, 1, 1),
                        Character.valueOf('W'), ItemBase.ironLeggings
                });

                CraftingRegistry.addShapedRecipe(new ItemInstance(astolfo_helmet), new Object[]{
                        "XXX", "XWX", "XXX",
                        Character.valueOf('X'), new ItemInstance(astolfo_gem, 1, 1),
                        Character.valueOf('W'), ItemBase.ironHelmet
                });

                CraftingRegistry.addShapedRecipe(new ItemInstance(astolfo_page, 1, 1), new Object[]{
                        "XXX", "XWX", "XXX",
                        Character.valueOf('X'), new ItemInstance(astolfo_gem, 1, 1),
                        Character.valueOf('W'), ItemBase.paper
                });

                CraftingRegistry.addShapedRecipe(new ItemInstance(astolfo_page, 1, 3), new Object[]{
                        "XXX", "XWX", "XXX",
                        Character.valueOf('X'), ItemBase.flint,
                        Character.valueOf('W'), ItemBase.paper
                });

                break;
            }
        }
    }

    @SuppressWarnings("unused")
    @EventListener
    public void registerPlayerHandler(PlayerEvent.HandlerRegister event)
    {
        event.playerHandlers.add(new SoundPlayerHandler(event.player));
    }
}
