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
public class Restaurant implements Enjoyable {
    
    private String name;
    private String type;
    private String location;
    private int priceRange;

    public Restaurant(String name, String type, String location, int priceRange) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.priceRange = priceRange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(int priceRange) {
        this.priceRange = priceRange;
    }

    @Override
    public String toString() {
        return "Restaurant{" + "name=" + name + ", type=" + type + ", location=" + location + ", priceRange=" + priceRange + '}';
    }
    
    public int schedule(boolean doIt)
    {
        if (doIt)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    
}
