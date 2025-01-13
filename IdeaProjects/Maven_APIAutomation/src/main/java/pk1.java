public class pk1 {
    public static void main(String [] args){

        String  a="jhghj";
        StringBuilder sb =new StringBuilder(a);
        sb=sb.reverse();
        if(a.equals(sb.toString())){
            System.out.println("It is palindrome");
        }



    }
}
