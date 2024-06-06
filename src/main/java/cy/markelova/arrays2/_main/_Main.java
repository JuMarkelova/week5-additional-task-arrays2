package cy.markelova.arrays2._main;

import cy.markelova.arrays2.util.Operations;

public class _Main {

    public static void main(String[] args) {
        int[] arr = new int[]{2, -3, 1, 1};
        Operations.sortArray(arr);
        for (int num : arr) {
            System.out.println(num);
        }
    }
}