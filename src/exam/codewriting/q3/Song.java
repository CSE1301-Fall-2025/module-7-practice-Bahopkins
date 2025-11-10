package exam.codewriting.q3;

/*
 * We wish to create a Song class. A song has-a(n):
	name
	artist
	duration (in seconds)
 */
public class Song {
	
	// Define your instance variables here
	private String name;
	private String artist;
	private double duration;
	
	// Write the constructor for the Song class
	public Song(String name, String artist, double duration) {
		this.name = name;
		this.artist = artist;
		this.duration = duration;
	}
	
	public String getName () {
		return name;
	}

	public String getArtist() {
		return artist;
	}

	public double getDuration() {
		return duration;
	}
	
	public String toString () {
		return "Name: " + name + " , Artist: " + artist + " , Duration: " + duration;
	}
	
	/**
	* When two songs are mashed up, a new Song should be created and returned.
	* The name and artist of the new song should contain both names and both
	* artists from the original songs, and the duration should be the average
	* of the durations of the original songs.
	*/
	public Song mashUp ( Song other ) {
		String newName = this.name + " and " + other.getName();
		String newArtist = this.artist + " and " + other.getArtist();
		double newDuration = (this.duration + other.getDuration()) / 2;
		return new Song(newName, newArtist, newDuration);
	}
}
