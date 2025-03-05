package Java_Interview_Questions;

//Ouestion : Remove all junks and special charracter from the string...
//Explenation : to remove all junks from the string we can use replaceAll method of String
//                where first argument is regular expression and second is replacement
//                regular expression is specify inside a square brackets it cantain all
//                the value the you  want to remove from the string if you use it with
//                ^ not than it means remove all other element except those element
//                specify in the regular expression replacement is use to pass a charracter by
//                which you want to replace the existing element ..

public class Remove_Junks_and_SpecialChar_From_String {
    public static void main(String[] args) {
        String str="%$@%$Saud%^%Khan";
        str=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
    }
}
