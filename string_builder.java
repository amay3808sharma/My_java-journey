public class string_builder{
    public static void main(String []args){
        StringBuilder sb=new StringBuilder("aman");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'p');
        System.out.println(sb);
        sb.insert(2,'k');
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);
System.out.print(sb.length());
        
    }
}