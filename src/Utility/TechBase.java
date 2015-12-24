package Utility;

/**
 * @author Trevin
 */
public enum TechBase {
    IS_TECH_BASE("IS", "InnerSphere", 0),
    CLAN_TECH_BASE("CL", "Clan", 1);

    public String short_name;
    public String long_name;
    public int value;

    TechBase(final String short_name, final String long_name, final int value) {
        this.short_name = short_name;
        this.long_name = long_name;
        this.value = value;
    }

    @Override
    public String toString() {
        return long_name;
    }

    public static TechBase getEnum(String value) {
        switch(value) {
            case "InnerSphere":
                return IS_TECH_BASE;
            case "Clan":
                return CLAN_TECH_BASE;
            default:
                throw new IllegalArgumentException(String.format("Could not create enum based on given value: %s", value));
        }
    }
}
