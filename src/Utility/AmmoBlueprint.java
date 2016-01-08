package Utility;

public class AmmoBlueprint extends Blueprint {
    public TechBase tech_base;
    public int health;
    public int criticals;
    public String type;
    public double damage;
    public double tonnage;
    public int ammo_count;
    public boolean artemis_capable;
    public boolean apollo_capable;

    public AmmoBlueprint(String paramString) {
        String[] arrayOfString = paramString.split(";");
        int i = 0;
        this.name = arrayOfString[(i++)];
        this.id = Integer.parseInt(arrayOfString[(i++)]);
        this.tech_base = TechBase.getEnum(arrayOfString[(i++)]);
        this.artemis_capable = Boolean.parseBoolean(arrayOfString[(i++)]);
        this.apollo_capable = Boolean.parseBoolean(arrayOfString[(i++)]);
        this.health = Integer.parseInt(arrayOfString[(i++)]);
        this.criticals = Integer.parseInt(arrayOfString[(i++)]);
        this.tonnage = Double.parseDouble(arrayOfString[(i++)]);
        this.type = arrayOfString[(i++)];
        this.ammo_count = Integer.parseInt(arrayOfString[(i++)]);
        this.damage = Double.parseDouble(arrayOfString[i]);
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.is_locked = false;
        localCrittable.name = this.name;
        localCrittable.item_type = "Ammo";
        localCrittable.hardpoint_type = HardpointType.NONE_HARDPOINT_TYPE;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = this.tonnage;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}