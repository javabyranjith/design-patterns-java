package jbr.iteratorpattern.student.solution;

public class IteratorPatternSolution {

  public static void main(String[] args) {
    Clearance clearance = new Clearance();
    clearance.collectReport(new FinanceDepartment(), new LibraryDepartment());
  }
}
