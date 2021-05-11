package day5;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean countExsists = false;	//Coolieにcountが存在するか？
		int count = 1;					//現在のカウント
		Cookie cookie = null;
		Cookie[] cookies = request.getCookies();	//送信されているCookieを取得(Cookieが送信されていなかったらnull)

		//Cookieが送信されていた場合
		if(cookies != null) {
			for(Cookie c: cookies) {
				//countというcookieがあるか
				if(c.getName().equals("count")) {
					count = Integer.parseInt(c.getValue()) + 1;
					//新しくcountをキーにしてCookieを生成する
					cookie = new Cookie("count", String.valueOf(count));
					//cookieの有効期限を秒で設定（90日)
					cookie.setMaxAge(60 * 60 * 24 * 90);
					//レスポンスヘッダーにcookieをつめる
					response.addCookie(cookie);
					//countが存在したのでtrue
					countExsists = true;
					break;
				}
			}
		}
		//countというクッキーが送信されていなかった場合
		if (!countExsists) {
			//新しくcookieを生成
			cookie = new Cookie("count", "1");
			cookie.setMaxAge(60 * 60 * 24 * 90);
			response.addCookie(cookie);
		}
		//現在のカウントをviewで使えるようにリクエストスコープに詰める
		request.setAttribute("count", String.valueOf(count));
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/day5/view/index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
