/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay.Components.Components;

import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class XL_Engine extends Component implements Serializable 
{
    private static final String equipmentName = "XL Fusion Engine";
    private static final int criticals = 3;
    private static final boolean removable = false;
    
    public String getEquipmentName() {  return equipmentName;  }
    
    public int getCriticals() {  return criticals;  }
    
    public boolean isRemovable() {  return removable;  }
    
    public String toString() {  return equipmentName;  }
    
    public int getItemType() {  return ENGINE_ITEM_TYPE;  }
}
