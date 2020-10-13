package Command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.json.JSONParser;

import com.google.gson.Gson;

import Base.BaseCommand;
import DAO.UsuarioDAO;
import Models.Telefone;
import Models.Usuario;

public class cadastroUsuarioCommand implements BaseCommand{

	private UsuarioDAO dao;
	
	public cadastroUsuarioCommand(UsuarioDAO dao) {
		this.dao = dao;
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		int ddd = Integer.parseInt(request.getParameter("ddd"));
		int numero =  Integer.parseInt(request.getParameter("numero"));
		String tipo =  request.getParameter("tipo");
		
		int ddd2 = Integer.parseInt(request.getParameter("ddd2"));
		int numero2 =  Integer.parseInt(request.getParameter("numero2"));
		String tipo2 =  request.getParameter("tip2o");
		
		Telefone telefone = new Telefone();
		telefone.setDdd(ddd);
		telefone.setNumero(numero);
		telefone.setTipo(tipo);
		
		Telefone telefone2 = new Telefone();
		telefone2.setDdd(ddd2);
		telefone2.setNumero(numero2);
		telefone2.setTipo(tipo2);
		
		List<Telefone> list =  new ArrayList<Telefone>();
		list.add(telefone);
		list.add(telefone2);
		
		System.out.println(request.getParameterMap().toString());
		
		
		Usuario usuario = new Usuario(nome, email, senha, list);
		
		Usuario resUsuario  = dao.salvarUsuario(usuario);
		String usuarioJson = new Gson().toJson(resUsuario);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		try {
			response.getWriter().write(usuarioJson);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
