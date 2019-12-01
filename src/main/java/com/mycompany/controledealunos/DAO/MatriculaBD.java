package com.mycompany.controledealunos.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.controledealunos.modelo.Matricula;

public class MatriculaBD {
	private Connection connection;

	public MatriculaBD() {
		this.connection = new DataSource().getConnection();
	}

	public void fechaConexao() {
		try {
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void insere(Matricula matricula) {
		String sql = "insert into matriculas (alunoId, discId) values (?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, matricula.getAlunoId());
			stmt.setLong(2, matricula.getDiscId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Matricula matricula) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from matriculas where id=?");
			stmt.setLong(1, matricula.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Matricula matricula) {
		String sql = "update matriculas set alunoId=?, discId=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, matricula.getAlunoId());
			stmt.setLong(2, matricula.getDiscId());
			stmt.setLong(3, matricula.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Matricula> buscaMatriculaPeloAluno(Long alunoId) {
		List<Matricula> matriculas = new ArrayList<Matricula>();
		PreparedStatement stmt;
		String sql = "select * from matriculas where alunoId=?";
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setLong(1, alunoId);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Matricula matricula = new Matricula(rs.getLong("id"), rs.getLong("alunoId"), rs.getLong("discId"));
				matriculas.add(matricula);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return matriculas;
	}

	public List<Matricula> buscaMatriculaPelaDisciplina(Long discId) {
		List<Matricula> matriculas = new ArrayList<Matricula>();
		PreparedStatement stmt;
		String sql = "select * from matriculas where discId=?";
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setLong(1, discId);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Matricula matricula = new Matricula(rs.getLong("id"), rs.getLong("alunoId"), rs.getLong("discId"));
				matriculas.add(matricula);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return matriculas;
	}

	public List<Matricula> getLista() {
		List<Matricula> matriculas = new ArrayList<Matricula>();
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(
					"select * from alunos a join matricula m on a.id = m.alunoId join disciplinas d on d.id = m.discId;");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Matricula matricula = new Matricula(rs.getLong("id"), 
													rs.getLong("a.id"),
													rs.getString("a.nome"),
													rs.getString("a.email"),
													rs.getString("a.endereco"),
													rs.getLong("d.id"),
													rs.getString("d.nome"),
													rs.getInt("d.creditos"),
													rs.getInt("d.vagas"));
				matriculas.add(matricula);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return matriculas;
	}
}