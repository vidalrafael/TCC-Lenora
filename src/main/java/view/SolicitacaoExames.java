package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/solicitacao-exame")
public class SolicitacaoExames extends HttpServlet{

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
      out.println("<h4>Solicitação de exames</h4>");
      out.println("</div>");
      out.println("</div>");
      out.println("<form>");
      out.println("<div class='form-group row'>");
      out.println("<label class='col-form-label p-0'>Paciente:</label>");
      out.println("<div class='p-left'>");
      out.println("<input type='tel' class='form-control' placeholder='Id do paciente'>");
      out.println("</div>");
      out.println("</div>");

      //criar condição aqui para só mostrar caso não encontre o paciente
      out.println("<div class='espacoEdit'>");
      out.println("<hr class='linha2'>");
      out.println("<div class='row center w-100'>");
      out.println("<h5>Paciente não encontrado - Novo cadastro</h5>");      
      out.println("</div>");
      out.println("<div class='form-group row'>");
      out.println("<label class='col-form-label p-0'>Nome do paciente</label>");
      out.println("<div class='w-100 mt-1'>");
      out.println("<input type='text' class='form-control'>");          
      out.println("</div>");
      out.println("</div>");
      out.println("<div class='form-group row espacoEdit'>");
      out.println("<div class='col pl-0'>");
      out.println("<label class='col-form-label p-0'>Documento</label>");
      out.println("<div class='w-100 mt-1'>");
      out.println("<input type='text' class='form-control'>");          
      out.println("</div>");
      out.println("</div>");
      out.println("<div class='col p-0  espacoEditMobile'>");
      out.println("<label class='col-form-label p-0'>CPF</label>");
      out.println("<div class='w-100 mt-1'>");
      out.println("<input type='tel' class='form-control'>");          
      out.println("</div>");
      out.println("</div>");          
      out.println("</div>");
      out.println("<div class='form-group row espacoEditMobile'>");
      out.println("<label class='col-form-label p-0'>Nome Da mãe</label>");
      out.println("<div class='w-100 mt-1'>");
      out.println("<input type='text' class='form-control'>");          
      out.println("</div>");
      out.println("</div>");
      out.println("<div class='form-group row espacoEdit'>");
      out.println("<div class='col pl-0'>");
      out.println("<label class='col-form-label p-0'>Data de nascimento</label>");
      out.println("<div class='w-100 mt-1'>");
      out.println("<input type='tel' class='form-control'>");          
      out.println("</div>");
      out.println("</div>");
      out.println("<div class='col p-0 espacoEditMobile'>");
      out.println("<label class='col-form-label p-0'>Sexo</label>");
      out.println("<div class='w-100 mt-1'>");
      out.println("<select class='form-control'>");                
      out.println("<option>Masculino</option>");
      out.println("<option>Feminino</option>");
      out.println("<option>Outros</option>");
      out.println("</select>");                        
      out.println("</div>");
      out.println("</div>");          
      out.println("</div>");
      out.println("<div class='form-group row espacoEdit'>");
      out.println("<div class='col pl-0'>");
      out.println("<label class='col-form-label p-0'>Cor</label>");
      out.println("<div class='w-100 mt-1'>");
      out.println("<select class='form-control'");                
      out.println("<option>Branco</option>");
      out.println("<option>Preto</option>");
      out.println("<option>Pardo</option>");
      out.println("</select>");                        
      out.println("</div>");
      out.println("</div>"); 
      out.println("<div class='col p-0 espacoEditMobile'>");
      out.println("<label class='col-form-label p-0'>Nacionalidade</label>");
      out.println("<div class='w-100 mt-1'>");
      out.println("<input type='text' class='form-control'>");          
      out.println("</div>");
      out.println("</div>");                   
      out.println("</div>");
      out.println("</div>");

      out.println("<hr class='linha2'>");
      out.println("<div class='form-group row espacoEdit'>");
      out.println("<label class='col-form-label p-0'>Solicitante:</label>");
      out.println("<div class='p-left'>");
      out.println("<input type='tel' class='form-control' placeholder='Id do médico'>");
      out.println("</div>");
      out.println("</div>");

      //criar condição para só mostrar caso não encontre o médico
      out.println("<div class='espacoEdit'>");
      out.println("<hr class='linha2'>");
      out.println("<div class='row center w-100'>");
      out.println("<h5>Médico não encontrado - Novo cadastro</h5>");
      out.println("</div>");
      out.println("<div class='form-group row'>");
      out.println("<label class='col-form-label p-0'>Nome Completo</label>");
      out.println("<div class='w-100 mt-1'>");
      out.println("<input type='text' class='form-control'>");          
      out.println("</div>");
      out.println("</div>");
      out.println("<div class='form-group row espacoEdit'>");
      out.println("<label class='col-form-label p-0'>CRM</label>");
      out.println("<div class='w-100 mt-1'>");
      out.println("<input type='tel' class='form-control'>");          
      out.println("</div>");
      out.println("</div>");
      out.println("</div>");

      out.println("<hr class='linha2'>");
      out.println("<div class='form-group row espacoEdit'>");
      out.println("<label class='col-form-label p-0'>Exame:</label>");
      out.println("<div class='p-left'>");
      out.println("<select class='form-control'> ");
      out.println("<option>Dengue</option>");
      out.println("<option>Zica</option>");
      out.println("<option>Chikungunya</option>");
      out.println("</select>");
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
