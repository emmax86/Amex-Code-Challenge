package com.stevex86;

import java.util.Stack;

public class Parser {

    public Parser() {

    }

    public boolean checkParenthesisBalance(String input) {
        if (input.equals("")) {
            return true;
        }

        Stack<Character> charStack = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            char curChar = input.charAt(i);
            if (curChar == '(' || curChar == '{' || curChar == '[') {
                charStack.push(curChar);
            }
            else if (curChar == ')' || curChar == '}' || curChar == ']') {
                if (charStack.empty()) {
                    return false;
                }
                char top = charStack.pop();
                switch (curChar) {
                    case ')':
                        if (top != '(') {
                            return false;
                        }
                        break;
                    case '}':
                        if (top != '{') {
                            return false;
                        }
                        break;
                    case ']':
                        if (top != '[') {
                            return false;
                        }
                        break;
                }
            }
        }
        return charStack.empty();
    }

}