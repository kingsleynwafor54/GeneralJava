package TicTacToe;

import java.util.Scanner;

public class TictactoeMain {
    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
        Tictactoe tictactoe = new Tictactoe();
        String[][] gameBoard ={};
        Tictactoe.setGameBoard(gameBoard);
        System.out.println("press any number to start except -1");
        int number=sc.nextInt();
        while (number!=-1){
            System.out.println("press 1 to continue and -1 to end");
            number=sc.nextInt();
            System.out.println("Enter your number from 1-9");
            int input = sc.nextInt();
            System.out.println("enter your team");
            int user = sc.nextInt();
            while(Tictactoe.playerOne.contains(input)||Tictactoe.playerTwo.contains(input)){
                System.out.println("This position has been chosen");
                user=sc.nextInt();
            }
            tictactoe.inputNumbers(input, user);
           String result= tictactoe.checkingWinnings();
           if(result.length()>0)
            System.out.println(result);



        }


    }
}
