import java.util.*;

public class Anagram_Upper {
    public static void main(String[] args) {
        
        String str1 = "listen";
        String str2 = "silent";

        //Check length
        if (str1.length() != str2.length()) {
            System.out.println("Not an Anagram");
            return;
        }

        //Convert to char array
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        //convert into uppercase :

        //Sort arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //Compare
        boolean flag = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                flag = false;
                break;
            }
        }

        //print
        if (flag) {
            System.out.println("It is an Anagram");
        } else {
            System.out.println("It is Not an Anagram");
        }
    }
}
