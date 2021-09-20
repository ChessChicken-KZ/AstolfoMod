package kz.chesschicken.astolfomod.block;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemInstance;
import net.modificationstation.stationapi.api.client.gui.CustomTooltipProvider;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

public class AstolfoStatue extends TemplateBlockBase implements CustomTooltipProvider {
    public AstolfoStatue(Identifier identifier) {
        super(identifier, Material.STONE);
        this.setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
    }

    @Override
    public boolean isFullCube() {
        return false;
    }

    @Override
    public boolean isFullOpaque() {
        return false;
    }

    @Override
    public String[] getTooltip(ItemInstance itemInstance, String originalTooltip) {
        return new String[] {
                "Astolfo Statue",
                "Statue: " + (itemInstance.getDamage() == 0 ? "Lightweight" : "Armored")
        };
    }
}
