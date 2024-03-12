package example;

public class Bubble_Short {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<--- Bubble Short ---->\n\n");
		int array[] = {9,2,4,2,5,3,8,4,5,6,8};
		System.out.println("<-- Unsorted Element -->");
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		bubbleshort(array,array.length);

	}
	public static void bubbleshort (int[] array, int len)
	{
		for (int i = 0;i<len-1;i++) {
			for(int j=0;j<len-1-i;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("\n<-- Sorted Element -->");
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
