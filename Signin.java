import java.util.*;
public class Signin {
    static Scanner sc=new Scanner(System.in);
    private String name;
    private long Mno;
    private String password;
    void signup(String name,long Mno,String password){
        this.name=name;
        this.Mno=Mno;
        this.password=password;
    }
    String get_name(){
        return name;
    }
    String get_password(){
        return password;
    }
    long get_mno(){
        return Mno;
    }

}
