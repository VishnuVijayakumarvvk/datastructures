import java.util.Scanner;
public class ArrayExc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] array=new int[5];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<5;i++){
            array[i]=sc.nextInt();
        }
        for(int j=0;j<array.length;j++){
            System.out.println("Element is "+array[j]);
        }
        int largest=array[0];
        for(int k=1;k<array.length;k++){
            if(array[k]>largest){
                largest=array[k];
            }
        }
        System.out.println("The largest number in the array is " + largest);
        int sum=0;
        for(int l=0;l<array.length;l++){
            sum=sum+array[l];
        }
        System.out.println("The sum of the array is "+sum);
    }
}
