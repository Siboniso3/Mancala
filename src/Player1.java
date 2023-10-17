public class Player1 extends Board{

    private static String player ="player2";
    public Player1( int playerScore,int stones, String playerName,  boolean isPlay, String player) {
        super(playerScore,isPlay,stones,playerName);
        this.isPlay =isPlay;
//        this.playerName =playerName;
        this.player =player;
    }

    public String getPlayer(){
        return player;
    }

    public String setPlayer(String player){
        this.player =player;
        return player;
    }

    @Override
    public boolean setPlay(boolean isPlay){
        this.isPlay =isPlay;
        return isPlay;
    }
    @Override
    public String toString(){
        String str ="\nPlayer Playing: " + getPlayer() + "\nPlayer Name :" +getPlayerName() + "\nNumber of holes filled : " + numOfstones() + "\nPlaying Status :" + isPlay;
        return str;
    }

}
