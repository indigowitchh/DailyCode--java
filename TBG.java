//dumb java stuff you have to set up first
import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
    
    Scanner Doggo = new Scanner(System.in); // create this thing to get user input
    
    System.out.println("Java Text Based Game!"); //prints to screen

    //game variables
    int room = 1;
    String input = "glurbaburbal!"; //dummy value for game loop
    String[] inventory = {" ", " ", " ", " "}; //use this to hold player items
    int Money = 0;
    Random rand = new Random();
    while (input != "quit") { //OMG GAME LOOP-----------------------------------------
    int duck = rand.nextInt(100);
     
  //print inventory
      System.out.println("Your inventory:");
      for(int i = 0; i<=3; i++)
        System.out.println(inventory[i]);
      
      switch (room) {
        case 1:
          System.out.println("You're in room 1, you can go East");
          Money +=1;
          System.out.println("You have " + Money + " dollars!");
          input = Doggo.nextLine();
          if(input.equals("East"))
            room = 2;
          break;
       
        case 2:
          System.out.println("You're in room 2, you can go West or South");
          Money +=3;
          System.out.println("You have " + Money + " dollars!");
            if (!inventory[0].equals("marshmallow gun")){ 
            System.out.println("OMG you got the marshmallow gun!");
            inventory[0] = "marshmallow gun";
          }
          input = Doggo.nextLine();
          if(input.equals("South"))
            room = 3;
          else if (input.equals("West"))
            room = 1;
          break;
          
        case 3:
          Money += duck;
          System.out.println("You have " + Money + " dollars!");
          System.out.println("You're in room 3, you can go North or South.");
          if (!inventory[1].equals("key")){ 
            System.out.println("OMG you got a key!");
            inventory[1] = "key";
          }
          input = Doggo.nextLine();
          if(input.equals("North"))
            room = 2;
          else if (input.equals("South"))
            room = 4;
          break;
          
          
        case 4:
          Money +=10;
          System.out.println("You have " + Money + " dollars!");
          System.out.println("You're in room  4 , you can go West or North");
          input = Doggo.nextLine();
          if(input.equals("North"))
            room = 3;
          else if (input.equals("West"))
            room = 5;
          break;

        case 5:
          Money +=15;
          System.out.println("You have " + Money + " dollars!");
          System.out.println("You're in room  5 , you can go East or West");
          input = Doggo.nextLine();
          if(input.equals("East"))
            room = 4;
          else if(input.equals("West"))
            room = 6;
        
        case 6:
          Money +=21;
          System.out.println("You have " + Money + " dollars!");
          System.out.println("You're in room  6 , you can go South or East");
          if (!inventory[2].equals("confetti bomb")){ 
            System.out.println("OMG you found the confetti bomb!");
            inventory[2] = "confetti bomb";
          }
          input = Doggo.nextLine();
          if(input.equals("South"))
            room = 7;
          else if (input.equals("East"))
            room = 5;
          break;
        
        case 7:
          Money +=28;
          System.out.println("You have " + Money + " dollars!");
          System.out.println("You're in room  7 , you can go North or West");
          input = Doggo.nextLine();
          if(input.equals("North"))
            room = 6;
          else if (input.equals("West"))
            room = 8;
          break;

        case 8:
          Money +=36;
          System.out.println("You have " + Money + " dollars!");
          if (inventory[1].equals("key")){
            System.out.println("You opened the door with the key!");
          }
          else if (!inventory[1].equals("key")){
            System.out.println("Sorry its locked");         
          }
            System.out.println("You're in room  8 , you can go East");
              if (!inventory[3].equals("candy sword")){ 
              System.out.println("OMG you collected the candy sword!");
              inventory[3] = "candy sword";
          }
          input = Doggo.nextLine();
          if(input.equals("East"))
            room = 7;
          break;
        
      }// end bracket for switch
    } // end bracket for OMG GAME LOOP----------------------------------------------------
  }// end bracket for public static void main
}// end bracket for class main
