package fr.emse.ai.adversarial;

import java.util.ArrayList;
import java.util.List;

public class Justtesting {

    public static String traduce(Integer i) {
        if (i == 1) {
            return "X";
        } else if (i == -1) {
            return "O";
        } else {
            return " ";
        }
    }

    public static void printState(List<Integer> state) {
        System.out.println(" ___ ___ ___");
        System.out.println("| " + traduce(state.get(1)) + " | " + traduce(state.get(2)) + " | " + traduce(state.get(3)) + " |");
        System.out.println(" --- --- ---");
        System.out.println("| " + traduce(state.get(4)) + " | " + traduce(state.get(5)) + " | " + traduce(state.get(6)) + " |");
        System.out.println(" --- --- ---");
        System.out.println("| " + traduce(state.get(7)) + " | " + traduce(state.get(8)) + " | " + traduce(state.get(9)) + " |");
        System.out.println(" ___ ___ ___");
    }

    public static void main(String[] args) {

        List<Integer> initialState = new ArrayList<Integer>();
        ArrayList<Integer> actions = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            initialState.add(0);
        }

        for (int i = 1; i < 10; i++) {
            if (initialState.get(i) == 0) {
                actions.add(i);
            }
        }

        Integer action = actions.get(3);

        ArrayList<Integer> newState = new ArrayList<Integer>();
        newState.addAll(initialState);
        System.out.println(initialState);
        System.out.println(newState);
        for (int i = 1; i < 10; i++) {
            if (action == i) {
                newState.set(i, 1 - 2 * newState.get(0));
            }
        }
        System.out.println(newState);


    }
}
