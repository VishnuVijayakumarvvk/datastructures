

public class BankApp {
    String name;
    int age;
    String taxDetails;
    int amount;
//    Contructor
    public BankApp(String name,int age,String taxDetails,int amount){
        this.name=name;
        this.age=age;
        this.taxDetails=taxDetails;
        this.amount=amount;
    }

    public void Display(){
        System.out.println("Name is "+this.name);
        System.out.println("Age is "+this.age);
        System.out.println("Tax details are "+this.taxDetails);
        System.out.println("Amount is "+ this.amount);
    }
}

//  Contructor
//public BankApp(String name){
//        this.name=name;
//        }
//public void setAge(int age){
//        this.age=age;
//        }
//public void setTaxDetails(String taxDetails){
//        this.taxDetails=taxDetails;
//        }
//public void setAmount(int amount){
//        this.amount=amount;
//        }
//public void Display(){
//        System.out.println("Name is "+this.name);
//        System.out.println("Age is "+this.age);
//        System.out.println("Tax details are "+this.taxDetails);
//        System.out.println("Amount is "+ this.amount);
//        }
//        }
