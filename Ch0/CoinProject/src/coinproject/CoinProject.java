/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coinproject;

/**
 *
 * @author Charters
 */
public class CoinProject {
    
    private Coin aCoin;
    private int heads = 0;
    private int tails = 0;
    private int total = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        CoinProject myProject = new CoinProject();
        myProject.flip(100);
        myProject.showResults(100);
             
    }
    
    public void flip(int numFlips)
    {
        int face;
        aCoin = new Coin(2);
        for (int i = 0; i < numFlips; i++)
        {
            face = aCoin.toss();
            if (face == 1)
                heads++;
            else
                tails++;
        }
        total = heads + tails;
        
    }
    
    public void showResults(int numFlips)
    {
       System.out.println("The results of flipping " + numFlips + " times is: ");
       System.out.printf("Heads: %d and Tails: %d Totalling: %d", heads, tails, total);
       
        
    }
    
}
