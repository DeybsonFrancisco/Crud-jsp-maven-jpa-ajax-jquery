package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import base.BaseCommand;
import dao.UsuarioDAO;
import models.Usuario;

public class BuscarUsuarioCommand implements BaseCommand{
	
	private UsuarioDAO dao;
	
	public BuscarUsuarioCommand(UsuarioDAO dao) {
		this.dao = dao;
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		Long id = Long.parseLong(request.getParameter("id"));
		
		try {
			Usuario usuario = dao.consultarUsuario(id);
			
			Gson json = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
			
			 response.setContentType("application/json");
			 response.setCharacterEncoding("UTF-8");
			
			 response.getWriter().print(json.toJson(usuario, Usuario.class));
		
			
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
	}

}
