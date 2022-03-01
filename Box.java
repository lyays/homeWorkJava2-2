package java2hw.hw3;
import java.util.ArrayList;
import java.util.Arrays;

public class Box<T> {
    private double fruitWeight = 0.0;

    ArrayList<T> fruits = new ArrayList<>();

    public <T> Box (double fruitWeight){
        this.fruitWeight = fruitWeight;
    }

    public void addFruit(T fru) {
        fruits.add(fru);
    }

    public double getBoxWeight() {
        return fruits.size()* fruitWeight;
    }

    public boolean compareBoxes(Box<?> box){
       return Math.abs(this.getBoxWeight() - box.getBoxWeight()) < 0.0001;
    }

    public void shiftFruits (Box<T> tBox) {
        for(T f:fruits){
            tBox.addFruit(f);             //добавляем
        }
        this.fruits.clear();       // удаляем из текущей коробки
    }
}
