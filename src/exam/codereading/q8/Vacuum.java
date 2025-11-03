package exam.codereading.q8;

public class Vacuum {

    private int capacity;
    private int currentAmount;
    private boolean isClogged;
    
    public Vacuum(int capacity) {
        this.capacity = capacity;
        this.currentAmount = 0;
        this.isClogged = false;
    }
    
    public void unclog() {
        this.isClogged = false;
    }
    
    public int clean(int amount) {
		if(amount > 3) {
			this.isClogged = true;
		}
		if(!this.isClogged) {
			if (currentAmount + amount < capacity) {
				this.currentAmount += amount;
			} else {
				this.currentAmount = capacity;//full
			}
		}
		return this.currentAmount;
	}
    
    public static void main(String[] args) {
    	//What will print?
    	Vacuum small = new Vacuum (5);
    	  
		Vacuum large = new Vacuum (10);
  
		System.out.println(small.clean(2));
  
		System.out.println(large.clean(4));
  
		for(int i = 0; i < 8; i ++) {
			small.clean(1);
		}
  
		System.out.println(large.clean(1));
  
		System.out.println(small.clean(1));
  
		Vacuum old = large;
  
		System.out.println(old.clean(1));
  
		large.unclog();
  
		System.out.println(large.clean(2));
  
		System.out.println(old.clean(1));
    }
 }
