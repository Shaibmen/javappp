import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choose;


        do {
            System.out.println("Выберите фигуру: \n 1. треугольник. 2. паралелограмм. 3. паралелепипид. 4. квадрат. \n 5. круг. 6. трапеция. 7.ромб. 8. прямоугольник \n для выхода введите esc");
            choose = scanner.next();

            if (choose.equalsIgnoreCase("esc")) {
                break;
            }

            Figure figure = null;
            if(choose.equals("1")) {
                System.out.println("Введите стороны: ");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                figure = new Triangle(a, b, c);
                scanner.nextLine();
            }

            if(choose.equals("2")) {
                System.out.println("Введите стороны: ");
                double base = scanner.nextDouble();
                double side = scanner.nextDouble();
                double height = scanner.nextDouble();
                figure = new Paralelogram(base, side, height);
                scanner.nextLine();
            }

            if(choose.equals("3")) {
                System.out.println("Введите стороны: ");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                double height = scanner.nextDouble();
                figure = new Paralelepid(length, width, height);
                scanner.nextLine();
            }

            if(choose.equals("4")) {
                System.out.println("Введите стороны: ");
                double side = scanner.nextDouble();
                figure = new Square(side);
                scanner.nextLine();
            }

            if(choose.equals("5")) {
                System.out.println("Введите стороны: ");
                double radius = scanner.nextDouble();
                scanner.nextLine();
                figure = new Circle(radius);
                scanner.nextLine();
            }

            if(choose.equals("6")) {
                System.out.println("Введите стороны: ");
                double base1 = scanner.nextDouble();
                double base2 = scanner.nextDouble();
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double height = scanner.nextDouble();
                figure = new Trapec(base1, base2, side1, side2, height);
                scanner.nextLine();
            }

            if(choose.equals("7")) {
                System.out.println("Введите стороны: ");
                double diagonal1 = scanner.nextDouble();
                double diagonal2 = scanner.nextDouble();
                double side = scanner.nextDouble();
                figure = new Romb(diagonal1, diagonal2, side);
                scanner.nextLine();
            }

            if(choose.equals("8")) {
                System.out.println("Введите стороны: ");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                scanner.nextLine(); // Consume newline left-over
                figure = new pramogolnik(length, width);
                scanner.nextLine();
            }
            assert figure != null;
            System.out.println("Площадь: " + figure.calculateS());
            System.out.println("Периметр: " + figure.calculateP());
        } while (true);

    }
}


