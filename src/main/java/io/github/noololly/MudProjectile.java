package io.github.noololly;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import io.github.noololly.MudDamageTypes;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

public class MudProjectile extends ThrownItemEntity {
    public static World world;
    public static final DamageSource MUD_PROJECTILE = new DamageSource(
            world.getRegistryManager()
                    .get(RegistryKeys.DAMAGE_TYPE)
                    .entryOf(MudDamageTypes.MUD_BALL)
    );

    public MudProjectile(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public MudProjectile(World world, LivingEntity owner) {
        super(Mud.MudProjectileEntityType, owner, world);
    }

    public MudProjectile(World world, double x, double y, double z) {
        super(Mud.MudProjectileEntityType, x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return null;
    }


   @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        float damage = (float) Math.min(3.0 + this.getVelocity().length() * 2.0, 10.0);
        if (entity instanceof HostileEntity) {
            damage += 2.0f;
        }
        entity.damage(MUD_PROJECTILE, damage);
   }
}