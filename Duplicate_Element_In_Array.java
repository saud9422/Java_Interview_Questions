package Java_Interview_Questions;
//Question : Find the duplicate Element from the array..
import java.util.HashSet;
import java.util.Set;

public class Duplicate_Element_In_Array {
    public static void main(String[] args) {
        int[] arr={4,2,6,2,5,8,4,3,2,5};
//        m1(arr);
        m2(arr);
    }
    public static void m1(int[] arr){
        System.out.println("The Duplicate Element are :");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }

    public static void m2(int[] arr)
    {
        System.out.println("The duplicate Element are :");
        Set<Integer> set=new HashSet<>();
        for (int a:arr){
            if (set.add(a)==false){
                System.out.println(a);
            }
        }
    }
}
