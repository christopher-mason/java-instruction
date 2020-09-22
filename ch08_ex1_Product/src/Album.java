
public class Album extends Product {
	
	//fields
	private String artist;
	
	//contructors
	public Album() {
		super();
		artist = "";
		count++;
	}
	
	//getters and setters
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getArtist() {
		return artist;
	}
	
	@Override
    public String toString() {
        return super.toString() + " (" + artist + ")";
	}
}
