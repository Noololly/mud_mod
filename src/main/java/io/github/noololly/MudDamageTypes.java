package io.github.noololly;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;


public class MudDamageTypes {
    public static final DamageType MUD_BALL_DAMAGE = new DamageType();
    Registry.register(Registries.DAMAGE_TYPE), new Identifier(Mud.MOD_ID, "mud_ball"), MUD_BALL_DAMAGE);

}
