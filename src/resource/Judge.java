package resource;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Judge
 */
@WebServlet("/Judge")
public class Judge extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Judge() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		int yourhand=Integer.parseInt(request.getParameter("hand"));
		int cpuhand=(int)(Math.random()*3);
		int standing;//勝敗表

		Hand h=new Hand();
		h.setYourhandstr(yourhand);
		h.setCpuhandstr(cpuhand);
		h.setStanding(yourhand, cpuhand);//3×3の2次元配列で勝敗表を作ってます。
		standing=h.getStanding();
		h.setResult(standing);//勝敗表から結果をセット


		request.setAttribute("result",h);
		RequestDispatcher rd=request.getRequestDispatcher("/play.jsp");
		rd.forward(request, response);
	}

}
