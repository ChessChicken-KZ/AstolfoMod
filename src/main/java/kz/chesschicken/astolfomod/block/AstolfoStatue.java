package kz.chesschicken.astolfomod.block;

import kz.chesschicken.astolfomod.AstolfoListener;
import net.minecraft.block.material.Material;
import net.minecraft.level.BlockView;
import net.modificationstation.stationapi.api.block.HasCustomBlockItemFactory;
import net.modificationstation.stationapi.api.client.model.BlockInventoryModelProvider;
import net.modificationstation.stationapi.api.client.model.BlockWorldModelProvider;
import net.modificationstation.stationapi.api.client.model.JsonModel;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

@HasCustomBlockItemFactory(ItemAstolfoStatue.class)
public class AstolfoStatue extends TemplateBlockBase implements BlockWorldModelProvider, BlockInventoryModelProvider {
    public AstolfoStatue(Identifier identifier) {
        super(identifier, Material.STONE);
        this.setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
        this.setHardness(1.5F);
        this.setBlastResistance(10.0F);
        this.setSounds(PISTON_SOUNDS);
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
    public JsonModel getCustomWorldModel(BlockView bv, int i, int i1, int i2) {
        return AstolfoListener.astolfoStatue;
    }

    @Override
    public JsonModel getInventoryModel(int i) {
        return AstolfoListener.astolfoStatue;
    }
  
}
