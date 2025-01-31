package love.marblegate.flowingagony.util;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.List;
import java.util.function.Predicate;

public class EntityUtil {
    public static List<LivingEntity> getTargetListExceptOneself(LivingEntity central, float radius, float height, Predicate<LivingEntity> predicate){
        AxisAlignedBB aabb = new AxisAlignedBB(central.getPosition().getX()-radius,central.getPosition().getY()-height,central.getPosition().getZ()-radius,central.getPosition().getX()+radius,central.getPosition().getY()+height,central.getPosition().getZ()+radius);
        List<LivingEntity> entities = central.world.getEntitiesWithinAABB(LivingEntity.class,aabb,predicate);
        if(entities.contains(central)) entities.remove(central);
        return entities;
    }

}
