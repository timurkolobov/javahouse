public class Main {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};

        int[] result = subtractArrays(array1, array2);

        if (result != null) {
            for (int element : result) {
                System.out.print(element + " ");
            }
        }
    }

    public static int[] subtractArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            System.out.println("Длины массивов не равны");
            return null;
        }

        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] - array2[i];
        }

        return result;
    }
}