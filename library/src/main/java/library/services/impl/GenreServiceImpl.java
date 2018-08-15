package library.services.impl;

import library.model.Genre;
import library.services.GenreService;

public class GenreServiceImpl implements GenreService{

	public int getGenreID(Genre genre) {
		return (genre.ordinal() + 1);
	}
	
	public String genre(int genreID) {
	switch (genreID) {
	case 1:
		return Genre.Science_fiction.name();
	case 2:
		return Genre.Historical_drama.name();
	case 3:
		return Genre.Fantasy.name();
	case 4:
		return Genre.Philosophical_novel.name();		
	}
	return null;
}


}
