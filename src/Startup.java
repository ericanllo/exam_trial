import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Startup {

    public static void main(String[] args) {

       BankAccount b1 = new BankAccount(new Person("Jess",24), 24);
        BankAccount b2 = new BankAccount(new Person("Ass",24), 24);
        BankAccount b3 = new BankAccount(new Person("Zass",24), 24);
       System.out.println(b1.account);
        System.out.println(b2.account);
        System.out.println(b3.account);
        System.out.println(b1.equals(b2) );

        ArrayList<BankAccount>  arr = new ArrayList<BankAccount>();

        arr.add(b1);
        arr.add(b2);
        arr.add(b3);

        Collections.sort(arr);
        for (BankAccount b : arr){
            System.out.println(b.owner.getName());

        }






    }


}
