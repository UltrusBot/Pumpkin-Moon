package me.ultrusmods.pumpkinmoon.register;

import me.ultrusmods.pumpkinmoon.PumpkinMoonMod;
import me.ultrusmods.pumpkinmoon.entity.HauntedHorseEntity;
import me.ultrusmods.pumpkinmoon.entity.SplinterlingEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class PumpkinMoonEntities {

    public static final EntityType<HauntedHorseEntity> HAUNTED_HORSE = register(
            "haunted_horse",
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, HauntedHorseEntity::new)
                    .dimensions(EntityDimensions.fixed(1.3964844F, 1.6F))
                    .trackRangeChunks(10)
                .build());
    public static final EntityType<SplinterlingEntity> SPLINTERLING = register(
            "splinterling",
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SplinterlingEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6F, 1.95F))
                    .trackRangeChunks(8)
                    .build());
    public static void init() {
        FabricDefaultAttributeRegistry.register(HAUNTED_HORSE, HauntedHorseEntity.createAttributes());
        FabricDefaultAttributeRegistry.register(SPLINTERLING, ZombieEntity.createAttributes().build());
    }
    public static <T extends Entity> EntityType<T> register(String name, EntityType<T> entityType) {
        return Registry.register(Registries.ENTITY_TYPE, PumpkinMoonMod.id(name), entityType);
    }
}
