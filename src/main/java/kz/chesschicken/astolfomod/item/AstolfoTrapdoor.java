package kz.chesschicken.astolfomod.item;

import net.minecraft.item.ItemInstance;
import net.modificationstation.stationapi.api.client.gui.CustomTooltipProvider;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.item.TemplateItemBase;

public class AstolfoTrapdoor extends TemplateItemBase implements CustomTooltipProvider {
    public AstolfoTrapdoor(Identifier identifier) {
        super(identifier);
    }

    @Override
    public String[] getTooltip(ItemInstance itemInstance, String originalTooltip) {
        return new String[] {
                "Trap Door",
                "For obtaining astolfo gems,",
                "you need to kill any chicken",
                "with this item.",
                "Drop chance: 50%"
        };
    }
}
