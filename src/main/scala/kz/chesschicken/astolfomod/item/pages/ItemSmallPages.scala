package kz.chesschicken.astolfomod.item.pages

import net.modificationstation.stationapi.api.registry.Identifier
import net.modificationstation.stationapi.api.template.item.TemplateItemBase
import net.fabricmc.api.EnvType
import net.minecraft.entity.player.PlayerBase
import net.minecraft.item.ItemInstance
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.level.Level

class ItemSmallPages(identifier: Identifier) extends TemplateItemBase(identifier) {

  override def getMetaData(i: Int): Int = i

  override def use(item: ItemInstance, level: Level, player: PlayerBase): ItemInstance = {
    if (FabricLoader.getInstance.getEnvironmentType eq EnvType.CLIENT)
      FabricLoader.getInstance.getGameInstance.asInstanceOf[net.minecraft.client.Minecraft].openScreen(new GuiSmallPage(item.getDamage))
    item
  }

  override def getTranslationKey(item: ItemInstance): String = super.getTranslationKey(item) + "_" + item.getDamage
}
