package love.marblegate.flowingagony.enchantment.diceoffraudcategory;

import love.marblegate.flowingagony.config.Config;
import love.marblegate.flowingagony.util.EnchantmentLevelUtil;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class SavorTheTastedEnchantment extends Enchantment{
    public SavorTheTastedEnchantment(Rarity p_i46731_1_, EquipmentSlotType[] p_i46731_3_) {
        super(p_i46731_1_,EnchantmentType.WEAPON, p_i46731_3_);
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

    public boolean canVillagerTrade() { return Config.SAVOR_THE_TASTED.get(); }

    public boolean canGenerateInLoot() { return Config.SAVOR_THE_TASTED.get(); }

    public boolean isAllowedOnBooks() {
        return Config.SAVOR_THE_TASTED.get();
    }

    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        if(Config.SAVOR_THE_TASTED.get())
            return super.canApplyAtEnchantingTable(stack);
        else
            return false;
    }

}
