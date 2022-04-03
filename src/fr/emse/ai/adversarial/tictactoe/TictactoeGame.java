package fr.emse.ai.adversarial.tictactoe;

import fr.emse.ai.adversarial.Game;

import java.util.ArrayList;
import java.util.List;


public class TictactoeGame implements Game<List<Integer>, Integer, Integer> {

    public final static Integer[] players = {0, 1};
    public final static List<Integer> initialState = new ArrayList<Integer>();

    public TictactoeGame() {
        for (int i = 0; i < 10; i++) {
            initialState.add(0);
        }
    }

    @Override
    public List<Integer> getInitialState() {
        return initialState;
    }

    @Override
    public Integer[] getPlayers() {
        return players;
    }

    @Override
    public Integer getPlayer(List<Integer> state) {
        return state.get(0);
    }

    @Override
    public List<Integer> getActions(List<Integer> state) {
        ArrayList<Integer> actions = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++) {
            if (state.get(i) == 0) {
                actions.add(i);
            }
        }
        return actions;
    }

    @Override
    public List<Integer> getResult(List<Integer> state, Integer action) {
        ArrayList<Integer> newState = new ArrayList<Integer>();
        newState.addAll(state);

        for (int i = 1; i < 10; i++) {
            if (action == i) {
                newState.set(i, (1 - 2 * newState.get(0)));
            }
        }
        newState.set(0, 1-state.get(0));
        return newState;
    }

    @Override
    public boolean isTerminal(List<Integer> state) {
        if (state.get(1) == state.get(2) && state.get(2) == state.get(3) && state.get(1) != 0) {
            return true;
        }
        if (state.get(4) == state.get(5) && state.get(5) == state.get(6) && state.get(4) != 0) {
            return true;
        }
        if (state.get(7) == state.get(8) && state.get(8) == state.get(9) && state.get(7) != 0) {
            return true;
        }
        if (state.get(1) == state.get(4) && state.get(4) == state.get(7) && state.get(1) != 0) {
            return true;
        }
        if (state.get(2) == state.get(5) && state.get(5) == state.get(8) && state.get(2) != 0) {
            return true;
        }
        if (state.get(3) == state.get(6) && state.get(6) == state.get(9) && state.get(3) != 0) {
            return true;
        }
        if (state.get(1) == state.get(5) && state.get(5) == state.get(9) && state.get(1) != 0) {
            return true;
        }
        if (state.get(3) == state.get(5) && state.get(5) == state.get(7) && state.get(3) != 0) {
            return true;
        }if(state.get(1) != 0 && state.get(2) != 0 && state.get(3) != 0 && state.get(4) != 0 && state.get(5) != 0 && state.get(6) != 0 && state.get(7) != 0 && state.get(8) != 0 && state.get(9) != 0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public double getUtility(List<Integer> state, Integer player) {

        if (state.get(1) == state.get(2) && state.get(2) == state.get(3) && state.get(1) != 0) {
                return state.get(1)*(1-2*player);
            } else if (state.get(4) == state.get(5) && state.get(5) == state.get(6) && state.get(4) != 0) {
                return state.get(4)*(1-2*(player));
            } else if (state.get(7) == state.get(8) && state.get(8) == state.get(9) && state.get(7) != 0) {
                return state.get(7)*(1-2*(player));
            } else if (state.get(1) == state.get(4) && state.get(4) == state.get(7) && state.get(1) != 0) {
                return state.get(1)*(1-2*(player));
            } else if (state.get(2) == state.get(5) && state.get(5) == state.get(8) && state.get(2) != 0) {
                return state.get(2)*(1-2*(player));
            } else if (state.get(3) == state.get(6) && state.get(6) == state.get(9) && state.get(3) != 0) {
                return state.get(3)*(1-2*(player));
            } else if (state.get(1) == state.get(5) && state.get(5) == state.get(9) && state.get(1) != 0) {
                return state.get(1)*(1-2*(player));
            } else if (state.get(3) == state.get(5) && state.get(5) == state.get(7) && state.get(3) != 0) {
                return state.get(3)*(1-2*(player));
            } else{
                return 0;
            }

    }
}
