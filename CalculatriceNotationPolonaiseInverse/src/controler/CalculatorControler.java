package controler;

import java.util.Stack;
import Model.CalculatorModel;
import Model.CalculatorModelInterface;

public class CalculatorControler implements CalculatorControlerInterface {
	
	private CalculatorModel model;
	
	public CalculatorControler() {
        model = new CalculatorModel(); // Initialize the calculator model
    }

	@Override
	public void change(String accu) {
		// Method handling the changes on the accumulator due to the user's input and displaying it 
		
		System.out.println("Accumulator changed to: " + accu);
	}

	@Override
	public void change(Stack<Double> stackData) {
		// Method handling the changes on the stack due to the user's input and displaying it 
		
		System.out.println("Stack changed to: " + stackData);
	}

}
