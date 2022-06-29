package kz.chesschicken.astolfomod.player

import kz.chesschicken.astolfomod.ModListener
import net.minecraft.entity.player.PlayerBase
import net.minecraft.item.ItemInstance
import net.modificationstation.stationapi.api.entity.player.PlayerHandler

class SoundPlayerHandler(playerBase: PlayerBase) extends Object with PlayerHandler {

  private def canAstolfoSay(itemInstances: Array[ItemInstance]): Boolean = {
    if (itemInstances(3) != null)
      return itemInstances(3).itemId == ModListener.astolfo_light_helmet.id || itemInstances(3).itemId == ModListener.astolfo_helmet.id
    false
  }

  override def getHurtSound(previous: String): String = {
    if (canAstolfoSay(playerBase.inventory.armour))
      return "astolfomod:astolfo_hurt"
    previous
  }
}
