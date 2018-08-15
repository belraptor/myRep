package library.db;

import java.sql.SQLException;

import library.model.Author;

public interface AuthorDao {
	Author getById(long id) throws SQLException;

}
