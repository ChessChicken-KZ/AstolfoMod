package kz.chesschicken.astolfomod.block

import net.minecraft.block.BlockBase
import net.minecraft.block.material.Material
import net.modificationstation.stationapi.api.block.HasCustomBlockItemFactory
import net.modificationstation.stationapi.api.registry.Identifier
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase

@HasCustomBlockItemFactory(classOf[ItemAstolfoStatue])
class AstolfoStatue(identifier: Identifier) extends TemplateBlockBase(identifier, Material.STONE) {
  this.setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F)
  this.setHardness(1.5F)
  this.setBlastResistance(10.0F)
  this.setSounds(BlockBase.PISTON_SOUNDS)

  override def isFullCube: Boolean = false

  override def isFullOpaque: Boolean = false
}
