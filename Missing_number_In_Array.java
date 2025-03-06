package Java_Interview_Questions;

public class Missing_number_In_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7};
        m1(arr);
    }
    public static void m1(int[] arr){
        int sum1=0;
        int sum2=0;

        for (int i = 0; i < arr.length; i++) {
            sum1=sum1+arr[i];
        }

        for (int j = 0; j <=arr[arr.length-1] ; j++) {
            sum2=sum2+j;

        }
        if(sum2-sum1>0){
            System.out.println("The missing Number is : "+(sum2-sum1));
        }
        else {
            System.out.println("No missing value is present ");
        }
    }
}
