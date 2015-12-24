package Utility;

public class ActuatorBlueprint extends Blueprint {
    public String type;
    public int index;

    public ActuatorBlueprint(String paramString) {
        String[] arrayOfString = paramString.split(";");
        int i = 0;
        this.name = arrayOfString[i++];
        this.id = Integer.parseInt(arrayOfString[i++]);
        this.type = arrayOfString[i++];
        this.index = Integer.parseInt(arrayOfString[i]);
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.is_locked = true;
        localCrittable.name = this.name;
        localCrittable.item_type = "Actuator";
        localCrittable.hardpoint_type = HardpointType.NONE_HARDPOINT_TYPE;
        localCrittable.criticals = 1;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}