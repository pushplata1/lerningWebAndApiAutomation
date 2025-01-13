//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class test {
    public static void main(String[] args) {


       // ParentClass p= new child();

      //  p.m1();

        String statement = "This is sample Script";

        String [] str= statement.split(" ");

        String reverse="";


        for(int i=0;i<=str.length-1;i++){
            String word= str[i];

            for(int j=word.length()-1;j>=0;j--){

                reverse= reverse+word.charAt(j);
            }

            reverse=reverse+" ";
        }
        System.out.println(reverse);
        System.out.println("pushp");
    }
    }
