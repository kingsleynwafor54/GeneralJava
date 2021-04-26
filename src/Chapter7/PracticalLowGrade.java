package Chapter7;

public class PracticalLowGrade {
    // practical to check for the lowest grade in a multidimensional array
    public static void main(String...Args){
        int[][] grade={{67,78,55},{78,56,78},
                {45,56,67},{78,65,43}};
         int lowGrade =grade[0][0];

        for(int[] studentGrade: grade){
            for (int grades: studentGrade){
                if (grades<lowGrade){
                    lowGrade=grades;

                }
            }
        }
        System.out.println(lowGrade);
    }
}