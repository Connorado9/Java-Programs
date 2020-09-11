
/**
 * Write a description of class Craps here.
 * 
 * @author Connor
 * @version 8-22-17
 */


public class Craps
{
    public static void main (String[] args)
    {
        //Scanner keyboard = new Scanner (System.in);
        //scanner initialization
        
        //while(keyboard.next().equals("yes"))
        
        int dice1 = (int)(Math.random()* 6) +1;
        int dice2 = (int)(Math.random()* 6) +1;
        int totalSum = dice1 + dice2;
        //declaring variables and summing first two random dice rolls
        
        System.out.print("You rolled " + totalSum + ".");
        //telling user their roll
        
        if(totalSum == 2 || totalSum == 3 || totalSum == 12)
        {
            System.out.println("Sorry, you lose.");
            //if the user rolls a 2, 3, or 12, they automatically  lose
        }
        else if(totalSum == 7 || totalSum == 11)
        {
            System.out.println("YOU WIN!!");
            //otherwise, if a 7 or 11 is generated, the user wins
        }
        else
        {
            System.out.println("Your point is " + totalSum);
            //if a number other than a 7, 11, 2, 3, or 12 is generated, a point total will be recorded
            
            dice1 = (int)(Math.random()* 6) +1;
            dice2 = (int)(Math.random()* 6) +1;
            //the dice are basically rolled again
            int roll2 = dice1 + dice2;
            //and added together again
            System.out.println("You rolled " + roll2 + ".");
            //lets user know their second roll
            while(roll2 != 7)
            {
                if(totalSum == roll2)
                {
                    System.out.println("You Win!");
                    //if the user's second roll is equal to the first roll, they win
                    break; 
                    //and the program ends
                }
                else
                {
                    System.out.println("Point is " + roll2);
                    //if they don't win, their point total is displayed again
                }
                
                dice1 = (int)(Math.random()* 6) + 1;
                dice2 = (int)(Math.random()* 6) + 1;
                //the dice are randomly generated again
                roll2 = dice1 + dice2;
                //and added again
                System.out.print("You rolled " + roll2 + ".");
                //and displayed
            }
            if(roll2 == 7)
            {
                System.out.println("Sorry, you Lose!");
                //the player loses if they roll a 7 before their point
            }           
        }
    }
}

