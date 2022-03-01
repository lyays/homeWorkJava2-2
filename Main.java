package java2hw.hw3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] array = {11, 22, 33, 44};
//        Object[] objects = {11, 22, 33, 44};
        switchPlacesArray(array, 1, 2);


        Box<Apple> appleBox = new Box<>(1.0);
        Box<Orange> orangeBox = new Box<>(1.5);
        Box<Orange> orangeBox1 = new Box<>(1.5);

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        orangeBox.shiftFruits(orangeBox1);  //переложить фрукты из текущей коробки в другую

        appleBox.compareBoxes(orangeBox);   //сравнить разные коробки фруктов

        System.out.println("Вес коробки orangeBox1 = " + orangeBox1.getBoxWeight());
        System.out.println("Коробки appleBox и orangeBox равны?  " + appleBox.compareBoxes(orangeBox));


    }

        private static void switchPlacesArray (Object[]array,int i0, int i1){
            Object t = array[i0];
            array[i0] = array[i1];
            array[i1] = t;

            System.out.println(Arrays.toString(array));
        }

}

