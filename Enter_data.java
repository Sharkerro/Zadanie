
    import java.util.Scanner;
    public class Enter_data {
        int number;
        double a,b,c,h,r;
        Scanner scanner=new Scanner(System.in);


        public void triangle()
        {
            System.out.println("Enter data.");
            System.out.println("Enter side a");
            a = scanner.nextDouble();

            System.out.println("Enter side b");
            b = scanner.nextDouble();
            System.out.println("Enter side c");
            c = scanner.nextDouble();
            System.out.println("Enter side h");
            h = scanner.nextDouble();



        }

        public void square()
        {
            System.out.println("Enter data.");
            System.out.println("Enter side a");
            a = scanner.nextDouble();


        }

        public void circle() {
            System.out.println("Enter data.");
            System.out.println("Enter side r");
            r = scanner.nextDouble();

        }
        public Triangle method1()
        {
            Triangle t = new Triangle(a, b, c, h);
            return t;
        }
        public Square method2()
        {
            Square s = new Square(a);
            return s;
        }
        public Circle method3()
        {
            Circle co = new Circle(r);
            return co;
        }

    }
