public class BankUsers {
    public static void main(String[] args){
        BankApp first=new BankApp("Vishnu",23,"paid",100000);
//        first.setAge(23);
//        first.setAmount(10000);
//        first.setTaxDetails("paid");
//        first.name="malar";
        first.Display();
//
//        BankApp second=new BankApp("Vijayakumar");
//        second.setAge(54);
//        second.setAmount(210000);
//        second.setTaxDetails("paid");
//        second.Display();
        SbiBank second=new SbiBank("vijayakumar",54,"paid",1000,20);
        second.guide();
        second.Display();
    }
}
