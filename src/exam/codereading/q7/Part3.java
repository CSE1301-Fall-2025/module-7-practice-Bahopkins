package exam.codereading.q7;

public class Part3 {

	public static void main(String[] args) {
		//What gets printed?
		int [] secret = new int [] { 1, 3, 1 };
		ComboLock c5 = new ComboLock (secret , 0); // careful
		c5.trySoln(new int [] { 1, 3, 1 });
		System.out.println(c5);
	}

}
