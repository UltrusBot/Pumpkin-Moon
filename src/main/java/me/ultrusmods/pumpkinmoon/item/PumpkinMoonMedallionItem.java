package me.ultrusmods.pumpkinmoon.item;

import me.ultrusmods.pumpkinmoon.entity.HauntedHorseEntity;
import me.ultrusmods.pumpkinmoon.entity.SplinterlingEntity;
import me.ultrusmods.pumpkinmoon.register.PumpkinMoonEntities;
import me.ultrusmods.pumpkinmoon.register.PumpkinMoonItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.Heightmap;
import net.minecraft.world.World;

public class PumpkinMoonMedallionItem extends Item {
    public PumpkinMoonMedallionItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isNight()) {
            user.sendMessage(Text.translatable("message.pumpkinmoon.not_night"), true);
        }
        user.sendMessage(Text.translatable("message.pumpkinmoon.successful"), true);
        // Pick 12 random spots around the user and spawn Splinterings:
        var spawns = 0;
        for (int i = 0; i < 50; i++) {
            if (spawns >= 12) {
                break;
            }
            var x = user.getX() + (Math.random() * 30) - 15;
            var z = user.getZ() + (Math.random() * 30) - 15;
            var y = world.getTopY(Heightmap.Type.WORLD_SURFACE, (int) x, (int) z);
            SplinterlingEntity splinterling = PumpkinMoonEntities.SPLINTERLING.create(world);
            if (splinterling != null) {
                splinterling.refreshPositionAndAngles(x, y, z, 0, 0);
                world.spawnEntity(splinterling);
                spawns++;
            }
        }
        spawns = 0;
        for (int i = 0; i < 50; i++) {
            if (spawns >= 3) {
                break;
            }
            var x = user.getX() + (Math.random() * 30) - 15;
            var z = user.getZ() + (Math.random() * 30) - 15;
            var y = world.getTopY(Heightmap.Type.WORLD_SURFACE, (int) x, (int) z);
            HauntedHorseEntity hauntedHorse = PumpkinMoonEntities.HAUNTED_HORSE.create(world);
            if (hauntedHorse != null) {
                hauntedHorse.refreshPositionAndAngles(x, y, z, 0, 0);
                hauntedHorse.setTame(true);
                world.spawnEntity(hauntedHorse);
                spawns++;
                SplinterlingEntity splinterling = PumpkinMoonEntities.SPLINTERLING.create(world);
                if (splinterling != null) {
                    splinterling.refreshPositionAndAngles(x, y, z, 0, 0);
                    world.spawnEntity(splinterling);
                    splinterling.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 50000, 2));
                    splinterling.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 50000, 1));
                    splinterling.equipStack(EquipmentSlot.HEAD, Items.JACK_O_LANTERN.getDefaultStack());
                    // They are the headless horsemen after all
                    if (user.getRandom().nextInt(10) < 2) {
                        splinterling.equipStack(EquipmentSlot.OFFHAND, PumpkinMoonItems.PUMPKIN_MOON_MEDALLION.getDefaultStack());
                        splinterling.setEquipmentDropChance(EquipmentSlot.OFFHAND, 0.33F);
                    }
                    splinterling.startRiding(hauntedHorse);
                }
            }
        }
        if (spawns > 0 && !user.isCreative()) {
            user.getStackInHand(hand).decrement(1);
            return TypedActionResult.success(user.getStackInHand(hand));
        }


        return super.use(world, user, hand);
    }
}
