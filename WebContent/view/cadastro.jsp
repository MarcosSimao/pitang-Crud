<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <style>
            .form-area{
                margin-top:100px;
            }  
            
        </style>
       
         <script type="text/javascript" src="script/jquery-1.7.2.min.js"></script>
        <script type="text/javascript" src="script/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="script/jquery.cycle.all.js"></script>
        <script type="text/javascript" src="script/jquery-3.4.1.min.js"></script>
        <script type="text/javascript" src="script/jquery-3.4.1.js"></script>
       <script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/estilo.css"/>
        <script>
            
            $(document).ready(function(){
                $("#telefone1").prop('disabled',false);
               $("#telefone").prop('disabled',false);
               $("#telefone1").removeAttr('disabled');
               $("#telefone").removeAttr('disabled');
               $("#telefone1").hide();
               $("#telefone").hide();
                
                 
              $('.formulario').validate({
                 rules:{
                     nome:{
                         required: true,
                         minlength: 5
                     },
                     email:{
                        required: true,
                        email:true
                         
                     },
                     senha:{
                         required:true,
                         rangelength:[4,10]
                     },
                     senha2:{
                         required:true,
                         equalTo:"#senha"
                     },
                     fixo:{
                         required:true,
                         minlength:8,maxlength:8
                     },
                      celular:{
                         required:true,
                         minlength:9,maxlength:9
                     },
                     ddd:{
                         required:true,
                         minlength:2,maxlength:2
                     }
                 },
                 messages:{
                     nome:{
                         required: "esse campo é obrigatorio",
                         minlength: "so aceitamos acima de 5 caractere"
                     },
                     email:{
                        required: "esse campo é obrigatorio",
                        email:"tem certeza que isso é um email? "
                         
                     },
                     senha:{
                         required:"esse campo é obrigatorio",
                         rangelength:"maior que 5 caractere para sua segurança"
                     },
                     senha2:{
                         required:"esse campo é obrigatorio",
                         equalTo:"a senha nao bate , ou vc tem probleminha ou seu teclado esta com defeito"
                     },
                     fixo:{
                         required:"esse campo é obrigatorio",
                         minlength:"aceita no minimo ate 8 numeros",maxlength:" so aceita no maximo ate 8 numeros"
                     },
                      celular:{
                         required:"esse campo é obrigatorio",
                         minlength:"aceita no minimo ate 9 numeros",maxlength:" so aceita no maximo ate 9 numeros"
                     },
                     ddd:{
                    	 required:"esse campo é obrigatorio",
                         minlength:"aceita no minimo ate 2 numeros",maxlength:" so aceita no maximo ate 2 numeros"
                     }
                 }
              }); 
              
       $('.movel1').click(function(){
$('#telefone').hide( function(){
 $('#telefone1').show();
 $('#telefone').attr('disabled','disabled');
 
  $('#telefone').prop('disabled',true);
 
});
});
      $('.fixo1').click(function(){
$('#telefone1').hide( function(){
 $('#telefone').show();
 $('#telefone1').attr('disabled','disabled');
 
 $('#telefone1').prop('disabled',true);
 
});
});
            });
     
            </script>
    </head>
    <body>
        <div class="form-area ">
            <svg class="agile" enable-background="new 0 0 295.3 134" version="1.1" viewBox="0 0 295.3 134" xml:space="preserve" xmlns="http://www.w3.org/2000/svg">
            <path fill="#ffffff" d="m199.4 90.3l-3.1 8.4h1.2l0.9-2.5h3.3l0.9 2.5h1.2l-3.1-8.4h-1.3zm-0.6 5l1.3-3.7 1.3 3.7h-2.6z"></path> <path fill="#ffffff" d="m209 93.4c-0.3-0.3-0.5-0.6-0.9-0.7-0.3-0.2-0.7-0.2-1.1-0.2-0.8 0-1.5 0.3-2 0.9s-0.8 1.4-0.8 2.4 0.3 1.8 0.8 2.4 1.2 0.9 2 0.9c0.4 0 0.8-0.1 1.1-0.2 0.3-0.2 0.6-0.4 0.8-0.7v0.8c0 0.6-0.1 1-0.4 1.2s-0.8 0.4-1.4 0.4c-0.5 0-0.9-0.1-1.2-0.2-0.3-0.2-0.4-0.4-0.4-0.7h-1c0 0.6 0.2 1 0.7 1.3s1.1 0.5 1.9 0.5c1 0 1.7-0.2 2.2-0.6s0.7-1.1 0.7-2.1v-6h-1v0.6zm-0.4 4.1c-0.3 0.4-0.8 0.6-1.4 0.6s-1-0.2-1.3-0.6-0.5-1-0.5-1.7c0-0.8 0.2-1.3 0.5-1.7s0.8-0.6 1.3-0.6c0.6 0 1.1 0.2 1.4 0.6s0.5 1 0.5 1.8c0 0.6-0.2 1.2-0.5 1.6z"></path> <rect fill="#ffffff" x="211.6" y="90.3" width="1" height="1.2"></rect> <rect fill="#ffffff" x="211.6" y="92.6" width="1" height="6.1"></rect> <rect fill="#ffffff" x="214.2" y="90.3" width="1.1" height="8.4"></rect> <path fill="#ffffff" d="m219.3 92.4c-0.9 0-1.5 0.3-2 0.9s-0.7 1.4-0.7 2.5c0 1 0.2 1.8 0.7 2.3 0.5 0.6 1.2 0.9 2 0.9 0.7 0 1.3-0.2 1.8-0.6s0.8-0.9 0.9-1.6h-1c-0.1 0.4-0.3 0.7-0.5 0.9-0.3 0.2-0.6 0.3-1 0.3-0.6 0-1-0.2-1.3-0.5-0.3-0.4-0.5-0.9-0.5-1.5h4.4v-0.2-0.3c0-1-0.2-1.8-0.7-2.3s-1.2-0.8-2.1-0.8zm-1.6 2.7c0-0.6 0.2-1 0.5-1.3s0.7-0.5 1.2-0.5 0.9 0.2 1.2 0.5 0.4 0.8 0.4 1.3h-3.3z"></path> <rect fill="#ffffff" x="226.7" y="90.3" width="1.1" height="8.4"></rect> <polygon fill="#ffffff" points="228.8 91.3 231.5 91.3 231.5 98.8 232.7 98.8 232.7 91.3 235.3 91.3 235.3 90.3 228.8 90.3"></polygon> <path fill="#ffffff" d="m143.3 53.5c-1.7 0-3.3 0.4-4.9 1.2s-3.1 2-4.6 3.5h-0.3l-1-4.1h-2.8v43.2h3.8v-15.6h0.3c1.5 1.6 3 2.7 4.6 3.5s3.2 1.1 4.9 1.1c3.6 0 6.4-1.5 8.5-4.4s3.2-6.9 3.2-12c0-5-1.1-9-3.2-12-2.1-2.9-5-4.4-8.5-4.4zm5.8 26.3c-1.4 2.3-3.5 3.5-6.1 3.5-1.7 0-3.2-0.5-4.8-1.4-1.5-0.9-3.1-2.5-4.7-4.6v-14.7c1.6-2.1 3.2-3.6 4.7-4.5s3.1-1.4 4.8-1.4c2.7 0 4.7 1.2 6.1 3.5s2.2 5.6 2.2 9.8-0.8 7.5-2.2 9.8z"></path> <rect fill="#ffffff" x="158.7" y="42" width="6.5" height="6.1"></rect> <rect fill="#ffffff" x="158.7" y="53.2"  width="6.5" height="32.5" ></rect> <path fill="#ffffff" d="m179.4 80.9c-0.9 0-1.6-0.3-1.9-0.9-0.4-0.6-0.5-1.9-0.5-3.8v-17.9h4.3v-5.1h-4.3v-8.7h-6.6v8.7h-3.5v5.1h3.5v17.6c0 4.1 0.5 6.8 1.5 8.2s3.4 2.1 6.1 2.1c0.6 0 1.1 0 1.7-0.1s1.1-0.2 1.7-0.4v-4.9h-0.3c-0.8 0.1-1.4 0.1-1.7 0.1z"></path> <path fill="#ffffff" d="m226.8 53.5c-1.8 0-3.6 0.5-5.4 1.4s-3.7 2.3-5.5 4.1v-5h-3.8v31.7h3.8v-23c1.7-1.9 3.3-3.4 5-4.4s3.3-1.5 4.9-1.5c2.2 0 3.7 0.6 4.6 1.8s1.3 3.3 1.3 6.5v20.7h3.8v-22c0-3.4-0.7-6-2.1-7.6-1.6-1.8-3.7-2.7-6.6-2.7z"></path> <path fill="#ffffff" d="m262.4 82.8c-1.8-1.4-4.4-2.2-7.8-2.4-1-0.1-2.2-0.1-3.8-0.2-5.2-0.3-7.8-1.1-7.8-2.5 0-0.6 0.3-1.2 0.9-1.6 0.6-0.5 1.5-0.9 2.6-1.2 0.8 0.3 1.7 0.5 2.5 0.7 0.8 0.1 1.6 0.2 2.3 0.2 3.2 0 5.9-1.1 7.9-3.2s3-4.9 3-8.3c0-1.2-0.2-2.3-0.5-3.4s-0.8-2.1-1.5-3.1c0.5-0.4 1.1-0.7 1.8-0.9 0.6-0.2 1.4-0.3 2.2-0.3h0.7v-3.6c-1.2 0-2.3 0.2-3.4 0.7-1 0.5-2 1.2-3 2.1-1.1-0.8-2.3-1.4-3.5-1.8s-2.6-0.6-4.1-0.6c-3.2 0-5.9 1.1-8.1 3.2s-3.2 4.8-3.2 7.9c0 1.7 0.3 3.3 1 4.6 0.6 1.4 1.6 2.7 2.9 3.8v0.4c-1.4 0.9-2.4 1.7-3 2.5s-0.9 1.7-0.9 2.6c0 1 0.3 1.8 0.9 2.5s1.4 1.2 2.5 1.5v0.6c-1.6 0.9-2.8 1.9-3.6 2.9s-1.1 2.2-1.1 3.5c0 2.5 1.2 4.4 3.5 5.8s5.5 2.1 9.6 2.1c4.5 0 7.9-0.8 10.3-2.3s3.6-3.7 3.6-6.6c-0.2-2.4-1.1-4.2-2.9-5.6zm-19.2-18.3c0-2.3 0.8-4.2 2.3-5.8s3.4-2.4 5.5-2.4c2.3 0 4.1 0.8 5.6 2.3s2.2 3.5 2.2 5.9-0.7 4.4-2.2 6-3.3 2.4-5.6 2.4c-2.2 0-4-0.8-5.5-2.4-1.6-1.7-2.3-3.7-2.3-6zm15.7 28.5c-1.8 1-4.3 1.5-7.5 1.5-3.1 0-5.5-0.5-7.2-1.4s-2.6-2.2-2.6-3.9c0-1.1 0.4-2.2 1.3-3.2s2.3-1.9 4-2.6c5.5 0 9.3 0.4 11.4 1.2s3.2 2.1 3.2 4.1c0.1 1.8-0.8 3.2-2.6 4.3z"></path> <path fill="#ffffff" d="m86.7 32.7c-3 0-5.8 0.8-8.4 2.3-0.3 0-0.4 0.1-0.6 0.2-1.2 0.5-2.5 0.8-3.9 0.8-1.9 0-3.4-0.5-3.7-0.6-2.7-1.4-5.6-2.1-8.7-2.1-10.4 0-20.5 7.8-26.5 20.4-8 16.9-5.5 36.2 5.7 43.1 2.7 1.7 5.7 2.5 8.9 2.5 4.2 0 8.6-1.5 12.8-4.3 1.6-1.1 5.9-3.6 11-3.6 2.3 0 4.5 0.5 6.6 1.5 5.1 4.2 13.2 6.5 18.5 6.5 3.2 0 6.1-0.8 8.8-2.5 5.5-3.4 9.1-9.9 10.2-18.2 1-8.1-0.6-17.1-4.5-25.2-5.9-12.7-16.2-20.8-26.2-20.8zm-26.2 59.4c-3.6 2.4-7.4 3.7-10.9 3.7-2.6 0-5-0.7-7.2-2-9.8-6-11.8-23.4-4.4-38.8 5.4-11.3 14.6-18.5 23.5-18.5 2.5 0 4.9 0.6 7.1 1.7 0.5 0.2 1.4 0.6 2.6 0.8v0.1c-0.5 0.2-13.6 1.7-17.4 17.7-3.1 13.2 5.7 24.9 15.3 31.6-4.1 0.9-7.2 2.8-8.6 3.7zm38-14.4c-2 7.5-8.8 13.4-13.4 13.4-0.8 0-1.4-0.2-2-0.5 1.5-3.4 3.3-11.9-9.7-22.8-12.1-10-2.7-27.9-2.2-28.7l0.1 0.8c0.9 8.2 3.3 11.7 18.8 20.6 7.2 4.1 10.2 10.3 8.4 17.2z"></path> <path fill="#ffffff" d="m204.7 81.6c0 0.6 0.1 1.2 0.2 1.8s0.2 1.4 0.4 2.3h3.7c-0.2-1-0.3-1.8-0.4-2.5s-0.2-1.3-0.2-1.7v-19.6c0-2.4-1-4.4-2.9-6s-4.3-2.4-7.3-2.4c-2.6 0-4.8 0.5-6.6 1.6-1.8 1-3.3 2.7-4.6 5l2.9 1.7c0.9-1.7 2.1-3 3.3-3.8 1.3-0.8 2.8-1.3 4.5-1.3 2.1 0 3.8 0.5 5.1 1.4 1.2 0.9 1.9 2.2 1.9 3.8v3.1c-7.1 1.3-12.1 2.9-15 4.9s-4.3 4.7-4.3 8.1c0 2.5 0.8 4.5 2.4 6.1s3.6 2.4 6.2 2.4c1.9 0 3.7-0.4 5.5-1.2 1.7-0.9 3.4-2.1 5.2-3.7zm-10.2 1.7c-1.6 0-2.9-0.5-3.8-1.5s-1.4-2.4-1.4-4.1c0-2.4 1-4.2 3.1-5.6s6.2-2.8 12.4-4.1v9.8c-1.9 1.9-3.7 3.4-5.3 4.3-1.8 0.8-3.4 1.2-5 1.2z">
                
            </path> </svg>
            <h2>criar uma conta</h2>  
            <form class="formulario"  action="../cadastroServlet" method="POST">
                <P>nome*</p>
                <input type="text" name="nome" placeholder="nome"/>
                <P>Email*</p>
                <input type="text" name="email" placeholder="Email"/>
                 <P>Senha*</p>
                <input type="password" id="senha" name="senha" placeholder="Password"/>
                <P>repita a senha*</p>
                
                <input type="password" name="senha2" placeholder="Password"/>
                <P>DDD*</p>
                <input type="number" name="ddd"placeholder="(00)"/>
                <P>telefone*</p>
                <input  type="tel"  name="fixo" placeholder="0000-0000"/>
                <P>celular*</p>
                 <input  type="tel"   name="celular"  placeholder="00000-0000"/>
                
                
                 <button class="entrar" type='submit' >entrar</button>
                </form>
           
            <a href="login.jsp"><button class="cadastro">voltar</button></a>
           
                
                
                
            
        </div>
    </body>
</html>