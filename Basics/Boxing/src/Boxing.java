import java.util.ArrayList;

public class Boxing {
    public static void main(String[] args){
        ArrayList<Integer> number=new ArrayList<Integer>();
        for(int i=0;i<=10;i++){
            number.add(Integer.valueOf(i)); // Autoboxing
        }
        for(int j=0;j<=10;j++){
            System.out.println(number.get(j).intValue()); // unboxing
        }
    }
}
// Autoboxing- whenever i use the valueof things it is the Autoboxing way
// Unboxing- when i unbox the AutoBoxing using inrValue() that is an Unboxing
