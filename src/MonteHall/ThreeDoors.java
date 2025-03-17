package MonteHall;
import java.util.Random;

public class ThreeDoors {
    public int montyHall() {
        int simulations = 10000;
        int switchWins=0;
        int stayWins=0;

        Random rand = new Random();

        for(int i = 0; i<simulations; i++) {
            int[] doors = {0, 0, 0}; //array of 3 door with 0 being losses and 1 being a win
            int car = rand.nextInt(3);
            doors[car] = 1;
            //Player picks random number between 1 and 3
            int player = rand.nextInt(3);

            //Door opens that does not have a car that's not the players choice
            int opendoor = -1;
            for (int j = 0; j < 3; j++) {
                if (j != player && doors[j] == 0){
                    opendoor = j;
                }
            }
            //switches choice and shows if its a win
            int switchChoice = 3 - player-opendoor;
            if(doors[switchChoice] == 1){
                switchWins++;
            }
            //keeps choice and checks if a win
            if(doors[player]==1){
                stayWins++;
            }
        }
        System.out.println("Wins if switching: " + switchWins + " out of " + simulations);
        System.out.println("Wins if staying: " + stayWins + " out of " + simulations);
        return simulations;
    }
}
