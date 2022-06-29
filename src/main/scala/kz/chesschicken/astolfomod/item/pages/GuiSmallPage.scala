package kz.chesschicken.astolfomod.item.pages

import kz.chesschicken.astolfomod.ModListener
import net.minecraft.client.gui.screen.ScreenBase
import org.lwjgl.opengl.GL11

import java.awt.Color
import java.nio.file.Files
import java.nio.file.Paths
import java.util
import java.util.stream.Stream

class GuiSmallPage(page1: Int) extends ScreenBase {
  private val stringList = load()

  private def load(): util.ArrayList[String] = {
    val ret1: util.ArrayList[String] = util.ArrayList[String]
    val stringStream: Stream[String] = Files.lines(Paths.get(ModListener.publicModID.getContainer.getRootPath.toString + "/assets/astolfomod/pages/page" + page1 + ".txt"))
    stringStream.forEach((s: String) => ret1.add(s))
    stringStream.close()
    ret1
  }

  override def init(): Unit = {
    this.buttons.clear()
  }

  override def render(mouseX: Int, mouseY: Int, delta: Float): Unit = {
    this.renderBackground()
    val w = this.width / 2 - 128
    val h = this.height / 2 - 128
    GL11.glBindTexture(3553, this.minecraft.textureManager.getTextureId("/assets/astolfomod/stationapi/textures/gui/paper.png"))
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F)
    this.blit(w, h, 0, 0, 256, 256)
    var i = 0
    while (i < stringList.size) {
      this.textManager.drawText((if (stringList.get(i).startsWith("§")) "" else "§0") + stringList.get(i), w + 4, h + (10 * (i + 1)), Color.white.getRGB)
      i += 1
    }
    super.render(mouseX, mouseY, delta)
  }
}
