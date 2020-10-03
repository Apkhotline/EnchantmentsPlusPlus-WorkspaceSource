
package net.mcreator.enchantmentsplusplus.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.enchantmentsplusplus.EnchantmentsplusplusModElements;

@EnchantmentsplusplusModElements.ModElement.Tag
public class LightningSpeedEnchantment extends EnchantmentsplusplusModElements.ModElement {
	@ObjectHolder("enchantmentsplusplus:lightning_speed")
	public static final Enchantment enchantment = null;
	public LightningSpeedEnchantment(EnchantmentsplusplusModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("lightning_speed"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.RARE, EnchantmentType.WEAPON, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 2;
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
