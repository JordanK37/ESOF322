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
public class ListManager {
    private Node first;
    ListManager(EmployeeRecords record){
        first = new Node(record);
    }
    
       public void add(EmployeeRecords a)
    {
        Node n = new Node(a);
        Node iter = first;
        if(first == null)
        {
            first = n;
            n.setNext(first);
            n.setPrevious(first);
        }else
        {
            while(iter.getNext() != first)
            {
                iter = iter.getNext();
            }iter.setNext(n);
            n.setPrevious(iter);
            n.setNext(first);
            first.setPrevious(n);
        }
    }
}
