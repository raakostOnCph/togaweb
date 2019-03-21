import persistens.Kunde;
import persistens.KundeMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HentKunder", urlPatterns = {"/HentKunder"})
public class HentKunder extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().println("vi fandt min servlet");

        List<Kunde> kundeList = KundeMapper.lavKundeListe();

        for (int i = 0; i < kundeList.size(); i++) {

            response.getWriter().println(kundeList.get(i).getNavn());
            response.getWriter().println(kundeList.get(i).getKundeId());
        }


        request.setAttribute("listen",kundeList);

        request.getRequestDispatcher("resultat.jsp").forward(request,response);


    }
}
