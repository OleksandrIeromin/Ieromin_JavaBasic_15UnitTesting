//добавьте метод, который будет считать среднее арифметическое элементов массива.

import java.util.Arrays;

public class ArrayAverage {

    public static void main(String[] args) {
        int[] randomArray = new int[5];

        for (int i = 0; i < 5; i++) {
            randomArray[i] = (int) (Math.random() * 6);
        }
        System.out.println(Arrays.toString(randomArray));
        double arrayAverage = 0;
        for (int i = 0; i < 5; i++) {
            arrayAverage += randomArray[i];

        }
        arrayAverage /= 5;
        System.out.println("Средние арифметические массивов равны (" + arrayAverage + ")");
    }
    }
