package homework9;

public enum Genre {
	Science_fiction(1),
	Historical_drama(2),
	Fantasy(3);
	
	private int genreID;
	private Genre(int genreID){
		this.genreID=genreID;
	}
	public int getGenreID() {
		return genreID;
	}
}
