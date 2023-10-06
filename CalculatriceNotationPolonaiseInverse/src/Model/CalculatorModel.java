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
}
