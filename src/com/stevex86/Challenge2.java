import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static String isPanagram(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            Set<Character> charSet = new HashSet<Character>();
            for (int i = 0; i < s.length(); i++) {
                char cur_char = s.charAt(i);
                if (cur_char == ' ') {
                    continue;
                }
                if (!charSet.contains(cur_char)) {
                    charSet.add(cur_char);
                }
            }
            if (charSet.size() == 26) {
                sb.append("1");
            }
            else {
                sb.append("0");
            }
        }
        return sb.toString();
    }

}