package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dashboard")
public class Dashboard extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {    
    String usuario = request.getParameter("usuario");
    // String senha = request.getParameter("senha");

    response.setContentType("text/html;charset=UTF-8");

    try (PrintWriter out = response.getWriter()) {
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<meta charset='utf-8'>");
      out.println("<meta name='viewport' content='width=device-width,initial-scale=1.0'>");      
      out.println("<title>TCC - Lenora</title>");           
      out.println("<link rel='icon' href='" + request.getContextPath() +  "/ico.png'/>");      
      out.println("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css' integrity='sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO' crossorigin='anonymous'> ");      
      out.println("<link rel='stylesheet' type='text/css' href='" + request.getContextPath() +  "/style.css'/>");           
      out.println("<link rel='stylesheet' type='text/css' href='" + request.getContextPath() +  "/styleMobile.css'/>");
      out.println("</head>");
      out.println("<body class='app'>");
      out.println("<div class='center full-page'>");
      out.println("<div class='box-white'>");
      out.println("<header>");
      out.println("<div class='row page-center'>");
      out.println("<img src='" + request.getContextPath() + "/img/logo-hospital.png' alt='logo-hospital' class='logoHospital mt-4 mb-3'>");
      out.println("</div>");
      out.println("<div class='row center'>");
      out.println("<h2 class='acesso'>" + usuario + " - Nível de acesso</h2>");
      out.println("</div>");
      out.println("<hr class='center linha'>");
      out.println("</header>");
      out.println("<section>");
      out.println("<div class='row center'>");

      //card solicitação de exame
      out.println("<div class='card m-card' style='width: 18rem;'>");
      out.println("<div class='center'>");
      out.println("<img class='card-img-top img-card' src='" + request.getContextPath() + "/img/add.png' alt='img add'>");
      out.println("</div> ");
      out.println("<div class='card-body'>");
      out.println("<h5 class='card-title'>Solicitação de Exame</h5>");
      out.println("<p class='card-text'>Cadastrar um novo exame</p>");
      out.println("<div class='center'>");
      out.println("<form action='solicitacao-exame' method='POST'>");
      out.println("<button class='btn btn-primary'>Acessar</button>");
      out.println("</form>");
      out.println("</div>");
      out.println("</div>");
      out.println("</div>");

      //card Consultar exame      
      out.println("<div class='card m-card' style='width: 18rem;'>");
      out.println("<div class='center'>");
      out.println("<img class='card-img-top img-card' src='" + request.getContextPath() + "/img/relatorio.png' alt='img relatorio'>");
      out.println("</div> ");
      out.println("<div class='card-body'>");
      out.println("<h5 class='card-title'>Consultar Exame</h5>");
      out.println("<p class='card-text'>Consultar o resultado de um exame</p>");
      out.println("<div class='center'>");
      out.println("<form action='consulta-exame' method='POST'>");
      out.println("<button class='btn btn-primary'>Acessar</button>");
      out.println("</form>");
      out.println("</div>");
      out.println("</div>");
      out.println("</div>");

      //card Resultado exame      
      out.println("<div class='card m-card' style='width: 18rem;'>");
      out.println("<div class='center'>");
      out.println("<img class='card-img-top img-card' src='" + request.getContextPath() + "/img/resultado.png' alt='img relatorio'>");
      out.println("</div> ");
      out.println("<div class='card-body'>");
      out.println("<h5 class='card-title'>Resultado Exame</h5>");
      out.println("<p class='card-text'>Cadastrar o resultado para um exame</p>");
      out.println("<div class='center'>");
      out.println("<form action='resultado-exame' method='POST'>");
      out.println("<button class='btn btn-primary'>Acessar</button>");
      out.println("</form>");
      out.println("</div>");
      out.println("</div>");
      out.println("</div>");
        
      out.println("</div>");
      out.println("</section>");
      out.println("</div>");
      out.println("</div>");
      out.println("<script src='scripts.js'></script>");
      out.println("<script src='https://code.jquery.com/jquery-3.3.1.slim.min.js' integrity='sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo' crossorigin='anonymous'></script>");
      out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js' integrity='sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49' crossorigin='anonymous'></script>");
      out.println("<script src='https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js' integrity='sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy' crossorigin='anonymous'></script>");
      out.println("</body>");
      out.println("</html>");    
    
    } 
  }
}
