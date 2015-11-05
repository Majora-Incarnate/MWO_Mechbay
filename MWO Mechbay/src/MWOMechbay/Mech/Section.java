package Mech;

import Utility.Database;
import java.util.ArrayList;
import java.util.Iterator;

public class Section
{
  public int maximum_criticals;
  public int current_criticals;
  public int[] maximum_hardpoints = new int[5];
  public int[] current_hardpoints = new int[5];
  public int health;
  public int minimum_armor;
  public int rear_armor;
  public int front_armor;
  public int maximum_armor;
  public ArrayList<Crittable> components = new ArrayList();
  
  public void Set_Section(Section_Blueprint paramSection_Blueprint, int paramInt, double paramDouble)
  {
    this.maximum_criticals = paramSection_Blueprint.criticals;
    this.current_criticals = 0;
    this.health = Utility.Constants.INTERNALS_PER_SECTION[((int)((paramDouble - 20.0D) / 5.0D))][paramInt];
    this.rear_armor = 0;
    this.minimum_armor = (this.front_armor = (int)paramSection_Blueprint.armor_quirk);
    if (paramInt == 5) {
      this.maximum_armor = (18 + (int)paramSection_Blueprint.armor_quirk);
    } else {
      this.maximum_armor = (this.health * 2 + (int)paramSection_Blueprint.armor_quirk);
    }
    this.health += (int)paramSection_Blueprint.structure_quirk;
    for (int i = 0; i < 5; i++)
    {
      this.maximum_hardpoints[i] = paramSection_Blueprint.hardpoints[i];
      this.current_hardpoints[i] = 0;
    }
    for (i = 0; i < paramSection_Blueprint.minimum_actuator_count; i++)
    {
      Iterator localIterator = Database.master_actuator_blueprints.iterator();
      while (localIterator.hasNext())
      {
        Actuator_Blueprint localActuator_Blueprint = (Actuator_Blueprint)localIterator.next();
        if ((localActuator_Blueprint.type.equals(paramSection_Blueprint.actuator_type)) && (localActuator_Blueprint.index == i)) {
          Add_Component(localActuator_Blueprint.Get_Crittable());
        }
      }
    }
  }
  
  public void Remove_Omni_Restrictions()
  {
    Iterator localIterator = this.components.iterator();
    while (localIterator.hasNext())
    {
      Crittable localCrittable = (Crittable)localIterator.next();
      if ((localCrittable.is_locked) && ((localCrittable.item_type.equals("Armor")) || (localCrittable.item_type.equals("Structure")) || (localCrittable.item_type.equals("Heat Sink")) || (localCrittable.item_type.equals("Equipment")) || (localCrittable.item_type.equals("Jump Jet")) || (localCrittable.item_type.equals("Weapon")))) {
        localCrittable.is_locked = false;
      }
    }
  }
  
