package jbr.adapterpattern.filereader.solution.inheritance;

import jbr.adapterpattern.solution.inheritance.FileReader;
import jbr.adapterpattern.solution.inheritance.MyFileReader;

public class AdapterPatternTest {
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