package kz.chesschicken.astolfomod.item;

import net.minecraft.item.ItemInstance;
import net.modificationstation.stationapi.api.client.item.ArmorTextureProvider;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.item.armour.TemplateArmour;

public class ArmorAstolfo extends TemplateArmour implements ArmorTextureProvider {
    private final int type;
    private static final int[] BASE_DURABILITY = new int[] { 11, 16, 15, 13 };

    public ArmorAstolfo(Identifier id, int slot, int armorType) {
        super(id, 3, 3, slot);
        this.setDurability(BASE_DURABILITY[slot] * 3 << 3);
        this.maxStackSize = 1;
        this.type = armorType;
    }

    @Override
    public String getChestplateModelTexture(ItemInstance itemInstance) {
        switch (type)
        {
            case 0:
                return "/assets/astolfomod/textures/armor/astolfo_armored_2.png";
            case 1:
                return "/assets/astolfomod/textures/armor/astolfo_lightweight_2.png";
            default:
                return null;
        }
    }

    @Override
    public String getOtherModelTexture(ItemInstance itemInstance) {
        switch (type)
        {
            case 0:
                return "/assets/astolfomod/textures/armor/astolfo_armored_1.png";
            case 1:
                return "/assets/astolfomod/textures/armor/astolfo_lightweight_1.png";
            default:
                return null;
        }
    }
}
