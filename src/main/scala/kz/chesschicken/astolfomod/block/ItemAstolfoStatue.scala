package kz.chesschicken.astolfomod.block

import net.minecraft.item.ItemInstance
import net.modificationstation.stationapi.api.client.gui.CustomTooltipProvider
import net.modificationstation.stationapi.api.template.item.TemplateBlock

class ItemAstolfoStatue(i: Int) extends TemplateBlock(i) with CustomTooltipProvider {
  override def getTooltip(itemInstance: ItemInstance, originalTooltip: String): Array[String] = Array[String](
    "Astolfo Statue",
    "Statue: " + (if (itemInstance.getDamage == 0) "Lightweight" else "Armored")
  )
}
