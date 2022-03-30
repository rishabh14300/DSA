package DataSructurs;

public class Largest_Number {
	static int getLargest(int arr[]) {
		int res = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>arr[res]) {
				res++;
			}
		}
		return arr[res];
	}
	public static void main(String[] args) {
		int arr[] = {12, 20, 12, 10};
		System.out.println(getLargest(arr));
	}
}
