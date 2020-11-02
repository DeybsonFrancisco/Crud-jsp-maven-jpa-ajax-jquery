package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import base.BaseCommand;
import bind.UsuarioBind;
import dao.UsuarioDAO;
import models.Usuario;

public class RemoverUsuarioCommand implements BaseCommand{
	
	private UsuarioDAO dao;
	
	public RemoverUsuarioCommand(UsuarioDAO dao) {
		this.dao = dao;
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			Long id = Long.parseLong(request.getParameter("id"));
			dao.removerUsuario(id);
		}catch(Exception ex) {
			System.out.println(ex);
			
		}
		
	}

}
