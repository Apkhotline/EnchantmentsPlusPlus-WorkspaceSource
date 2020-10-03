package net.mcreator.enchantmentsplusplus.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.enchantmentsplusplus.enchantment.CurseOfHungerEnchantment;
import net.mcreator.enchantmentsplusplus.EnchantmentsplusplusModElements;

import java.util.Map;
import java.util.HashMap;

@EnchantmentsplusplusModElements.ModElement.Tag
public class CurseOfHungerProcedureProcedure extends EnchantmentsplusplusModElements.ModElement {
	public CurseOfHungerProcedureProcedure(EnchantmentsplusplusModElements instance) {
		super(instance, 13);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CurseOfHungerProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.armorInventory.get(0) : ItemStack.EMPTY)).isEnchanted())
				|| (((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.armorInventory.get(1) : ItemStack.EMPTY)).isEnchanted())
						|| (((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.armorInventory.get(2) : ItemStack.EMPTY))
								.isEnchanted())
								|| ((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY))
										.isEnchanted()))))) {
			if ((((EnchantmentHelper.getEnchantmentLevel(CurseOfHungerEnchantment.enchantment,
					((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.armorInventory.get(0) : ItemStack.EMPTY))) == 1)
					|| (((EnchantmentHelper.getEnchantmentLevel(CurseOfHungerEnchantment.enchantment,
							((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.armorInventory.get(1) : ItemStack.EMPTY))) == 1)
							|| (((EnchantmentHelper.getEnchantmentLevel(CurseOfHungerEnchantment.enchantment,
									((entity instanceof PlayerEntity)
											? ((PlayerEntity) entity).inventory.armorInventory.get(2)
											: ItemStack.EMPTY))) == 1)
									|| ((EnchantmentHelper.getEnchantmentLevel(CurseOfHungerEnchantment.enchantment,
											((entity instanceof PlayerEntity)
													? ((PlayerEntity) entity).inventory.armorInventory.get(3)
													: ItemStack.EMPTY))) == 1))))) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HUNGER, (int) 20, (int) 0, (false), (false)));
			}
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
