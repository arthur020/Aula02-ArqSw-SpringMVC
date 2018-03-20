package br.usjt.arqsw.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 
 *@author Arthur Santos
 *
 */
public class AutorizadorInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object controller) throws Exception {
		String uri = request.getRequestURI();
		if (uri.endsWith("Login") || uri.endsWith("verifica_usuario") || uri.contains("css") || uri.contains("js")
				|| uri.contains("img")) {
			return true;
		}
		if (request.getSession().getAttribute("usuarioLogado") != null) {
			System.out.println(request.getSession().getAttribute("usuarioLogado")); 
			return true;
		}
		response.sendRedirect("Login");
		return false;
	}
}
