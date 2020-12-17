package kz.chesschicken.astolfomod;



import kz.chesschicken.astolfomod.item.ArmorAstolfo;
import net.minecraft.item.ItemBase;
import net.modificationstation.stationloader.api.client.event.texture.TextureRegister;
import net.modificationstation.stationloader.api.client.texture.TextureFactory;
import net.modificationstation.stationloader.api.client.texture.TextureRegistry;
import net.modificationstation.stationloader.api.common.config.Category;
import net.modificationstation.stationloader.api.common.config.Property;
import net.modificationstation.stationloader.api.common.event.item.ItemRegister;
import net.modificationstation.stationloader.api.common.mod.StationMod;

public class AstolfoMod implements StationMod, ItemRegister, TextureRegister
{
    public static ItemBase astolfoArmored_helmet;
    public static ItemBase astolfoArmored_chestplate;
    public static ItemBase astolfoArmored_leggings;
    public static ItemBase astolfoArmored_boots;
    public static ItemBase astolfoLightweight_helmet;
    public static ItemBase astolfoLightweight_chestplate;
    public static ItemBase astolfoLightweight_leggings;
    public static ItemBase astolfoLightweight_boots;
    @Override
    public void preInit() {
        TextureRegister.EVENT.register(this);
        ItemRegister.EVENT.register(this);
    }

    @Override
    public void registerItems() {
        Category itemIdsCategory = getDefaultConfig().getCategory("Item IDs");
        Property astolfoArmored_helmetID = itemIdsCategory.getProperty("astolfoArmored_helmet", 1000);
        Property astolfoArmored_chestplateID = itemIdsCategory.getProperty("astolfoArmored_chestplate", 1001);
        Property astolfoArmored_leggingsID = itemIdsCategory.getProperty("astolfoArmored_leggings", 1002);
        Property astolfoArmored_bootsID = itemIdsCategory.getProperty("astolfoArmored_boots", 1003);

        Property astolfoLightweight_helmetID = itemIdsCategory.getProperty("astolfoLightweight_helmet", 1004);
        Property astolfoLightweight_chestplateID = itemIdsCategory.getProperty("astolfoLightweight_chestplate", 1005);
        Property astolfoLightweight_leggingsID = itemIdsCategory.getProperty("astolfoLightweight_leggings", 1006);
        Property astolfoLightweight_bootsID = itemIdsCategory.getProperty("astolfoLightweight_boots", 1007);

        astolfoArmored_helmet = new ArmorAstolfo(astolfoArmored_helmetID.getIntValue(), 0, 0).setName("astolfoArmored_helmet");
        astolfoArmored_chestplate = new ArmorAstolfo(astolfoArmored_chestplateID.getIntValue(),  1, 0).setName("astolfoArmored_chestplate");
        astolfoArmored_leggings = new ArmorAstolfo(astolfoArmored_leggingsID.getIntValue(),  2, 0).setName("astolfoArmored_leggings");
        astolfoArmored_boots = new ArmorAstolfo(astolfoArmored_bootsID.getIntValue(),  3, 0).setName("astolfoArmored_boots");
        astolfoLightweight_helmet = new ArmorAstolfo(astolfoLightweight_helmetID.getIntValue(), 0, 1).setName("astolfoLightweight_helmet");
        astolfoLightweight_chestplate = new ArmorAstolfo(astolfoLightweight_chestplateID.getIntValue(),  1, 1).setName("astolfoLightweight_chestplate");
        astolfoLightweight_leggings = new ArmorAstolfo(astolfoLightweight_leggingsID.getIntValue(),  2, 1).setName("astolfoLightweight_leggings");
        astolfoLightweight_boots = new ArmorAstolfo(astolfoLightweight_bootsID.getIntValue(),  3, 1).setName("astolfoLightweight_boots");
    }

    @Override
    public void registerTextures() {
        astolfoArmored_helmet.setTexturePosition(TextureFactory.INSTANCE.addTexture(TextureRegistry.getRegistry("GUI_ITEMS"), "/assets/astolfomod/textures/item/astolfoArmored_helmet.png"));
        astolfoArmored_chestplate.setTexturePosition(TextureFactory.INSTANCE.addTexture(TextureRegistry.getRegistry("GUI_ITEMS"), "/assets/astolfomod/textures/item/astolfoArmored_chestplate.png"));
        astolfoArmored_leggings.setTexturePosition(TextureFactory.INSTANCE.addTexture(TextureRegistry.getRegistry("GUI_ITEMS"), "/assets/astolfomod/textures/item/astolfoArmored_leggings.png"));
        astolfoArmored_boots.setTexturePosition(TextureFactory.INSTANCE.addTexture(TextureRegistry.getRegistry("GUI_ITEMS"), "/assets/astolfomod/textures/item/astolfoArmored_boots.png"));
        astolfoLightweight_helmet.setTexturePosition(TextureFactory.INSTANCE.addTexture(TextureRegistry.getRegistry("GUI_ITEMS"), "/assets/astolfomod/textures/item/astolfoArmored_helmet.png"));
        astolfoLightweight_chestplate.setTexturePosition(TextureFactory.INSTANCE.addTexture(TextureRegistry.getRegistry("GUI_ITEMS"), "/assets/astolfomod/textures/item/astolfoArmored_chestplate.png"));
        astolfoLightweight_leggings.setTexturePosition(TextureFactory.INSTANCE.addTexture(TextureRegistry.getRegistry("GUI_ITEMS"), "/assets/astolfomod/textures/item/astolfoArmored_leggings.png"));
        astolfoLightweight_boots.setTexturePosition(TextureFactory.INSTANCE.addTexture(TextureRegistry.getRegistry("GUI_ITEMS"), "/assets/astolfomod/textures/item/astolfoArmored_boots.png"));
    }
}
