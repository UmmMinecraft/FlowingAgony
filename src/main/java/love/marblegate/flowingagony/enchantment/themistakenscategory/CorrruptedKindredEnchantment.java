package love.marblegate.flowingagony.enchantment.themistakenscategory;

import love.marblegate.flowingagony.config.Config;
import love.marblegate.flowingagony.util.EnchantmentLevelUtil;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;

public class CorrruptedKindredEnchantment extends Enchantment {
    public CorrruptedKindredEnchantment(Rarity p_i46731_1_, EquipmentSlotType[] p_i46731_3_) {
        super(p_i46731_1_, EnchantmentType.ARMOR_CHEST, p_i46731_3_);
    }

    public int getMinEnchantability(int p_77321_1_) {
        return EnchantmentLevelUtil.get(this.getRarity(),this.getMaxLevel(),p_77321_1_,true);
    }

    public int getMaxEnchantability(int p_223551_1_) {
        return EnchantmentLevelUtil.get(this.getRarity(),this.getMaxLevel(),p_223551_1_,false);
    }

    public int getMaxLevel() {
        return 3;
    }

    public boolean canVillagerTrade() { return Config.CORRUPTED_KINDRED.get(); }

    public boolean canGenerateInLoot() { return Config.CORRUPTED_KINDRED.get(); }

    public boolean isAllowedOnBooks() {
        return Config.CORRUPTED_KINDRED.get();
    }

    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        if(Config.CORRUPTED_KINDRED.get())
            return super.canApplyAtEnchantingTable(stack);
        else
            return false;
    }

}
