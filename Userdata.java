import java.util.ArrayList;
import java.util.Scanner;
public class Userdata {
    
        // Create an ArrayList to store user data
    static ArrayList<String> users = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addUsers(ArrayList<String> users){
        users.add("Raju,8790766335,Raju@123");
        users.add("Rahul,6565464664,Rahul@123");
        users.add("ShivaRama,6376373783,Srk@123");
        users.add("ARJUN,6376373783,Srk@123");


    }
    public static boolean mobno(long l){
        String s=l+"";
        int a=s.length();
        if(a==10){
            return true;
        }
        else{
            System.out.println(Main.BLACK+Main.RED_BACKGROUND+"Mobile number should contain atleast 10 digits"+Main.def);
        }
        return false;
    }
    public static boolean password(String s){
        int Cc=0;
		int Sc=0;
		int Dc=0;
		int Specc=0;
		int Spac=0;
		int a=s.length();
		for(int i=0;i<a;i++){
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z'){
				Cc=1;
			}
			else if(ch>='a' && ch<='z'){
				Sc=1;
			}
			else if(ch>='0' && ch<='9'){
				Dc=1;
			}
			else if(ch!=' '){
				Specc=1;
			}
			else{
				Spac=1;
                System.out.println(Main.BLACK+Main.RED_BACKGROUND+"password should not contain spaces"+Main.def);
				break;
			}
		}
		if(Cc!=0 && Sc!=0 && Dc!=0 && Specc!=0 && Spac==0){
			return true;
		}
		else{
            if(Cc==0){
                System.out.println(Main.BLACK+Main.RED_BACKGROUND+"Password should have at least one Capital letter"+Main.def);
            }
            if(Sc==0){
                System.out.println(Main.BLACK+Main.RED_BACKGROUND+"Password should have at least one Small letter"+Main.def);
            }
            if(Dc==0){
                System.out.println(Main.BLACK+Main.RED_BACKGROUND+"Password should have at least one Digit"+Main.def);
            }
            if(Specc==0){
                System.out.println(Main.BLACK+Main.RED_BACKGROUND+"Password should have at least one Special character"+Main.def);
            }
			return false;
		}
	
    }
    public static boolean addNewUsers(ArrayList<String> users, String name, long mobileNo, String password){
        for (String string : users) {
            String[] user = string.split(",");
            if(user[0].equals(name)){
                return false;
            }

        }
        // if(mobno(mobileNo)==true && password(password)){
        //     users.add(""+name+","+mobileNo+","+password);
        // }
        // else if(mobno(mobileNo)==false){
        //     System.out.println("Invalid Mobile Number");
        // }
        // else if(password(password)==false){


        
        // for (String string : users) {
        //     System.out.println(string);
        // }
    
        return true;
    }
    public static String passre(String s,int index){
        System.out.println(Main.BLACK+Main.BROWN_BACKGROUND+"Password Reset"+Main.def);
        
        // if(password(newPass)){
        //     String[] userData = users.get(index).split(",");
        //     userData[2]=newPass;
        //     users.set(index,userData[0]+","+userData[1]+","+userData[2]);
        //     System.out.println("Password Reset Successfully");
        //     return newPass;
        // }2

        while(true){
            System.out.println("Enter new password");
            String newPass = sc.next();
            String[] userData = users.get(index).split(",");
            if(password(newPass)){
            userData[2]=newPass;
            users.set(index,userData[0]+","+userData[1]+","+userData[2]);
            System.out.println(Main.GREEN+"Password Reset Successfully Done !"+Main.def);
            return newPass;
            }else{
                System.out.println("Enter correct password");
            }
        }
    }

    static int index=-1;
    public static boolean CheckValidUserOrNot(String name,String password){
        for (String string : users) {
            index++;
            String[] user = string.split(",");
            if(user[0].equals(name)){
            if(user[0].equals(name) && user[2].equals(password)){
                return true;
            }
            else if(user[2].equals(password)==false){
                return false;
                // System.out.println(Main.BLACK+Main.RED_BACKGROUND+"Wrong password"+Main.def);
                // System.out.println(Main.YELLOW+"Try again press 1 or to reset password press 2"+Main.def);
                // int passwordReset = sc.nextInt();
                // if(passwordReset==1){
                //     String s=sc.next();
                //     return CheckValidUserOrNot(name, s);
                // }
                // else{
                //     //// if(passre(password, index)!="false"){
                //     String l=passre(password, index);
                //     callLogin();
                //     return true;
                //    // // }
                //     //// else{
                //     ////     System.out.println("Password Reset Failed");
                //     ////     return false;
                //     //// }
                // }

            }
        }
        }
        
        return false;
    }

    public static void callLogin(){
        Main obj = new Main();
        obj.Login();
    }
    public static void passwrong(String name,String password){
        System.out.println(Main.BLACK+Main.RED_BACKGROUND+"Wrong password"+Main.def);
                System.out.println(Main.YELLOW+"Try again press 1 or to reset password press 2"+Main.def);
                int passwordReset = sc.nextInt();
                if(passwordReset==1){
                    // String s=sc.next();
                    // CheckValidUserOrNot(name, s);
                }
                else{
                    
                    // }
                    // else{
                    //     System.out.println("Password Reset Failed");
                    //     return false;
                    // }
                }

    }


}

    

