package fr.emse.ai.adversarial;

import fr.emse.ai.util.SimpleTwoPlyGameTree;

public class Minimax<V> {
        Integer c = 0;

    public Integer getC() {
        return c;
    }

    public Integer minimax(SimpleTwoPlyGameTree<Integer> node) {
        Integer bestvalue;
        if (node.isLeaf()) {
            return node.getValue();
        }
        if (node.isMax()) {
            bestvalue = Integer.MIN_VALUE;
            for (SimpleTwoPlyGameTree<Integer> child : node.getChildren()) {
                Integer v = minimax(child);
                c++;
                bestvalue = Integer.max(bestvalue, v);
            }
            return bestvalue;
        } else {
            bestvalue = Integer.MAX_VALUE;
            for (SimpleTwoPlyGameTree<Integer> child : node.getChildren()) {
                Integer v = minimax(child);
                c++;
                bestvalue = Integer.min(bestvalue, v);
            }
            return bestvalue;
        }
    }

    public Integer alphabeta(SimpleTwoPlyGameTree<Integer> node, Integer alpha, Integer beta) {
        Integer val;
        if (node.isLeaf()) {
            return node.getValue();
        } else if (!node.isMax()) {
            val = Integer.MAX_VALUE;
            for (SimpleTwoPlyGameTree<Integer> child : node.getChildren()) {
                val = Integer.min(val, alphabeta(child, alpha, beta));
                c++;
                if (alpha >= val) {    /*coupure alpha */
                    return val;
                }
                beta = Integer.min(beta, val);
            }
        } else {
            val = Integer.MIN_VALUE;
            for (SimpleTwoPlyGameTree<Integer> child : node.getChildren()) {
                val = Integer.max(val, alphabeta(child, alpha, beta));
                c++;
                if (val >= beta) {    /*coupure beta */
                    return val;
                }
                alpha = Integer.max(alpha, val);
            }
        }
        return val;
    }
}

