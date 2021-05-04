package ChapterEight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.MissingFormatArgumentException;

public class Tictactoe1 {
    private String[][] tictactoe;
    static ArrayList<Integer> playerOne = new ArrayList<>();
    static ArrayList<Integer> playerTwo = new ArrayList<>();

    public Tictactoe1(String[][] tictactoe1){
        this.tictactoe=new String[3][3];
    }
public  static void placeResult(String[][] tictactoe){

    for(String[] c:tictactoe){
        for(String k:c){
            System.out.print(k);
        }

        System.out.println();
    }

}
public String displayResult(int player, int number){
            String symbol="";
            try {
                if (player == 1) {
                    symbol="X";
                    return symbol;
                }
                if (player == 2) {
                    symbol="O";
                    return symbol;
                }

            } catch (MissingFormatArgumentException e) {
                System.out.println("e");
            }

    switch (number) {
        case 1 -> tictactoe[0][0] = symbol;
        case 2 -> tictactoe[0][1] = symbol;
        case 3 -> tictactoe[0][2] = symbol;
        case 4 -> tictactoe[1][0] = symbol;
        case 5 -> tictactoe[1][1] = symbol;
        case 6 -> tictactoe[1][2] = symbol;
        case 7 -> tictactoe[2][0] = symbol;
        case 8 -> tictactoe[2][1] = symbol;
        case 9 -> tictactoe[2][2] = symbol;
    }
        placeResult(tictactoe);

    return "";
}

    public void displayResult1(int player, int number){
        String symbol="";
        try {
            if (player == 1) {
                symbol="X";

            }
            if (player == 2) {
                symbol="O";

            }

        } catch (MissingFormatArgumentException e) {
            System.out.println("e");
        }

        switch (number) {
            case 1 -> tictactoe[0][0] = symbol;
            case 2 -> tictactoe[0][1] = symbol;
            case 3 -> tictactoe[0][2] = symbol;
            case 4 -> tictactoe[1][0] = symbol;
            case 5 -> tictactoe[1][1] = symbol;
            case 6 -> tictactoe[1][2] = symbol;
            case 7 -> tictactoe[2][0] = symbol;
            case 8 -> tictactoe[2][1] = symbol;
            case 9 -> tictactoe[2][2] = symbol;
        }
        placeResult(tictactoe);
    }

    public String CheckForWinningCases() {
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
        return "o";
    }
}
