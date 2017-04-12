package jbr.facadepattern.passport.solution;

import jbr.facadepattern.common.Person;

public class PassportProcess {
  public static boolean verify(Person person) {
    Verification phoneNumber = new PhoneNumberVerification();
    Verification address = new AddressVerification();
    Verification dob = new DateOfBirthVerification();
    Verification policeCase = new PoliceCaseVerification();

    return phoneNumber.verify(person.getPhone()) && address.verify(person.getAddress()) && dob.verify(person.getDob())
        && policeCase.verify(person.getName());
  }
}
