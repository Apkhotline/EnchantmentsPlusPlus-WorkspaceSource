
package net.mcreator.enchantmentsplusplus.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.enchantmentsplusplus.EnchantmentsplusplusModElements;

@EnchantmentsplusplusModElements.ModElement.Tag
public class IceAspectEnchantment extends EnchantmentsplusplusModElements.ModElement {
	@ObjectHolder("enchantmentsplusplus:ice_aspect")
	public static final Enchantment enchantment = null;
	public IceAspectEnchantment(EnchantmentsplusplusModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("ice_aspect"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.UNCOMMON, EnchantmentType.WEAPON, slots);
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
