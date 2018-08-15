package library.db.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import library.db.ConnectionUtils;
import library.model.Author;

public class AuthorDaoImpl {
	private String GET_BY_ID = "SELECT * from authors where id = ?";
	public Author getById(long id) throws SQLException{
		ConnectionUtils.connectToDataBase();
		PreparedStatement ps = ConnectionUtils.getConnection().prepareStatement(GET_BY_ID);
		ps.setLong(1, id);
		ResultSet rs = ps.executeQuery();
		
		Author author = null;
		author = createAuthor(rs);
		ConnectionUtils.closeConnection();
		return author;
	}
	private Author createAuthor(ResultSet rs) throws SQLException {
		Author author = new Author();
		while (rs.next()){
			author.setId(rs.getLong(1));
			author.setName(rs.getString(2));
		}
		return author;
	}

}
