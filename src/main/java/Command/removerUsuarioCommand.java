package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import base.BaseCommand;
import dao.UsuarioDAO;

public class RemoverUsuarioCommand implements BaseCommand{
	
	private UsuarioDAO dao;
	
	public RemoverUsuarioCommand(UsuarioDAO dao) {
		this.dao = dao;
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

}
