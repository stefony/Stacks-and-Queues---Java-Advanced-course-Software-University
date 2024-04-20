package Stacks_and_Queues;

import java.util.*;

public class P08_Infix_to_Postfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an infix expression:");
        String input = scanner.nextLine();
        String output = infixToPostfix(input);
        System.out.println("Postfix expression:");
        System.out.println(output);
    }

    public static String infixToPostfix(String expression) {
        List<String> outputList = new ArrayList<>();
        Deque<String> stack = new ArrayDeque<>();
        String[] tokens = expression.split("\\s+");

        Map<String, Integer> precedence = new HashMap<>();
        precedence.put("+", 1);
        precedence.put("-", 1);
        precedence.put("*", 2);
        precedence.put("/", 2);

        for (String token : tokens) {
            if (token.matches("[a-z]|\\d")) {  // Check if token is a variable or digit
                outputList.add(token);
            } else if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    outputList.add(stack.pop());
                }
                stack.pop();  // Remove the '(' from the stack
            } else {  // The token is an operator
                while (!stack.isEmpty() && precedence.containsKey(stack.peek()) &&
                        precedence.get(token) <= precedence.get(stack.peek())) {
                    outputList.add(stack.pop());
                }
                stack.push(token);
            }
        }

        while (!stack.isEmpty()) {
            outputList.add(stack.pop());
        }

        return String.join(" ", outputList);
    }
}
