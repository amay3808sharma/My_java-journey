public class strings{
    public static void main(String [] args){
        String firstname="aman";
        String lastname="sharma";
        String fullname=firstname+"@"+lastname;
        System.out.println(fullname);
        System.out.print(fullname.length());
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
       
    }
}