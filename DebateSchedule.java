//package debateschedule;

import java.util.*;

//now i have to come home
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
        
    }
}