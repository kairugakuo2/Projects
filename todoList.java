import java.util.Scanner;
import java.util.LinkedList;
import java.util.InputMismatchException;

public class todoList
{
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		LinkedList<String> todoList = new LinkedList<String>();
		
		int input = 0;
		while(input != -1){
		    printPrompt();
		    
		    try{
		        input = scnr.nextInt();
		        scnr.nextLine();
		    } catch (InputMismatchException e){
		        System.out.println("Invalid input. Please enter a valid integer.");
                scnr.nextLine();
                continue;
		    }
		    
		    switch (input){
		        case 1 :
		            System.out.println("Enter in task to add.");
		            String taskAdd = scnr.nextLine();
		            todoList.add(taskAdd);
		            displayTasks(todoList);
		            break;
		        case 2 :
		            System.out.println("Enter in task to remove.");
		            String taskRemove = scnr.nextLine();
		            removeTask(taskRemove, todoList);
		            displayTasks(todoList);
		            break;
		        case 3 :
		            System.out.println("Here's the full list of tasks:");
		            displayTasks(todoList);
		            break;
		        case 4 :
		            isEmpty(todoList);
		            displayTasks(todoList);
		            break;
		        case -1:
		            System.out.println("Exiting program.");
		            break;
		        default:
		            System.out.println("Invalid input, please try again.");
		    }
		}
		
	}
	
	public static void printPrompt(){
	    System.out.println("Enter a number for the operation:");
		System.out.println("1. Add a task");
		System.out.println("2. Remove a task");
		System.out.println("3. Display all tasks");
		System.out.println("4. Check if list is empty");
		System.out.println("-1. Exit program");
	}
	public static void addTask(int numTasks, LinkedList<String> todoList){
	    String temp;
	    Scanner scnr = new Scanner(System.in);
	    for (int i = 0; i < numTasks; i++){
	        temp = scnr.nextLine();
	        todoList.add(temp);
	    }
	    System.out.println("Added task to list!");
	}
	
	public static void removeTask( String taskRemove, LinkedList<String> todoList){
	    try{
            if ( !todoList.contains(taskRemove)){
                throw new Exception("Task not found.");
            } else {
                todoList.remove(taskRemove);
                System.out.println("Removed task from list!");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void displayTasks(LinkedList<String> todoList) {
        
        System.out.println();
        System.out.println("Tasks:");
        for(int i = 0; i < todoList.size(); i++){
		    System.out.println( (i+1) + ": " + todoList.get(i));
	    }
	    System.out.println();
    }
    
    public static void isEmpty(LinkedList<String> todoList){
        if (todoList.isEmpty()){
            System.out.println("The list is empty.");
        } else {
            System.out.println("The list is not empty.");
        }
    }
	
	
}