package bubbleSort;

public class BubbleSortDemo {

	public static void main(String[] args){
		int maxSize = 100;
		ArrayBub array = new ArrayBub(maxSize);
		array.insert(1);	
		array.insert(66);
		array.insert(2);
		array.insert(11);
		array.insert(394);
		array.insert(22);
		array.insert(45);
		array.insert(12);
		array.insert(-55);
		array.insert(0);
		array.insert(-64);
		array.insert(-2);
		array.insert(77);
		array.insert(13);
		array.insert(14);
		array.insert(999);
		array.insert(666);
		array.insert(123);
		array.insert((int) Math.random());
		
		array.display();
		array.bubbleSort();
		array.display();
	}

}
