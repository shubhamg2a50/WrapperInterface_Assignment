package oop.assignment;

public class ExceptionHandlingExample {

	public static int divide(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		return a / b; 
		}
public static void main(String[] args) {
	try { 
		System.out.println("10 / 2 = " + divide(10, 2)); 
		System.out.println("10 / 0 = " + divide(10, 0));
		
		} catch (ArithmeticException e) {
			System.err.println("Error: " + e.getMessage()); 
			}
	}
}
