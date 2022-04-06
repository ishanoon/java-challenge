package com.company;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    Solution.Node root = new Solution.Node(8);
    Solution.Node node1 = new Solution.Node(1);
    Solution.Node node0 = new Solution.Node(0);
    Solution.Node node2 = new Solution.Node(2);
    Solution.Node node13 = new Solution.Node(13);
    Solution.Node node4= new Solution.Node(4);
    Solution.Node node6 = new Solution.Node(6);
    Solution.Node node17 = new Solution.Node(17);
    Solution.Node node9 = new Solution.Node(9);
    Solution.Node node30 = new Solution.Node(30);
    Solution.Node node28 = new Solution.Node(28);
    Solution.Node node15 = new Solution.Node(15);

    @BeforeEach
    void setUp(){
        root.setRight(node2);
        root.setLeft(node4);

        node2.setLeft(node1);
        node2.setRight(node9);


        node1.setLeft(node0);
        node1.setRight(node15);

        node9.setLeft(node6);
        node9.setRight(node13);

        node13.setRight(node28);

        node28.setLeft(node30);
        node28.setRight(node17);
    }


    @Test()
    void shouldReturnZeroWhenNodeIsNull() {
        assertEquals( 0,solution.countNodesInTree(null));
    }

    @Test()
    void shouldReturnOneGivenALeaf() {
        assertEquals( 1,solution.countNodesInTree(node4));
    }

    @Test()
    void shouldReturnActualTreeCountGivenAnUpBalanceTree() {
        assertEquals( 4,solution.countNodesInTree(node13));
    }

    @Test()
    void shouldReturn12CountGivenRule() {
        assertEquals( 12,solution.countNodesInTree(root));
    }
}