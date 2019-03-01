package sort;

public class SortAlog {
	public static void select_sort(int[] a) {
		// 选择排序
		int N = a.length;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (a[j] < a[i]) {
					int tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
			}
		}
	}

	public static void bubble_sort(int[] a) {
		// 冒泡排序
		int N = a.length;
		for (int i = 0; i < N - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < N - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					flag = true;
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
			if (!flag) {
				break;
			}
		}
	}

	public static int partition(int[] a, int i, int j) {
		int tmp = a[i];
		while (i < j) {
			while (i < j && tmp <= a[j]) {
				j--;
			}
			a[i] = a[j];
			while (i < j && a[i] <= tmp) {
				i++;
			}
			a[j] = a[i];
		}
		a[i] = tmp;
		return i;
	}

	public static void quick_sort(int[] a, int low, int high) {
		// 快速排序
		if (low < high) {
			int pivot = partition(a, low, high);
			quick_sort(a, low, pivot - 1);
			quick_sort(a, pivot + 1, high);
		}
	}

	public static int[] count_sort(int[] arr, int k) {
		// 计数排序
		int[] arrC = new int[k + 1];// 构造c数组
		int[] arrB = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrC[arr[i]] += 1;
		}
		for (int i = 1; i <= k; i++) {
			arrC[i] += arrC[i - 1];
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			// 将A中元素放到排序数组B的指定位置
			arrB[arrC[arr[i]] - 1] = arr[i];
			arrC[arr[i]]--;
		}
		return arrB;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 8, 7, 5, 4, 9, 2, 6, 10 };
		// select_sort(arr);
		// bubble_sort(arr);
		// quick_sort(arr, 0, arr.length - 1);
		int[] sort_arr = count_sort(arr, 10);
		for (int i = 0; i < sort_arr.length; i++) {
			System.out.print(String.valueOf(sort_arr[i]) + ' ');
		}
		System.out.println();
	}
}