  public boolean Toggle_Arm_Actuator(int paramInt)
  {
    Iterator localIterator = this.components.iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (Crittable)localIterator.next();
      Actuator_Blueprint localActuator_Blueprint = null;
      if (((Crittable)localObject).item_type.equals("Actuator")) {
        localActuator_Blueprint = (Actuator_Blueprint)((Crittable)localObject).reference;
      }
      if ((localActuator_Blueprint != null) && (localActuator_Blueprint.type.equals("Arms")) && (localActuator_Blueprint.index == paramInt))
      {
        this.components.remove(localObject);
        Calculate_Criticals();
        return false;
      }
    }
    localIterator = Database.master_actuator_blueprints.iterator();
    while (localIterator.hasNext())
    {
      localObject = (Actuator_Blueprint)localIterator.next();
      if ((((Actuator_Blueprint)localObject).type.equals("Arms")) && (((Actuator_Blueprint)localObject).index == paramInt)) {
        this.components.add(paramInt, ((Actuator_Blueprint)localObject).Get_Crittable());
      }
    }
    Calculate_Criticals();
    return true;
  }
  
  public void Update_Section(Section_Blueprint paramSection_Blueprint)
  {
    for (int i = this.components.size() - 1; i >= 0; i--) {
      if (!((Crittable)this.components.get(i)).is_locked)
      {
        Database.queued_items.add(this.components.get(i));
        this.components.remove(i);
      }
    }
    for (i = 0; i < 5; i++) {
      this.maximum_hardpoints[i] = paramSection_Blueprint.hardpoints[i];
    }
    Calculate_Criticals();
    Calculate_Hardpoints();
  }
  
  public boolean Add_Component(Crittable paramCrittable)
  {
    if (paramCrittable == null) {
      return false;
    }
    if (!paramCrittable.hardpoint_type.equals("None"))
    {
      for (int i = 0; (i < 5) && (!Utility.Constants.HARDPOINT_TYPES[i].equals(paramCrittable.hardpoint_type)); i++) {}
      if (this.current_hardpoints[i] + 1 > this.maximum_hardpoints[i]) {
        return false;
      }
    }
    if (this.current_criticals + paramCrittable.criticals > this.maximum_criticals) {
      return false;
    }
    this.components.add(paramCrittable);
    Calculate_Criticals();
    Calculate_Hardpoints();
    return true;
  }
  
  public boolean Add_Component(Crittable paramCrittable, int paramInt)
  {
    if (paramCrittable == null) {
      return false;
    }
    if (!paramCrittable.hardpoint_type.equals("None")) {
      return false;
    }
    if (this.current_criticals + paramCrittable.criticals > this.maximum_criticals) {
      return false;
    }
    this.components.add(paramInt, paramCrittable);
    Calculate_Criticals();
    Calculate_Hardpoints();
    return true;
  }
  
  public void Remove_Component_Type(String paramString)
  {
    for (int i = this.components.size() - 1; i >= 0; i--)
    {
      Crittable localCrittable = (Crittable)this.components.get(i);
      if (localCrittable.item_type.equals(paramString)) {
        this.components.remove(i);
      }
    }
    Calculate_Criticals();
    Calculate_Hardpoints();
  }
  
  public Crittable Get_Component(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > this.maximum_criticals)) {
      return null;
    }
    int i = 0;
    Iterator localIterator = this.components.iterator();
    while (localIterator.hasNext())
    {
      Crittable localCrittable = (Crittable)localIterator.next();
      if (paramInt > i)
      {
        i += localCrittable.criticals;
        if (paramInt <= i)
        {
          if (localCrittable.is_locked) {
            return null;
          }
          return localCrittable;
        }
      }
    }
    return null;
  }
  
  public void Remove_Component(Crittable paramCrittable)
  {
    this.components.remove(paramCrittable);
    Calculate_Criticals();
    Calculate_Hardpoints();
  }
  
  public void Remove_Component(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > this.maximum_criticals)) {
      return;
    }
    int i = 0;
    for (int j = this.components.size() - 1; j >= 0; j--) {
      if (paramInt > i)
      {
        i += ((Crittable)this.components.get(j)).criticals;
        if (paramInt <= i)
        {
          if (((Crittable)this.components.get(j)).is_locked) {
            return;
          }
          this.components.remove(j);
        }
      }
    }
    Calculate_Criticals();
    Calculate_Hardpoints();
  }
  
  public void Remove_All()
  {
    for (int i = this.components.size() - 1; i >= 0; i--) {
      if (!((Crittable)this.components.get(i)).is_locked) {
        this.components.remove(i);
      }
    }
    Calculate_Criticals();
    Calculate_Hardpoints();
  }
  
  public void Calculate_Criticals()
  {
    this.current_criticals = 0;
    Iterator localIterator = this.components.iterator();
    while (localIterator.hasNext())
    {
      Crittable localCrittable = (Crittable)localIterator.next();
      this.current_criticals += localCrittable.criticals;
    }
  }
  
  public void Calculate_Hardpoints()
  {
    for (int i = 0; i < 5; i++) {
      this.current_hardpoints[i] = 0;
    }
    Iterator localIterator = this.components.iterator();
    while (localIterator.hasNext())
    {
      Crittable localCrittable = (Crittable)localIterator.next();
      for (int j = 0; j < 5; j++) {
        if (Utility.Constants.HARDPOINT_TYPES[j].equals(localCrittable.hardpoint_type)) {
          this.current_hardpoints[j] += 1;
        }
      }
    }
  }
  
  public double Calculate_Tonnage()
  {
    double d = 0.0D;
    Iterator localIterator = this.components.iterator();
    while (localIterator.hasNext())
    {
      Crittable localCrittable = (Crittable)localIterator.next();
      d += localCrittable.tonnage;
    }
    return d;
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\Mech\Section.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */