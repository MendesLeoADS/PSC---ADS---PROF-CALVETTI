import javax.swing.JOptionPane;
public class solucao4 {
  public static void main(String[] args) {
  //ler três strings com JOptionPane
  String str1 = JOptionPane.showInputDialog("Digite a primeira string:");
  String str2 = JOptionPane.showInputDialog("Digite a segunda string:");
  String str3 = JOptionPane.showInputDialog("Digite a terceira string:");
  
  //calcular comprimento das strings
  int comprimento1 = str1.length();
  int comprimento2 = str2.length();
  int comprimento3 = str3.length();
  
  //somar
  int somaComprimentos = comprimento1 + comprimento2 + comprimento3;
  
  //imprimir resultado
  JOptionPane.showMessageDialog(null, "O comprimento das strings juntas é: " + somaComprimentos);
 }
}