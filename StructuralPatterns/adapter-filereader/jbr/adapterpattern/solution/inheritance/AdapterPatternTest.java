package jbr.adapterpattern.solution.inheritance;

public class AdapterPatternTest {
  public static void main(String[] args) {

    System.out.println("ADAPTER DESIGN PATTERN - INHERITANCE");
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