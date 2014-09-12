/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javacourse;

/**
 *
 * @author walter
 */
public class Colombian {
    String name;
    
    void traffic(String item) {
        System.out.println("I am " + name + ", and I traffic " + item);
    }
    
    void friend(Colombian friend) {
         System.out.println("I am " + friend.name  );
        friend.traffic(name);
    }
}
