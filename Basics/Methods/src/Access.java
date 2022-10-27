import java.util.ArrayList;

public class Access {
    private int score = 85;

    public static void main(String[] args) {
        System.out.println("Program to know about the access modifiers");
        Display();
        int num1=87;
        int num2=6;
        System.out.println("the largest is "+ smallest(num1,num2));
        System.out.println("The sum is "+ add(num1,num2));
        ArrayList<String> heros=new ArrayList<String>();
        heros.add("hulk");
        heros.add("ironman");
        heros.add("thor");
        heros.add(0,"Captian America");
        System.out.println(heros.get(0));
        System.out.println(heros.get(1));
    }

    public static void Display() {
        System.out.println("This message is displayed in the function");
        System.out.println("hello fucntion");
    }
    public static int add(int a,int b){
        int sum;
        sum=a+b;
        return sum;
    }

    public static int smallest(int a, int b) {
        int min;
        if(a>b){
            min=a;
        }else{
            min=b;
        }
        return min;
    }
}
//public-visible to everyone
//private-visible only to the class
//protected-visible to the packages and to all the subclass
//
//static- it is a modifier used to create class,method,variables.which is created statically not permanent
//final- type of a modifier which is created permanently it cannot be changed
//Parameter is a variable which is passed to a function so that the body can use it.