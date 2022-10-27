import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int num=sc.nextInt();
        int last,rev=0;
        while (num!=0){
            last=num%10;
            rev= rev*10+last;
            num/=10;
        }
        System.out.println("The reverse of the number is: "+ rev);
    }
}
