/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadeowen
 */
public class Node<E> {
    
    private Node next;
    private Node previous;
    private E ele;
    
    public Node(E ele){
        this.ele = ele;
        this.next = null;
        this.previous = null;
    }

    /**
     * @return the next
     */
    public Node getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * @return the previous
     */
    public Node getPrevious() {
        return previous;
    }

    /**
     * @param previous the previous to set
     */
    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    /**
     * @return the ele
     */
    public E getEle() {
        return ele;
    }

    /**
     * @param ele the ele to set
     */
    public void setEle(E ele) {
        this.ele = ele;
    }
    
    
    
}
