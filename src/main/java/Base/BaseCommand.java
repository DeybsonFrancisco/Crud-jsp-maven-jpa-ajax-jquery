package Base;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.Usuario;

public interface BaseCommand {

	public void execute(HttpServletRequest request, HttpServletResponse response);
}
