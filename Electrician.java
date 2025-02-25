import java.util.Scanner;
public class Electrician {
    Scanner sc=new Scanner(System.in);
    static int x=0;
    static int z=0;
    void electriclist(){
        System.out.println("1.      Rahul      500 per hour");
        System.out.println("2.      Vivek      600 per hour");
        System.out.println("3.      Exit");
    }
    void Electric(){
        System.out.println("                    "+Main.BLACK+Main.BLUE_BACKGROUND+"List of Electricians"+Main.def);
        electriclist();
        int a=sc.nextInt();
        switch (a) {
            case 1:
            if(x==0){
                System.out.println(Main.BLACK+Main.BROWN_BACKGROUND+"You Selected Rahul"+Main.def);
                System.out.println(Main.BLACK+Main.LIGHT_BLUE_BACKGROUND+"Rahul will charge 500 per hour"+Main.def);
                System.out.println("If you want to book him press 1 to go back press 2");
                int b=sc.nextInt();
                if(b==1){
                    System.out.println(Main.BLACK+Main.BLUE_BACKGROUND+"You are booking Rahul"+Main.def);
                    System.out.println("               "+Main.RED+"PAYMENT"+Main.def);
                    Payment obj2=new Payment();
                    double c=obj2.paybill(500);
                    System.out.println(Main.GREEN+"You have to pay minimum amount : "+c+"/-"+Main.def);
                    System.out.println("To pay the minimum amount press 1 or to go back press 2");
                    int d=sc.nextInt();
                    if(d==1){
                        if(obj2.billpayment(c)==true){
                            x++;
                            Loading.load();
                            System.out.println(Main.BLACK+Main.GREEN_BACKGROUND+Main.blink+"You Sucessfully Booked Rahul"+Main.def);
                            System.out.println();
                            System.out.println(Main.LIGHT_PINK+"His Contact Details are : "+Main.def);
                            System.out.println(Main.ORANGE+"Name            :  RAHUL");
                            System.out.println("Mobile Number   :  7846468362");
                            System.out.println("Address         :  123, ABC STREET");
                            System.out.println("Email           :  rahul@gmail.com"+Main.def);
                            System.out.println("You have Successfully Booked a Electrician");
                            System.out.println("We hope you will satisfy with RAHUL work Thank You!!");
                            System.out.println(Main.BLACK+Main.BROWN_BACKGROUND+"To go back press 1 or to directly exit press 2"+Main.def);
                            int v=sc.nextInt();
                            if(v==1){
                                System.out.println("Going back to Electric List");
                                Electric();
                                break;
                            }

                            else{
                                break;
                            }
                        }
                        else{
                            Electric();
                            break;
                        }
                    }
                    else{
                        System.out.println("Going back to Electric List");
                        Electric();
                        break;
                    }
                }
                else{
                    System.out.println("Going back to Electric List");
                    Electric();
                    break;
                }
            }
            else{
                System.out.println(Main.BLACK+Main.RED_BACKGROUND+"Rahul is already booked so plz try to book others"+Main.def);
                System.out.println("To go back press 1");
                int v=sc.nextInt();
                if(v==1){
                    System.out.println("Going back to Electric List");
                    Electric();
                    break;
                }
            }    
                break;
            case 2:
            if(z==0){

                System.out.println(Main.BLACK+Main.BROWN_BACKGROUND+"You Selected Vivek"+Main.def);
                System.out.println(Main.BLACK+Main.LIGHT_BLUE_BACKGROUND+"Vivek will charge 600 per hour"+Main.def);
                System.out.println("If you want to book him press 1 to go back press 2");
                int c=sc.nextInt();
                if(c==1){
                    System.out.println(Main.BLACK+Main.BLUE_BACKGROUND+"You are booking Vivek"+Main.def);
                    System.out.println("               "+Main.RED+"PAYMENT"+Main.def);
                    Payment obj2=new Payment();
                    double e=obj2.paybill(600);
                    System.out.println(Main.GREEN+"You have to pay minimum amount : "+e+"/-"+Main.def);
                    System.out.println("To pay the minimum amount press 1 or to go back press 2");
                    int d=sc.nextInt();
                    if(d==1){
                        if(obj2.billpayment(e)==true){
                            z++;
                            Loading.load();
                            System.out.println(Main.BLACK+Main.GREEN_BACKGROUND+Main.blink+"You Sucessfully Booked Vivek"+Main.def);
                            System.out.println();
                            System.out.println(Main.LIGHT_PINK+"His Contact Details are : "+Main.def);
                            System.out.println(Main.ORANGE+"Name            :  VIVEK");
                            System.out.println("Mobile Number   :  7846468362");
                            System.out.println("Address         :  123, ABC STREET");
                            System.out.println("Email           :  vivek@gmail.com"+Main.def);
                            System.out.println("You have Successfully Booked a Electrician");
                            System.out.println("We hope you will satisfy with VIVEK work Thank You!!");
                            System.out.println(Main.BLACK+Main.BROWN_BACKGROUND+"To go back press 1 or to directly exit press 2"+Main.def);
                            int v=sc.nextInt();
                            if(v==1){
                                System.out.println("Going back to Electric List");
                                Electric();
                                break;
                            }

                            else{
                                break;
                            }
                        }
                        else{
                            Electric();
                            break;
                        }
                    }
                    else{
                        System.out.println("Going back to Electric List");
                        Electric();
                        break;
                    }
                    
                }
                else{
                    System.out.println("Going back to Electric List");
                    Electric();
                    break;
                }
            }
            else{
                System.out.println(Main.BLACK+Main.RED_BACKGROUND+"Vivek is already booked so plz try to book others"+Main.def);
                System.out.println("To go back press 1");
                int v=sc.nextInt();
                if(v==1){
                    System.out.println("Going back to Electric List");
                    Electric();
                    break;
                }
            }    
            break;
            case 3:
                System.out.println("Going Back To Workers List");
                Worker obj=new Worker();
                obj.TypeOfWorker();
                break;
        }
    }
    
}
