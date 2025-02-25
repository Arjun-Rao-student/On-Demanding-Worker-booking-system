import java.util.Scanner;
public class Worker {
    Scanner sc=new Scanner(System.in);
    void workerlist(){
        System.out.println("                    "+Main.BLACK+Main.LIGHT_PURPLE_BACKGROUND+"WORKER LIST"+Main.def);
        System.out.println("1. Plumber");
        System.out.println("2. Electrician");
        System.out.println("3. Carpenter");
        System.out.println("4. Exit");
    }
    void TypeOfWorker(){
        workerlist();
        System.out.println(Main.ORANGE+"---------------SELECT TYPE OF WORKER----------------"+Main.def);
        int a=sc.nextInt();
        switch (a) {
            case 1:
            System.out.println("You Selected Plumber");
            Plumber obj3=new Plumber();
            obj3.plumber();
            break;

            case 2:
            System.out.println("You Selected Electrician");
            Electrician obj4=new Electrician();
            obj4.Electric();
            break;

            case 3:
            System.out.println("You Selected Carpenter");
            Carpenter obj5=new Carpenter();
            obj5.carpenters();
            break;
            
            case 4:
            System.out.println("Back To List");
            InitialList obj=new InitialList();
            obj.Initial();
            // Main obj=new Main();
            // // if(obj.Login()){
            // //     Worker obj2=new Worker();
            // //     obj2.TypeOfWorker();
            // // }
            break;
        }

    }
    
}
