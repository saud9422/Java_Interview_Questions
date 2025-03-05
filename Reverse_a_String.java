package Java_Interview_Questions;
// Question : Reverse a String Using for loop and using StringBuffer class method Called reverse().
//Explanation : In java string is immutable objects so there is no predefine method to reverse a string
//              we can reverse a string using for loop and also use StringBuffer Class object because
//             StringBuffer Object is mutable and provide a predefine method to reverse a string


public class Reverse_a_String {
    public static void main(String[] args) {
        String string="Hello";
        m1(string);
        m2(string);
    }
    static void m1(String string){
        int len=string.length();
        String rev="";

        for (int i = len-1 ; i >= 0 ; i--) {
            rev+=string.charAt(i);
        }
        System.out.println("Reverse the String using for loop : "+rev);
    }

    static void m2(String string){
        StringBuffer rev=new StringBuffer(string);
        rev.reverse();
        System.out.println("Reverse the String using StringBuffer : "+rev);
    }
}
