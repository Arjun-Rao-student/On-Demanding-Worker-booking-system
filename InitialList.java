import java.util.Scanner;
public class InitialList {
    static Scanner sc=new Scanner(System.in);
    static{
        System.out.println(Main.BLACK+Main.LIGHT_PURPLE_BACKGROUND+"WEL COME"+Main.def);
    }
    void Initial(){   
        System.out.println(Main.ORANGE+"Select Any One Of The Following"+Main.def);
        System.out.println("1. List Of Workers");
        System.out.println("2. Your Account Details");
        System.out.println("3. Exit");
        int a=sc.nextInt();
        switch(a) {
            case 1:
            Worker obj2=new Worker();
                obj2.TypeOfWorker();
                break;
            
            case 2:
            AccountDetails obj4=new AccountDetails();
            obj4.AccountDet();
            break;
            case 3:
            Main obj3=new Main();
            if(obj3.Login()){
                InitialList obj5=new InitialList();
                obj5.Initial();

            }
            break;
        }

    }
}
