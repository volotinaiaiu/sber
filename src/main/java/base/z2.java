package base;

public class z2 {
     static void zz2() {
        int size = 10;
        double[] numbers = new double[size];
        double sum = 0;
        double max = Double.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            numbers[i] = Math.random() * 100;
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        double average = sum / size;

        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}