package kz.chesschicken.astolfomod.block;

import net.minecraft.item.ItemInstance;
import net.modificationstation.stationapi.api.client.gui.CustomTooltipProvider;
import net.modificationstation.stationapi.api.template.item.TemplateBlock;

public class ItemAstolfoStatue extends TemplateBlock implements CustomTooltipProvider {
    
    public ItemAstolfoStatue(int i) {
        super(i);
    }

    @Override
    public String[] getTooltip(ItemInstance itemInstance, String originalTooltip) {
        return new String[]{
            "Astolfo Statue",
            "Statue: " + (itemInstance.getDamage() == 0 ? "Lightweight" : "Armored")
        };
    }
    
}
