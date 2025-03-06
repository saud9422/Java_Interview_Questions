package Java_Interview_Questions;
//Question : Reverse an Integer
//Explanetion : Reversing a String value can be done using two ways
//          Method1 : this method reverse a String By taking reminder of number
//                    adding this reminder to the rev number by multiplying by 10
//                    and also to take second last number it divide number by 10

//          Method2 : In this method we canvert the value of integer into String
//                    using string.valueOf() method and then Create a stringbuffer
//                      using this String and use pregefine reverse() method of
//                      StringBuffer..


public class Reverse_A_Integer {
    public static void main(String[] args) {
        int nums=12345;
        Method_1(nums);
        Method_2(nums);
    }

    public static void Method_1(int nums){
        int rev=0;
        while(nums != 0){
            rev=rev*10 + nums % 10;
            nums=nums/10;
        }
        System.out.println("The reverse number is :"+rev);
    }

    public static void Method_2(int nums){
        System.out.println(new StringBuffer(String.valueOf(nums)).reverse());
    }

}
