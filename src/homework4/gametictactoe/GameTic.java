package homework4.gametictactoe;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GameTic {

     static ArrayList<Integer> answerPlayer1=new ArrayList<>();//store player1 positions
    static ArrayList<Integer> answerPlayer2=new ArrayList<>();

    public static void printBoard(String board[]){


        System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
        System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
        System.out.println(board[6] + "|" + board[7] + "|" + board[8]);
    }
    public static void play(int pos,String[] board,String player ,String answer ){
        if(player.equals("player1")){   // the method should take the postion where the player want to make his answer which is pos
            if(answer.equals("x")){      //answer is the answer of player 1 x or o
                answer="x";
            }else
                answer="o";
        }
        if(player.equals("player2")){// string player refer to player1 or player 2
            if(answer.equals("x")){
                answer="o";
            }else
                answer="x";
        }
        switch (pos){
            case 0: board[pos]=answer;
            case 1: board[pos]=answer;
            case 2: board[pos]=answer;
            case 3: board[pos]=answer;
            case 4: board[pos]=answer;
            case 5: board[pos]=answer;
            case 6: board[pos]=answer;
            case 7: board[pos]=answer;
            case 8: board[pos]=answer;
        }
    }
    public static String checkWin() {
        List<Integer> topRow = new ArrayList<>(Arrays.asList(0, 1, 2)); //winning conditions
        List<Integer> midRow = new ArrayList<>(Arrays.asList(3, 4, 5));
        List<Integer> butRow = new ArrayList<>(Arrays.asList(6, 7, 8));
        List<Integer> rightCol = new ArrayList<>(Arrays.asList(0, 3, 6));
        List<Integer> midCol = new ArrayList<>(Arrays.asList(1, 4, 7));
        List<Integer> leftCol = new ArrayList<>(Arrays.asList(2, 5, 8));
        List<Integer> cross1 = new ArrayList<>(Arrays.asList(0, 4, 8));
        List<Integer> cross2 = new ArrayList<>(Arrays.asList(2, 4, 6));
        List<List> winConditions = new ArrayList<>(); //create a list to loop for all winning conditions
        winConditions.add(topRow);
        winConditions.add(midRow);
        winConditions.add(butRow);
        winConditions.add(rightCol);
        winConditions.add(midCol);
        winConditions.add(leftCol);
        winConditions.add(cross1);
        winConditions.add(cross2);

        for (List l : winConditions) {
            if (answerPlayer1.containsAll(l)) { //loop through winning conditions
                return "player 1 wins ";
            } else if (answerPlayer2.containsAll(l)) {
                return "player 2 wins ";
            } else if (answerPlayer1.size() + answerPlayer2.size() == 9) { // in case of tie
                return "game over";
            }

        }
        return "";
    }
     public static void tictactoe(){
         String[] board = new String[9];
         String resault="";
         printBoard(board);
         Scanner sc = new Scanner(System.in);
         System.out.println("player1 : please choose x or o ");
         String answer=sc.next();
         while(!answer.equals("x")&& !answer.equals("o")){ //check is answer is x or o
             System.out.println("enter a valid answer x or o");
             answer=sc.next();
         }


         do {
             int pos;
             System.out.println("plase  player1 enter a position ");
             while(!sc.hasNextInt()){// check is the input is an integer
                 System.out.println("enter a valid position from 0 to 8 .please do not enter charcters");
                 sc.next();
             }
             pos = sc.nextInt();

             while(pos>8){// check if the input is not greater than 8
                 System.out.println("enter a valid position from 0 to 8  ");
                 pos = sc.nextInt();
             }

             while(answerPlayer1.contains(pos)|| answerPlayer2.contains(pos)){//check is its a valid position (not taken )
                 System.out.println("position taken ,reenter ");
                 pos = sc.nextInt();
             }
             answerPlayer1.add(pos);// add the pos to the arraylist for player 1


             play(pos, board, "player1", answer);
             printBoard(board);
             resault = checkWin();
             System.out.println(resault);
             if(!resault.isEmpty()){ // if resault not empty break the loop
                 break;
             }
             System.out.println("plase  player2 enter a position ");
             int posP2 = sc.nextInt();
             while(posP2>8){
                 System.out.println("enter a valid position from 0 to 8  ");
                 pos = sc.nextInt();
             }
             while(answerPlayer1.contains(posP2)|| answerPlayer2.contains(posP2)){
                 System.out.println("position taken ,reenter ");
                 posP2 = sc.nextInt();
             }
             answerPlayer2.add(posP2);


             play(posP2, board, "player2", answer);
             printBoard(board);
             resault = checkWin();
             System.out.println(resault);
             if(!resault.isEmpty()){
                 break;
             }


         }while(true);
         System.out.println("do you want ot play again  y /n");
     }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tictactoe();

         char reply =sc.next().charAt(0);

             while (Character.toLowerCase(reply)=='y') {
                 answerPlayer1.clear();
                 answerPlayer2.clear();
                 tictactoe();
                 reply=sc.next().charAt(0);
                    if (Character.toLowerCase(reply)=='n'){
                        System.out.println("------thank you.good by--------- ");
                    }
             }

        }













        //if 3 in row player wins
        //if player enters in non empty position - don't allow
        //if no more empty places - game is tied
        //ask if player wants to replay

        //don't accept incorrect position (correct position are [1 to 9] only)
    }

