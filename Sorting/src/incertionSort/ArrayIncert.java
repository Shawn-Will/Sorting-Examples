package incertionSort;

public class ArrayIncert {
	private int[] a;
	private int nElements;

	public ArrayIncert(int maxSize) {
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
		System.out.println();
	}

	public void incertionSort() {
		int in;
		int out;

		for (out = 1; out < nElements; out++) {
			int temp = a[out];
			in = out;
			while (in > 0 && a[in - 1] >= temp) {
				a[in] = a[in - 1];
				in--;
			}
			a[in] = temp;
		}
	}

	private void swap(int one, int two) {
		int temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}

}
