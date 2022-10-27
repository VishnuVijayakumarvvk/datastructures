import java.util.Scanner;
public class ChallangeF {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find the multi table: ");
        int num=sc.nextInt();
        int multi;
        for(int i=1;i<=15;i++){
            multi=num*i;
            System.out.println(i+"*"+num+"="+multi);
        }
    }
}
