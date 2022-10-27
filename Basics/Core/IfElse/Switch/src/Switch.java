public class Switch {
    public static void main(String[] args){

    char alpha = 'D';

        switch(alpha){
        case 'D':
            System.out.println("the letter is found");
            break;
        default:
            System.out.println("the letter is not found");
            break;
    }
    int number=5;
        switch (number){
            case 1:
                System.out.println("the number is not 1");
                break;
            case 5:
                System.out.println("the number is found and it is 5");
                break;
            default:
                System.out.println("the nummber is not found and the default works");
                break;
        }
}
}
