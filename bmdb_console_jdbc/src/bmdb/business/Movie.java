package bmdb.business;

public class Movie {
	
	private long id;
	private String title;
	private String year;
	private String rating;
	private String director;

	public Movie() {
		id = 0;
		title = "";
		year = "";
		rating = "";
		director = "";
	}

	public Movie(long id, String title, String year, String rating, String director) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.rating = rating;
		this.director = director;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", year=" + year + ", rating=" + rating + ", director="
				+ director + "]";
	}
	
	
}
