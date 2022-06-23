package org.example;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BagInLibrary {

    public static String removeAllDigit(String str)
    {
        // Converting the given string
        // into a character array
        char[] charArray = str.toCharArray();
        String result = "";

        // Traverse the character array
        for (int i = 0; i < charArray.length; i++) {

            // Check if the specified character is not digit
            // then add this character into result variable
            if (!Character.isDigit(charArray[i])) {
                result = result + charArray[i];
            }
        }

        // Return result
        return result;
    }
    public static HashMap<Integer, String> ParserStrings(List<String> strings){
        HashMap<Integer, String> resultMap = new HashMap<Integer, String>();
        for(int i = 0; i< strings.size(); i++){
            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(strings.get(i));
            var num = "";
            while(m.find()) {
                num = m.group();
            }
            String str = removeAllDigit(strings.get(i));

            if((num != null) && (str != null))
            {
                resultMap.put(Integer.valueOf(num), str);
            }
        }
        return resultMap;
    }

    public static void ResultStrings(List<String> strings){
        HashMap<Integer, String> resultMap = ParserStrings(strings);
        if(!resultMap.isEmpty())
        {
            Map<Integer, String> treeMap = new TreeMap<>(resultMap);
            for(int i = 1; i<= treeMap.size(); i++){
                System.out.println(treeMap.get(i));
            }
        }
        else{
            System.out.println("result map is null!");
        }
    }
}
