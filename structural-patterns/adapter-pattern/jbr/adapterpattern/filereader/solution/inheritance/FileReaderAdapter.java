package jbr.adapterpattern.filereader.solution.inheritance;

public class FileReaderAdapter extends AdvancedFileReader {

  public void readFile(String fileType) {
    readFileAdvanced(fileType);
  }
}