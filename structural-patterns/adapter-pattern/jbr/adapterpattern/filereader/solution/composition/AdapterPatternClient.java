package jbr.adapterpattern.filereader.solution.composition;

public class AdapterPatternClient {
  public static void main(String[] args) {

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