package homework9;

public enum Genre {
	Science_fiction(1),
	Historical_drama(2),
	Fantasy(3);
	
	private int genreID;
	private Genre(int genreID){
		this.genreID=genreID;
	}
	public static int getGenreID(Genre genre) {
		return (genre.ordinal()+1);
	}
	public String genre() {
		switch (genreID) {
		case 1:
			return Genre.Science_fiction.name();
		case 2:
			return Genre.Historical_drama.name();
		case 3:
			return Genre.Fantasy.name();
		}
		return null;
	}

}
