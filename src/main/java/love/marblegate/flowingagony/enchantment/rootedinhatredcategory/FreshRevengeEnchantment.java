package love.marblegate.flowingagony.enchantment.rootedinhatredcategory;

import love.marblegate.flowingagony.config.Config;
import love.marblegate.flowingagony.registry.EnchantmentRegistry;
import love.marblegate.flowingagony.util.EnchantmentLevelUtil;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;

public class FreshRevengeEnchantment extends Enchantment{
    public FreshRevengeEnchantment(Rarity p_i46731_1_, EquipmentSlotType[] p_i46731_3_) {
        super(p_i46731_1_, EnchantmentType.WEAPON, p_i46731_3_);
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

    public boolean canVillagerTrade() { return Config.FRESH_REVENGE.get(); }

    public boolean canGenerateInLoot() { return Config.FRESH_REVENGE.get(); }

    public boolean isAllowedOnBooks() {
        return Config.FRESH_REVENGE.get();
    }

    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        if(Config.FRESH_REVENGE.get())
            return super.canApplyAtEnchantingTable(stack);
        else
            return false;
    }

}
