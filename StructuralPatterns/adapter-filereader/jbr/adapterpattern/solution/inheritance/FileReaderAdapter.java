package jbr.adapterpattern.solution.inheritance;

public class FileReaderAdapter extends AdvancedFileReader {

  public void readFile(String fileType) {
    readFileAdvanced(fileType);
  }
}