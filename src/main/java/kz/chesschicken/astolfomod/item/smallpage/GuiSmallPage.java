package kz.chesschicken.astolfomod.item.smallpage;

import kz.chesschicken.astolfomod.AstolfoListener;
import lombok.SneakyThrows;
import net.minecraft.client.gui.screen.ScreenBase;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GuiSmallPage extends ScreenBase {
    private List<String> stringList;

    public GuiSmallPage(int i)
    {
        readTxt(i);
    }

    @SneakyThrows
    private void readTxt(int i)
    {
        stringList = new ArrayList<>();
        Stream<String> stringStream = Files.lines(Paths.get(AstolfoListener.modID.getContainer().getRootPath() + "/assets/astolfomod/pages/page" + i + ".txt"));
        stringStream.forEach(s -> stringList.add(s));
        stringStream.close();
    }


    @Override
    public void init() {
        this.buttons.clear();
    }

    public void render(int mouseX, int mouseY, float delta) {
        this.renderBackground();
        final int w = this.width / 2 - 128;
        final int h = this.height / 2 - 128;

        GL11.glBindTexture(3553, this.minecraft.textureManager.getTextureId("/assets/astolfomod/textures/gui/paper.png"));
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        this.blit(w, h, 0, 0, 256, 256);


        for(int i = 0; i < stringList.size(); i++) {
            this.textManager.drawText((!stringList.get(i).startsWith("§") ? "§0" : "") + stringList.get(i), w + 4, h + (10 * (i + 1)), Color.white.getRGB());
        }

        super.render(mouseX, mouseY, delta);
    }
}
