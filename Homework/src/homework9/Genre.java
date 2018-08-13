package homework9;

public enum Genre {
	Science_fiction, Historical_drama, Fantasy;

	private int genreID;

	public static int getGenreID(Genre genre) {
		return (genre.ordinal() + 1);
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
