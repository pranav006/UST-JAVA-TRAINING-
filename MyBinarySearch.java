
public class MyBinarySearch {
	int binarySearch(int arr[], int l, int r, int x) {
		if(r >= l) {
			int mid = l + (r-l)/2;
			if(arr[mid] == x)
				return mid;
			if(arr[mid] > x)
				return binarySearch(arr, l, mid-1, r);
			return binarySearch(arr, mid+1, r, x);
			}
		return -1;
	}
	public static void main(String[] args) {
		MyBinarySearch obj = new MyBinarySearch();
		int arr[] = {2,5,7,11,12,34,45,56};
		int n= arr.length;
		int x= 34;
		int result = obj.binarySearch(arr, 0, n-1, x);
		if(result == -1)
			System.out.println(x + ": Element not found");
		else
			System.out.println(x + ": Element found at index: " + result);
	}

}