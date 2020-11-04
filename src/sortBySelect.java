public class sortBySelect {
    public static void main(String[] args) {
        int[] testArray = new int[]{-96, 83, 876, -762, 60, 49, 34, 101, 1};
        sortingBySelect(testArray);
        for (int i : testArray) {
            System.out.println(i);
        }
    }

    public static void sortingBySelect(int[] array) {

        for (int i = 0; i < array.length-1; i++) {
            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
