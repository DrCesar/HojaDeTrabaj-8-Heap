
import java.util.Collection;
import java.util.PriorityQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadeowen
 */
public interface Priority<E>{
    
    public abstract void add(E ele);
    
    public E remove();
    
    public int size();
    
    public void clear();
}
