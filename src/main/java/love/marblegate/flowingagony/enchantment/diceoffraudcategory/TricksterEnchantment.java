package love.marblegate.flowingagony.enchantment.diceoffraudcategory;

import love.marblegate.flowingagony.config.Config;
import love.marblegate.flowingagony.util.EnchantmentLevelUtil;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;

public class TricksterEnchantment extends Enchantment {
    public TricksterEnchantment(Rarity p_i46731_1_, EquipmentSlotType[] p_i46731_3_) {
        super(p_i46731_1_, EnchantmentType.WEAPON, p_i46731_3_);
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

    public boolean canVillagerTrade() { return Config.TRICKSTER.get(); }

    public boolean canGenerateInLoot() { return Config.TRICKSTER.get(); }

    public boolean isAllowedOnBooks() {
        return Config.TRICKSTER.get();
    }

    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        if(Config.TRICKSTER.get())
            return super.canApplyAtEnchantingTable(stack);
        else
            return false;
    }

}
