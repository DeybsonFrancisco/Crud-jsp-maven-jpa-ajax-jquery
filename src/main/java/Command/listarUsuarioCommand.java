package command;

import java.lang.reflect.Type;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import base.BaseCommand;
import dao.UsuarioDAO;
import models.Usuario;

public class ListarUsuarioCommand implements BaseCommand {
	
	private UsuarioDAO dao;
	
	public ListarUsuarioCommand(UsuarioDAO dao) {
		this.dao = dao;
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			List<Usuario> usuarioList = dao.listarUsuarios();
			
			Gson json = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create(); 
			
			
			Type type = new TypeToken<List<Usuario>>() {}.getType();
			
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			
			response.getWriter().print(json.toJson(usuarioList, type));
			response.getWriter().flush();
			
//			
//			
//			response.getWriter().format("application/json", type);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
