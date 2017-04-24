package selectionSort;

public class ArraySel {
	private int[] a;
	private int nElements;

	public ArraySel(int maxSize) {
		a = new int[maxSize];
		nElements = 0;
	}

	public void insert(int value) {
		a[nElements++] = value;
	}

	public void display() {
		for (int i = 0; i < nElements; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
	}

	public void selectionSort() {
		int out;
		int in;
		int min;

		for (out = 0; out < nElements - 1; out++) {
			min = out;
			for (in = out + 1; in < nElements; in++) {
				if (a[in] < a[min]) {
					min = in;
				}
			}
			swap(out, min);
		}
	}

	private void swap(int one, int two) {
		int temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}