// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
import java.util.*;

public class Anagram_group{
    public static void main(String[] args) {
        



        String[] words = {"eat","listennn","silent","tea","ate"};
        //Visited Array visited=[false,false,false,false,false]
        boolean visited[] = new boolean[words.length];
        //outer Loop
        for (int i = 0; i < words.length; i++) {

            if (visited[i])
                continue;

            List<String> group = new ArrayList<>();
            group.add(words[i]);//eat

            //Inner Loop compare with other
            for (int j = i + 1; j < words.length; j++) {

                if (isAnagram(words[i], words[j])) {
                    group.add(words[j]);
                    visited[j] = true;
                }
            }

            System.out.println(group);
        }
    }


    static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length())
            return false;

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }

        return true;
    
    }
}