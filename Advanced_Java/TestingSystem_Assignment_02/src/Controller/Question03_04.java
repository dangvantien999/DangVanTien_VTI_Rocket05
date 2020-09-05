package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Question03_04
 */
@WebServlet("/Question03_04")
public class Question03_04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Question03_04() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * // TODO Auto-generated method stub
		 * response.getWriter().append("Served at: ").append(request.getContextPath());
		 */
		
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		if ("duynn1".equals(user) && "123456".equals(pass)) {

			
			  RequestDispatcher repuestdispatcher = request.getRequestDispatcher("/home.jsp");
			  repuestdispatcher.forward(request, response);
			 
		}else {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			out.print("Nhap Sai");
			
			  RequestDispatcher repuestdispatcher = request.getRequestDispatcher("/Question03_04.jsp");
			  repuestdispatcher.include(request, response);
			 
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
