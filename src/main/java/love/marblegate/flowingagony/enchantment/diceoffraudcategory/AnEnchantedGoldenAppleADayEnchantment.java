package love.marblegate.flowingagony.enchantment.diceoffraudcategory;

import love.marblegate.flowingagony.config.Config;
import love.marblegate.flowingagony.util.EnchantmentLevelUtil;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class AnEnchantedGoldenAppleADayEnchantment extends Enchantment{
    public AnEnchantedGoldenAppleADayEnchantment(Rarity p_i46731_1_, EquipmentSlotType[] p_i46731_3_) {
        super(p_i46731_1_,EnchantmentType.ARMOR, p_i46731_3_);
}

    public int getMinEnchantability(int p_77321_1_) {
        return EnchantmentLevelUtil.get(this.getRarity(),this.getMaxLevel(),p_77321_1_,true);
    }

    public int getMaxEnchantability(int p_223551_1_) {
        return EnchantmentLevelUtil.get(this.getRarity(),this.getMaxLevel(),p_223551_1_,false);
    }

    public int getMaxLevel() {
        return 1;
    }

    public boolean canVillagerTrade() { return Config.AN_ENCHANTED_GOLDEN_APPLE_A_DAY.get(); }

    public boolean canGenerateInLoot() { return Config.AN_ENCHANTED_GOLDEN_APPLE_A_DAY.get(); }

    public boolean isAllowedOnBooks() {
        return Config.AN_ENCHANTED_GOLDEN_APPLE_A_DAY.get();
    }

    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        if(Config.AN_ENCHANTED_GOLDEN_APPLE_A_DAY.get())
            return super.canApplyAtEnchantingTable(stack);
        else
            return false;
    }

}
