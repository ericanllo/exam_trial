import java.util.Random;

public class Factories {

    private final String brand;


    public Factories(String brand) {
        this.brand = brand;
    }

    public Cars buildCar(){
        return new Cars(brand, "black", randomSpeed() );
    }

    private int randomSpeed(){
        Random rand = new Random();
        return 120 + rand.nextInt(180);
    }

}
