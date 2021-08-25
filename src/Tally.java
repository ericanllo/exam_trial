import java.util.Objects;

public class Tally implements Comparable<Tally>{
    int counter = 0;
    int maxValue = 0;

    public Tally(int counter){
        this.counter = counter;
    }
    public Tally(Tally original){
        this.counter = original.counter;
        this.maxValue = original.maxValue;
    }



    void inc(){
        counter++;
        if(counter > 999){
            counter = 0;
        }
    }
    void decr(){
        counter--;
    }
    void reset(){
        counter = 0;
    }
    public int read(){
        return counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tally)) return false;
        Tally tally = (Tally) o;
        return counter == tally.counter && maxValue == tally.maxValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(counter, maxValue);
    }

    @Override
    public int compareTo(Tally o) {
        if(this.counter == o.counter) return 0;
        else if (this.counter > o.counter) return 1;
        else return -1;
    }
}
