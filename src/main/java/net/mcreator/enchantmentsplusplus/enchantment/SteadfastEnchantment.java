
package net.mcreator.enchantmentsplusplus.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.enchantmentsplusplus.EnchantmentsplusplusModElements;

@EnchantmentsplusplusModElements.ModElement.Tag
public class SteadfastEnchantment extends EnchantmentsplusplusModElements.ModElement {
	@ObjectHolder("enchantmentsplusplus:steadfast")
	public static final Enchantment enchantment = null;
	public SteadfastEnchantment(EnchantmentsplusplusModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("steadfast"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 3;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == new ItemStack(Items.LEATHER_CHESTPLATE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.CHAINMAIL_CHESTPLATE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.IRON_CHESTPLATE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.GOLDEN_CHESTPLATE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.DIAMOND_CHESTPLATE, (int) (1)).getItem())
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}
	}
}
