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
public class TVProgram implements Enjoyable {
    
    private String name;
    private int runtime;
    private String genre;

    public TVProgram(String name, int runtime, String genre) {
        this.name = name;
        this.runtime = runtime;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "TVProgram{" + "name=" + name + ", runtime=" + runtime + ", genre=" + genre + '}';
    }
    
    public int schedule(boolean doIt)
    {
        if (doIt)
        {
            return runtime;
        }
        else
        {
            return 0;
        }
    }
    
    
}
