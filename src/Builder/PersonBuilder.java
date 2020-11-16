package Builder;

import java.time.LocalDateTime;

public class PersonBuilder {
    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;
    private String addressOne;
    private String addressTwo;
    private String sex;
    private boolean driverLicence;
    private boolean married;

    public PersonBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder birthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public PersonBuilder addressOne(String addressOne) {
        this.addressOne = addressOne;
        return this;
    }

    public PersonBuilder addressTwo(String addressTwo) {
        this.addressTwo = addressTwo;
        return this;
    }

    public PersonBuilder sex(String sex) {
        this.sex = sex;
        return this;
    }

    public PersonBuilder driverLicence(boolean driverLicence) {
        this.driverLicence = driverLicence;
        return this;
    }

    public PersonBuilder married(boolean married) {
        this.married = married;
        return this;
    }

    public Person builder() {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setBirthDate(birthDate);
        person.setAddressOne(addressOne);
        person.setAddressTwo(addressTwo);
        person.setDriverLicence(driverLicence);
        person.setSex(sex);
        person.setMarried(married);
        return person;
    }
}
