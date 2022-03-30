package DataSructurs;

public class SortedArray {
	static boolean isSorted(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < arr[i-1])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int arr[] = {2,3,4,5,6};
		System.out.println(isSorted(arr));
	}
}

// Time-complexity O(n)


// Time-complexity:- O(n^2)

//for(int i=0; i<n; i++) {
//	for(int j=i+1; j<n; j++) {
//		if(arr[i]<arr[j]) {
//			return false;
//		}
//	}
//}