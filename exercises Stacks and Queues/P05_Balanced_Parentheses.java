package Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05_Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        boolean isBalanced = false;

        for (char bracket: input.toCharArray()) {

            if (bracket=='(' || bracket=='[' || bracket=='{'){
                stack.push(bracket);

            }else if (bracket==')' || bracket==']' || bracket=='}'){
                if (stack.isEmpty()){
                    isBalanced=false;
                    break;
                }
                char lastOpen = stack.pop();

                if (lastOpen=='(' && bracket==')'){
                    isBalanced=true;

                }else if (lastOpen=='['&& bracket==']'){
                    isBalanced=true;

                }else if (lastOpen=='{' && bracket=='}'){
                    isBalanced=true;

                }else {
                    isBalanced=false;
                    break;
                }
            }

        }
        if (isBalanced){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
