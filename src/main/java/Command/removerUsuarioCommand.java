package Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Base.BaseCommand;
import DAO.UsuarioDAO;

public class removerUsuarioCommand implements BaseCommand{
	
	private UsuarioDAO dao;
	
	public removerUsuarioCommand(UsuarioDAO dao) {
		this.dao = dao;
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

}
