package Stack1;

public class PostFix {
    public static int evaluatePostfix(String exp) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (char ch : exp.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); 
            } else {
                int val2 = stack.pop();
                int val1 = stack.pop();
                switch (ch) {
                    case '+':
                        stack.push(val1 + val2);
                        break;
                    case '-':
                        stack.push(val1 - val2);
                        break;
                    case '*':
                        stack.push(val1 * val2);
                        break;
                    case '/':
                        stack.push(val1 / val2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        /*
        Evaluate the value of an arithmetic expression in Reverse Polish Notation.

        Valid operators are +, -, *, and /. Each operand may be an integer or another expression.

        Note that division between two integers should truncate toward zero.
        */
        String exp = "231*+9-";
        int result = evaluatePostfix(exp);
        System.out.println("The result of the postfix expression is: " + result);
    }   
}
