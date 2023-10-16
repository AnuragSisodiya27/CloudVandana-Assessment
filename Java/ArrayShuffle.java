package Java;

import java.util.*;
public class ArrayShuffle {
    public static void shuffle(int[] array) {
        int n = array.length;
        for (int i = n - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        shuffle(array);

        System.out.println(Arrays.toString(array));
    }
}
