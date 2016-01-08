package Utility;

public class ChassisBlueprint extends Blueprint {
    public String chassis_name;
    public TechBase tech_base;
    public boolean is_omnimech;
    public double tonnage;
    public MovementArchetype movement_archetype;
    public String description;

    public ChassisBlueprint(String paramString) {
        String[] arrayOfString = paramString.split(";");
        int i = 0;
        this.chassis_name = arrayOfString[(i++)];
        this.tech_base = TechBase.getEnum(arrayOfString[(i++)]);
        this.is_omnimech = Boolean.parseBoolean(arrayOfString[(i++)]);
        this.tonnage = Double.parseDouble(arrayOfString[(i++)]);
        this.movement_archetype = MovementArchetype.getEnum(arrayOfString[(i++)]);
        this.description = arrayOfString[(i++)];
    }

    @Override
    public String toString() {
        return this.chassis_name;
    }
}