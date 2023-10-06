package Model;

import java.util.Stack;

public class CalculatorModel {
	// Attribute representing the stack of the calculator
	private Stack<Double> stack;
    
	// Constructor of the class CalculatorModel
	public CalculatorModel() {		
		stack = new Stack<>();
    }
	
	// Method to add an element in the stack
    public void push(double value) {
    	stack.push(value);
        
    }
    
 // Method to pop an element out of the stack
    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        } 
        else {
            System.out.println("The stack is empty");
        }
    }
    
 // Method to clear the stack 
    public void clear() {
        stack.clear();
    }
    
 // Method to swap the two elements at the top of the stack 
    public void swap() {
        if (stack.size() >= 2) {
            double topElement = stack.pop();
            double secondTopElement = stack.pop();
            stack.push(topElement);
            stack.push(secondTopElement);
        } 
        else {
            System.out.println("There are not enough elements to make a swap");
        }
    }
    
 // Method to drop the element at the top of the stack
    public void drop() {
        if (!stack.isEmpty()) {
            stack.pop();
        } else {
            System.out.println("The stack is empty");
        }
    }

}
