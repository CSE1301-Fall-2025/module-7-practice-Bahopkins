package exam.codereading.q2;

public class Bike {
	private int maxGear ;
	private int currentGear ;
	public Bike (int maxGear ) {
		this . maxGear = maxGear ;
		currentGear = 1;
	}
	public int shiftUp () {
		if( this . currentGear < maxGear ) {
			this . currentGear ++;
		}
		return this . currentGear ;
	}
	public int shiftDown (int gears ) {
		if( this.currentGear > gears ) {
			this.currentGear -= gears ;
		} else {
			this.currentGear = 1;
		}
		return this.currentGear ;
	}
	public void pedal () {
		this.shiftUp ();
		System.out.println ( this.currentGear );
	}

	public static void main(String[] args) {
		//What will print?
		Bike tenSpeed = new Bike(10);
		Bike eighteenSpeed = new Bike(18);
		System.out.println ( tenSpeed . shiftUp());
		tenSpeed.pedal();
		for(int i = 0; i < 10; i ++) {
			eighteenSpeed.shiftUp();
		}
		eighteenSpeed.pedal();
		System.out.println (tenSpeed.shiftDown(5));
		Bike huffy = eighteenSpeed ;
		huffy.pedal();
		tenSpeed = huffy ;
		System.out.println ( eighteenSpeed.shiftDown(7));
		System.out.println ( tenSpeed.shiftDown(7));
		huffy.pedal();
	}
}
