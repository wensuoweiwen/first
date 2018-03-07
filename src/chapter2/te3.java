package chapter2;

public class te3 {
	public static void main(String[] args) {
		int[] arr = {25,24,12,76,101,96,28};
		System.out.print("Ã°ÅİÅÅĞòÇ°£º");
		printArray(arr);
		bubbleSort(arr);
		System.out.print("Ã°ÅİÅÅĞòºó£º");
		printArray(arr);
	}
	public static void printArray(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}
	public static void bubbleSort(int[] arr) {
		for (int i=0;i<arr.length-1;i++) {
			for (int j=0;j<arr.length-i-1;j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.print("µÚ"+(i+1)+"ÂÖÅÅĞòºó£º");
			printArray(arr);
		}
	}
}
