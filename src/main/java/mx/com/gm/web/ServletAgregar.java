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
import mx.com.gm.domain.Contacto;
import mx.com.gm.domain.Domicilio;

import mx.com.gm.servicio.ServicioAlumno;

@WebServlet("/ServletAgregar")
public class ServletAgregar extends HttpServlet {

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) {

      try {
         String nombre = request.getParameter("nombre");
         String apellido = request.getParameter("apellido");
         String calle = request.getParameter("calle");
         String noCalle = request.getParameter("noCalle");
         String pais = request.getParameter("pais");
         String email = request.getParameter("email");
         String telefono = request.getParameter("telefono");
         
         Domicilio domicilio = new Domicilio();
         domicilio.setCalle(calle);
         domicilio.setNoCalle(noCalle);
         domicilio.setPais(pais);
         
         Contacto contacto = new Contacto();
         contacto.setEmail(email);
         contacto.setTelefono(telefono);
         
         //se deja de ultimo la clase que tiene las relaciones pk
         
         Alumno alumno = new Alumno();
         
         alumno.setNombre(nombre);
         alumno.setApellido(apellido);
         alumno.setContacto(contacto);
         alumno.setDomicilio(domicilio);
         
         
         ServicioAlumno servicioAlumno = new ServicioAlumno();
         
         servicioAlumno.guardarAlumno(alumno);
         
         request.getRequestDispatcher("/index.jsp").forward(request, response);
      } catch (ServletException ex) {
         
      } catch (IOException ex) {
        
      }

   }

}
