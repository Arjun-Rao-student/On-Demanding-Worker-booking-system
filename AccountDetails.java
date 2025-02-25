import java.util.Scanner;
public class AccountDetails {
    static Scanner sc=new Scanner(System.in);
	static double balance=0;
    double deposit(double amount){
		balance=balance+amount;
		return balance;
	}
    void list(){
        System.out.println("1.  Balance Enquiry");
        System.out.println("2.  Deposit");
        System.out.println("3.  Exit");
    }
    void AccountDet(){
        AccountDetails obj=new AccountDetails();
        obj.list();
        int n=sc.nextInt();
        switch(n) {
            case 1:
            System.out.println(Main.BLACK+Main.CYAN_BACKGROUND+"Your Current Balance is :"+Main.def+" "+balance+"/-");
            System.out.println("To go back press 1");
            int a=sc.nextInt();
            if(a==1){
                AccountDet();
                break;
            }
            break;  

            case 2:
            System.out.println("Enter the amount  to deposit");
            double m=sc.nextDouble();
            if(m<100){
                System.out.println(Main.BLACK+Main.RED_BACKGROUND+"Minimum amount to deposit is 100"+Main.def);
                System.out.println("To go back press 1");
                int b=sc.nextInt();
                if(b==1){
                    AccountDet();
                    break;
                }
            }
            else{
                obj.deposit(m);
                System.out.println(Main.BLACK+Main.LIGHT_GREEN_BACKGROUND+"Sucessfully Deposited : "+m+"/-"+Main.def);
                System.out.println("To go back press 1");
                int b=sc.nextInt();
                if(b==1){
                    AccountDet();
                    break;
                }
            }

            break;

            case 3:
            System.out.println("Back to list");
            InitialList obj1=new InitialList();
            obj1.Initial();
            
            break;

        }


    }
}
