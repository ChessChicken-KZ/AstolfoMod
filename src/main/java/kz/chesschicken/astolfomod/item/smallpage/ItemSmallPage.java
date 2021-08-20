package kz.chesschicken.astolfomod.item.smallpage;

import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.item.ItemInstance;
import net.minecraft.level.Level;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.item.TemplateItemBase;

public class ItemSmallPage extends TemplateItemBase {
    public ItemSmallPage(Identifier identifier) {
        super(identifier);
        this.setHasSubItems(true);
    }

    @Override
    public int getMetaData(int i) {
        return i;
    }

    @Override
    public ItemInstance use(ItemInstance item, Level level, PlayerBase player) {
        if(FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT)
        {
            ((net.minecraft.client.Minecraft)FabricLoader.getInstance().getGameInstance()).openScreen(new kz.chesschicken.astolfomod.item.smallpage.GuiSmallPage(item.getDamage()));
        }
        return item;
    }

    @Override
    public String getTranslationKey(ItemInstance item) {
        return super.getTranslationKey(item) + "_" + item.getDamage();
    }
}
