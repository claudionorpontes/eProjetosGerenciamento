package pos_java_jdbc;

import org.junit.jupiter.api.Test;

import dao.Projeto;
import dao.UserPosDao;
import model.Userposjava;

public class TesteBancoJdbc<listarProjetosIniciados> {

	private static final Userposjava[] list = null;

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
			listarProjetosIniciados = new listaProjetosIniciados();

			for (Userposjava userposjava : list) {
				System.out.println(userposjava);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void Lista() {
	}
		
	 listaProjetosIniciados listarProjetosIniciados = new listaProjetosIniciados(); 

	@Test
	public void initAtualizar() {
		try {

			UserPosDao<?> dao = new UserPosDao<Projeto>();

			Userposjava objetoBanco = dao.buscar(5L);
			
			objetoBanco.setNome("Nome mudado com metodo atualizar");
			
			dao.atualizar(objetoBanco);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
	

}



