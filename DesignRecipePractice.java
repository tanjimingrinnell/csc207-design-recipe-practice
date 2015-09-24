
public class DesignRecipePractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"a", "b", "c", "d"};
		String str = " space ";
		printStrArray(arr);
		String[] interArr = intersperses(str, arr);
		printStrArray(interArr);
	}

	public static String[] intersperses(String str, String[] arr) {
		String[] interArr = new String[(2 * arr.length) - 1];
		for (int i = 0; i < arr.length; i++) {
			interArr[2 * i] = arr[i];//injection relationship
			if (i != arr.length - 1) //do not add the last one
			interArr[2 * i + 1] = str;//"inter" String
		}
		return interArr;
	}
	
	//Print method
	public static void printStrArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
