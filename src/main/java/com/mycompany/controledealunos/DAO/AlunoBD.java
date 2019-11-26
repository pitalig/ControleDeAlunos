package com.mycompany.controledealunos.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.controledealunos.modelo.Aluno;

public class AlunoBD {
	private Connection connection;

	public AlunoBD() {
		// cria uma conexao com o BD
		this.connection = new DataSource().getConnection();
	}

	public void fechaConexao() {
		try {
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// insere um aluno
	public void insere(Aluno aluno) {
		String sql = "insert into alunos (nome,email,endereco) values (?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			// seta valores
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getEmail());
			stmt.setString(3, aluno.getEndereco());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// remove um aluno
	public void remove(Aluno aluno) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from alunos where id=?");
			stmt.setLong(1, aluno.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// altera dados de um aluno
	public void altera(Aluno aluno) {
		String sql = "update alunos set nome=?, email=?, endereco=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getEmail());
			stmt.setString(3, aluno.getEndereco());
			stmt.setLong(4, aluno.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// faz a busca de aluno(s) pelo nome do aluno
	public List<Aluno> buscaAlunoPeloNome(String nome) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		PreparedStatement stmt;
		String sql = "select * from alunos where nome=?";
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, nome);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Aluno aluno = new Aluno();
				aluno.setId(rs.getLong("id"));
				aluno.setNome(rs.getString("nome"));
				aluno.setEmail(rs.getString("email"));
				aluno.setEndereco(rs.getString("endereco"));
				alunos.add(aluno);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return alunos;
	}

	// devolve uma lista com todos alunos
	public List<Aluno> getLista() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement("select * from alunos order by nome");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Aluno aluno = new Aluno();
				aluno.setId(rs.getLong("id"));
				aluno.setNome(rs.getString("nome"));
				aluno.setEmail(rs.getString("email"));
				aluno.setEndereco(rs.getString("endereco"));
				alunos.add(aluno);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return alunos;
	}
}