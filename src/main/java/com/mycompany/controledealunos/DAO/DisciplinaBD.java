package com.mycompany.controledealunos.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.controledealunos.modelo.Disciplina;

public class DisciplinaBD {
	private Connection connection;

	public DisciplinaBD() {
		this.connection = new DataSource().getConnection();
	}

	public void fechaConexao() {
		try {
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void insere(Disciplina disciplina) {
		String sql = "insert into disciplinas (nome,creditos,vagas) values (?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, disciplina.getNome());
			stmt.setInt(2, disciplina.getCreditos());
			stmt.setInt(3, disciplina.getVagas());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Disciplina disciplina) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from disciplinas where id=?");
			stmt.setLong(1, disciplina.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Disciplina disciplina) {
		String sql = "update disciplinas set nome=?, creditos=?, vagas=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, disciplina.getNome());
			stmt.setInt(2, disciplina.getCreditos());
			stmt.setInt(3, disciplina.getVagas());
			stmt.setLong(4, disciplina.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Disciplina> buscaDisciplinaPeloNome(String nome) {
		List<Disciplina> disciplinas = new ArrayList<Disciplina>();
		PreparedStatement stmt;
		String sql = "select * from disciplinas where nome=?";
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, nome);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Disciplina disciplina = new Disciplina(rs.getLong("id"), rs.getString("nome"), rs.getInt("creditos"), rs.getInt("vagas"));
				disciplinas.add(disciplina);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return disciplinas;
	}

	public List<Disciplina> getLista() {
		List<Disciplina> disciplinas = new ArrayList<Disciplina>();
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement("select * from disciplinas order by nome");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
                            Disciplina disciplina = new Disciplina(rs.getLong("id"), rs.getString("nome"), rs.getInt("creditos"), rs.getInt("vagas"));
                            disciplinas.add(disciplina);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return disciplinas;
	}
}