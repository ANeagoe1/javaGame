public class levelOne extends level {
    boolean levelDone = false;

    public void init(){
        levelDone = false;
    }
    public boolean isGameDone(){
        return false;
    }
    public boolean isLevelDone(){
        return levelDone;
    }

    public void start(){
        System.out.println("What is 2+2?");
    }
    public boolean isAutoStart(){
        return true;
    }
    public void processCommand(String str){
        if (str.equals("4")){
            levelDone = true;
            System.out.println("correct!");
        }
        else {
            System.out.println("Try again.");
        }
    }
}
