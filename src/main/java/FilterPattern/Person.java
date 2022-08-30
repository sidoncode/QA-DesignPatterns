package FilterPattern;

public class Person {
    private String name;
    private String gender;
    private String maritialStatus;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritialStatus() {
        return maritialStatus;
    }

    public Person(String name, String gender, String maritialStatus){
        this.name = name;
        this.gender = gender;
        this.maritialStatus = maritialStatus;
    }


}
