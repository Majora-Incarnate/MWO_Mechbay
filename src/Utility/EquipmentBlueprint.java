package Utility;

public class EquipmentBlueprint
        extends Blueprint {
    public String tech_base;
    public String hardpoint_type;
    public double tonnage;
    public int criticals;

    public EquipmentBlueprint(String paramString) {
        String[] arrayOfString = paramString.split(";");
        int i = 0;
        this.name = arrayOfString[(i++)];
        this.id = Integer.parseInt(arrayOfString[(i++)]);
        this.tech_base = arrayOfString[(i++)];
        this.hardpoint_type = arrayOfString[(i++)];
        this.tonnage = Double.parseDouble(arrayOfString[(i++)]);
        this.criticals = Integer.parseInt(arrayOfString[(i++)]);
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.is_locked = false;
        localCrittable.name = this.name;
        localCrittable.item_type = "Equipment";
        localCrittable.hardpoint_type = HardpointType.NONE_HARDPOINT_TYPE;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = this.tonnage;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}