public class SbiBank extends BankApp{
    int years;
    public SbiBank(String name,int age,String taxDetails,int amount,int years){
        super(name,age,taxDetails,amount);
        this.years=years;
    }
    public void guide(){
        System.out.println("I am a subclass"+ this.years + taxDetails);
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Years is "+ this.years);
    }
}
//super upayogikunath matte constructor ente akath ulla value edukan ann
//declare cheyyan vendi super vere constructorel edunnu and extra nthelum add cheyyanel cheyyunu
