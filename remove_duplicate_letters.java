import java.util.*;

class Solution {
    public String remove_duplicate_letters(String s) {
        int[] last = new int[26];
        boolean[] seen = new boolean[26];
        Stack<Character> stack = new Stack<>();

        // Store last occurrence of each character
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (seen[c - 'a']) continue;

            while (!stack.isEmpty() && 
                   c < stack.peek() && 
                   last[stack.peek() - 'a'] > i) {
                seen[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            seen[c - 'a'] = true;
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}