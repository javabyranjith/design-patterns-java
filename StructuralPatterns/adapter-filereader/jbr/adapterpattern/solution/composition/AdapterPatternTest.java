package jbr.adapterpattern.solution.composition;

public class AdapterPatternTest {
  public static void main(String[] args) {

    System.out.println("ADAPTER DESIGN PATTERN - COMPOSITION");
    FileReader fileReader = new MyFileReader();
    fileReader.readFile(".txt");

    System.out.println("\n");
    fileReader.readFile(".pdf");

    System.out.println("\n");
    fileReader.readFile(".docx");

    System.out.println("\n");
    fileReader.readFile(".xlsx");

    System.out.println("\n");
    fileReader.readFile(".aaa");
  }
}