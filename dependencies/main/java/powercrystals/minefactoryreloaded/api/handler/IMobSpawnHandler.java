package powercrystals.minefactoryreloaded.api.handler;

import net.minecraft.entity.EntityLivingBase;

/**
 * Defines a handler for mob spawns from the autospawner. Added primarily to
 * solve item duping on exact spawn & entity inventories
 *
 * @author skyboy
 */
public interface IMobSpawnHandler {

    /**
     * @return The class that this instance is handling.
     */
    Class<? extends EntityLivingBase> getMobClass();

    /**
     * Called when a mob has been spawned normally.
     *
     * @param entity
     *      The entity instance being spawned. Typically your regular spawn code 100% handles this
     */
    void onMobSpawn(EntityLivingBase entity);

    /**
     * Called when an exact copy of an entity has been made.
     *
     * @param entity
     *      The entity instance being exact-copied. Clear your inventorie & etc. here
     */
    void onMobExactSpawn(EntityLivingBase entity);

}
