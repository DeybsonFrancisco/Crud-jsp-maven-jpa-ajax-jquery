package Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Base.BaseCommand;
import DAO.UsuarioDAO;

public class alterarUsuarioCommand implements BaseCommand{
	
	private UsuarioDAO dao;
	
	public alterarUsuarioCommand(UsuarioDAO dao) {
		this.dao = dao;
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

}
