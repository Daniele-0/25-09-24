// Esta importando o componente JFrame  do módulo swing da biblioteca javax
import javax.swing.JFrame;

// Declaração da classe TextFieldTest
public class TextFieldTest

// Inicio do bloco de codigos TextFieldTest
{

   // Declaração do método main, método executor
   public static void main(String[] args)

   // Inicio do bloco de códigos do método
   { 

      // Declaração da variavel TextFielFrame, declaração a novo objeto, e trazendo o construtor da classe TextFieldFrame.
            TextFieldFrame textFieldFrame = new TextFieldFrame(); 

            // Declaração de fechamento padrão, buscar a variavel que esta dentro do JFrame e a variavel Exit on close
      textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Definir Tamanho 
      textFieldFrame.setSize(350, 100); 

      // Definir a visibilidade verdadeira
      textFieldFrame.setVisible(true); 

      // Fim do bloco de códigos do método main
   } 

   // Fim do bloco de códigos da classe
} // end class TextFieldTest

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
