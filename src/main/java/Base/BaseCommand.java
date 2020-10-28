package base;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Usuario;

public interface BaseCommand {

	public void execute(HttpServletRequest request, HttpServletResponse response);
}
