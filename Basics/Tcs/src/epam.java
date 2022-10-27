public class epam {
    public static void main(String[] args){
        int[] fib=new int[10];
        fib[0]=0;
        fib[1]=1;
        int sum=fib[0]+fib[1];
        for(int i=2;i<=4;i++){
            fib[i]=fib[i-1]+fib[i-2];
            sum+=fib[i];

        }
        System.out.println(sum);

    }
}
