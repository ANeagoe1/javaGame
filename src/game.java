import java.util.*;
public class game {

   static boolean gameRunning = true;
   static boolean levelRunning = true; //lets the game run
   static int levelIndex = 0;
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        String keyboardInput;

        level[] levels = new level[10]; //creates an array that holds each level
        levels[0] = new levelOne();
        levels[1] = new levelTwo();
        levels[2] = new levelOne();
        levels[3] = new levelOne();
        levels[4] = new levelOne();
        levels[5] = new levelOne();
        levels[6] = new levelOne();
        levels[7] = new levelOne();
        levels[8] = new levelOne();
        levels[9] = new levelTen();

        while(gameRunning == true){ //loop that checks of the game is running, and if it is
            levels[levelIndex].init();
            levels[levelIndex].start();
            levelRunning = true;
           
            while(levelRunning == true){//loop that 
                keyboardInput = keyboard.nextLine();
               
               

                levels[levelIndex].processCommand(keyboardInput);
                levelRunning =  levels[levelIndex].isLevelDone()?false:true;
                gameRunning =  levels[levelIndex].isGameDone()?false:true;


            }
            levelIndex++;
            if(levelIndex >= levels.length){
                gameRunning = false;
            }

        }
        System.out.println("Game Complete");


    }
}

