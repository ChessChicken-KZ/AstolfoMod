package kz.chesschicken.astolfomod

import kz.chesschicken.astolfomod.block.AstolfoStatue
import kz.chesschicken.astolfomod.item.pages.ItemSmallPages
import kz.chesschicken.astolfomod.item.{ArmorAstolfo, AstolfoTrapdoor}
import kz.chesschicken.astolfomod.player.SoundPlayerHandler
import net.mine_diver.unsafeevents.listener.EventListener
import net.modificationstation.stationapi.api.event.entity.player.PlayerEvent
import net.modificationstation.stationapi.api.event.registry.{BlockRegistryEvent, ItemRegistryEvent}
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint
import net.modificationstation.stationapi.api.registry.{Identifier, ModID}
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase
import net.modificationstation.stationapi.api.template.item.TemplateItemBase
import net.modificationstation.stationapi.api.template.item.armour.TemplateArmour
import net.modificationstation.stationapi.api.util.Null

object ModListener {
  var astolfo_helmet : TemplateArmour = _
  var astolfo_chestplate: TemplateArmour = _
  var astolfo_leggings: TemplateArmour = _
  var astolfo_boots: TemplateArmour = _
  var astolfo_light_helmet: TemplateArmour = _
  var astolfo_light_chestplate: TemplateArmour = _
  var astolfo_light_leggings: TemplateArmour = _
  var astolfo_light_boots: TemplateArmour = _

  var astolfo_page: TemplateItemBase = _
  var astolfo_trapdoor: TemplateItemBase = _
  var astolfo_gem: TemplateItemBase = _

  var astolfo_statue: TemplateBlockBase = _

  var publicModID: ModID = _
}

class ModListener {

  @Entrypoint.ModID val modID: ModID = Null.get()

  @EventListener def registerBlocks(event: BlockRegistryEvent): Unit = {
    ModListener.astolfo_statue = new AstolfoStatue(Identifier.of(modID, "astolfo_statue")).setTranslationKey(modID, "astolfo_statue")
  }

  @EventListener def registerItems(event: ItemRegistryEvent): Unit = {
    ModListener.publicModID = modID
    ModListener.astolfo_helmet = new ArmorAstolfo(Identifier.of(modID, "astolfo_helmet"), 0, 0).setTranslationKey(modID, "astolfo_helmet")
    ModListener.astolfo_chestplate = new ArmorAstolfo(Identifier.of(modID, "astolfo_chestplate"), 1, 0).setTranslationKey(modID, "astolfo_chestplate")
    ModListener.astolfo_leggings = new ArmorAstolfo(Identifier.of(modID, "astolfo_leggings"), 2, 0).setTranslationKey(modID, "astolfo_leggings")
    ModListener.astolfo_boots = new ArmorAstolfo(Identifier.of(modID, "astolfo_boots"), 3, 0).setTranslationKey(modID, "astolfo_boots")
    ModListener.astolfo_light_helmet = new ArmorAstolfo(Identifier.of(modID, "astolfo_light_helmet"), 0, 1).setTranslationKey(modID, "astolfo_light_helmet")
    ModListener.astolfo_light_chestplate = new ArmorAstolfo(Identifier.of(modID, "astolfo_light_chestplate"), 1, 1).setTranslationKey(modID, "astolfo_light_chestplate")
    ModListener.astolfo_light_leggings = new ArmorAstolfo(Identifier.of(modID, "astolfo_light_leggings"), 2, 1).setTranslationKey(modID, "astolfo_light_leggings")
    ModListener.astolfo_light_boots = new ArmorAstolfo(Identifier.of(modID, "astolfo_light_boots"), 3, 1).setTranslationKey(modID, "astolfo_light_boots")
    ModListener.astolfo_page = new ItemSmallPages(Identifier.of(modID, "page")).setTranslationKey(modID, "page")
    ModListener.astolfo_trapdoor = new AstolfoTrapdoor(Identifier.of(modID, "trap_door")).setDurability(40).setTranslationKey(modID, "trap_door")
    ModListener.astolfo_gem = new TemplateItemBase(Identifier.of(modID, "trap_gem")).setTranslationKey(modID, "trap_gem")
  }

  @EventListener def registerPlayerHandler(event: PlayerEvent.HandlerRegister): Unit = {
    event.playerHandlers.add(new SoundPlayerHandler(event.player))
  }
}
