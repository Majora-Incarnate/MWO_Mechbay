package com.github.majora_incarnate.mwo.mechbay.entities.blueprints;

import com.github.majora_incarnate.mwo.mechbay.entities.enums.HardpointType;
import com.github.majora_incarnate.mwo.mechbay.entities.Crittable;

public class WeaponBlueprint extends Blueprint {
    public double health;
    public int criticals;
    public HardpointType hardpoint_type;
    public String ammo_type;
    public double damage;
    public double thermal_damage;
    public double cooldown;
    public double heat;
    public double impulse;
    public int salvo_count;
    public int burst_count;
    public double spread;
    public int ammo_per_shot;
    public int minimum_range;
    public int effective_range;
    public int maximum_range;
    public double tonnage;
    public double duration;
    public int velocity;
    public double volley_delay;
    public double rate_of_fire;
    public boolean artemis_capable;
    public boolean apollo_capable;
    public boolean lock_capable;
    public int ghost_heat_threshold;
    public double ghost_heat_penalty;
    public int ghost_heat_group;
    public double jamming_chance;
    public double jammed_time;
    public double tag_duration;
    public double emp_duration;
    public double crit_modifier;
    public double[] crit_chances;
    public int shots_during_recycle;
    public boolean actuator_compatible;
    public double charge_time;
    public double explosion_chance;
    public double explosion_damage;

//    public WeaponBlueprint(Node parentNode) throws IllegalArgumentException {
//        NodeList childNodes = parentNode.getChildNodes();
//        Node weaponNode = null;
//
//        for (int i = 0; i < childNodes.getLength(); i++) {
//            if (childNodes.item(i).getNodeName() == "WeaponStats") {
//                weaponNode = childNodes.item(i);
//            }
//        }
//
//        if (!parentNode.hasAttributes() || weaponNode == null || !weaponNode.hasAttributes()) {
//            throw new IllegalArgumentException();
//        }
//
//        NamedNodeMap nodeMap = parentNode.getAttributes();
//        NamedNodeMap statNodeMap = weaponNode.getAttributes();
//
//        this.name = nodeMap.getNamedItem("name").getNodeValue();
//        this.id = Integer.parseInt(nodeMap.getNamedItem("id").getNodeValue());
//        this.tech_base = TechBase.getEnum(nodeMap.getNamedItem("faction").getNodeValue());
//
//        this.health = Integer.parseInt(statNodeMap.getNamedItem("Health").getNodeValue());
//        this.criticals = Integer.parseInt(statNodeMap.getNamedItem("slots").getNodeValue());
//        this.hardpoint_type = HardpointType.getEnum(statNodeMap.getNamedItem("type").getNodeValue());
//        this.damage = Double.parseDouble(statNodeMap.getNamedItem("damage").getNodeValue());
//        this.thermal_damage = Double.parseDouble(statNodeMap.getNamedItem("heatdamage").getNodeValue());
//        //this.ghost_heat_group = Integer.parseInt(statNodeMap.getNamedItem("heatPenaltyID").getNodeValue());
//        //this.ghost_heat_penalty = Double.parseDouble(statNodeMap.getNamedItem("heatpenalty").getNodeValue());
//        //this.ghost_heat_threshold = Integer.parseInt(statNodeMap.getNamedItem("minheatpenaltylevel").getNodeValue());
//        this.impulse = Double.parseDouble(statNodeMap.getNamedItem("impulse").getNodeValue());
//        this.heat = Double.parseDouble(statNodeMap.getNamedItem("heat").getNodeValue());
//        this.cooldown = Double.parseDouble(statNodeMap.getNamedItem("cooldown").getNodeValue());
//        this.ammo_type = statNodeMap.getNamedItem("ammoType").getNodeValue();
//        this.ammo_per_shot = Integer.parseInt(statNodeMap.getNamedItem("ammoPerShot").getNodeValue());
//        //this.rate_of_fire = Double.parseDouble(statNodeMap.getNamedItem("rof").getNodeValue());
//        //this.spread = Double.parseDouble(statNodeMap.getNamedItem("spread").getNodeValue());
//        this.minimum_range = Integer.parseInt(statNodeMap.getNamedItem("minRange").getNodeValue());
//        this.effective_range = Integer.parseInt(statNodeMap.getNamedItem("longRange").getNodeValue());
//        this.maximum_range = Integer.parseInt(statNodeMap.getNamedItem("maxRange").getNodeValue());
//        this.duration = Double.parseDouble(statNodeMap.getNamedItem("duration").getNodeValue());
//        this.tonnage = Double.parseDouble(statNodeMap.getNamedItem("tons").getNodeValue());
//        this.velocity = Integer.parseInt(statNodeMap.getNamedItem("speed").getNodeValue());
//        this.volley_delay = Double.parseDouble(statNodeMap.getNamedItem("volleydelay").getNodeValue());
//        this.salvo_count = this.volley_delay > 0 ? 1 : Integer.parseInt(statNodeMap.getNamedItem("numFiring").getNodeValue());
//        this.burst_count = this.volley_delay > 0 ? Integer.parseInt(statNodeMap.getNamedItem("numFiring").getNodeValue()) : 1;
//        //this.crit_modifier = Double.parseDouble(statNodeMap.getNamedItem("critDamMult").getNodeValue());
//        /*this.crit_chances = new double[3];
//            String[] temp =  statNodeMap.getNamedItem("critChanceIncrease").getNodeValue().split(",");
//            for (int j = 0; j < 3; j++) {
//                this.crit_chances[j] = Double.parseDouble(temp[j]);
//            }*/
//        this.crit_chances = new double[3];
//        for (int j = 0; j < 3; j++) {
//            this.crit_chances[j] = 0.0;
//        }
//        //this.shots_during_recycle = Integer.parseInt(statNodeMap.getNamedItem("ShotsDuringCooldown").getNodeValue());
//        //this.jamming_chance = Double.parseDouble(statNodeMap.getNamedItem("JammingChance").getNodeValue());
//        //this.jammed_time = Double.parseDouble(statNodeMap.getNamedItem("JammedTime").getNodeValue());
//        //this.tag_duration = Double.parseDouble(statNodeMap.getNamedItem("TAGDuration").getNodeValue());
//        //this.emp_duration = Double.parseDouble(statNodeMap.getNamedItem("duration").getNodeValue());
//        this.charge_time = this.name.contains("Gauss") ? 0.75 : 0.0;
//        //this.explosion_chance = Double.parseDouble(statNodeMap.getNamedItem("ExplodeChance").getNodeValue());
//        //this.explosion_damage = Double.parseDouble(statNodeMap.getNamedItem("InternalExplosionDmg").getNodeValue());
//    }

