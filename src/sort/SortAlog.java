package sort;

public class SortAlog {
	public static void select_sort(int[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if (a[j] < a[min]) {
					int tmp = a[j];
					a[j] = a[min];
					a[min] = tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 8, 7, 5, 4, 9, 2, 6, 10 };
		select_sort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(String.valueOf(arr[i])+'\t');
		}
		System.out.println();
	}
}
