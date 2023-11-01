package me.ultrusmods.pumpkinmoon.entity;

import me.ultrusmods.pumpkinmoon.register.PumpkinMoonEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.ZombieHorseEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class HauntedHorseEntity extends ZombieHorseEntity {
    public HauntedHorseEntity(EntityType<? extends ZombieHorseEntity> entityType, World world) {
        super(entityType, world);
    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return PumpkinMoonEntities.HAUNTED_HORSE.create(world);
    }
}
