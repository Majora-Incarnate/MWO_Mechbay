package com.quicksilver.mwo.mechbay.entities;

public class ModuleBlueprint extends Blueprint {
    public final String type;
    public final int[] unlock_xp;
    public final long cost;
    public final String description;

    public ModuleBlueprint(final Builder builder) {
        super(builder);
        type = builder.type;
        unlock_xp = builder.unlock_xp;
        cost = builder.cost;
        description = builder.description;
    }
    
    public static class Builder extends Blueprint.Builder {
    public String type;
    public int[] unlock_xp;
    public long cost;
    public String description;
        
        public ModuleBlueprint buildFromCSV(String line) {
            String[] arrayOfString = line.split(";");
            int i = 0;
            this.name = arrayOfString[(i++)];
            this.id = Integer.parseInt(arrayOfString[(i++)]);
            this.type = arrayOfString[(i++)];
            this.unlock_xp = new int[5];
            for (int j = 0; j < 5; j++) {
                this.unlock_xp[j] = Integer.parseInt(arrayOfString[(i++)]);
            }
            this.cost = Long.parseLong(arrayOfString[(i++)]);
            this.description = arrayOfString[(i++)];
            
            return build();
        }
        
        public ModuleBlueprint build() {
            return new ModuleBlueprint(this);
        }
        
        public static Builder create() {
            return new Builder();
        }
        
        private Builder() {
            super();
            type = description = "";
            unlock_xp = new int[0];
            cost = 0L;
        }
    }
}