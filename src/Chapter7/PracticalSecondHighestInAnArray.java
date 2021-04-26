package Chapter7;

public class PracticalSecondHighestInAnArray {
    public static void main(String[] args) {
       int [][] grades={ {88,78,101,45},{78,92,91},
                {45,56,67},{100,94,93}};
        int highestGrade =grades[0][0];
        int secondHighestGrade=grades[0][0];
        for(int[] studentGrade: grades){
            for (int grade: studentGrade){
                if (grade>highestGrade){
                    secondHighestGrade=highestGrade;
                    highestGrade=grade;

                }
            else if (grade >secondHighestGrade)
                secondHighestGrade=grade;
            }
        }
        System.out.println(highestGrade);
       System.out.println(secondHighestGrade);
    }
    }

