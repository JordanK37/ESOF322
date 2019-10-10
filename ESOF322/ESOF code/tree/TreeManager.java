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
public class TreeManager {
    private Node root;
    TreeManager(int i){
        root = new Node(i);
    }
    
    private void add(int i){
        Node iter = root;
        Node newNode = new Node(i);
        boolean outOfPlace = true;
        while(outOfPlace){
            if(i == iter.getInfo() || i < iter.getInfo()){
                if(iter.getLeftChild() != null){
                    iter = iter.getLeftChild();
                }else{
                    iter.setLeftChild(newNode);
                    newNode.setParent(iter);
                    outOfPlace = false;
                }
            }else if(i > iter.getInfo()){
                if(iter.getRightChild() != null){
                    iter = iter.getRightChild();
                }else{
                    iter.setRightChild(newNode);
                    newNode.setParent(iter);
                    outOfPlace = false;
                }
            }
        }
        
    }
    
    
}
