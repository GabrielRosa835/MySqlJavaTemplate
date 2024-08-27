package mylibrary;

public abstract class Utils {
	
	public static void print() {
		System.out.println();
	}
	public static void print(String text) {
		System.out.println(text);
	}
//===================================================================================
	public static Object[] push(Object[] array, Object new_value) {
		Object[] new_array = new Object[array.length+1];
		new_array[array.length] = new_value;
		return new_array;
	}
	public static int[] push(int[] array, int new_value) {
		int[] new_array = new int[array.length+1];
		new_array[array.length] = new_value;
		return new_array;
	}
	public static double[] push(double[] array, double new_value) {
		double[] new_array = new double[array.length+1];
		new_array[array.length] = new_value;
		return new_array;
	}
	public static boolean[] push(boolean[] array, boolean new_value) {
		boolean[] new_array = new boolean[array.length+1];
		new_array[array.length] = new_value;
		return new_array;
	}
}
