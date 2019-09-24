/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enjoyableinterfaceexample;

/**
 *
 * @author mtsguest
 */
public class Pool implements Enjoyable {
    
    private String location;
    private String waterType;
    private boolean heated;

    public Pool(String location, String waterType, boolean heated) {
        this.location = location;
        this.waterType = waterType;
        this.heated = heated;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    
    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public boolean isHeated() {
        return heated;
    }

    public void setHeated(boolean heated) {
        this.heated = heated;
    }

    @Override
    public String toString() {
        return "Pool{" + "location=" + location + ", waterType=" + waterType + ", heated=" + heated + '}';
    }
    
    public int schedule(boolean doIt) {
        if (doIt)
        {
            return 2;
        }
        else
        {
            return 0;
        }
    }
    
    
}
