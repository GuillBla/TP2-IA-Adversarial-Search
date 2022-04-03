package fr.emse.ai.adversarial.tictactoe;

import fr.emse.ai.adversarial.AlphaBetaSearch;
import fr.emse.ai.adversarial.IterativeDeepeningAlphaBetaSearch;
import fr.emse.ai.adversarial.MinimaxSearch;

import java.util.List;
import java.util.Scanner;

public class TictactoeGameplay {

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
        TictactoeGame game = new TictactoeGame();
        MinimaxSearch<List<Integer>, Integer, Integer> minimaxSearch = MinimaxSearch.createFor(game);
        AlphaBetaSearch<List<Integer>, Integer, Integer> alphabetaSearch = AlphaBetaSearch.createFor(game);
        IterativeDeepeningAlphaBetaSearch<List<Integer>, Integer, Integer> iterativeDeepeningAlphaBetaSearch = IterativeDeepeningAlphaBetaSearch.createFor(game, -1, 1, 10);
        List<Integer> state = game.getInitialState();
        System.out.println("You play the X");
        System.out.println("The machine plays the O");
        while (!game.isTerminal(state)) {
            System.out.println("======================");
            printState(state);
            int action = -1;
            if (state.get(0) == 0) {
                //human
                List<Integer> actions = game.getActions(state);
                Scanner in = new Scanner(System.in);
                while (!actions.contains(action)) {
                    System.out.println("Human player, what is your action?");
                    action = in.nextInt();
                }
            } else {
                //machine
                System.out.println("Machine player, what is your action?");
                action = minimaxSearch.makeDecision(state);
                System.out.println("Metrics for Minimax : " + minimaxSearch.getMetrics());
                //action = alphabetaSearch.makeDecision(state);
                System.out.println("Metrics for AlphaBeta : " + alphabetaSearch.getMetrics());
                iterativeDeepeningAlphaBetaSearch.makeDecision(state);
                System.out.println("Metrics for IDAlphaBetaSearch : " + iterativeDeepeningAlphaBetaSearch.getMetrics());
            }
            System.out.println("Chosen action is " + action);
            state = game.getResult(state, action);
        }
        System.out.print("GAME OVER: ");
        if (state.get(1) != 0 && state.get(2) != 0 && state.get(3) != 0 && state.get(4) != 0 && state.get(5) != 0 && state.get(6) != 0 && state.get(7) != 0 && state.get(8) != 0 && state.get(9) != 0)
            System.out.println("It's a draw!");
        else if (state.get(0) == 1) {
            System.out.println("Human wins!");
        } else {
            System.out.println("Machine wins!");
        }
        printState(state);
    }
}
