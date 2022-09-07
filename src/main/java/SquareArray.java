
//сделайте метод, который будет принимать на вход двумерную матрицу(двумерный массив)у и проверять является ли она квадратной.

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class SquareArray {
    private int row;
    private int column;
    private int[][] sqArray;

    public SquareArray(int row, int column) {
        this.row = row;
        this.column = column;
        this.sqArray = new int[row][column];
    }

    public SquareArray(int row) {
        this.row = row;
        this.column = row;
        this.sqArray = new int[row][column];
    }

    public SquareArray(int[][] sqArray) {
        this.sqArray = sqArray;
        this.row = this.sqArray.length;
        this.column = this.sqArray[0].length;
    }

    public SquareArray() {
        this.row = 2;
        this.column = this.row;
        this.sqArray = new int[row][column];
    }

    public long getArea() {return row * column;}

    public long getSumLengthAllRow() {
        long sum = 0;
        for (int[] row : sqArray)
            sum += row.length;
        return sum;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int[][] getSqArray() {
        return sqArray;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int[] someRow: sqArray)
            builder.append(Arrays.toString(someRow)).append('\n');
        return builder.toString();
    }

    @Test
    public void newSquareArrayShouldHaveSomeArea() {
        int[][] anArray = {{1, 1}, {2, 2}};
        SquareArray squareArray1 = new SquareArray(anArray);
        long asserCountAllElements = squareArray1.getRow() * squareArray1.getColumn();
        Assert.assertEquals(asserCountAllElements, squareArray1.getSumLengthAllRow());
    }

    public static void main(String[] args) {
        SquareArray squareArray = new SquareArray(2, 2 );
        System.out.println(squareArray);
    }
}



