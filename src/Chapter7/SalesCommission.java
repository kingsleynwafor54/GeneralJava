package Chapter7;

public class SalesCommission {
    int [] integer = new int[100];


    public int calculateSaleCommission(int[] salesPayment) {
        int scale=200;
        return salesCalculation(scale);
    }
    public int calculateSaleCommission(double[] salesPayment) {
        int scale=300;
        return salesCalculation(scale);
    }

    private int salesCalculation(int scale) {
        int count = 0;
        int salesCommission = 0;
        integer[count] = 0;
        System.out.println("Wages"+" "+"SalesCommission");
        for (; count < integer.length; count++) {
            salesCommission = (scale + count) +(int)(0.09*5000);
            System.out.printf("%5d%8d%n",scale+count,salesCommission);
        }
        return salesCommission;
    }

}