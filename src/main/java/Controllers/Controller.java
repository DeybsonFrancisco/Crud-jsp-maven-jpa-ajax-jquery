package Controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Base.BaseCommand;
import Command.alterarUsuarioCommand;
import Command.buscarUsuarioCommand;
import Command.cadastroUsuarioCommand;
import Command.listarUsuarioCommand;
import Command.removerUsuarioCommand;
import DAO.UsuarioDAO;
import Models.Usuario;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected Map<String, BaseCommand> getAcoes(){
    	Map<String, BaseCommand> acoes = new HashMap<String, BaseCommand>();
    	acoes.put("cadastrar", new cadastroUsuarioCommand(new UsuarioDAO()));
    	acoes.put("consultar", new buscarUsuarioCommand(new UsuarioDAO()));
    	acoes.put("listar", new listarUsuarioCommand(new UsuarioDAO()));
    	acoes.put("alterar", new alterarUsuarioCommand(new UsuarioDAO()));
    	acoes.put("remover", new removerUsuarioCommand(new UsuarioDAO()));
    	return acoes;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acaoSTR = (String) request.getParameter("cmd");
		BaseCommand acao = getAcoes().get(acaoSTR);
		acao.execute(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
