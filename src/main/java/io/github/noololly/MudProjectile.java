package io.github.noololly;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

public class MudProjectileEntity extends ProjectileEntity {

    public MudProjectileEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public MudProjectileEntity(World world, LivingEntity owner) {
        super(Mud.MUD_PROJECTILE_ENTITY_TYPE, owner, world);
    }

    public MudProjectileEntity(World world, double x, double y, double z) {
        super(Mud.MUD_PROJECTILE_ENTITY_TYPE, x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return MudItems.MUD;
    }


   @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        float damage = (float) Math.min(3.0 + this.getVelocity().length() * 2.0, 10.0);
        if (entity instanceof HostileEntity) {
            damage += 2.0f;
        }
   }
}