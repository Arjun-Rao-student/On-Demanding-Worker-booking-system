import java.util.Scanner;
public class Payment {
    static Scanner sc=new Scanner(System.in);
    double paybill(double a){
        double b=(a*25)/100;
        return b;
    }
    boolean billpayment(double c){

        if(c<=AccountDetails.balance){
            //double d=AccountDetails.balance-c;
            AccountDetails.balance=AccountDetails.balance-c;
            System.out.println(Main.GREEN+"Sucessfully paid "+c+"/-"+Main.def);
            System.out.println(Main.BLACK+Main.CYAN_BACKGROUND+"Your remaining balance is "+AccountDetails.balance+"/-"+Main.def);
            return true;
        }
        else{
            System.out.println(Main.BLACK+Main.RED_BACKGROUND+"Your Account Balance is Low !!"+Main.def);
            System.out.println("To deposit press 1 or to go back press 2");
            int e=sc.nextInt();
            if(e==1){
                AccountDetails obj=new AccountDetails();
                //obj.AccountDet();
                System.out.println("Enter the amount to deposit");
                double g=sc.nextDouble();
                double h=obj.deposit(g);
                System.out.println(Main.GREEN+"You have sucessfully deposited "+g+"/-"+Main.def);
                System.out.println(Main.BLACK+Main.CYAN_BACKGROUND+"Your current balance is "+h+"/-"+Main.def);
                System.out.println("To pay bill press 1");
                int f=sc.nextInt();
                if(f==1){
                    billpayment(c);
                    return true;
                    
                }
            }
            else{
                System.out.println(Main.BLACK+Main.RED_BACKGROUND+"Payment Failed !"+Main.def);
                
            }

        }
        return false;
    }
}
