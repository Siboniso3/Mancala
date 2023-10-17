import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] player1Stones  = new int[48];
        int[] player2Stones  = new int[48];
        ArrayList<String> filledHoles = new ArrayList<String>();
        int stoneToPlayWith = 0;
        String holesFilled ="";
        int stoneDrop =0;


         Board board = new Board( 0, false, 0, "");
         Player1 player1 = new Player1(0, 0, "Siboniso", false, "");
         Player2 player2 = new Player2(0,0 , "John", false, "");
        Scanner scanner= new Scanner(System.in);

        System.out.print("Please enter the name of the playing:  ");
        String playerName = scanner.nextLine();


        System.out.print("Typing true to begin play");
        String isPlay = scanner.nextLine();

        System.out.print("Enter 'player1\' one or 'player2\' :");
        String playerSide = scanner.nextLine();
        player1.setPlayer(playerSide);



        System.out.print("How many stone do you have in your hand: ");
        int pickedStones = Integer.parseInt(scanner.nextLine());




        if(Boolean.parseBoolean(isPlay) == true) {

                if (player1.setPlayer(playerSide).equalsIgnoreCase("player1")) {
                    player1.setPlay(Boolean.parseBoolean(isPlay));
                    player1.setScore(pickedStones);
                    player1.getPlayer();
                    stoneToPlayWith = player1.getStones();
                    if (player1.numOfstones()<=player1Stones.length) {
                        for (int i = 0; i < player1Stones.length; i++) {
                            if (player1.numOfstones() <= 0) {
                                System.out.print("Picked stones can not be less that zero");
                                break;
                            } else  if (player1.numOfstones() > 0){
                                while ((i+1)<= player1.numOfstones()) {
                                    holesFilled +="*";
                                    filledHoles.add(holesFilled);;
                                    i++;
                                }
                            }
                        }
                        System.out.println("\n--------------------------------------");
                        System.out.println(player1.toString()+ "\n");
                        System.out.println(filledHoles + "\n");
                        System.out.println("Stones Remaining on the hand:" + stoneToPlayWith + "\n");
                        System.out.println("\n--------------------------------------");
                    }else{
                        System.out.print("You have picked more stones that required, read the rules of the game");
                    }
                } else if (player2.setPlayer(playerSide).equalsIgnoreCase("player2")) {
                    player2.setScore(pickedStones);
                    player2.setPlay(Boolean.parseBoolean(isPlay));
                    player2.getPlayer();
                    stoneToPlayWith = player1.getStones();
                    if ( player2.numOfstones() <= player2Stones.length) {
                        for (int i = 0; i < player2Stones.length; i++) {
                            if (player2.numOfstones() <= 0) {
                                System.out.print("Picked stones can not be less that zero");
                            } else {
                                while ((i+1)<= player2.numOfstones()) {
                                    holesFilled +="*";
                                    filledHoles.add(holesFilled);;
                                    i++;
                                }
                            }
                        }
                        System.out.println("\n--------------------------------------");
                        System.out.println(player2.toString()+ "\n");
                        System.out.println(filledHoles + "\n");
                        System.out.println("Stones Remaining on the hand: " + stoneToPlayWith + "\n");
                        System.out.println("\n--------------------------------------");
                    }else{
                        System.out.print("You have picked more stones that required, read the rules of the game");

                    }

                } else {
                    System.out.print("Could not find the player, try again");
                }

            } else {
                System.out.print("You have entered Incorrect input, Please Enter true to begin to play, \nTry again");
            }
        }
    }
