

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Bean4party;

/**
 * Servlet implementation class Vote1
 */
@WebServlet("/Vote1")
public class Vote1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Vote1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "password");
			Statement st1 = con1.createStatement();
			String qry1 = "select * from details";
			ResultSet rs = st1.executeQuery(qry1);
			ArrayList<String> al = new ArrayList<>();
			while (rs.next()) {
				String Party = rs.getString("party");
				
				/*Bean4party b = new Bean4party();
				b.setParty(Party);*/
				
				al.add(Party);
			}
		    RequestDispatcher rd = request.getRequestDispatcher("party.jsp");
		    		request.setAttribute("list", al);
		    		rd.forward(request, response);
		}
		catch (Exception e) {
			e.printStackTrace();
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
