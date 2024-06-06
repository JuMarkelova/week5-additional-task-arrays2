package cy.markelova.arrays2.util;

public class Operations {

    public static void sortArray(int[] arrayNumbers) {
        int arrayLength = arrayNumbers.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength - 1 - i; j++) {
                if (arrayNumbers[j] > arrayNumbers[j + 1]) {
                    int temp = arrayNumbers[j];
                    arrayNumbers[j] = arrayNumbers[j + 1];
                    arrayNumbers[j + 1] = temp;
                }
            }
        }
    }
}