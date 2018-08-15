package library.model;

public enum Genre {
	Science_fiction, Historical_drama, Fantasy, Philosophical_novel;

	private int genreID;

	public int getGenreID() {
		return genreID;
	}

	public void setGenreID(int genreID) {
		this.genreID = genreID;
	}

}
