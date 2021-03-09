import java.util.Scanner;

public class Player {
    private int points;    
    private String name = "";

    public Player(){
        points = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name.");
        name = sc.next();
    }

    public String getName() {
        return name;        
    }

    public int getPoints() {
        return points;
    }

    public void increaseScore() {
        points++;
    }
}