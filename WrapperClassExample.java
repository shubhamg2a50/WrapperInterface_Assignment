package oop.assignment;

public class WrapperClassExample {
	public static Integer convertPrimitiveToWrapper(int value) {
		return Integer.valueOf(value);
	}
	
	public static int convertWrapperToPrimitive(Integer value) {
		return value.intValue();
	}
	
	public static void main(String[] args) {
		int primitiveValue = 10;
		
		Integer wrapperValue = convertPrimitiveToWrapper(primitiveValue);
		System.out.println("Primitive to Wrapper: " + wrapperValue);
		
		int newPrimitiveValue = convertWrapperToPrimitive(wrapperValue);
		System.out.println("Wrapper to Primitive: " + newPrimitiveValue);
	}
}
