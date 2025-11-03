package exam.codereading.q7;

public class Part4 {

	public static void main(String[] args) {
		//What gets printed?
		int [] secret = new int [] { 1, 3, 1 };
		ComboLock c4 = new ComboLock(secret , 2);
		System.out.println (c4 );
		c4.trySoln( new int [] { 1, 2, 3 });
		c4.trySoln( new int [] { 1, 3, 1 });
		System.out.println (c4);
	}

}
