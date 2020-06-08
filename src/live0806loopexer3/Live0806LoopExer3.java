package live0806loopexer3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class Live0806LoopExer3 {

    /*
      Faça um programa que leia uma série não determinada de dois valores. O 
      primeiro valor é um código que significa: (1) débito, (2) crédito e (0) fim.
      O segundo valor é uma quantia numérica real. O programa deve identificar o
      código e se for 1, somar a quantia em um acumulador de débitos; se for 2, 
      somar a quantia em um acumulador de créditos; se for 0,encerrar o programa.
      Ao final, mostre o total de débitos e créditos e o saldo 
      (saldo=créditos–débitos).
     */
    public static void main(String[] args) {
        int opcao;
        double valor, acCredito, acDebito;
        opcao = -1; acCredito=0; acDebito=0;
        while(opcao != 0 ){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n"
             + "(1) débito\n(2) crédito\n(0) fim"));
            if(opcao == 1){
                valor = Double.parseDouble(JOptionPane.showInputDialog("Informe"
                        + " o valor do Débito R$:"));
                acDebito = acDebito + valor;
            }else if(opcao == 2){
                 valor = Double.parseDouble(JOptionPane.showInputDialog("Informe"
                        + " o valor do Crédito R$:"));
                acCredito = acCredito + valor;
            }else if(opcao<0 || opcao>2){
                JOptionPane.showMessageDialog(null, "Opção inválida apenas "
                        + "1 ou 2 ou 0");
            }else{
                JOptionPane.showMessageDialog(null, 
                "        Resultado\n Créditos R$"+acCredito+"\n Débitos R$"
                +acDebito+"\n---------------------------\n Saldo R$ "
                +(acCredito-acDebito));
                JOptionPane.showMessageDialog(null, "Bye bye");
            }
        }//fim do loop
        
    }

}
