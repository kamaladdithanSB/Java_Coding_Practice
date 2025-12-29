package string;

public class basicstringoperation {
    public static void main(String[] args) {
        String str1 = "string example";
        int length = str1.length();
        char ch = str1.charAt(5);
        int indf=str1.indexOf("s");
        //String indf1 = str1.lastIndexOf("s");
        String str2= str1.toUpperCase();
        String str3= str1.toLowerCase();
        String str4= str1.replace("g","h");
        
        System.out.println("total length of string str1 = "+length);
        System.out.println("character at the index of 5 in string str1= "+ch);
        System.out.println("printing the first index of s from str1= "+indf);
        //System.out.println("printing the last index of s from str1: "+indf1);
        System.out.println("printing the uppercase of str1= "+str2);
        System.out.println("printing th elowercase of str1= "+str3);
        System.out.println("replacing the character and printing of str1= "+str4);
    }
    
}
