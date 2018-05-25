public class levelOne extends level {
    boolean levelDone = false; //level is defined as not being done

    public void init(){
        levelDone = false;
    }
    public boolean isGameDone(){ //game is defined as not done yet, once set to true the game ends
        return false;
    }
    public boolean isLevelDone(){//this is checked for the level being 
        return levelDone;
    }

    public void start(){
        System.out.println("What is 2+2?");//the actual game that the players get to interact with
    }
    public boolean isAutoStart(){
        return true;
    }
    public void processCommand(String str){ //checks for the level completion, if the win condition is met
        if (str.equals("4")){
            levelDone = true;
            System.out.println("correct!");
        }
        else {
            System.out.println("Try again.");
        }
    }
}
