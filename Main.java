import java.util.*;
public class Main {
  public static final String BLACK = "\033[0;30m"; // BLACK
  public static final String RED = "\033[0;31m"; // RED
  public static final String GREEN = "\033[0;32m"; // GREEN
  public static final String YELLOW = "\033[0;33m"; // YELLOW
  public static final String BLUE = "\033[0;34m"; // BLUE
  public static final String PURPLE = "\033[0;35m"; // PURPLE
  public static final String CYAN = "\033[0;36m"; // CYAN
  public static final String WHITE = "\033[0;37m"; // WHITE
  public static final String LIGHT_PURPLE = "\033[38;2;200;0;200m"; // LIGHT PURPLE
  public static final String TEAL = "\033[38;2;0;225;221m"; // TEAL
  public static final String ORANGE = "\033[38;2;225;153;0m"; // ORANGE
  public static final String LIGHT_GREEN = "\033[38;2;136;255;0m"; // LIGHT GREEN
  public static final String LIGHT_BLUE = "\033[38;2;120;172;255m"; // LIGHT BLUE
  public static final String DARK_BLUE = "\033[38;2;72;0;255m"; // DARK BLUE
  public static final String ROSY_PINK = "\033[38;2;255;0;162m"; // ROSY PINK
  public static final String BROWN = "\033[38;2;135;82;62m"; // BROWN
  public static final String FOREST_GREEN = "\033[38;2;62;135;81m"; // FOREST GREEN
  public static final String BANANA_YELLOW = "\033[38;2;240;238;113m"; // BANANA YELLOW
  public static final String DARK_RED = "\033[38;2;145;40;16m"; // DARK RED
  public static final String LIGHT_PINK = "\033[38;2;255;153;240m"; // LIGHT PINK
  public static final String def = "\u001b[0;1m";
  public static final String blink = "\u001b[5m";
  public static final String red = "\u001b[31;1m";
  public static final String green = "\u001b[32;1m";
  public static final String yellow = "\u001b[33;1m";
  public static final String blue = "\u001b[34;1m";
  public static final String purpe = "\u001b[35;1m";
  public static final String skblue = "\u001b[36;1m";
  // Background
  public static final String BLACK_BACKGROUND = "\033[40m"; // BLACK
  public static final String RED_BACKGROUND = "\033[41m"; // RED
  public static final String GREEN_BACKGROUND = "\033[42m"; // GREEN
  public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
  public static final String BLUE_BACKGROUND = "\033[44m"; // BLUE
  public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
  public static final String CYAN_BACKGROUND = "\033[46m"; // CYAN
  public static final String WHITE_BACKGROUND = "\033[47m"; // WHITE
  public static final String LIGHT_PURPLE_BACKGROUND = "\033[48;2;200;0;200m"; // LIGHT PURPLE
  public static final String TEAL_BACKGROUND = "\033[48;2;0;225;221m"; // TEAL
  public static final String ORANGE_BACKGROUND = "\033[48;2;225;153;0m"; // ORANGE
  public static final String LIGHT_GREEN_BACKGROUND = "\033[48;2;136;255;0m"; // LIGHT GREEN
  public static final String LIGHT_BLUE_BACKGROUND = "\033[48;2;120;172;255m"; // LIGHT BLUE
  public static final String DARK_BLUE_BACKGROUND = "\033[48;2;72;0;255m"; // DARK BLUE
  public static final String ROSY_PINK_BACKGROUND = "\033[48;2;255;0;162m"; // ROSY PINK
  public static final String BROWN_BACKGROUND = "\033[48;2;135;82;62m"; // BROWN
  public static final String FOREST_GREEN_BACKGROUND = "\033[48;2;62;135;81m"; // FOREST GREEN
  public static final String BANANA_YELLOW_BACKGROUND = "\033[48;2;240;238;113m"; // BANANA YELLOW
  public static final String DARK_RED_BACKGROUND = "\033[48;2;145;40;16m"; // DARK RED
  public static final String LIGHT_PINK_BACKGROUND = "\033[48;2;255;153;240m"; // LIGHT PINK
    static Scanner sc=new Scanner(System.in);
    static Main obj1=new Main();
    static Signin obj=new Signin();
    boolean Login(){
        
        while(true){
            System.out.println(ORANGE +"Select option 1 or 2"+ def);
            Userdata.addUsers(Userdata.users);
            System.out.println("1. Signup");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            int a=sc.nextInt();
            if(a==1){
                
                System.out.println(BLACK+YELLOW_BACKGROUND+"Enter your name :"+def);
                String name = sc.next();
                System.out.println(BLACK+YELLOW_BACKGROUND+"Enter your MobNo :"+def);
                long mobileNo = sc.nextLong();
                System.out.println(BLACK+YELLOW_BACKGROUND+"Enter your Password :"+def);
                String password = sc.next();
                boolean pass=Userdata.password(password);
                boolean mno=Userdata.mobno(mobileNo);
                boolean existedUserNameOrNot = Userdata.addNewUsers(Userdata.users,name,mobileNo,password);
                if(existedUserNameOrNot==true && pass ==true && mno==true){
                    obj.signup(name, mobileNo, password);
                    Userdata.users.add(""+name+","+mobileNo+","+password);
                    System.out.println();
                    System.out.println(BLACK+GREEN_BACKGROUND+"Signup Successful !"+def);
                    System.out.println();
                    obj1.Login();
                }else if(existedUserNameOrNot==false){
                    System.out.println(BLACK+RED_BACKGROUND+"UserName Already Existed Try with Another name"+def);
                    obj1.Login();
                }
                else if(mno==false){
                    System.out.println("Enter a valid mobile number");
                    obj1.Login();
                }
                else if(pass==false){
                    System.out.println("Enter a valid password");
                    obj1.Login();
                }

                break;
            }
            else if(a==2){
                System.out.println(BLACK+YELLOW_BACKGROUND+"Enter User Name :"+def);
                String b=sc.next();
           
                System.out.println(BLACK+YELLOW_BACKGROUND+"Enter Password :"+def);
                String c=sc.next();
                // if(b.equals(obj.get_name()) && c.equals(obj.get_password())){
                    if(Userdata.CheckValidUserOrNot(b, c)){
                        Loading.load();
                        System.out.println(BLACK+GREEN_BACKGROUND+"Login Successful !"+def);
                        System.out.println();
                        break;
                    }else{
                        Loading.load();
                        System.out.println(BLACK+RED_BACKGROUND+"Login UnSuccessful !"+def);
                        System.out.println(ORANGE+"Please try again!"+def);
                        Userdata.passwrong(b,c);
                         obj1.Login();
                        break;
                    }
                    
                   
                
              
                    
                

                // else if((!b.equals(obj.get_name())) && c.equals(obj.get_password())){
                //     System.out.println("Invalid User Name Please Try Again");
                //     System.out.println("Press 1 to try again 2 to reset Username and Password");
                //     int d=sc.nextInt();
                //     if(d==1){
                //         obj1.Login();
                //     }
                //     else{
                        

                //     }
                // }
                // else if((b.equals(obj.get_name())) && (!c.equals(obj.get_password()))){
                //     System.out.println("Invalid Password Please Try Again");
                // }    
                // else if(!(b.equals(obj.get_name()) && c.equals(obj.get_password()))){
                //     System.out.println("Invalid User Name and Password Please Try Again");
                // }
            }
            else if(a==3){
                return false;
            }


        }
        
        return true;
    }
    public static void main(String[] args) {

        System.out.println("                      "+BLACK+ORANGE_BACKGROUND+"WELCOME TO WORKER BOOKING SITE"+def);
        System.out.println();
        if(obj1.Login()){
            InitialList obj1=new InitialList();
            obj1.Initial();
            // Worker obj2=new Worker();
            // obj2.TypeOfWorker();
        }
        System.out.println(GREEN+blink+"Thank You Hava A Nice Day ...!"+def);
    }
    
}
    

