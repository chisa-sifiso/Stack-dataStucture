
package javaapplication20;

import java.util.Scanner;
import java.util.Stack;

public class StackAct{

    public static void main(String[] args) {
        // TODO code application logic here
        int option =opt();
        Stack<Employee> stack = new Stack();
        Scanner input = new Scanner(System.in);
        while(option!=7){
            if(option==1){
                System.out.print("Enter your name:");
                String name = input.nextLine();
                System.out.print("Enter your id:");
                String id = input.nextLine();
                Employee obj = new Employee(name,id); 
                stack.push(obj);
            }
            else if(option==2){
                for (int i = 0; i < stack.size(); i++) {
                    System.out.println("Name:"+stack.get(i).getName()+"    ID:"+stack.get(i).getId());
                }
             
            }
            else if (option ==3){
                 System.out.print("Enter the id to search for:");
                String id = input.nextLine();
                boolean found=false;
                for (int i = 0; i < stack.size(); i++) {
                   if(stack.get(i).getId().equals(id)){
                     found=true;  break;
                   }  
               }
                if(found == true){
                    System.out.println("The employee is found");
                }else{
                    System.out.println("The employee is not found");
                }
                 
            }
            else if(option ==4){
                stack.pop();
            }
            else if(option==5){
                System.out.print("Enter the number of employess to retrench");
                int num = input.nextInt();
                for (int i = 0; i < num; i++) {
                    stack.pop();
                }
            }else if(option==6){
                stack.clear();
            }
             option =opt();   
        }
        
    }
    public static int opt(){
        Scanner input = new Scanner(System.in);
        System.out.println("\n===========Menu==========");
        System.out.println("1.Add employees to a list.");
        System.out.println("2.Display all the employees.");
        System.out.println("3.Search for a specific employee using an ID number");
        System.out.println("4.Remove an employee from the list.");
        System.out.println("5.Retrench a certain number of employees using the LIFO principle.");
        System.out.println("6.Retrench all the employees");
        System.out.println("7.Exit");
        System.out.print("Enter your option:");
        int userinput = input.nextInt();
        return userinput;
    }
}
