package Project;
import java.util.Scanner;

	

	interface Arithmetic {
	    void addition(double... numbers);

	    void subtraction(double... numbers);

	    void multiplication(double... numbers);

	    void division(double... numbers);
	}

	interface Geometrics {
	    void sin();

	    void cos();

	    void tan();

	    void sinh();

	    void cosh();

	    void tanh();
	}

	interface Exponential {
	    void power(double base, double exponent);
	    void sqrt(double number);
	    void quadratic(double num);
	    void cubic(double num);
	    void logarithm(double num);
	    void logarithm_func(double num);
	    void natural_Log(double value);
	    void exponential_func(double num);
	}

	class Calculator implements Arithmetic, Geometrics, Exponential {
	    private  Scanner scanner;

	    public Calculator() 
	    {
	        scanner = new Scanner(System.in);
	    }

	    public void  addition(double... numbers) {
	        double sum = 0;
	        for (double num : numbers) {
	            sum += num;
	        }
	        String formatVal = String.format("%.19f",sum);
	        System.out.println("Sum: " + formatVal);
	    }

	    public void subtraction(double... numbers) {
	        double result = numbers[0];
	        for (int i = 1; i < numbers.length; i++) {
	            result -= numbers[i];
	        }
	        String formatVal = String.format("%.19f",result);
	        System.out.println("Result of subtraction: " + formatVal);
	    }

	    public void multiplication(double... numbers) {
	        double product = 1;
	        for (double num : numbers) {
	            product *= num;
	        }
	        String formatVal = String.format("%.19f", product);
	        System.out.println("Product: " + formatVal);
	    }

	    public void division(double... numbers) {
	        if (numbers.length == 0) {
	            System.out.println("Cannot divide by zero.");
	            return;
	        }

	        double result = numbers[0];
	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] == 0) {
	                System.out.println("Cannot divide by zero.");
	                return;
	            }
	            result = numbers[i];
	        }
	        String formatVal = String.format("%.19f", result);
	        System.out.println("Result of division: " + formatVal);
	    }

	    public void sin() {
	    	
	    	System.out.println(" ");
	    	System.out.println("Choose angle mode: ");
	    	System.out.println("1. Degrees");
	    	System.out.println("2. Radians");
	    	
	    	int angleMode = (int) getInput("Enter your choice: ");
	    	double angle;
	    	
	    	if(angleMode == 1)
	    	{
	    		angle = getInput("Enter the angle in degrees ");
	    	}	
	    	
	    	else if(angleMode == 2)
	    		
	    	{
	    		angle = getInput("Enter the angle in radians");
	    	}
	    	else
	    	{
	    		System.out.println("Invalid choice.Defaulting to degrees.");
	    		angle = getInput("Enter the angle in Degrees: ");
	    	}
	    	
	    	double angleRadians = (angleMode ==1)?Math.toRadians(angle):angle;
	        double sinValue = Math.sin(angleRadians);
	        String formattedSinValue = String.format("%.19f", sinValue);
	        System.out.println("Sine of " + angle + ": " + formattedSinValue);
	        
	    }

	    public void cos() {
	    System.out.println(" ");
    	System.out.println("Choose angle mode: ");
    	System.out.println("1. Degrees");
    	System.out.println("2. Radians");
    	
    	int angleMode = (int) getInput("Enter your choice: ");
    	double angle;
    	
    	if(angleMode == 1)
    	{
    		angle = getInput("Enter the angle in degrees ");
    	}	
    	
    	else if(angleMode == 2)
    		
    	{
    		angle = getInput("Enter the angle in radians");
    	}
    	else
    	{
    		System.out.println("Invalid choice.Defaulting to degrees.");
    		angle = getInput("Enter the angle in Degrees: ");
    	}
    	
    	double angleRadians = (angleMode ==1)?Math.toRadians(angle):angle;
        double cosValue = Math.cos(angleRadians);
        String formattedCosValue = String.format("%.19f", cosValue);
        System.out.println("Cos of " + angle + ": " + formattedCosValue);
        
    
	    }

	    public void tan() {
		    System.out.println(" ");
	    	System.out.println("Choose angle mode: ");
	    	System.out.println("1. Degrees");
	    	System.out.println("2. Radians");
	    	
	    	int angleMode = (int) getInput("Enter your choice: ");
	    	double angle;
	    	
	    	if(angleMode == 1)
	    	{
	    		angle = getInput("Enter the angle in degrees ");
	    	}	
	    	
	    	else if(angleMode == 2)
	    		
	    	{
	    		angle = getInput("Enter the angle in radians");
	    	}
	    	else
	    	{
	    		System.out.println("Invalid choice.Defaulting to degrees.");
	    		angle = getInput("Enter the angle in Degrees: ");
	    	}
	    	
	    	double angleRadians = (angleMode ==1)?Math.toRadians(angle):angle;
	        double tanValue = Math.tan(angleRadians);
	        String formattedTanValue = String.format("%.19f", tanValue);
	        System.out.println("Tan of " + angle + ": " + formattedTanValue);
	        
	    
		    }

	    public void sinh(){
		    System.out.println(" ");
	    	System.out.println("Choose angle mode: ");
	    	System.out.println("1. Degrees");
	    	System.out.println("2. Radians");
	    	
	    	int angleMode = (int) getInput("Enter your choice: ");
	    	double angle;
	    	
	    	if(angleMode == 1)
	    	{
	    		angle = getInput("Enter the angle in degrees ");
	    	}	
	    	
	    	else if(angleMode == 2)
	    		
	    	{
	    		angle = getInput("Enter the angle in radians");
	    	}
	    	else
	    	{
	    		System.out.println("Invalid choice.Defaulting to degrees.");
	    		angle = getInput("Enter the angle in Degrees: ");
	    	}
	    	
	    	double angleRadians = (angleMode ==1)?Math.toRadians(angle):angle;
	        double sinhValue = Math.sinh(angleRadians);
	        String formattedSinhValue = String.format("%.19f", sinhValue);
	        System.out.println("Hyperbolic Sin of " + angle + ": " + formattedSinhValue);
	        
	    
		    }

	    public void cosh(){
		    System.out.println(" ");
	    	System.out.println("Choose angle mode: ");
	    	System.out.println("1. Degrees");
	    	System.out.println("2. Radians");
	    	
	    	int angleMode = (int) getInput("Enter your choice: ");
	    	double angle;
	    	
	    	if(angleMode == 1)
	    	{
	    		angle = getInput("Enter the angle in degrees ");
	    	}	
	    	
	    	else if(angleMode == 2)
	    		
	    	{
	    		angle = getInput("Enter the angle in radians");
	    	}
	    	else
	    	{
	    		System.out.println("Invalid choice.Defaulting to degrees.");
	    		angle = getInput("Enter the angle in Degrees: ");
	    	}
	    	
	    	double angleRadians = (angleMode ==1)?Math.toRadians(angle):angle;
	        double coshValue = Math.cosh(angleRadians);
	        String formattedCoshValue = String.format("%.19f", coshValue);
	        System.out.println("hyperbolic of cosine " + angle + ": " + formattedCoshValue);
	        
	    
		    }

	    public void tanh() {
		    System.out.println(" ");
	    	System.out.println("Choose angle mode: ");
	    	System.out.println("1. Degrees");
	    	System.out.println("2. Radians");
	    	
	    	int angleMode = (int) getInput("Enter your choice: ");
	    	double angle;
	    	
	    	if(angleMode == 1)
	    	{
	    		angle = getInput("Enter the angle in degrees ");
	    	}	
	    	
	    	else if(angleMode == 2)
	    		
	    	{
	    		angle = getInput("Enter the angle in radians");
	    	}
	    	else
	    	{
	    		System.out.println("Invalid choice.Defaulting to degrees.");
	    		angle = getInput("Enter the angle in Degrees: ");
	    	}
	    	
	    	double angleRadians = (angleMode ==1)?Math.toRadians(angle):angle;
	        double tanhValue = Math.tanh(angleRadians);
	        String formattedTanValue = String.format("%.19f", tanhValue);
	        System.out.println("hyperbolic of Tangent of " + angle + ": " + formattedTanValue);
	        
	    
		    }

	    public void power(double base, double exponent) 
	    {
	        double result = Math.pow(base, exponent);
	        String formatVal = String.format("%.19f", result);
	        System.out.println(base + " raised to the power of " + exponent + ": " + formatVal);
	    }

	    public void sqrt(double number) 
	    {
	        double result = Math.sqrt(number);
	        String formatVal = String.format("%.19f", result);
	        System.out.println("The  square root of " + number + ": " + formatVal);
	    }
	    public void quadratic(double num)	    
	    {
	    	double result = Math.pow(num, 2);
	    	String formatVal = String.format("%.19f", result);
	        System.out.println("The square of  " + num + ": " + formatVal);
	    }
	    
	    public void cubic(double num)	    
	    {
	    	double result = Math.pow(num, 3);
	    	String formatVal = String.format("%.19f", result);
	        System.out.println("The cubic of  " + num + ": " + formatVal);
	        
	        
	    }
	    
	    public void logarithm(double num)
	    {
	    	double result = Math.log10(num);
	    	String formatVal = String.format("%.19f", result);
	    	System.out.println("The Base 10 Logarithim of " + num + ":" + formatVal);	    	
	    }
	    
	    public void logarithm_func(double num)
	    {
	    	double result  = Math.pow(10,num);
	    	String formatVal = String.format("%.19f", result);
	    	System.out.println("The 10^ " + num + ":" + formatVal);
	    }
	    
	    public void natural_Log(double num)
	    {
	    	double result = Math.log(num);
	    	String formatVal = String.format("%.19f", result);
	    	System.out.println("ln" + num + ":" + formatVal);
	    }
	    public void exponential_func(double num)
	    {
	    	double result = Math.exp(num);
	    	String formatVal = String.format("%.19f", result);
	    	System.out.println("e^" + num + ":"+ formatVal);
	    }
	    

	    public double getInput(String prompt) {
	        System.out.print(prompt);
	        return scanner.nextDouble();
	    }

	    public static void main(String[] args) {
	        Calculator calculator = new Calculator();

	        boolean exit = false;
	        do {
	            System.out.println("\nChoose an operation type:");
	            System.out.println("1. Arithmetic");
	            System.out.println("2. Geometric");
	            System.out.println("3. Exponential");
	            System.out.println("0. Exit");

	            int operationType = (int) calculator.getInput("Enter your choice: ");

	            switch (operationType) {
	                case 1:
	                    performArithmeticOperations(calculator);
	                    break;
	                case 2:
	                    performGeometricOperations(calculator);
	                    break;
	                case 3:
	                    performExponentialOperations(calculator);
	                    break;
	                case 0:
	                    exit = true;
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        } while (!exit);
	    }

	    private static void performArithmeticOperations(Calculator calculator) {
	        int choice;
	        do {
	            System.out.println("\nChoose an arithmetic operation:");
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division");
	            System.out.println("0. Back to main menu");

	            choice = (int) calculator.getInput("Enter your choice: ");

	            switch (choice) {
	                case 1:
	                	int numAdd;
	                	do {
	                		numAdd = (int) calculator.getInput("Enter the number of values to add: ");
	                	   }
	                	while(numAdd>6);
	                	
	                    double[] addValues = new double[numAdd];
	                    for (int i = 0; i < numAdd; i++) {
	                        addValues[i] = calculator.getInput("Enter value " + (i + 1) + ": ");
	                    }
	                    calculator.addition(addValues);
	                    break;
	                case 2:
	                	int numSub;
	                	do
	                	{
	                		numSub = (int) calculator.getInput("Enter the number of values to subtract: ");
	                	}
	                	while(numSub>6);
	                    
	                    double[] subValues = new double[numSub];
	                    for (int i = 0; i < numSub; i++) {
	                        subValues[i] = calculator.getInput("Enter value " + (i + 1) + ": ");
	                    }
	                    calculator.subtraction(subValues);
	                    break;
	                case 3:
	                	int numMul;
	                	do
	                	{
	                		numMul = (int) calculator.getInput("Enter the number of values to multiply: ");
	                	}
	                	while(numMul>6);
	                    
	                    double[] mulValues = new double[numMul];
	                    for (int i = 0; i < numMul; i++) {
	                        mulValues[i] = calculator.getInput("Enter value " + (i + 1) + ": ");
	                    }
	                    calculator.multiplication(mulValues);
	                    break;
	                case 4:
	                    int numDiv;
	                    {
	                	numDiv = (int) calculator.getInput("Enter the number of values to divide: ");
	                    }
	                    while(numDiv>6);
	                    
	                    double[] divValues = new double[numDiv];
	                    for (int i = 0; i < numDiv; i++) {
	                        divValues[i] = calculator.getInput("Enter value " + (i + 1) + ": ");
	                    }
	                    calculator.division(divValues);
	                    break;
	                case 0:
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        } while (choice != 0);
	    }

	    private static void performGeometricOperations(Calculator calculator) {
	        int choice;
	        do {
	            System.out.println("\nChoose a geometric operation:");
	            System.out.println("1. Sine");
	            System.out.println("2. Cosine");
	            System.out.println("3. Tangent");
	            System.out.println("4. Hyperbolic Sine");
	            System.out.println("5. Hyperbolic Cosine");
	            System.out.println("6. Hyperbolic Tangent");
	            System.out.println("0. Back to main menu");

	            choice = (int) calculator.getInput("Enter your choice: ");

	            switch (choice) {
	                case 1:
	                    calculator.sin();
	                    break;
	                case 2:
	                    calculator.cos();
	                    break;
	                case 3:
	                    calculator.tan();
	                    break;
	                case 4:
	                    calculator.sinh();
	                    break;
	                case 5:
	                    calculator.cosh();
	                    break;
	                case 6:
	                    calculator.tanh();
	                    break;
	                case 0:
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        } while (choice != 0);
	    }

	    private static void performExponentialOperations(Calculator calculator) {
	        int choice;
	        do {
	            System.out.println("\nChoose an exponential operation:");
	            System.out.println("1. Power Function");
	            System.out.println("2. Square Root");
	            System.out.println("3. quadratic");
	            System.out.println("4. cubic");
	            System.out.println("5. logarithm");
	            System.out.println("6. Logarithimic Function");
	            System.out.println("7. natural logarithim");
	            System.out.println("8. Exponential function");                                                                                                                                      
	            System.out.println("0. Back to main menu");

	            choice = (int) calculator.getInput("Enter your choice: ");

	            switch (choice) {
	                case 1:
	                    double base = calculator.getInput("Enter the base: ");
	                    double exponent = calculator.getInput("Enter the exponent: ");
	                    calculator.power(base, exponent);
	                    break;
	                case 2:
	                    double number = calculator.getInput("Enter the number: ");	              
	                    calculator.sqrt(number);
	                    break;
	                case 3:
	                	double quadraticValue = calculator.getInput("Enter the number: ");
	                	calculator.quadratic(quadraticValue);
	                    break;
	                case 4:
	                	double cubicValue = calculator.getInput("Enter the number: ");
	                	calculator.cubic(cubicValue);
	                	break;
	                	
	                case 5:
	                	double logValue = calculator.getInput("Enter the number: ");
	                	calculator.logarithm(logValue);
	                	break;
	                	
	                case 6:
	                	double LogValue = calculator.getInput("Enter the number: ");
	                	calculator.logarithm_func(LogValue);
	                	break;
	                	
	                case 7:
	                	double natValue = calculator.getInput("Enter the number: ");
	                	calculator.natural_Log(natValue);
	                	break;
	                	
	                case 8:
	                	double expoValue = calculator.getInput("Enter the number: ");
	                	calculator.exponential_func(expoValue);
	                	break;
	                	
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	                    break;
	            }
	        } while (choice != 0);
	    }
	}


