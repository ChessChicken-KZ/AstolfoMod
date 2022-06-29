package kz.chesschicken.astolfomod.item

import kz.chesschicken.astolfomod.ModListener
import kz.chesschicken.astolfomod.item.ArmorAstolfo.BASE_DURABILITY
import net.minecraft.item.armour.Armour
import net.modificationstation.stationapi.api.client.item.ArmourTextureProvider
import net.modificationstation.stationapi.api.registry.Identifier
import net.modificationstation.stationapi.api.template.item.armour.TemplateArmour
import net.minecraft.item.ItemInstance

object ArmorAstolfo {
  private val BASE_DURABILITY = Array[Int](11, 16, 15, 13)
}

class ArmorAstolfo(identifier: Identifier, slot: Int, armorType: Int) extends TemplateArmour(identifier, 3, 3, slot) with ArmourTextureProvider {
  this.setDurability(BASE_DURABILITY(slot) * (4 + (armorType * -1)) << 3)
  this.maxStackSize = 1

  override def getTexture(armour: Armour): Identifier = {
    armorType match {
      case 0 => Identifier.of(ModListener.publicModID, "astolfo_armored")
      case 1 => Identifier.of(ModListener.publicModID, "astolfo_lightweight")
    }
  }
}
