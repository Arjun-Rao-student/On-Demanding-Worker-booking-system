public class Loading {
    static void load(){
        String s="LOADING...";
        for(int i=0;i<s.length();i++){
            try{
                char ch=s.charAt(i);
                System.out.print(Main.BLUE+ch+" ");
                //Thread.sleep(1000);
            }
            catch(Exception e){
            }
        }
        System.out.println();
    }
}
