package jbr.adapterpattern.filereader.solution.composition;

import jbr.adapterpattern.filereader.solution.composition.AdvancedFileReader;

public class FileReaderAdapter {

  AdvancedFileReader advancedFileReader = null;

  public void readFile(String fileType) {
    advancedFileReader = new AdvancedFileReader();

    advancedFileReader.readFileAdvanced(fileType);
  }
}