/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparksystem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


        
    
public class CarparkSystem {

  
    public static void main(String[] args) {
        Car car = new Car("araba");
        
        Sedan sedan = new Sedan("Sedan"); 
        
        Truck truck = new Truck ("Truck");
      
       Scanner scan = new Scanner (System.in);
       System.out.println("Welcome to the Akyüz Carpark ! What is your name?");
       String name = scan.nextLine();
       System.out.println("What is your car type press 1 for sedan, 2 for truck, 3 for list of cars in the park "+ name + " ?");
       int type = scan.nextInt();
      if (type == 1) { 
          Car car2 = new Sedan ("sedan");
          car.amount();
          car2.amount();
          System.out.println("How many hours ?");
           int hours = scan.nextInt();
           System.out.println( hours * 5 + " $ should be paid. ");
                     }
      if (type == 2 ) {
          Car car2 = new Truck ("truck");
          car.amount();
          car2.amount();
          
          System.out.println("How many hours ?");
           int hours = scan.nextInt();
           System.out.println( hours * 6 + " $ should be paid.");
          
      }
      if (type == 3) {
          HashMap <Integer, String> a = new HashMap<>();
          a.put(34, " BKK 155");
          a.put(35, " TKS 448");
          a.put(74," SP 1303");
          for(Integer key : a.keySet()) {
              System.out.println(key +  a.get(key)  );
          }
      }
    
                 
       
    }
}
    


    

