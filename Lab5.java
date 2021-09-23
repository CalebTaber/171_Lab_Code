import java.util.Scanner;

public class Lab5 {

    private static void foundation(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print('=');
        }
        System.out.println();
    }

    private static void walls(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == 0 || j == width - 1) System.out.print('|');
                else System.out.print(' ');
            }

            System.out.println();
        }
    }

    private static void roof(int width) {
        // width will always be even

        int middle = width/2;
        for (int i = 1; i <= middle; i++) {
            for (int j = 0; j < width; j++) {
                if (j == middle - i) System.out.print('/');
                else if (j == middle + i - 1) System.out.print('\\');
                else {
                    if (i == middle) System.out.print('-');
                    else System.out.print(' ');
                }
            }

            System.out.println();
        }
    }

    private static void house(int width, int height) {
        roof(width);
        walls(width, height);
        foundation(width);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How wide would you like your house?");
        int width = scan.nextInt();

        System.out.println("How tall would you like your house?");
        int height = scan.nextInt();

        house(width, height);
    }

}
