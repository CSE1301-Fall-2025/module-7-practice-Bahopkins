package exam.codereading.q6;

public class Clock {
	private int s;
	private int m;
	public Clock ( int minute, int second ) {
		this.s = second ;
		this.m = minute ;
	}
	public void tick() {
		this.s = this.s+1;
		if(this.s==60) {
			tocking() ;
			this.s = 0 ;
		}
	}

	public void tocking () {
		this .m = this .m + 1;
	}

	public String toString () {
		return m + ":" + s;
	}

	public static void main(String[] args) {
		//What will print?
		Clock c = new Clock(3 ,58);
		System.out.println (c);
		c.tick();
		System.out.println(c);
		c = new Clock (3, 58);
		c.tick();
		c.tick();
		System.out.println (c);
		Clock d = new Clock(3 ,58);
		Clock k = new Clock(2, 50);
		System.out.println(k);
		d = k;
		System.out.println(d);
		k. tick ();
		System.out.println(k);
		d. tocking ();
		System.out.println(d);
	}

}
