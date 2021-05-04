package TicTacToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Tictactoe {
    static ArrayList<Integer> playerOne = new ArrayList<>();
    static ArrayList<Integer> playerTwo = new ArrayList<>();
    String[][] gameBoard = {{"   ", " | ", "   ", " | ", "   "},
            {"---", " * ", "---", " * ", "---"},
            {"   ", " | ", "   ", " | ", "   "},
            {"---", " * ", "---", " * ", "---"},
            {"   ", " | ", "   ", " | ", "   "}};

//    public String[][] getGameBoard() {
//        return gameBoard;
//    }

    public static void setGameBoard(String[][] gameBoard) {
        for (String[] row : gameBoard) {
            for (String c : row) {
                System.out.print(c);
            }
            System.out.println();
        }


    }

    public void inputNumbers(int number, int users) {
        String symbol = "   ";
        if (users == 1) {
            symbol = " X ";
            playerOne.add(number);
        } else if (users == 2) {
            symbol = " O ";
            playerTwo.add(number);
        }
        switch (number) {
            case 1 -> gameBoard[0][0] = symbol;

            case 2 -> gameBoard[0][2] = symbol;
            case 3 -> gameBoard[0][4] = symbol;
            case 4 -> gameBoard[2][0] = symbol;
            case 5 -> gameBoard[2][2] = symbol;
            case 6 -> gameBoard[2][4] = symbol;
            case 7 -> gameBoard[4][0] = symbol;
            case 8 -> gameBoard[4][2] = symbol;
            case 9 -> gameBoard[4][4] = symbol;
            default -> System.out.println("You entered the wrong number");
        }
        setGameBoard(gameBoard);


    }

    public void gamePlayers(String users) {

    }

    public String[][] getGameBoard() {
        return gameBoard;
    }

    public String checkingWinnings() {
        //define the winning list then you add them before looping them to check if you have won the game or not.
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List firstCross = Arrays.asList(1, 5, 9);
        List secoCross = Arrays.asList(3, 5, 7);
        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(firstCross);
        winning.add(secoCross);

        for (List winningCheck : winning) {
            if (playerOne.containsAll(winningCheck)) {
                System.out.println( "Congratulations Player1 wins!!!");
               break;
            }
            if (playerTwo.containsAll(winningCheck)) {
                System.out.println( "Congratulation Player2 wins!!!");
                break;
            } else if (playerOne.size() + playerTwo.size() == 9) {
                return "CAT!!!";

            }
        }
    return "";
    }
}
