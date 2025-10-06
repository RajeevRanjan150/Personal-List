// Simple console-based Personal List
import java.util.ArrayList;
import java.util.Scanner;
class PersonalList
  {
    // Declaring ArrayList and Scanner class.
    static ArrayList<String> list=new ArrayList<String>();
    static Scanner sc=new Scanner(System.in);
    // Method for adding values.
    public static void add()
    {
      System.out.print("Enter: ");
      String value=sc.nextLine();
      list.add(value);
    }
    // Method for removing values.
    public static void remove()
    {
      if(list.isEmpty()) {
        System.out.println("List is empty.");
        return;
      }
      for(int i=0; i<list.size(); i++) {
        System.out.println((i+1)+". "+list.get(i));
      }
      try {
      System.out.print("Remove: ");
      int remove=sc.nextInt();
      if(remove<=list.size()&&remove>0) {
      list.remove(remove-1);
      System.out.println(remove+" has been removed!");
      }
      else {
        System.out.println("Invalid input!");
        return;
      }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        return;
      }
    }
    // Method for changing values.
    public static void change()
    {
      if(list.isEmpty()) {
        System.out.println("List is empty.");
        return;
      }
      for(int i=0; i<list.size(); i++) {
        System.out.println((i+1)+". "+list.get(i));
      }
      try {
      System.out.print("Number: ");
      int idx=sc.nextInt();
      if(idx<=list.size()&&idx>0) {
      System.out.print("Change: ");
      String change=sc.nextLine();
      list.set(idx-1, change);
      System.out.println("Changed Successfully!");
      }
      else {
        System.out.println("Invalid input!");
        return;
      }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        return;
      }
    }
    // Method for showing all values one-by-one.
    public static void show()
    {
      if(list.isEmpty()) {
        System.out.println("List is empty.");
        return;
      }
      for(int i=0; i<list.size(); i++) {
        System.out.println((i+1)+". "+list.get(i));
      }
    }
    // Main method
    public static void main(String[] args)
    {
      System.out.println("--- Personal List ---");
      // Menu
      System.out.print("1. Add\n2. Remove\n3. Change\n4. Show List\n5. Exit");
      int choice=0;
      while(true) {
        try {
       System.out.print("\nEnter choice: ");
       choice=sc.nextInt();
        sc.nextLine();
        switch(choice) {
          case 1: add(); break;
          case 2: remove(); break;
          case 3: change(); break;
          case 4: show(); break;
          case 5: System.out.println("Exiting..."); return;
          default: System.out.println("Invalid Choice!");
        }
        } catch (Excpetion e) {
          System.out.println(e.getMessage());
      }
    }
  }
