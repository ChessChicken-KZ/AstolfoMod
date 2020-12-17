package kz.chesschicken.astolfomod.item;

import net.minecraft.item.ItemInstance;
import net.minecraft.item.armour.Armour;
import net.modificationstation.stationloader.api.client.item.ArmorTextureProvider;

public class ArmorAstolfo extends Armour implements ArmorTextureProvider {

    private static final int[] field_2086 = new int[]{3, 8, 6, 3};
    private static final int[] BASE_DURABILITY = new int[]{11, 16, 15, 13};
    public final int field_2082;
    public final int armourSlot;
    public final int field_2084;
    public final int field_2085;
    private final int type;

    public ArmorAstolfo(int id, int slot, int armorType) {
        super(id, 3, 3, slot);
        this.field_2082 = 3;
        this.armourSlot = slot;
        this.field_2085 = 3;
        this.field_2084 = field_2086[slot];
        this.setDurability(BASE_DURABILITY[slot] * 3 << 3);
        this.maxStackSize = 1;
        this.type = armorType;
    }

    @Override
    public String getChestplateModelTexture(ItemInstance itemInstance) {
        switch (type)
        {
            case 0:
                return "/assets/astolfomod/textures/armor/astolfo_armored.png";
            case 1:
                return "/assets/astolfomod/textures/armor/astolfo_lightweight.png";
            default:
                return null;
        }
    }

    @Override
    public String getOtherModelTexture(ItemInstance itemInstance) {
        switch (type)
        {
            case 0:
                return "/assets/astolfomod/textures/armor/astolfo_armored.png";
            case 1:
                return "/assets/astolfomod/textures/armor/astolfo_lightweight.png";
            default:
                return null;
        }
    }
}
