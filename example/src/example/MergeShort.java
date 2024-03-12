package example;
/*
 * Merge Sort:
Average Case Time Complexity: O(n log n)
Worst Case Time Complexity: O(n log n)
Best Case Time Complexity: O(n log n) - Merge sort divides the array into halves and recursively sorts them, regardless of the initial order of elements.
 */
public class MergeShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,1,2,4,5,6,8,3,4,2,6,8,9,4};
		System.out.println("<-- Merge short -->");
		System.out.println("<-- Unsorted Element -->");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		mergeshort(arr);
		System.out.println("\n\n<-- Sorted Element -->");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
 public static void mergeshort(int arr[]) {
	 if (arr == null || arr.length < 2) {
		 return ;
	 }
	 mergeshortoperation(arr,0,arr.length-1);
 }
 public static void mergeshortoperation(int arr[], int left, int right) {
	 if(left < right) {
		 int mid = left + (right-left)/2;
		 mergeshortoperation(arr,left,mid);
		 mergeshortoperation(arr,mid+1,right);
		 merge(arr,left,mid,right);
	 }
 }
 public static void merge(int arr[], int left, int mid, int right) {
	 int l = mid-left+1;
	 int r = right- mid;
	 int a[] = new int[l];
	 int b[] = new int[r];
	 System.arraycopy(arr, left, a, 0, l);
	 System.arraycopy(arr, mid+1, b, 0, r);
	 int i = 0, j = 0, k = left;
	 while(i<l && j<r) {
		 if(a[i]>b[j])
			 arr[k++] = a[i++];
		 else
			 arr[k++] = b[j++];
	 }
	 while(i<l) {
		 arr[k++] = a[i++];
	 }
	 while(j<r) {
		 arr[k++] = a[j++];
	 }
 }
 
}
