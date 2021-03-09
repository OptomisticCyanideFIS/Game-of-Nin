import java.util.Scanner;


public class Game {
    private Player player1;
    private Player player2;
    private boolean playAgain = true;

    public Game() {
        player1 = new Player();
        player2 = new Player();
    }

    public void play() {
        //Assign which player starts.
        //Use a scanner to take user input to remove the pieces, but not more than half using a while loop.
        //Switch players.
        //Determine winner and println points. 
        //Create a play again option.
        while(playAgain == true) {

        
            Scanner sc = new Scanner(System.in);
            
            Player playerPlayer;
            int curPlayer = (int)(Math.random() + 1);


            if (curPlayer == 0) {
                playerPlayer = player1;
            } else {
                playerPlayer = player2;
            }

            System.out.println(playerPlayer.getName() + " is going first.");

            while(Board.getPieces()  > 1) {
                System.out.println("There are " +Board.getPieces() + " pieces on the board.");
                System.out.println(playerPlayer.getName() + ", how many pieces would you like to remove?");
                int toRemove = sc.nextInt();
                
                while(toRemove < 1 || toRemove > Board.getPieces() / 2) {
                    System.out.println(playerPlayer.getName() + ", enter a valid number.");
                    toRemove = sc.nextInt();
                }
                Board.removePieces(toRemove);

                if (curPlayer == 0) {
                    curPlayer = 1;
                    playerPlayer = player2;
                } else {
                    curPlayer = 0;
                    playerPlayer = player1;
                }
            }

            if(curPlayer == 1 ) {
                System.out.println(player1.getName() +" has won!");
                player1.increaseScore();
            } else {
                System.out.println(player2.getName() +" has won!");
                player2.increaseScore();
            }
            System.out.println(player1.getName() +" has " +player1.getPoints() +" points.");
            System.out.println(player2.getName() +" has " +player2.getPoints() +" points.");

            System.out.println("Would you like to play again? (1) for yes, (2) for no.");
            int answer = sc.nextInt();
            
            if(answer == 1) {
                Board.populate();
            } else if (answer == 2) {
                System.out.println("Thank you for playing!");
                playAgain = false;

            }

            

        }
    }

}