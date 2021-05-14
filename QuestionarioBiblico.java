
package questionario.biblico;

import java.util.Scanner;
 


public  class QuestionarioBiblico {
   static String nome;
    static int pontos;
    static int vidas=3;
    public  static void main (String[]args) {
   
        String tecla; 
        
        
        System.out.println("A Paz do Senhor");
        System.out.println("Seja Bem Vindo ao");
        System.out.println("Questionario Biblico");
        System.out.println("Aperte a Tecla Enter para Começar");
        Scanner clik=  new Scanner (System.in);
        tecla=clik.nextLine();
        
        System.out.println("Vamos Começar ;D ");
         System.out.println("Primeiro Me Diga !");
         System.out.println("Qual o Seu Nome ?");
        Scanner cl= new Scanner (System.in);     
        nome=cl.nextLine();
        
        System.out.println(nome + " O Questionario foi dividido em 5(cinco) fases");
          
                System.out.println("você tem 3 Vidas para finalizar o questionario");
                
                
               
        
        
        System.out.println("Se Prepare Vamos Começar !!");
        Scanner tt= new Scanner(System.in);
        Quest1();
        
    }
    
    
    
    
    
    public static void Quest1(){
     String tic;
     int tv;   
        
        System.out.println(" Vamos iniciar a Primeira fase !!  ");
     System.out.println("Aperte Enter  Para Começar");
     Scanner tt =new Scanner (System.in);
     tic=tt.nextLine();
     
     System.out.println("Muito bem "+nome+" Responda a Primeira Questão !! ");
      
     System.out.println("Quantos livros tem a Bíblia no Velho Testamento e no Novo Testamento?");
     System.out.println("[1]-69 Livros sendo 38 no Velho Testamento e 31 no Novo Testamento.");
    System.out.println("[2]-66 Livros sendo 38 no Velho Testamento e 28 no Novo Testamento.");
    System.out.println("[3]-66 Livros sendo 39 no Velho Testamento e 27 no Novo Testamento.");
    Scanner th = new Scanner(System.in);
    tv=th.nextInt();
    
    
    switch (tv){
        
        case 1 : 
            int y;
            
            
           System.out.println("Não Foi dessa vez ");
           System.out.println("calma "+nome+" A Resposta certa Era");
           System.out.println("66 Livros sendo 39 no Velho Testamento e 27 no Novo Testamento");
          vidas=(-1);
           
         Quest2();
            break;
        
        case 2 :
            
            
         System.out.println("Não Foi dessa vez ");
           System.out.println("calma "+nome+" A Resposta certa Era");
           System.out.println("66 Livros sendo 39 no Velho Testamento e 27 no Novo Testamento");
           vidas=-1;
           Quest2();
          
            
            break;
            
            
        case 3 :
            
          
            
         
                
                System.out.println("Parabéns Acertou de Primeira Ganhou 10 PONTOS ");
           System.out.println(nome+" Aperte os Cintos Vamos para a proxima pergunta ");
          pontos=+10;
           
           
           Quest2();
           
           break;
        
        
        
    } 
    
    }
    
    
    public static void Quest2 (){
    
        System.out.println(nome+" Seus Pontos até o Momento ="+pontos);
        System.out.println(vidas+" Suas Vidas até o Momento");
        pontos=+10;
        
        
        System.out.println(pontos);
    }
    
   
    
    public static void Quest3 (){
    
}
    
    
    
    }
