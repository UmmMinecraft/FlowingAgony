package love.marblegate.flowingagony.enchantment.innerpotentialcategory;

import love.marblegate.flowingagony.config.Config;
import love.marblegate.flowingagony.registry.EnchantmentRegistry;
import love.marblegate.flowingagony.util.EnchantmentLevelUtil;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;

public class StubbornStepEnchantment extends Enchantment {
    public StubbornStepEnchantment(Rarity p_i46731_1_, EquipmentSlotType[] p_i46731_3_) {
        super(p_i46731_1_, EnchantmentType.ARMOR_FEET, p_i46731_3_);
    }

    public int getMinEnchantability(int p_77321_1_) {
        return EnchantmentLevelUtil.get(this.getRarity(),this.getMaxLevel(),p_77321_1_,true);
    }

    public int getMaxEnchantability(int p_223551_1_) {
        return EnchantmentLevelUtil.get(this.getRarity(),this.getMaxLevel(),p_223551_1_,false);
    }

    public int getMaxLevel() {
        return 2;
    }

    public boolean canApplyTogether(Enchantment p_77326_1_) {
        return super.canApplyTogether(p_77326_1_) && p_77326_1_ != EnchantmentRegistry.frivolous_step_enchantment.get();
    }

    public boolean canVillagerTrade() { return Config.STUBBORN_STEP.get(); }

    public boolean canGenerateInLoot() { return Config.STUBBORN_STEP.get(); }

    public boolean isAllowedOnBooks() {
        return Config.STUBBORN_STEP.get();
    }

    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        if(Config.STUBBORN_STEP.get())
            return super.canApplyAtEnchantingTable(stack);
        else
            return false;
    }

}
