package love.marblegate.flowingagony.effect;

import love.marblegate.flowingagony.registry.EffectRegistry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.util.DamageSource;

public class LightburnFungalInfectionEffect extends Effect {
    public LightburnFungalInfectionEffect() {
        super(EffectType.HARMFUL, 16777196);
    }

    public void performEffect(LivingEntity entityLivingBaseIn, int amplifier) {
        if (this == EffectRegistry.lightburn_fungal_infection_effect.get()) {
            entityLivingBaseIn.attackEntityFrom((new DamageSource("flowingagony.lightburn_fungal_infection")).setDamageBypassesArmor(), 3.0F);
        }
    }

    public boolean isReady(int duration, int amplifier) {
        int k = 40;
        if(amplifier>0){
            k /= (amplifier * amplifier);
        }
        if (k > 0) {
            return duration % k == 0;
        }
        else {
            return false;
        }
    }
}
