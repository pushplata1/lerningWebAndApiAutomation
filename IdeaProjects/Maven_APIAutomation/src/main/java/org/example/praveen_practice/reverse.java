package org.example.praveen_practice;

public class reverse {


    public String BYcharArray(String name){
        String Rev="";
        char[] ch=name.toCharArray();
        for (int i=ch.length-1;i>=0;i-- ){
            Rev=Rev+ch[i];
        }
        return Rev ;
    }

    public String By_CharAt(String name){
        String Rev="";
        for(int i=name.length()-1; i>=0;i--){
            Rev=Rev+name.charAt(i);


        }
        return Rev;


    }

    public static void main(String[] args) {


        String name="Praveen";
reverse s=new reverse();

       String a =s.BYcharArray(name);
        System.out.println("By method 'BycharArray': "+a);

        System.out.println("By method 'By_CharAt': "+s.By_CharAt(name));

    }
}
