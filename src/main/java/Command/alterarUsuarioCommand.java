package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import base.BaseCommand;
import dao.UsuarioDAO;
import models.Usuario;

public class AlterarUsuarioCommand implements BaseCommand{
	
	private UsuarioDAO dao;
	
	public AlterarUsuarioCommand(UsuarioDAO dao) {
		this.dao = dao;
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			Long id =  Long.parseLong(request.getParameter("id"));
			Usuario usuario =  new Usuario();
			usuario.setNome(request.getParameter("nome"));
			usuario.setEmail(request.getParameter("email"));
			
			dao.alterarUsuario(usuario, id);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
