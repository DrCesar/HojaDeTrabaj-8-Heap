
import java.util.PriorityQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadeowen
 * @param <E>
 */
public class VectorHeap<E extends Comparable<E>> implements Priority<E> {
    
    Node<E> root;
    
    
    public VectorHeap(){
        this.clear();
    }
    
    
    public void add(E ele){
       root = addRec(ele, root);
    }
    
    public Node<E> addRec(E ele, Node<E> temp){
        if(temp == null){
            temp = new Node(ele);
        }else{
            int j = ele.compareTo(temp.getEle());
            if(j > 0)
                temp.setNext(addRec(ele, temp.getNext()));
            else{
                Node<E> n = new Node(ele);
                n.setNext(temp);
                temp=n;
            }
        }
        
        return temp;
    }
    
    public E remove(){
        Node temp = this.root;
        root = root.getNext();
        
        return (E)temp.getEle();
    }
    
    public int size(){
        int i = 0;
        Node temp = root;
        while(temp != null){
            temp = temp.getNext();
            i++;
        }
        return i;
    }
    
    public void clear(){
        this.root = null;
    }
    
}
