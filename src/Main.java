public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] firstArray = new int[]{1, 2, 3};
        float[] secondArray = new float[]{1.57f, 7.654f, 9.986f};
        int[] example;
        example = new int[]{65, 12, 13};

        System.out.println("Задача 2");
        for (int i = 0; i < firstArray.length; i++) {
            if (i < firstArray.length && i != firstArray.length - 1) {
                System.out.print(firstArray[i] + ", ");
            } else if (i == firstArray.length - 1) {
                System.out.print(firstArray[i]);
            }

        }
        System.out.print("\n");
        for (int i = 0; i < secondArray.length; i++) {
            if (i < secondArray.length && i != firstArray.length - 1) {
                System.out.print(secondArray[i] + ", ");
            } else if (i == firstArray.length - 1) {
                System.out.print(secondArray[i]);
            }
        }
        System.out.print("\n");
        for (int i = 0; i < example.length; i++) {
            if (i < example.length && i != example.length - 1) {
                System.out.print(example[i] + ", ");
            } else if (i == example.length - 1) {
                System.out.print(example[i]);
            }
        }
        System.out.print("\n");

        System.out.println("Задача 3");
        for (int i = firstArray.length - 1; i >= 0; i--) {
            if (i < firstArray.length && i != 0) {
                System.out.print(firstArray[i] + ",");
            } else if (i == 0) {
                System.out.print(firstArray[i]);
            }
        }

        System.out.print("\n");
        for (int i = secondArray.length - 1; i <= secondArray.length && i >= 0; i--) {
            if (i < secondArray.length && i != 0) {
                System.out.print(secondArray[i] + ",");
            } else if (i == 0) {
                System.out.print(secondArray[i]);
            }
        }
        System.out.print("\n");
        for (int i = example.length - 1; i <= example.length && i >= 0; i--) {
            if (i < example.length && i != 0) {
                System.out.print(example[i] + ",");
            } else if (i == 0) {
                System.out.print(example[i]);
            }
        }

        System.out.print("\n");
        System.out.println("Задача 4");
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0) {
                firstArray[i] = firstArray[i] + 1;
            }
            System.out.print(firstArray[i] + " ");
        }
    }
}