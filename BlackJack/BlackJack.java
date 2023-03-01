import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) throws InterruptedException {
        boolean keepPlaying =false;
        while (keepPlaying);{
        Deck deck = new Deck();
        Scanner scnr = new Scanner(System.in);

        int houseTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);
        int playerTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);

        System.out.println("The house is showing: " + houseTotal);

        while(playerTotal <21)
        {
            System.out.println("Player is showing: " + playerTotal);
            System.out.println("Would you like to hit or stand?\n\tEnter 1 for hit or 0 for stand");
            int choice = scnr.nextInt();
            if (choice == 0){
                break;
            }else if (choice == 1)
            {
                Card nextCard = deck.drawCard();
                System.out.println("Player draws the " + nextCard.declareCard() );
                playerTotal += nextCard.getValue(true);
                Thread.sleep(450);
            }
            else{
                System.out.println("Invalid option, try again");
            }
        }

            if (playerTotal>21)
            {
System.out.println("Player has busted");
            }else{
                System.out.println("\nThe player stands with " + playerTotal + " points");
                System.out.println("The house will play next");
               //house
    
               System.out.println("The house is showing: " + houseTotal);

                if(houseTotal<17){

                    while(houseTotal<17){
                        Thread.sleep(450);
                    Card nextCard = deck.drawCard();
                    System.out.println("house draws the " + nextCard.declareCard() );
                houseTotal += nextCard.getValue(true);
                System.out.println("The house is showing: " + houseTotal);
                Thread.sleep(450);
            }
                }   
                
                else if(houseTotal>17 && houseTotal<21){
                System.out.println("\nThe house stands with " + houseTotal + " points");
                System.out.println(houseTotal);

                }  
                
                 else if (houseTotal>21)
                {
                    System.out.println("House has busted");
                    System.out.println("dnoe");
                    
                    
                }

            }
            int playerwins = 0;
            int housewins = 0;
            int ties = 0;
            //Score
            if (houseTotal >21){
                System.out.println("House has busted");
System.out.println("Player wins!");
playerwins++;
            }
            else if(houseTotal>playerTotal)
            {
                System.out.println("House wins!");   
                housewins++;

            }
            else if (playerTotal>houseTotal)
            {
                System.out.println("Player wins!");
                playerwins++;


            }
            else if (playerTotal == houseTotal)
            {
                System.out.println("Tie");
                ties++;
            }

System.out.println("Enter 0 to play again, or 1 to stop");
int answer = scnr.nextInt();

if (answer == 1)
{
    keepPlaying = false;
}
else if (answer == 0)
{
    keepPlaying = true;
}

System.out.println("There are " + playerwins + " player wins, " + housewins + " house wins, and " + ties + " ties.");
        
            

        }
    }
}
