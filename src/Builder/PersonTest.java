package Builder;

public class PersonTest {

    public static void main(String[] args) {
        Person personForTesting = createPersonForTesting();
        System.out.println(personForTesting.getAddressOne());
    }

    public static Person createPersonForTesting() {
        Person p1 = new Person().builder()
                .firstName("김")
                .lastName("민수")
                .addressOne("부산")
                .addressTwo("북구")
                .sex("남자")
                .driverLicence(true)
                .married(false)
                .builder();

        return p1;
    }
}
