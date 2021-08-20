package kz.chesschicken.astolfomod;

import kz.chesschicken.astolfomod.item.ArmorAstolfo;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.ItemBase;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.registry.ModID;
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

    @Entrypoint.ModID
    public static ModID modID = Null.get();

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
    }

    @SuppressWarnings("unused")
    @EventListener
    public void registerTextures(TextureRegisterEvent event)
    {
        astolfo_helmet.setTexture("/assets/astolfomod/textures/item/astolfoArmored_helmet.png");
        astolfo_chestplate.setTexture("/assets/astolfomod/textures/item/astolfoArmored_chestplate.png");
        astolfo_leggings.setTexture("/assets/astolfomod/textures/item/astolfoArmored_leggings.png");
        astolfo_boots.setTexture("/assets/astolfomod/textures/item/astolfoArmored_boots.png");
        astolfo_light_helmet.setTexture("/assets/astolfomod/textures/item/astolfoArmored_helmet.png");
        astolfo_light_chestplate.setTexture("/assets/astolfomod/textures/item/astolfoArmored_chestplate.png");
        astolfo_light_leggings.setTexture("/assets/astolfomod/textures/item/astolfoArmored_leggings.png");
        astolfo_light_boots.setTexture("/assets/astolfomod/textures/item/astolfoArmored_boots.png");
    }
}
