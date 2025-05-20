import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача Первая");
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        double[] doubleArray = {1.57, 7.654, 9.986};
        String[] stringArray = {"яблоко", "банан", "вишня"};

        System.out.println();
        System.out.println("Задача Вторая");
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Arrays.toString(stringArray));

        System.out.println();
        System.out.println("Задача Третья");
        for (int index = intArray.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(intArray[index]);
                break;
            }
            System.out.print(intArray[index] + ", ");
        }
        for (int index = doubleArray.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(doubleArray[index]);
                break;
            }
            System.out.print(doubleArray[index] + ", ");
        }
        for (int index = stringArray.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(stringArray[index]);
                break;
            }
            System.out.print(stringArray[index] + ", ");
        }

        System.out.println();
        System.out.println("Задача Четвертая");
        for (int index = 0; index <= intArray.length - 1; index++) {
            if (intArray[index] % 2 != 0) {
                intArray[index] += 1;
            }

        }
        System.out.println(Arrays.toString(intArray));
    }

}