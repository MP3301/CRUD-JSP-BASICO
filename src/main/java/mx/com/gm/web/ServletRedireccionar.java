package mx.com.gm.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.domain.Alumno;
import mx.com.gm.servicio.ServicioAlumno;

@WebServlet("/ServletRedireccionar")
public class ServletRedireccionar extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response) {

      try {
         request.getRequestDispatcher("/WEB-INF/agregarAlumno.jsp").forward(request, response);
      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }

}
