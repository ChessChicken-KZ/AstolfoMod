package kz.chesschicken.astolfomod.item

import net.modificationstation.stationapi.api.client.gui.CustomTooltipProvider
import net.modificationstation.stationapi.api.template.item.TemplateItemBase
import net.modificationstation.stationapi.api.registry.Identifier
import net.minecraft.item.ItemInstance

class AstolfoTrapdoor(identifier: Identifier) extends TemplateItemBase(identifier) with CustomTooltipProvider {

  def getTooltip(itemInstance: ItemInstance, originalTooltip: String): Array[String] = Array[String](
    "Trap Door",
    "For obtaining astolfo gems,",
    "you need to kill any chicken",
    "with this item.",
    "Drop chance: 50%"
  )

}
