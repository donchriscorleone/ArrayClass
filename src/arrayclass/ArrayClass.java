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
public class ArrayClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        // Create a class in your package
        
        // Create an instance of that class
        Array numbers = new Array(2);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.removeAt(0);
        System.out.println("Index of 2 is " + numbers.indexOf(2));
        numbers.print();
    }
    
}
