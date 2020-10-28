package controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import base.BaseCommand;
import command.AlterarUsuarioCommand;
import command.BuscarUsuarioCommand;
import command.CadastroUsuarioCommand;
import command.ListarUsuarioCommand;
import command.RemoverUsuarioCommand;
import dao.UsuarioDAO;


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
    	acoes.put("cadastrar", new CadastroUsuarioCommand(new UsuarioDAO()));
    	acoes.put("buscar", new BuscarUsuarioCommand(new UsuarioDAO()));
    	acoes.put("listar", new ListarUsuarioCommand(new UsuarioDAO()));
    	acoes.put("alterar", new AlterarUsuarioCommand(new UsuarioDAO()));
    	acoes.put("remover", new RemoverUsuarioCommand(new UsuarioDAO()));
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
