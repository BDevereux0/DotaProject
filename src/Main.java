import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Character Juggernaut = new Character("Juggernaut", 600, 243, 34, 14, 20,
                                     50, 54, 2.8, 2.2, 1.4, 1);
        double damageTest = Math.floor((Math.random()*(Juggernaut.getUpperBaseDamage()-Juggernaut.getLowerBaseDamage())
                            +Juggernaut.getLowerBaseDamage()));
        System.out.println(damageTest);
        Items SangeAndYasha = new Items("Sange_N_Yasha", 16, 16);

        int testAgi = Juggernaut.getAGI()+SangeAndYasha.getAgility();
        System.out.println("Combined agi from char and item="+testAgi);
        Juggernaut.setAGI(testAgi);
        System.out.println("updated agi="+Juggernaut.getAGI());



    }


}



