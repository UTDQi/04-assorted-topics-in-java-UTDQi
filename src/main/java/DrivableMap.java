/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<String, Drivable>();
    }


    public boolean addDrivable(String ID, Drivable object){
        if(drivable_map.containsKey(ID)){
            return false;
        }else{
            drivable_map.put(ID, object);
            return true;
        }
    }






    public boolean hasFasterThan(int speed){
        for(Drivable item:drivable_map.values()){
            if(item.getMaxSpeed() >= speed){
                return true;
            }
        }
        return false;
    }




    public List<Tradable> getTradable(){
        ArrayList<Tradable> list= new ArrayList<Tradable>();
        for(Drivable item:drivable_map.values()){
            if(item.getClass() == Tradable){
                list.add((Tradable)item);
            }
        }
        return list;
    }



}
