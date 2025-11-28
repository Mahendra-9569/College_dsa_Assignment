package StackII;
import java.util.*;
public class infixToPostfix {
    public static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '^') {
            return 3;
        } else {
            return -1;
        }
    }
    public static boolean isRightAssociative(char ch) {
        return ch == '^';
    }
    public static String infixToPostfixConvert(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        for (char ch : infix.toCharArray()) {
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9') {
                postfix.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }
    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)^(f+g*h)-i";
        String postfix = infixToPostfixConvert(infix);
        System.out.println("Postfix Expression: " + postfix);
    }
}
