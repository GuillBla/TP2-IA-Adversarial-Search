package fr.emse.ai.util;

import fr.emse.ai.adversarial.Minimax;

import java.util.ArrayList;

public class TestGameBis {
	public static void main(String[] args) {
		// niveau 4
		ArrayList<SimpleTwoPlyGameTree<Integer>> sublist41 = new ArrayList<SimpleTwoPlyGameTree<Integer>>();
		sublist41.add(new SimpleTwoPlyGameTree<Integer>(20, true));
		sublist41.add(new SimpleTwoPlyGameTree<Integer>(22, true));

		ArrayList<SimpleTwoPlyGameTree<Integer>> sublist42 = new ArrayList<SimpleTwoPlyGameTree<Integer>>();
		sublist42.add(new SimpleTwoPlyGameTree<Integer>(25, true));
		sublist42.add(new SimpleTwoPlyGameTree<Integer>(30, true));

		ArrayList<SimpleTwoPlyGameTree<Integer>> sublist43 = new ArrayList<SimpleTwoPlyGameTree<Integer>>();
		sublist43.add(new SimpleTwoPlyGameTree<Integer>(17, true));
		sublist43.add(new SimpleTwoPlyGameTree<Integer>(0, true));
		sublist43.add(new SimpleTwoPlyGameTree<Integer>(30, true));
		sublist43.add(new SimpleTwoPlyGameTree<Integer>(15, true));
		
		ArrayList<SimpleTwoPlyGameTree<Integer>> sublist44 = new ArrayList<SimpleTwoPlyGameTree<Integer>>();
		sublist44.add(new SimpleTwoPlyGameTree<Integer>(50, true));
		sublist44.add(new SimpleTwoPlyGameTree<Integer>(53, true));

		ArrayList<SimpleTwoPlyGameTree<Integer>> sublist45 = new ArrayList<SimpleTwoPlyGameTree<Integer>>();
		sublist45.add(new SimpleTwoPlyGameTree<Integer>(65, true));
		sublist45.add(new SimpleTwoPlyGameTree<Integer>(20, true));
		
		ArrayList<SimpleTwoPlyGameTree<Integer>> sublist46 = new ArrayList<SimpleTwoPlyGameTree<Integer>>();
		sublist46.add(new SimpleTwoPlyGameTree<Integer>(10, true));
		sublist46.add(new SimpleTwoPlyGameTree<Integer>(8, true));

		ArrayList<SimpleTwoPlyGameTree<Integer>> sublist47 = new ArrayList<SimpleTwoPlyGameTree<Integer>>();
		sublist47.add(new SimpleTwoPlyGameTree<Integer>(5, true));
		sublist47.add(new SimpleTwoPlyGameTree<Integer>(2, true));
		
		ArrayList<SimpleTwoPlyGameTree<Integer>> sublist48 = new ArrayList<SimpleTwoPlyGameTree<Integer>>();
		sublist48.add(new SimpleTwoPlyGameTree<Integer>(92, true));
		sublist48.add(new SimpleTwoPlyGameTree<Integer>(1, true));
		
		ArrayList<SimpleTwoPlyGameTree<Integer>> sublist49 = new ArrayList<SimpleTwoPlyGameTree<Integer>>();
		sublist49.add(new SimpleTwoPlyGameTree<Integer>(25, true));
		sublist49.add(new SimpleTwoPlyGameTree<Integer>(30, true));

// niveau 3	
		SimpleTwoPlyGameTree<Integer> subTree31 = new SimpleTwoPlyGameTree<Integer>(Integer.MIN_VALUE, false,
				sublist41);
		SimpleTwoPlyGameTree<Integer> subTree32 = new SimpleTwoPlyGameTree<Integer>(Integer.MIN_VALUE, false,
				sublist42);
		SimpleTwoPlyGameTree<Integer> subTree33 = new SimpleTwoPlyGameTree<Integer>(Integer.MIN_VALUE, false,
				sublist43);
		SimpleTwoPlyGameTree<Integer> subTree34 = new SimpleTwoPlyGameTree<Integer>(Integer.MIN_VALUE, false,
				sublist44);
		SimpleTwoPlyGameTree<Integer> subTree35 = new SimpleTwoPlyGameTree<Integer>(Integer.MIN_VALUE, false,
				sublist45);
		SimpleTwoPlyGameTree<Integer> subTree36 = new SimpleTwoPlyGameTree<Integer>(Integer.MIN_VALUE, false,
				sublist46);
		SimpleTwoPlyGameTree<Integer> subTree37 = new SimpleTwoPlyGameTree<Integer>(Integer.MIN_VALUE, false,
				sublist47);
		SimpleTwoPlyGameTree<Integer> subTree38 = new SimpleTwoPlyGameTree<Integer>(Integer.MIN_VALUE, false,
				sublist48);
		SimpleTwoPlyGameTree<Integer> subTree39 = new SimpleTwoPlyGameTree<Integer>(Integer.MIN_VALUE, false,
				sublist49);

// niveau 2		
		SimpleTwoPlyGameTree<Integer> subTree21 = new   SimpleTwoPlyGameTree<Integer>(Integer.MAX_VALUE, true);
		subTree21.addChild(subTree31);
		subTree21.addChild(subTree32);
		subTree21.addChild(subTree33);
		SimpleTwoPlyGameTree<Integer> subTree22 = new   SimpleTwoPlyGameTree<Integer>(Integer.MAX_VALUE, true);
		subTree22.addChild(subTree34);
		subTree22.addChild(subTree35);
		
		SimpleTwoPlyGameTree<Integer> subTree23 = new   SimpleTwoPlyGameTree<Integer>(Integer.MAX_VALUE, true);
		subTree23.addChild(subTree36);
		subTree23.addChild (subTree37);
		
		SimpleTwoPlyGameTree<Integer> subTree24 = new   SimpleTwoPlyGameTree<Integer>(Integer.MAX_VALUE, true);
		subTree24.addChild(subTree38);
		subTree24.addChild(subTree39);

		
// niveau 1
		SimpleTwoPlyGameTree<Integer> subTree11 = new   SimpleTwoPlyGameTree<Integer>(Integer.MIN_VALUE, false);
		subTree11.addChild(subTree21);
		subTree11.addChild(subTree22);
		
		SimpleTwoPlyGameTree<Integer> subTree12 = new   SimpleTwoPlyGameTree<Integer>(Integer.MIN_VALUE, false);
		subTree12.addChild(subTree23);
		subTree12.addChild(subTree24);

// Niveau 0
		SimpleTwoPlyGameTree<Integer> tree = new   SimpleTwoPlyGameTree<Integer>(Integer.MAX_VALUE, true);
		tree.addChild(subTree11);
		tree.addChild(subTree12);


		/*ArrayList<SimpleTwoPlyGameTree<Integer>> sublist1 =
				new ArrayList<SimpleTwoPlyGameTree<Integer>>();
		sublist1.add(new SimpleTwoPlyGameTree<Integer>(3,true));
		sublist1.add(new SimpleTwoPlyGameTree<Integer>(12,true));
		sublist1.add(new SimpleTwoPlyGameTree<Integer>(8,true));
		SimpleTwoPlyGameTree<Integer> subtree1 =
				new SimpleTwoPlyGameTree<Integer>(Integer.MIN_VALUE,false,sublist1);
		ArrayList<SimpleTwoPlyGameTree<Integer>> sublist2 =
				new ArrayList<SimpleTwoPlyGameTree<Integer>>();
		sublist2.add(new SimpleTwoPlyGameTree<Integer>(2,true));
		sublist2.add(new SimpleTwoPlyGameTree<Integer>(4,true));
		sublist2.add(new SimpleTwoPlyGameTree<Integer>(6,true));
		SimpleTwoPlyGameTree<Integer> subtree2 =
				new SimpleTwoPlyGameTree<Integer>(Integer.MIN_VALUE,false,sublist2);
		ArrayList<SimpleTwoPlyGameTree<Integer>> sublist3 =
				new ArrayList<SimpleTwoPlyGameTree<Integer>>();
		sublist3.add(new SimpleTwoPlyGameTree<Integer>(14,true));
		sublist3.add(new SimpleTwoPlyGameTree<Integer>(5,true));
		sublist3.add(new SimpleTwoPlyGameTree<Integer>(2,true));
		SimpleTwoPlyGameTree<Integer> subtree3 =
				new SimpleTwoPlyGameTree<Integer>(Integer.MIN_VALUE,false,sublist3);
		SimpleTwoPlyGameTree<Integer> tree1 = new   SimpleTwoPlyGameTree<Integer>(Integer.MAX_VALUE, true);

		tree1.addChild(subtree1);
		tree1.addChild(subtree2);
		tree1.addChild(subtree3);
*/
		Minimax<Integer> m1 = new Minimax<Integer>();
		Minimax<Integer> m2 = new Minimax<Integer>();

		System.out.println("The minimax value of the tree equals : "+m1.minimax(tree));
		System.out.println("counter for minimax : "+ m1.getC());
		//System.out.println("The minimax value of the tree equals : " +tree1.minimax(tree1));
		Integer alpha = Integer.MIN_VALUE;
		Integer beta = Integer.MAX_VALUE;
		System.out.println(("The alphabeta value of the tree equals : " + m2.alphabeta(tree,alpha,beta)));
		System.out.println("counter for alphabeta : "+ m2.getC());

	}
}
