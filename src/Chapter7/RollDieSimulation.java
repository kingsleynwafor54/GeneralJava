package Chapter7;

import java.security.SecureRandom;

public class RollDieSimulation {
    SecureRandom secureRandom=new SecureRandom();
    public int  sumOfDice(){
        int die1 = 1+secureRandom.nextInt(6);
        int die2 = 1+secureRandom.nextInt(6);
        System.out.println("die1= "+die1+" "+"die2= "+die2);
        return die1+die2;
    }

}

