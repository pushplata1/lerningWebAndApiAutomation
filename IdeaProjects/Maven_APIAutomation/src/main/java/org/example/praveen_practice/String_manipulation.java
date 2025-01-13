package org.example.praveen_practice;

public class String_manipulation {
    public void Reverse_String_Words(String s, StringBuilder sobj){
       String[] sarr=s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i=0;i<sarr.length;i++){
            for(int j=sarr[i].length()-1;i>=0;i--)
            {
                sobj.append(sarr[i].charAt(j));
            }

           result.append(sobj).append(" ");

        }
       String k=result.toString().trim();
        System.out.println(k);
    }


    public void Reverse_String(String s, StringBuilder sobj){

        for(int i=s.length()-1;i>=0;i--){
            sobj.append(s.charAt(i));
        }
        System.out.println(sobj);

    }
    public static void main(String[] args) {

    String s="I am boy";
    StringBuilder sobj=new StringBuilder();
    String_manipulation str= new String_manipulation();
    str.Reverse_String(s,sobj);
    str.Reverse_String_Words(s,sobj);






    }
}
