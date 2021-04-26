package Chapter7;

import java.util.Arrays;

public class practicalHighGrade {

    // practical to check for the highest grade in a multidimensional array
    public static void main(String[] args) {
        int[][] grade = {{34, 78, 55}, {78, 92, 78},
                {45, 56, 67}, {78, 65, 43}};
        int highestGrade = grade[0][0];

        for (int[] studentGrade : grade) {
            for (int grades : studentGrade) {
                if (grades > highestGrade) {
                    highestGrade = grades;

                }
            }
        }
        System.out.println(highestGrade);

        System.out.println(Arrays.toString(letters()));

    }



        public static char[][] letters () {
            return new char[][]{{'a', 'b', 'c'}, {'d', 'e', 'f'}};
        }
    }

