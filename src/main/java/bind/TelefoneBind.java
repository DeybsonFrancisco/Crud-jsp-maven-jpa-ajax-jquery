package bind;

import javax.servlet.http.HttpServletRequest;

import models.Telefone;

public class TelefoneBind {
	
	protected static Telefone telefoneBind(HttpServletRequest request) {
		Telefone telefone = new Telefone();
		telefone.setDdd(Integer.parseInt(request.getParameter("ddd")));
		telefone.setNumero(Integer.parseInt(request.getParameter("numero")));
		telefone.setTipo(request.getParameter("tipo"));
		
		return telefone;
	}
}
