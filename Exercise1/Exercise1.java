public class Exercise1 {
    public static void main(String[] args) {
        int[][] myArray = new int[10][10];
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                myArray[x][y] = ((int) (Math.random() * 100));
            }
        }

        int max = getMax(myArray);
        System.out.println("max - " + max);

        int min = getMin(myArray);
        System.out.println("min - " + min);

        int average = getAverage(myArray);
        System.out.println("average - " + average);
    }

    private static int getAverage(int[][] myArray) {
        int summ = 0 ;
        for (int[] ints : myArray) {
            for (int y = 0; y < myArray[0].length; y++) {
                summ = summ + ints[y];
            }
        }
        return summ / (myArray.length * myArray[0].length);
    }

    private static int getMin(int[][] myArray) {
        int min = myArray[0][0];
        for (int[] ints : myArray) {
            for (int y = 0; y < myArray[0].length; y++) {
                if (min > ints[y]) {
                    min = ints[y];
                }
            }
        }
        return min;
    }

    private static int getMax(int[][] myArray) {
        int max = myArray[0][0];
        for (int[] ints : myArray) {
            for (int y = 0; y < myArray[0].length; y++) {
                if (max < ints[y]) {
                    max = ints[y];
                }
            }
        }
        return max;
    }
}
