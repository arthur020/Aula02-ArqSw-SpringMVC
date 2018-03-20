package br.usjt.arqsw.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;

import br.usjt.arqsw.entity.Usuario;

/**
 * 
 * @author Arthur Santos
 *
 */
@Repository
public class UsuarioDAO {
	
	private Connection conn;
	
	@Autowired
	public UsuarioDAO(DataSource dataSource) throws IOException {
		try {
			this.conn = dataSource.getConnection();
		} catch (SQLException e) {
			throw new IOException(e);
		}
	}
	
	public boolean verificaUsuario(Usuario usuario) throws IOException {
		System.out.println(usuario);
		String query = "SELECT username, password FROM usuario WHERE username = ? AND password = ?";
		ArrayList<Usuario> lista = new ArrayList<>();
		try (PreparedStatement pst = conn.prepareStatement(query);) {
			pst.setString(1, usuario.getUsername());
			pst.setString(2, usuario.getPassword());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Usuario usuario2 = new Usuario();
				usuario2.setUsername(rs.getString("username"));
				usuario2.setPassword(rs.getString("password"));
				lista.add(usuario2);
			}

		} catch (SQLException e) {
			throw new IOException(e);
		}
		
		if(!lista.isEmpty()) {return true;}
		else return false;
	}
	
	

}
