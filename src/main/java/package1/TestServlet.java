package package1;

import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
    
    @PersistenceContext
    EntityManager em;
    
    @Override
    public void init() {
        
    }
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
                               throws ServletException, IOException {
        response.getWriter().write("test");
        response.getWriter().write(em.toString());
    }
    
}
