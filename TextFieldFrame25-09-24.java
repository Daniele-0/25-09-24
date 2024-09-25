import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class TextFieldFrame extends JFrame 

// inicio de bloco da classe TextFieldFrame
{

   // Declaração de variavel
   private final JTextField textField1; // text field with set size
   private final JTextField textField2; // text field with text
   private final JTextField textField3; // text field with text and size
   private final JPasswordField passwordField; // password field with text

   // exportando o construtor (public exporta o construtor)
   public TextFieldFrame()
   //inicio do bloco de codigos do construtor Textfieldframe
   {
      // definicão do titulo da janela 
      super("Testing JTextField and JPasswordField");
      // camadas do layout
      setLayout(new FlowLayout());

      // uma declaração de variavel mas com atruicao dentro do construtor, um novo objeto e no 10 estamos definindo a largura das colunas
      textField1 = new JTextField(10); 
      // Adcionando o textfield 
      add(textField1);

      // Esta atribuindo um novo texto e adcionamos ele no Frame
      textField2 = new JTextField("Enter text here");
      //
      add(textField2); // add textField2 to JFrame

      // construindo um novo textfield com mais colunas
      textField3 = new JTextField("Uneditable text field", 21);
      textField3.setEditable(false); //metodo que vai definir que este testfield nao seja editado, porque ele é falso
      add(textField3); // 

      // novo objeto ao testfield 
      passwordField = new JPasswordField("Hidden text");
      add(passwordField); // add passwordField to JFrame

      // handler é manipulador, manipulador dos campos textfield, manipulador dos campos de texto, e estamos adcionando um novo construtor dele
      TextFieldHandler handler = new TextFieldHandler();

      // todos os textfield vai adcionar um escutador de ação e dentro do parametro vamos enviar o handler
      textField1.addActionListener(handler);
      textField2.addActionListener(handler);
      textField3.addActionListener(handler);

      // este paramentro addActionListener ele 
      passwordField.addActionListener(handler);
   } 

   // new ActionListener injetando um objeto
   private class TextFieldHandler implements ActionListener 
   // inicio da classe ActionListener
   {
      // tipo um juiz para auterar tudo o que quiser, o arroba é pra nao receber notificação de perigo, pra ele ignorar msgs de aviso
      @Override //Subsercrever 
      public void actionPerformed(ActionEvent event) // As acções que vão acontecer ele vai enviar para executar o que esta abaixo. Para receber as informações temos que ter o Event
      { // inicio do metodo actionperfomace
         String string = ""; // atruindo um texto vazio para a string com s minusculo
         // if permite realizar as açoes que vem depois da linha dele. qnd tem dois sinais de igual é op de comparação, comparar o lado esquerdo e direito.
         if (event.getSource() == textField1)
         // metodo que vai entregar o texto formatado, porcentagems é um caracter coringa, o s significa que ele vai retornar um texto
         string = String.format("textField1: %s",
         // Pegar o comando da ação, que é fruto do parametro event
               event.getActionCommand());

         // user pressed Enter in JTextField textField2
         else if (event.getSource() == textField2)
            string = String.format("textField2: %s",
               event.getActionCommand());

         // user pressed Enter in JTextField textField3
         else if (event.getSource() == textField3)
            string = String.format("textField3: %s", 
               event.getActionCommand());

         // user pressed Enter in JTextField passwordField
         else if (event.getSource() == passwordField)
            string = String.format("passwordField: %s", 
               event.getActionCommand());

         // pedindo para exibir uma msg de dialogo ( null precisa de dois paramentros no minimo, mas deixou no nulo. a string declaramos nos if)
         JOptionPane.showMessageDialog(null, string); 
      } 
   } // fechamos a classe TextFieldHandler
} // e a classe TextFieldFrame

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
