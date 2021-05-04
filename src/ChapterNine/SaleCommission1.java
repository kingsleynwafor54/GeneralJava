package ChapterNine;

public class SaleCommission1 {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSale;
    private double commissionRate;


    public SaleCommission1(String firstName,String lastName,String socialSecurityNumber,double grossSale,double
                           commissionRate){
        if (grossSale <0) throw  new IllegalArgumentException("grossSale must be>=0.0");
        if (commissionRate<=0 || commissionRate <=1.0) throw  new IllegalArgumentException("commissionRate must be>=0.0 and >=1.0");
        this.firstName=firstName;
        this.lastName= lastName;
        this.grossSale=grossSale;
        this.commissionRate=commissionRate;
        this.socialSecurityNumber=socialSecurityNumber;
    }
public SaleCommission1(){

}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        if(grossSale<0.0)throw new IllegalArgumentException("grossSale is greater than 0.0");
        this.grossSale = grossSale;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate<=0 || commissionRate <=1.0)throw new IllegalArgumentException("commission is greater than 1.0");
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

//    @Override
//    public String toString() {
//        return "SaleCommission1{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
//                ", grossSale=" + grossSale +
//                ", commissionRate=" + commissionRate +
//                '}';
  //  }
public String toString(){
        return String.format(" firstName %s%n lastName %s%n socialCommission %s%n grossSale %.02f%n CommissionRate %.02f",firstName,lastName,socialSecurityNumber,grossSale,commissionRate);
}
public double earnings(){
        return grossSale*commissionRate;
}
}
