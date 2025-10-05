// Simple console-based Personal List
import java.util.ArrayList;
import java.util.Scanner;
class PersonalList
  {
    // Declaring ArrayLisg and Scanner class.
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
      for(int i=0; i<list.size(); i++) {
        System.out.println((i+1)+". "+list.get(i));
      }
      System.out.print("Remove: ");
      int remove=sc.nextInt();
      list.remove(remove-1);
      System.out.println(remove+" has been removed!");
    }
    // Method for changing values.
    public static void change()
    {
      for(int i=0; i<list.size(); i++) {
        System.out.println((i+1)+". "+list.get(i));
      }
      System.out.print("Number: ");
      int idx=sc.nextInt();
      System.out.print("Change: ");
      String change=sc.nextLine();
      list.set(idx-1, change);
      System.out.println("Changed Successfully!");
    }
    // Method for showing all values one-by-one.
    public static void show()
    {
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
      }
    }
  }
