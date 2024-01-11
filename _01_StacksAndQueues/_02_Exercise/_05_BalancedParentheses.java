package _01_StacksAndQueues._02_Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class _05_BalancedParentheses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Deque<Character> openBrackets = new ArrayDeque<>();

        boolean areBalanced = false;

        for (int index = 0; index < input.length(); index++) {
            char currentBracket = input.charAt(index);
            if (currentBracket == '(' || currentBracket == '{' || currentBracket == '[') {
                openBrackets.push(currentBracket);
            } else if (currentBracket == ')' || currentBracket == '}' || currentBracket == ']') {
                if (openBrackets.isEmpty()) {
                    areBalanced = false;
                    break;
                } else {
                    char lastOpenBracket = openBrackets.pop();

                    if (lastOpenBracket == '(' && currentBracket == ')') {
                        areBalanced = true;
                    } else if (lastOpenBracket == '{' && currentBracket == '}') {
                        areBalanced = true;
                    } else if (lastOpenBracket == '[' && currentBracket == ']') {
                        areBalanced = true;
                    } else {
                        areBalanced = false;
                        break;
                    }
                }
            }
        }

        String result = areBalanced ? "YES" : "NO";
        System.out.println(result);

    }
}
package _01_StacksAndQueues._02_Exercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _05_BalancedParentheses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Deque<Character> openBrackets = new ArrayDeque<>();

        String brackets = "({[";

        boolean areBalanced = true;

        for (char currentBracket : input.toCharArray()) {
            if (brackets.contains(currentBracket + "")) {
                openBrackets.push(currentBracket);
            } else {
                if (openBrackets.isEmpty()) {
                    areBalanced = false;
                    break;
                }
                char top = openBrackets.pop();

                if (!(top == '(' && currentBracket == ')' 
                        || top == '{' && currentBracket == '}'
                        || top == '[' && currentBracket == ']')) {
                    areBalanced = false;
                    break;
                }
            }
        }
        String result = areBalanced ? "YES" : "NO";
        System.out.println(result);
    }
}