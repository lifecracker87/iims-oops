import java.util.Scanner;

public class AreaCalculationConsole {
    public void areaOfTriangle(){
        int b,h; float a; //data representation
        Scanner s = new Scanner(System.in); // take user input
        System.out.println("Enter height of the triangle"); // instruction to the user
        h = s.nextInt(); // read user input
        System.out.println("Enter the base of triangle");
        b = s.nextInt();
        a = 0.5f*b*h; // algorithm or formula or business logic
        System.out.println("Area of triangle is "+a); // output or result

    }
    public void areaOfCircle(){
        int r; float a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radious of circle");
        r = s.nextInt();
        a = 3.14f*r*r;
        System.out.println("Area of circle is "+a);
    }

    public void perimeterOfCircle(){
        int r; float p;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radious of circle");
        r = s.nextInt();
        p = 3.14f*2*r;
        System.out.println("Perimeter of circle is "+p);
    }
}
