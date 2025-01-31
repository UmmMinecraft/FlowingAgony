package love.marblegate.flowingagony.effect.special;

import love.marblegate.flowingagony.registry.EffectRegistry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectType;
import net.minecraft.util.DamageSource;

public class ThornInFleshImplicitEffect extends ImplicitBaseEffect {
    public ThornInFleshImplicitEffect() {
        super(EffectType.HARMFUL, 0);
    }


    public void performEffect(LivingEntity entityLivingBaseIn, int amplifier) {
        if (this == EffectRegistry.thron_in_flesh_active_effect.get()) {
            int duration = entityLivingBaseIn.getActivePotionEffect(this.getEffect()).getDuration();
            if(duration%60<10){
                entityLivingBaseIn.setMotion(0,entityLivingBaseIn.getMotion().y,0);
                entityLivingBaseIn.velocityChanged=true;
                entityLivingBaseIn.markPositionDirty();
            }
        }
    }

    public boolean isReady(int duration, int amplifier) {
        return true;
    }
}
