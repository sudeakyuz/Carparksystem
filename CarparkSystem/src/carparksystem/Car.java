/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparksystem;

/**
 *
 * @author MONSTER
 */
public class Car {
    private String name;
    
    public Car ( String name ) {
        super();
        this.name = name; 
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name= name;
    }
    public void amount() {
        System.out.println("fee is calculating...");
    }

 
}
