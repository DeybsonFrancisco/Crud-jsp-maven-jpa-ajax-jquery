package DAO;

import java.util.ArrayList;
import java.util.List;

import Models.Usuario;
import Models.Telefone;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UsuarioDAO ud = new UsuarioDAO();
		
		Telefone t = new Telefone();
		t.setDdd(81);
		t.setNumero(999999999);
		t.setTipo("celular1");

		
	
		Telefone t4 = new Telefone();
		t4.setDdd(81);
		t4.setNumero(999999999);
		t4.setTipo("celular4");
		
		Telefone t3 = new Telefone();
		t3.setDdd(81);
		t3.setNumero(999999999);
		t3.setTipo("celular3");
		
		Telefone t2 = new Telefone();
		t2.setDdd(81);
		t2.setNumero(999999999);
		t2.setTipo("celular2");
		
		List<Telefone> list1 = new ArrayList<Telefone>();
		list1.add(t);
		list1.add(t4);
	
		
	
		List<Telefone> list2 = new ArrayList<Telefone>();
		list2.add(t2);
		
		List<Telefone> list3 = new ArrayList<Telefone>();
		list3.add(t3);
		
		Usuario usuario = new Usuario("Deybson","deybso@mail.com", "1234", list1);
		Usuario usuario2 = new Usuario("carlosjhgjhg", "carlos@gmail.com", "12345", list2);
		Usuario usuario3 = new Usuario("ana", "ana@gmail.com", "123", list3);

		ud.salvarUsuario(usuario);
		ud.salvarUsuario(usuario2);
		ud.salvarUsuario(usuario3);
//		
//		Usuario consulta = ud.consultarUsuario(usuario2.getId());
//		System.out.println("Usuario-----------");
//		System.out.println("id:"+ consulta.getId());
//		System.out.println("nome:"+ consulta.getNome());
//		System.out.println("Email:"+ consulta.getEmail());
//		for(Telefone tu : consulta.getTelefone()) {
//			System.out.println("Telefone----------");
//			System.out.println("id telefone:" + tu.getId());
//			System.out.println("tipo:" + tu.getTipo());
//			System.out.println("DDD:" + tu.getDdd());
//			System.out.println("numero:" + tu.getNumero());
//		}
	
//		List<Usuario> list= ud.listarUsuarios();
////		
//		for(Usuario usuarioConsulta :list ) {
//
//			System.out.println("Usuario-----------");
//			System.out.println("id:"+ usuarioConsulta.getId());
//			System.out.println("nome:"+ usuarioConsulta.getNome());
//			System.out.println("Email:"+ usuarioConsulta.getEmail());
//			for(Telefone tu : usuarioConsulta.getTelefone()) {
//				System.out.println("Telefone----------");
//				System.out.println("id telefone:" + tu.getId());
//				System.out.println("tipo:" + tu.getTipo());
//				System.out.println("DDD:" + tu.getDdd());
//				System.out.println("numero:" + tu.getNumero());
//			}
//		}	
//		
	}

}
