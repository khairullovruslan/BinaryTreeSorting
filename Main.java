package itis304.lab7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {12, 12, 93, 48, 43, 66, 69, 82, 82, 46, 33, 24, 21, 45, 80, 51, 16};
        TreeSort sort = new TreeSort(numbers);
        sort.createTree();
        System.out.println(Arrays.toString(sort.sort()));


    }
}
