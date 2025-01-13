package org.example.Practice_Program;

public class longestSequesnceFromstring {
    public static String longestCP(String s, String t){
        int n = Math.min(s.length(),t.length());
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != t.charAt(i)){
                return s.substring(0,i);
            }
        }
        return s.substring(0,n);
    }

    public static void main(String[] args) {
        String str = "abracabracutyadabra";
        String longestRS="";
        int len = str.length();
        for(int i = 0; i < len; i++){
            for(int j = i+1; j < len; j++){
                String s =
                        longestCP(str.substring(i,len),str.substring(j,len));
                if(s.length() > longestRS.length())
                    longestRS=s;
            }
        }
        System.out.println("Longest repeating sequence" +
                " in the given string is: "+longestRS);
    }
}
