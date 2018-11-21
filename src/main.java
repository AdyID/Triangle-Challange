import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        // values should be float because you can make a triangle even with rational numbers but they have to be positive.

        float a = numA(); //reads side a from keyboard
        float b = numB(); //reads side b from keyboard
        float c = numC(); //reads side c from keyboard

        if(a==b && b==c){ // equilateral means 3 sides are equal
            System.out.println('\n' + "The Triangle is Equilateral");
        }
        else{
            if(isosceles(a,b,c)==true){
                System.out.println('\n' + "The Triangle is Isosceles");
            }
            else{
                if(scalene(a,b,c)==true){
                    System.out.println('\n' + "The Triangle is Scalene");
                }
                else{
                    System.out.println('\n'+"Invalid input values"); //this message is printed if the triangle can't be formed with the given sizes
                }
            }
        }

    }

    public static float numA (){
        Scanner keyboard = new Scanner(System.in);
        float a=0;
        while(a<=0) {
            System.out.print("a side=");
            a = keyboard.nextFloat();
            if(a==0 || a<0){
                System.out.println("a side has to be >0");
            }
        }
        return a;
    }

    public static float numB(){
        Scanner keyboard = new Scanner(System.in);
        float b=0;
        while(b<=0){
            System.out.print("b side=");
            b = keyboard.nextFloat();
            if(b==0 || b<0){
                System.out.println("b side has to be >0");
            }
        }
        return b;
    }

    public static float numC(){
        Scanner keyboard = new Scanner(System.in);
        float c=0;
        while(c<=0){
            System.out.print("c side=");
            c = keyboard.nextFloat();
            if(c==0 || c<0){
                System.out.println("c side has to be >0");
            }
        }
        return c;
    }

    public static boolean isosceles (float a, float b, float c){ //2 sides have 2 be equal and also sum up more than the other side
        if(a==b) {
            if (a + b > c)
                return true;
        }
        else {
            if (b == c) {
                if (b + c > a)
                    return true;
            }
            else {
                if (a == c) {
                    if (a + c > b)
                        return true;
                }
            }
        }

        return false;

    }

    public static boolean scalene (float a,float b, float c){ //no sides are equal but each 2 sides had to sum more than the other one
        if(a+c>b){ //
            if(a+b>c){
                if(b+c>a){
                    return true;
                }
            }
        }

        return false;
    }
}
