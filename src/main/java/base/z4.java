package base;

public class z4 {
    static void drawStars() {
        int rows = 3;
        int starsPerRow = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < starsPerRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}