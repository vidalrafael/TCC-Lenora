package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/resultado-exame")
public class ResultadoExame extends HttpServlet{
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String usuario = request.getParameter("usuario");

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
      out.println("<div class='row title-h4'>");
      out.println("<div class='col p-0 centerMobile'>");
      out.println("<h4>Cadastro de resultado de exame</h4>");
      out.println("</div>");
      out.println("</div>");
      out.println("<form>");
      out.println("<div class='form-group row espacoEdit'>");
      out.println("<label class='col-form-label p-0'>Exame:</label>");
      out.println("<div class='p-left'>");
      out.println("<input type='tel' class='form-control' placeholder='Id do exame'>");
      out.println("</div>");
      out.println("</div>");

      //criar condição para mostrar somente se não encontrar o id
      out.println("<div v-if='exibirNaoEncontrado' class='espacoEdit errorForm'>");
      out.println("<span>Exame não encontrado, verifique o ID digitado.</span>");
      out.println("</div>");

      out.println("<div class='center mt-3'>");
      out.println("<button type='submit' class='btn btn-primary mb-2'>Consultar exame</button>");
      out.println("</div>");
      out.println("</form>");

      //criar condição para exibir somente se encontrar o id do exame
      out.println("<div class='espacoEdit'>");
      out.println("<hr class='linha2'>");
      out.println("<div class='form-group row'>");
      out.println("<label class='p-0'>Nome do paciente:</label>");
      out.println("<label class='pl-2'>{{paciente.nomePaciente}}</label>");        
      out.println("</div>");
      out.println("<div class='form-group row espacoEdit'>");
      out.println("<div class='col pl-0'>");
      out.println("<label class='p-0'>Médico solicitante:</label>");
      out.println("<label class='pl-2'>{{medico.nomeMedico}}</label>");  
      out.println("</div>");              
      out.println("</div>");  
      out.println("<hr class='linha2'>");
      out.println("<div class='row center'>");
      out.println("<h4>Resultado do exame</h4>");
      out.println("</div>");
      out.println("<div class='form-group row espacoEdit'>");
      out.println("<div class='col pl-0'>");
      out.println("<label class='p-0'>Tipo de exame:</label>");
      out.println("<label class='pl-2'>{{exame.descricaoExame}}</label>");  
      out.println("</div>");              
      out.println("</div>");
      out.println("<div class='form-group row espacoEdit'>");
      out.println("<div class='col pl-0'>");
      out.println("<label class='col-form-label p-0'>Parecer sobre o resultado do exame:</label>");
      out.println("<div class='form-group espacoEdit'>");          
      out.println("<textarea class='form-control' rows='3'</textarea>");
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
