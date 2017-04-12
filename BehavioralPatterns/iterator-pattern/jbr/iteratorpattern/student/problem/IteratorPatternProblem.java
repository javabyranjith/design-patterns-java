package jbr.iteratorpattern.student.problem;

public class IteratorPatternProblem {

  public static void main(String[] args) {

    System.out.println("FINANCE REPORTS");
    System.out.println("=========================");
    FinanceClearance financeClearance = new FinanceClearance();
    financeClearance.getReport();

    System.out.println("\nLIBRARY REPORTS");
    System.out.println("=========================");
    LibraryClearance libraryClearance = new LibraryClearance();
    libraryClearance.getReport();

  }
}
