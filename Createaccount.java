//USE OF CONSTUCTOR .
class Account{
    private int id;
    private String name;
    private double balance;
    Account(){
        id=1000;
        name="mohan";
        balance=120000.00;
    }
    void show(){
        System.out.println("account id is "+id);
        System.out.println("name is "+name);
        System.out.println("balance "+balance);
        
    }
}
class Createaccount{
    public static void main(String[]args){
        Account a=new Account();
        a.show();
        Account b=new Account();
        b.show();
    }
}   