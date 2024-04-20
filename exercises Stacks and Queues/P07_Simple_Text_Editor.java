package Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P07_Simple_Text_Editor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        Deque<String> undoStack = new ArrayDeque<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int command = scanner.nextInt();
            if (command == 1) {
                String str = scanner.next();
                undoStack.push(text.toString()); // push current text to undo stack before appending
                text.append(str);
            } else if (command == 2) {
                int count = scanner.nextInt();
                undoStack.push(text.toString()); // push current text to undo stack before erasing
                text.setLength(text.length() - count);
            } else if (command == 3) {
                int index = scanner.nextInt();
                System.out.println(text.charAt(index - 1));
            } else if (command == 4) {
                if (!undoStack.isEmpty()) {
                    text = new StringBuilder(undoStack.pop());
                }
            }
        }

    }
}
