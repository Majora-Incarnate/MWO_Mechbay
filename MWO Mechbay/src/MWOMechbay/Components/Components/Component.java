/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay.Components.Components;

import MWOMechbay.Components.Item;
import MWOMechbay.Mechs.MechCommon;

/**
 *
 * @author Nemesis
 */
public class Component extends Item implements MechCommon
{
    public int getHardpointType() {  return OMNI;  }
    
    public double getTonnage() {  return 0.0;  }
    
    public int getItemType() {  return COMPONENT_ITEM_TYPE;  }
}
