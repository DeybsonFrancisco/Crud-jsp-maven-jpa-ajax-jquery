package bind;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import models.Telefone;
import models.Usuario;

public class UsuarioBind {
	
	public static Usuario UsuaioBind(HttpServletRequest request) {
		 Usuario usuario = new Usuario();
		 usuario.setNome(request.getParameter("nome"));
		 usuario.setEmail(request.getParameter("email"));
		 usuario.setSenha(request.getParameter("senha"));
		 
		 Telefone telefone = TelefoneBind.telefoneBind(request);
		 List<Telefone> list = new ArrayList<Telefone>();
		 list.add(telefone);
		 
		 usuario.setTelefone(list);
		 
		 
		 return usuario;
	}

}