    public double Get_Effective_Damage() {
        return this.damage;
    }

    public double Get_DPS(double paramDouble) {
        return Get_Effective_Damage() / (this.cooldown * paramDouble + this.duration);
    }

    public double Get_HPS(double paramDouble) {
        return this.heat / (this.cooldown * paramDouble + this.duration);
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.isLocked = false;
        localCrittable.name = this.name;
        localCrittable.itemType = "Weapon";
        localCrittable.hardpointType = this.hardpoint_type;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = this.tonnage;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }

//    public String serializeToString() {
//        String[] values = new String[41];
//        int i = 0;
//        
//        values[i++] = this.name;
//        values[i++] = String.valueOf(this.id);
//        values[i++] = this.tech_base.long_name;
//        values[i++] = String.valueOf(this.health);
//        values[i++] = String.valueOf(this.criticals);
//        values[i++] = this.hardpoint_type.name;
//        values[i++] = String.valueOf(this.actuator_compatible);
//        values[i++] = String.valueOf(this.artemis_capable);
//        values[i++] = String.valueOf(this.apollo_capable);
//        values[i++] = String.valueOf(this.lock_capable);
//        values[i++] = String.valueOf(this.salvo_count);
//        values[i++] = String.valueOf(this.burst_count);
//        values[i++] = String.valueOf(this.damage);
//        values[i++] = String.valueOf(this.thermal_damage);
//        values[i++] = String.valueOf(this.ghost_heat_group);
//        values[i++] = String.valueOf(this.ghost_heat_penalty);
//        values[i++] = String.valueOf(this.ghost_heat_threshold);
//        values[i++] = String.valueOf(this.impulse);
//        values[i++] = String.valueOf(this.heat);
//        values[i++] = String.valueOf(this.cooldown);
//        values[i++] = this.ammo_type;
//        values[i++] = String.valueOf(this.ammo_per_shot);
//        values[i++] = String.valueOf(this.rate_of_fire);
//        values[i++] = String.valueOf(this.spread);
//        values[i++] = String.valueOf(this.minimum_range);
//        values[i++] = String.valueOf(this.effective_range);
//        values[i++] = String.valueOf(this.maximum_range);
//        values[i++] = String.valueOf(this.tonnage);
//        values[i++] = String.valueOf(this.duration);
//        values[i++] = String.valueOf(this.velocity);
//        values[i++] = String.valueOf(this.volley_delay);
//        values[i++] = String.valueOf(this.crit_modifier);
//        String[] temp = new String[3];
//        for (int j = 0; j < 3; j++)
//            temp[j] = String.valueOf(crit_chances[j]);
//        values[i++] = String.valueOf(String.join(",", temp));
//        values[i++] = String.valueOf(this.shots_during_recycle);
//        values[i++] = String.valueOf(this.jamming_chance);
//        values[i++] = String.valueOf(this.jammed_time);
//        values[i++] = String.valueOf(this.tag_duration);
//        values[i++] = String.valueOf(this.emp_duration);
//        values[i++] = String.valueOf(this.charge_time);
//        values[i++] = String.valueOf(this.explosion_chance);
//        values[i++] = String.valueOf(this.explosion_damage);
//        
//        return String.join(";", values);
//    }
}