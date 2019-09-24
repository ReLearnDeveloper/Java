/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coinproject;
import java.util.Random;
/**
 *
 * @author Charters
 */
public class Coin
{
    int sides;
    Random aNum;
    
    public Coin(int aSides)
    {
        sides = aSides;
        aNum = new Random();
    }
    
    public int toss()
    {
        return aNum.nextInt(sides);
    }
}
