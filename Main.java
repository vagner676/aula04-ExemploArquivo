import java.io.BufferedReader;
import java.io.FileReader;

class Main {
  public static void main(String[] args) throws Exception {
   FileReader arquivo = new FileReader("teste.txt");

    BufferedReader leBufferizado = new BufferedReader(arquivo);
    String linha = leBufferizado.readLine();
    System.out.println(linha);
    String [] substrings = linha.split("  ");
    for (int  i=0; i < substrings.length; i++) {
      
    }
    leBufferizado.close();
  }
}