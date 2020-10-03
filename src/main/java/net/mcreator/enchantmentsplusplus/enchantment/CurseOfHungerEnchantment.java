
package net.mcreator.enchantmentsplusplus.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.enchantmentsplusplus.EnchantmentsplusplusModElements;

@EnchantmentsplusplusModElements.ModElement.Tag
public class CurseOfHungerEnchantment extends EnchantmentsplusplusModElements.ModElement {
	@ObjectHolder("enchantmentsplusplus:curse_of_hunger")
	public static final Enchantment enchantment = null;
	public CurseOfHungerEnchantment(EnchantmentsplusplusModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("curse_of_hunger"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.RARE, EnchantmentType.ARMOR, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 1;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return true;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}
	}
}
