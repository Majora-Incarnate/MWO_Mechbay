package MWOMechbay.Components.Weapons;

import MWOMechbay.Components.Equipment;
import MWOMechbay.Mechs.MechCommon;

/**
 *
 * @author Nemesis
 */
public class Weapon extends Equipment implements MechCommon {
    protected boolean artemisIVCapable;
    protected int velocity;
    protected int minimumRange;
    protected int effectiveRange;
    protected int maximumRange;
    protected int projectileCount;
    protected double damage;
    protected double heat;
    protected double duration;
    protected double heatToTarget;
    protected double recycle;
    protected double delay;
    protected double spread;
    protected double knock;
    
    public Weapon() {
        super();
        itemType = WEAPON_ITEM_TYPE;
        velocity = -1;
        minimumRange = 0;
        effectiveRange = 0;
        maximumRange = 0;
        projectileCount = 0;
        damage = 0;
        heat = 0;
        duration = 0;
        heatToTarget = 0;
        recycle = 0;
        delay = 0;
        spread = 0;
        knock = 0;
        artemisIVCapable = false;
    }
    
    public int getVelocity() {
        return velocity;
    }
    
    public int getMinimumRange() {
        return minimumRange;
    }
    
    public int getRange() {
        return effectiveRange;
    }
    
    public int getMaximumRange() {
        return maximumRange;
    }
    
    public int getProjectileCount() {
        return projectileCount;
    }
    
    public double getDamage() {
        return damage;
    }
    
    public double getHeat() {
        return heat;
    }
    
    public double getDuration() {
        return duration;
    }
    
    public double getHeatToTarget() {
        return heatToTarget;
    }
    
    public double getRecycle() {
        return recycle;
    }
    
    public double getDelay() {
        return delay;
    }
    
    public double getSpread() {
        return spread;
    }
    
    public double getKnock() {
        return knock;
    }
    
    public double getDamagePerSecond() {
        return (damage / (recycle + duration));
    }
    
    public double getHeatPerSecond() {
        return (heat / (recycle + duration));
    }
    
    public boolean isArtemisIVCapable() {
        return artemisIVCapable;
    }
}
