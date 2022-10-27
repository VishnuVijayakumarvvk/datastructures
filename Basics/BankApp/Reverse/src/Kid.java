import java.util.ArrayList;
import java.util.Scanner;
class Kid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the extraCandies: ");
        int extraCandies=sc.nextInt();
        int[] input=new int[5];
        ArrayList<Boolean> output=new ArrayList<Boolean>(5);
        System.out.println("Enter the array elemets: ");
        for(int i=0;i<5;i++){
            input[i]=sc.nextInt();
        }
        for(int i=0;i<input.length;i++) {
            if (input[i] + extraCandies >= 5){
                output.add(true);
            } else {
                output.add(false);
            }
        }
        for(int j=0;j<input.length;j++){
            System.out.println(output.get(j));
        }

    }
}