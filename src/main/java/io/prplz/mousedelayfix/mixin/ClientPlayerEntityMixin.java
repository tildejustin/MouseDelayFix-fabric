package io.prplz.mousedelayfix.mixin;

import com.mojang.authlib.GameProfile;
import net.minecraft.entity.player.*;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ClientPlayerEntity.class)
public abstract class ClientPlayerEntityMixin extends PlayerEntity {
    public ClientPlayerEntityMixin(World world, GameProfile gameProfile) {
        super(world, gameProfile);
    }

    @Override
    public Vec3d getRotationVector(float vector) {
        return super.getRotationVector(this.pitch, this.yaw);
    }
}
