package command;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.json.JSONParser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import base.BaseCommand;
import bind.TelefoneBind;
import bind.UsuarioBind;
import dao.UsuarioDAO;
import models.Telefone;
import models.Usuario;

public class CadastroUsuarioCommand implements BaseCommand {

	private UsuarioDAO dao;

	public CadastroUsuarioCommand(UsuarioDAO dao) {
		this.dao = dao;
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		try {
			Usuario usuario = UsuarioBind.UsuaioBind(request);
			Usuario resUsuario = dao.salvarUsuario(usuario);
			
			Gson json = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
			
			 response.setContentType("application/json");
			 response.setCharacterEncoding("UTF-8");
			
			 response.getWriter().print(json.toJson(resUsuario, Usuario.class));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
