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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void change(Stack<Double> stackData) {
		// TODO Auto-generated method stub
		
	}

}
