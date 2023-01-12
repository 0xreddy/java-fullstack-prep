    import java.util.Scanner;

    public class rectangle {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();

                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();

                double perimeter = 2 * (length + width);
                double area = length * width;
                System.out.println("The perimeter of the rectangle is: " + perimeter);
                System.out.println("The area of the rectangle is: " + area);
            }
        }
    }
