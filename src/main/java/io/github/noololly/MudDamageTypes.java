package io.github.noololly;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.text.Text;

public class MudDamageTypes {
    public static final DamageSource MUD_PROJECTILE = new DamageSource ("mud_projectile") {
        @Override
        public Text getDeathMessage(LivingEntity entity) {
            String string = "death.mud_projectile";
            Text text = entity.getDisplayName();
            String name = text.getString();
            if (name == null || name.isEmpty()) {
                name = "Unknown";
            }
            return Text.translatable(string, name);
        }
    }.setProjectile();

}
