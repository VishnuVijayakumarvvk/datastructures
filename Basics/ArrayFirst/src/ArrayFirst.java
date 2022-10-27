import java.util.Scanner;
public class ArrayFirst {
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] array= new int[6];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int j=0;j<array.length;j++){
            System.out.println(array[j]);
        }
    }
}
