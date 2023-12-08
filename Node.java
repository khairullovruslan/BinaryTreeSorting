package itis304.lab7;

public class Node
{
    public Node left;
    public Node right;
    public  Node parent;
    public int value;
    public boolean checked = false;
    Node(int value){
        this.value = value;
    }
    Node(int value, Node parent){
        this.value = value;
        this.parent = parent;
    }

}
