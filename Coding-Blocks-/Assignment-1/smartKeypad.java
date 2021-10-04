import java.util.*;
public class smartKeypad {
    private static String genrateCode(char ch) {
        if(ch=='0') {
            return " ";
        }
        if(ch=='1') {
          return ".+@$";
        }
        if(ch=='2') {
            return "abc";
        }
        else if(ch=='3') {
            return "def";
        }
        else if(ch=='4')
         {
            return "ghi";
        }
        else if(ch=='5') {
            return "jkl";
        }
        else if(ch=='6') {
            return "mno";
        }
        else if(ch=='7') {
            return "pqrs";
        }
        else if(ch=='8') {
            return "tuv";
        }
        else if(ch=='9') {
            return "wxyz";
        }
        else {
            return "";
        }
    }
    private static void checkCode(String input,String output) {
        if(input.length()==0) {
            System.out.println(""+output);
            return;
 
        }
 
 
        char first=input.charAt(0);
        String s1=input.substring(1);
        String s2=genrateCode(first);  
        for(int i=0;i<s2.length();i++) {
 
            checkCode(s1,output+s2.charAt(i));
 
 
        }
 
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
 
        checkCode(str,"");
 
    }
}