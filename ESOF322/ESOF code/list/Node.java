/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked.list;

/**
 *
 * @author dylan
 */
public class Node {
    private EmployeeRecords info;
    private Node next;
    private Node previous;
    
    Node(EmployeeRecords stuff){
        info = stuff;
    }
    public EmployeeRecords getInfo(){
        return info;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node nextNode){
        next = nextNode;
    }
    public Node getPrevious(){
        return previous;
    }
    public void setPrevious(Node previousNode){
        previous = previousNode;
    }
    
}
