public class levelTen extends level {
    boolean levelDone = false;

    public void init(){
        levelDone = false;
    }
    public boolean isGameDone(){
        return levelDone;
    }
    public boolean isLevelDone(){
        return levelDone;
    }

    public void start(){
        System.out.println("What is 10*10?");
    }
    public boolean isAutoStart(){
        return true;
    }
    public void processCommand(String str){
        if (str.equals("100")){
            levelDone = true;
            System.out.println("correct!");
        }
        else {
            System.out.println("Try again.");
        }
    }
}
