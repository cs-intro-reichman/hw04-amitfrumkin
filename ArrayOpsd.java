public class ArrayOpsd{
    public static void main(String[] args) {
            int[] array1 = {1, 2, 1, 1, 2};
            int[] array2 = {2, 1};
            System.out.println(containsTheSameElements(array1, array2)); // Output: true

            int[] array3 = {2, 2, 3, 7, 8, 3, 2};
            int[] array4 = {8, 2, 7, 7};
            System.out.println(containsTheSameElements(array3, array4)); // Output: true

            int[] array5 = {1, 2, 3};
            int[] array6 = {1, 2, 3};
            System.out.println(containsTheSameElements(array5, array6)); // Output: true

            int[] array7 = {3, -4, 1, 2, 5};
            int[] array8 = {1, 3, -4, 5};
            System.out.println(containsTheSameElements(array7, array8)); // Output: false
        }





    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        boolean[] presentInArray1 = new boolean[10];
        boolean[] presentInArray2 = new boolean[10];

        for (int i = 0; i < array1.length; i++) {
            int num = array1[i];
            if (num >= 0 && num < 10) {
                presentInArray1[num] = true;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            int num = array2[i];
            if (num >= 0 && num < 10) {
                presentInArray2[num] = true;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (presentInArray1[i] != presentInArray2[i]) {
                return false;
            }
        }

        return true;
    }
}
