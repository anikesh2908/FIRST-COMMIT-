import java.util.*;
public class java4 {
    public static void calculatearea(int l,int b){
        int area=2*(l+b);
        System.out.println("area of rectangle is:" +area);
    }
    public static void sum(int a, int b,int c,int d){
        int sum=a+b+c+d;
        System.out.println("the sum of four numbers is" + sum);
    }
    public static void primeNo(int a){
        if(a % 2 == 0){
            System.out.println("no is a prime number");
        }
        else{
            System.out.println("no is not prime number");
        }

    }
    public static void calculateVolume(int l,int b,int h){
        int volume=l*b*h;
        System.out.println("volume is"+volume);
    }
    public static void main(String args[]){
        //calculatearea(24,4 );
        //primeNo(24);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length: ");
        int l=sc.nextInt();
        System.out.println("enter breadth: ");
        int b=sc.nextInt();
        System.out.println("enter height: ");
        int h=sc.nextInt();
        int v=l*b*h;
        System.out.println("the volume is"+v);
    
}
}