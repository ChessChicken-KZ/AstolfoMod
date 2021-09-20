package kz.chesschicken.astolfomod.block;

import net.modificationstation.stationapi.api.client.texture.atlas.Atlas;
import net.modificationstation.stationapi.api.template.item.TemplateBlock;

public class ItemAstolfoArmor extends TemplateBlock {
    
    public ItemAstolfoArmor(int i) {
        super(i);
    }

    @Override
    public int getTexturePosition(int damage) {
        return 12;
    }

    @Override
    public Atlas getAtlas() {
        return super.getAtlas();
    }
    
}
