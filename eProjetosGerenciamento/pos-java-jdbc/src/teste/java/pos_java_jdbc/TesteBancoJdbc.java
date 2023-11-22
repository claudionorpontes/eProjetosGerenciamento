package pos_java_jdbc;

import java.util.List;

import org.junit.jupiter.api.Test;

import dao.UserPosDao;
import model.Telefone;
import model.Userposjava;

public class TesteBancoJdbc {

	@Test
	public void initBanco() {
		UserPosDao userPosDao = new UserPosDao();
		Userposjava userposjava = new Userposjava();

		userposjava.setNome("Paulo");
		userposjava.setEmail("paulo@gmail.com");

		userPosDao.salvar(userposjava);

	}

	@Test
	public void initBuscar() {
		UserPosDao dao = new UserPosDao();
		try {
			List<Userposjava> list = dao.listar();

			for (Userposjava userposjava : list) {
				System.out.println(userposjava);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void initAtualizar() {
		try {

			UserPosDao dao = new UserPosDao();

			Userposjava objetoBanco = dao.buscar(5L);
			
			objetoBanco.setNome("Nome mudado com metodo atualizar");
			
			dao.atualizar(objetoBanco);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
	
	@Test
	public void testeInsertTelefone() {
		
		Telefone telefone = new Telefone();
		telefone.setNumero("(61) 8145-0236");
		telefone.setTipo("Casa");
		telefone.setUsuario(2L);
		
		UserPosDao dao = new UserPosDao();
		dao.salvarTelefone(telefone);
	}

}



