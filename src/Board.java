public class Board{
    private  int playerScore;
    private String playerName;
    boolean isPlay = false;
    int stones;

   public Board(int playerScore, boolean isPlay,int stones, String playerName){

       this.playerScore = playerScore;
       this.isPlay = isPlay;
       this.stones = stones;
       this.playerName = playerName;

   }
    public int numOfstones(){
        return playerScore;
    }
    public boolean setPlay(boolean isPlay){
        this.isPlay =isPlay;
        return isPlay;
    }
    public String getPlayerName(){
        return playerName;
    }
    public void setName(String playerName ){
        this.playerName =playerName;
    }
    public void setScore(int updateScore){
        this.playerScore = updateScore;
    }

    public int getStones(){
       return stones;
    }
    public String toString(){
       String str =  "\nStones picked : " + numOfstones();
       return str;
    }


}
