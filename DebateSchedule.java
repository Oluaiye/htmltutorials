//package debateschedule;

import java.util.*;

public class DebateSchedule 
{    
    
    public static void main(String[] args)                      
    {
        Scanner s = new Scanner(System.in);
        String temp;
        int k = 0;
        Team[] teamArray = new Team[10];
        
        while (k <= 9)
        {
            System.out.println("Enter team name.");
            temp = s.next();
            teamArray[k] = new Team(10, k, temp);  
            k++;
        } 
        
        Team tempTeam;
        
        int rounds = teamArray.length - 1;
        int counter = 0;
        int y = 0;
        int z = teamArray.length - 1;
        
        while (rounds > counter)
        {
            while (y < z)
            {
                //System.out.print(teamArray[y].teamName + " vs. " + teamArray[z].teamName + "      ");
                y++;
                z--;
            }
            
            System.out.println();
            y = 0;
            z = teamArray.length - 1;
            
            tempTeam = teamArray[teamArray.length - 1];

            k = teamArray.length - 1;

            while (k > 1)
            {
                teamArray[k] = teamArray[k-1];
                k--;
            }

            teamArray[1] = tempTeam;
            counter++;
            
        
        }
        
/*        k = 0;
        
        while (k < teamArray.length)
        {
            //System.out.println(teamArray[k].teamName);
            k++;
        }
       */ 
    }    
}
