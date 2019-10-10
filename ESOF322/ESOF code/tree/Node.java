/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.search.tree;

/**
 *
 * @author dylan
 */
public class Node {
    private Node leftChild;
    private Node rightChild;
    private Node parent;
    private int info;
    Node(){
    }
    Node(int a){
        info = a;
    }
    public boolean hasLeft(){
        if(leftChild != null){
            return true;
        }else{
            return false;
        }
    }
    public void setLeftChild(Node left){
        leftChild = left;
    }
    public Node getLeftChild(){
        return leftChild;
    }
    public boolean hasRight(){
        if(rightChild != null){
            return true;
        }else{
            return false;
        }
    }
    public void setRightChild(Node right){
        rightChild = right;
    }
    public Node getRightChild(){
        return rightChild;
    }
    public void setParent(Node root){
        parent = root;
    }
    public Node getparent(){
        return parent;
    }
    public int getInfo(){
        return info;
    }
}
