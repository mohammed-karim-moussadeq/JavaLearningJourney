package Algo.structure.brocode;

import java.util.Stack;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String >();

        stack.push("Valorant");
        stack.push("Minecraft");
        stack.push("Forza Horizon");
        stack.push("Gran Tursimo");
        stack.push("League of legends");


        //System.out.println(stack.empty()); // to check of the stack is empty or no

        //System.out.println(stack.peek());  // the peek method gives
        //stack.pop(); // the pop method will always remove the top object from my stack ( which in that case it's league of legends
        //System.out.println(stack.peek()); // if i want to take a peek of the top object on my stack i use the peek method.
        System.out.println(stack.search("League of legends")); // the search method search for the index of the object in my stack and if i search smth that is not on my stack the result will be -1.
        // Uses of stack: 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        //3. backtracking algorithms ( maze, file directories)
        //4. calling functions ( call stack )



    }

}