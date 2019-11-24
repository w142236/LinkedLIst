import java.util.Scanner;
public class ContactList {
   public static void main (String[] args) {
      ContactNode headObj;  // Create intNode objects
      ContactNode Contact1;
      ContactNode Contact2;
      ContactNode Contact3;
      ContactNode currObj;
      Scanner sc = new Scanner(System.in);
      //String name = sc.nextLine();
      // Front of nodes list
      headObj = new ContactNode(); 
      
      // Insert more nodes
      System.out.println("Person 1");
      System.out.println("Enter name:");
      String name = sc.nextLine();
      System.out.println("Enter phone number:");
      String phoneNum = sc.nextLine();
      System.out.println("You entered: " + name + ", " + phoneNum);
      
      Contact1 = new ContactNode(name, phoneNum);
      headObj.insertAfter(Contact1);

      System.out.println("\nPerson 2");
      System.out.println("Enter name:");
      name = sc.nextLine();
      System.out.println("Enter phone number:");
      phoneNum = sc.nextLine();
      System.out.println("You entered: " + name + ", " + phoneNum);
      
      Contact2 = new ContactNode(name, phoneNum);
      Contact1.insertAfter(Contact2);
      
      System.out.println("\nPerson 3");
      System.out.println("Enter name:");
      name = sc.nextLine();
      System.out.println("Enter phone number:");
      phoneNum = sc.nextLine();
      System.out.println("You entered: " + name + ", " + phoneNum);
      
      Contact3 = new ContactNode(name, phoneNum);
      Contact2.insertAfter(Contact3);

      // Print linked list
      System.out.println("\nCONTACT LIST");
      currObj = headObj;
      while (currObj != null) {
         currObj.printContactNode();
         currObj = currObj.getNext();
      }
   }
}