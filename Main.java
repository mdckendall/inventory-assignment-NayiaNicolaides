import java.util.ArrayList;
import java.util.Scanner;

import com.sun.security.auth.UnixNumericUserPrincipal;

import java.io.*;
import java.util.*;
import java.io.IOException;

// class Inventory {

// }
class Main {
	public static void main(String[] args) {
    Inventory in = new Inventory();
    // ArrayList<String> inventory = new ArrayList<String>();
    // cars.add("Volvo");
    // cars.add("BMW");
    // cars.add("Ford");
    // cars.add("Mazda");
    // System.out.println(cars);
    Scanner input = new Scanner(System.in);

    int  user = 0;

    while (user != 6) {
      System.out.println("Press 1 to add an item");
      System.out.println("Press 2 to delete an item");
      System.out.println("Press 3 to update an item");
      System.out.println("Press 4 to show all the items");
      System.out.println("Press 5 to quit the program");

      user = input.nextInt();
      
      if(user == 1){
        System.out.println("Enter the name:");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("Enter the serial number:");
        String serial = input.nextLine();
        System.out.println("Enter the value in dollars (whole number):");
        String value = input.nextLine();
        
        Item it = new Item(name, serial, value);
        in.items.add(it);

        // for(int i = 0; i < in.items.size(); i ++){
        //   if(in.items.get(i).serial.equals(serial)){
        //     in.items.remove(i);
        //     Item it = new Item(name, serial, value);
        //     in.items.add(it);
        //   }
        // }

        // String[] item = {name, serial, value};
        // inventory.add(item);
        // System.out.println(Arrays.toString(item));
        // System.out.println(invstem.out.println("Enter the name:");
        // inventorentory);
        // System.out.println("Enter the name:");
      }
      if(user == 2){
        System.out.println("Enter the serial number of the item to delete:");
        input.nextLine();
        String serial = input.nextLine();
        
        for(int i = 0; i < in.items.size(); i ++){
          if(in.items.get(i).serial.equals(serial)){
            in.items.remove(i);
          }
        }
      }
      if(user == 3){
        System.out.println("Enter the serial number of the item to change:");
        input.nextLine();
        String serial = input.nextLine();

        for(int i = 0; i < in.items.size(); i ++){
          if(in.items.get(i).serial.equals(serial)){
            in.items.remove(i);
            
            System.out.println("Enter the new name:");
            String name = input.nextLine();
            System.out.println("Enter the new value in dollars (whole number):");
            String value = input.nextLine();
        
            Item it = new Item(name, serial, value);
            in.items.add(i, it);
          }
        }
      }
      if(user == 4){
        for(int i = 0; i < in.items.size(); i ++){
          System.out.println(in.items.get(i));
        }
      }
      if(user == 5){
        break;
      }
    }
	}
}