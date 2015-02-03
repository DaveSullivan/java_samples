/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.WORLD;

import java.util.ArrayList;
import java.util.List;

class Node
{
    public Node node1 = null, node2 = null;
    public Node MakeDoubleList()
    {
        Node ret = new Node();
        if (node1 != null)
        {
            Node left = node1.MakeDoubleList();
            ret.node1 = left.node1;
            node1 = left.node2;
            node1.node2 = this;
        }
        else
        {
            ret.node1 = this;
            node1 = null;
        }
        
        if (node2 != null)
        {
            Node right = node2.MakeDoubleList();
            ret.node2 = right.node2;
            node2 = right.node1;
            node2.node1 = this;
        }
        else
        {
            ret.node2 = this;
            node2 = null;
        }
                
        return ret;
    }
    
    public void printInOrderTree()
    {
        if (node1 != null)
            node1.printInOrderTree();
        System.out.println("Node Data: " + data);
        if (node2 != null)
            node2.printInOrderTree();
    }
    
    public void printForwardList()
    {
        System.out.println("Node Data: " + data);
        if (node2 != null)
            node2.printForwardList();
    }
    public void printReverseList()
    {
        System.out.println("Node Data: " + data);
        if (node1 != null)
            node1.printReverseList();
    }
    int data = 0;
};

/**
 *
 * @author Dave
 */
public class DoubleList {
 public static void main(String... args) {
    
        Node node1 = new Node();
        node1.data = 1;
        Node node2 = new Node();
        node2.data = 2;
        Node node3 = new Node();
        node3.data = 3;
        Node node4 = new Node();
        node4.data = 4;
        Node node5 = new Node();
        node5.data = 5;
        
        node2.node1 = node1;
        node2.node2 = node3;
        node4.node1 = node2;
        node4.node2 = node5;
        
        System.out.println("Printing tree in order");
        node4.printInOrderTree();
        
        Node list = node4.MakeDoubleList();
        
        System.out.println("Printing list forward");
        list.node1.printForwardList();
        
        System.out.println("Printing list reverse");
        list.node2.printReverseList();
        
        List<Integer> intList = new ArrayList<>(10);
        
        
    }   
}
