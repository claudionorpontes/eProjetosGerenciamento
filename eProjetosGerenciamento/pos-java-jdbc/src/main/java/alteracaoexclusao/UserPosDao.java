package alteracaoexclusao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;



public class UserPosDao<Telefone> {

	private static final userposjava Retorno = null;
	private Connection connection;
	private String insert;

	public void salvar(UserPosDao userposjava) {
		try {
			String sql = buscarConexao ("inserção, alteração, exclusão, consultas");
			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setString(1, userposjava.getInsercao());
			insert.setString(2, userposjava.getAlteracao());
			insert.setString(3, userposjava.getExclusao());
			insert.setString(4, userposjava.getConsultas());
			insert.execute();
			connection.commit(); // salva no banco

		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
			e.printStackTrace();

		}
	}

	private String buscarConexao(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private void userposjava(String string) {
		// TODO Auto-generated method stub
		
	}

	private String getConsultas() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getExclusao() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getAlteracao() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getInsercao() {
		// TODO Auto-generated method stub
		return null;
	}

	public void salvarTelefone(Telefone telefone) {
		
		try {
			
				
		} catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
	}
	
	@Test
	public <Userposjava> void initBuscar() {

		UserPosDao dao = new UserPosDao();

		try {
			Userposjava userposjava = buscarConexao(2L);

			System.out.println(userposjava);

		} catch (Exception e) {

		}

	}
	
	private <Userposjava> Userposjava buscarConexao(long l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	private void initDeletar() {
		
		try {
			
			UserPosDao dao = new UserPosDao();
			dao.deletar(2L);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void atualizarDados(UserPosDao<Telefone> userposjava) {
		try {

			String sql = "update userposjava set insercao = ? where id = " + userposjava.getId();

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, userposjava.getInsercao());

			statement.execute();
			connection.commit();

		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (Exception e1) {
				
			}
			e.printStackTrace();
		}

	}

	private String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletar (Long id) {
		try {
			
			String sql = "delete from userposjava where id =  " + id;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.execute();
			connection.commit();
		} catch (Exception e) {
			try {
			connection.rollback();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
			e.printStackTrace();
		}
	}
	
}










