package kz.chesschicken.astolfomod.mixin;

import kz.chesschicken.astolfomod.AstolfoListener;
import net.minecraft.entity.EntityBase;
import net.minecraft.entity.animal.AnimalBase;
import net.minecraft.entity.animal.Chicken;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.item.ItemInstance;
import net.minecraft.level.Level;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Chicken.class)
public abstract class MixinChicken extends AnimalBase {
    public MixinChicken(Level arg) {
        super(arg);
    }

    @Override
    public void onKilledBy(EntityBase arg) {
        if(arg instanceof PlayerBase)
        {
            if(((PlayerBase)arg).inventory.getHeldItem() != null &&
                    ((PlayerBase)arg).inventory.getHeldItem().itemId == AstolfoListener.astolfo_trapdoor.id &&
                            ((PlayerBase)arg).inventory.getHeldItem().getDamage() == 0)
            {
                ((PlayerBase)arg).inventory.getHeldItem().applyDamage(1, arg);
                if(rand.nextBoolean())
                    this.dropItem(new ItemInstance(AstolfoListener.astolfo_gem, 1), 1);
            }
        }
        super.onKilledBy(arg);
    }
}
