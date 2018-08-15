package library.services;

import library.model.Genre;

public interface GenreService {
	int getGenreID(Genre genre);
	String genre(int genreID);

}
