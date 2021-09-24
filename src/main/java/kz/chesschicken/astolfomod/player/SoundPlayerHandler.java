package kz.chesschicken.astolfomod.player;

import kz.chesschicken.astolfomod.AstolfoListener;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.item.ItemInstance;
import net.modificationstation.stationapi.api.entity.player.PlayerHandler;

public class SoundPlayerHandler implements PlayerHandler {
    private final PlayerBase playerBase;

    private boolean canAstolfoSay(ItemInstance[] itemInstances) {
        if (itemInstances[3] != null)
            return itemInstances[3].itemId == AstolfoListener.astolfo_light_helmet.id || itemInstances[3].itemId == AstolfoListener.astolfo_helmet.id;
        return false;
    }

    public SoundPlayerHandler(PlayerBase player)
    {
        this.playerBase = player;
    }
    

    @Override
    public String getHurtSound(String previous) {
        if(canAstolfoSay(playerBase.inventory.armour))
            return "astolfomod:astolfo_hurt";
        return previous;
    }
}
