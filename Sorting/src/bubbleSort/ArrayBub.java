package bubbleSort;

public class ArrayBub {
	private int[] a;
	private int nElements;

	public ArrayBub(int maxSize) {
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

	public void bubbleSort() {
		int out;
		int in;
		int numOfComp = 0;

		for (out = nElements - 1; out >= 1; out--) {
			for (in = 0; in < out; in++) {
				numOfComp++;
				if (a[in] > a[in + 1]) {
					swap(in, in + 1);
				}
			}
		}
		System.out.println("Number of Comparisons: " + numOfComp);

	}

	private void swap(int one, int two) {
		int temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}

}
