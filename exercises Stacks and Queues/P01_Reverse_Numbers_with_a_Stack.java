package Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01_Reverse_Numbers_with_a_Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] numbersArr = scanner.nextLine().split(" ");

        ArrayDeque<String> numbersStack = new ArrayDeque<>();

        for (String s : numbersArr) {
            numbersStack.push(s);
        }

        for (String s : numbersStack) {
            System.out.print(numbersStack.pop() + " ");

        }
    }
}
