/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayclass;

/**
 *
 * @author christopherii
 */
public class Array {
    private int[] items;
    private int count = 0; // to keep track the current items
    
    public Array(int length) {
        this.items = new int[length]; // initialized your array and its length
    }
    
    public void add(int item) {
        // Resize array if full
        if (this.items.length == count) {
            // create an array then double its size
            int[] newArray = new int[count * 2];
            
            // Copy the existing items in to the new array
            for (int i = 0; i < count; i++)
                newArray[i] = this.items[i];
            
            // Reassign the array
            this.items = newArray;
        }
        
        // Add item to the end
        this.items[count++] = item;
    }
    
    public void removeAt(int index) {
        // validate the index
        if (index < 0 || index > count) throw new IllegalArgumentException();
        
        // shift the items
        for (int i = index; i < count; i++)
            this.items[i] = this.items[i + 1];
        
        count--;
    }
    
    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (this.items[i] == item) return i;
        
        return -1; // return -1 if the item is not found or not in the array.
    }
    
    public void print() { // for printing the elements in your array
        for (int i = 0; i < count; i++)
            System.out.println(this.items[i]);
    }
}
