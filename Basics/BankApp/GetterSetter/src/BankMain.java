public class BankMain {
    public static void main(String[] args){
        BankEdit edit=new BankEdit("maha",54);
        System.out.println(edit.getname());
        edit.setname("vishnu");
        System.out.println(edit.getname());

    }
}
class BankEdit{
    private String name="jithin";
    private int age;
    private int amount;
    private  int tax;
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public BankEdit(String name,int age){
        this.name=name;
        this.age=age;
    }

}
