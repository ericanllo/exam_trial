import java.util.Objects;
import java.util.Random;

public class BankAccount implements Comparable<BankAccount> {

    Person owner;
    int balance;
    String account = "";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(account, that.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account);
    }

    public BankAccount(Person owner, int balance) {
        this.owner = owner;
        this.balance = balance;
        String alph = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i<8; i++){
            Random r = new Random();
            account += alph.charAt(r.nextInt(25));
        }


    }

    void withdraw(int amount){
        balance -= amount;

    }
    void deposit(int amount){
        balance += amount;

    }
    void transfer(BankAccount receiver, int amount){
        withdraw(amount);
        receiver.deposit(amount);
    }

    String getName(){
        return this.owner.getName();
    }

    @Override
    public int compareTo(BankAccount o) {
        if(this.owner.equals(o.owner)) return balance - o.balance;
        //else if (this.owner > o.owner) return 1;
        else return getName().compareTo(o.getName());

    }
}
