<h2>3. Builder</h2><br/> 

Builder 패턴은 객체 생성에 필요한 생성자 인자가 많을 경우 객체의 생성을 깔끔하게 유지하기 위해서 고려하는 패턴이다.<br>
<h4>1-1. 단점</h4><hr>
<blockquote>
    객체 생성을 추가하는 것은 쉬우나 객체를 구성하는 각 부분들을 새롭게 추가하는것은 어렵다.
</blockquote>

<h4>구현 코드</h4>
<code><pre>public class Person {
    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;
    private String addressOne;
    private String addressTwo;
    private String sex;
    private boolean driverLicence;
    private boolean married;
    //Getter and Setter
}<br>
public class PersonBuilder {
    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;
    private String addressOne;
    private String addressTwo;
    private String sex;
    private boolean driverLicence;
    private boolean married;<br>
    public PersonBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }<br>
    public PersonBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }<br>//Setter ...<br>
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
}<br>
//Builder 객체 생성
public static Person createMinsuForTesting() {
    Person minsu = new Person().builder()
            .firstName("김")
            .lastName("민수")
            .addressOne("부산")
            .addressTwo("북구")
            .sex("남자")
            .driverLicence(true)
            .married(false)
            .builder();
    return minsu;
}</code></pre>
<h3><a href="https://github.com/EungyuCho/Disign_Pattern_Repo">목차로 돌아가기 🏃</a></h3> 