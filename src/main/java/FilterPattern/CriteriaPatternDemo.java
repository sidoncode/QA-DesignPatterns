package FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
    public static void main(String [] args){
        List<Person> personList = new ArrayList<Person>();

        personList.add(new Person("Anoop","Male","Single"));
        personList.add(new Person("Siddharth","Male","Single"));
        personList.add(new Person("x","Female","Married"));
        personList.add(new Person("y","Female","Married"));
        personList.add(new Person("z","Female","Married"));
        personList.add(new Person("a","Female","Married"));
        personList.add(new Person("b","Female","Married"));
        personList.add(new Person("c","Male","Married"));
        personList.add(new Person("d","Male","Married"));
        personList.add(new Person("e","Male","Married"));
        personList.add(new Person("f","Male","Single"));
        personList.add(new Person("g","Male","Single"));
        personList.add(new Person("h","Male","Single"));
        personList.add(new Person("i","Female","Single"));
        // Total Person = 14
        // Total Male = 8
        // Total Female = 6
        // Total Single = 6
        // Total Married = 8

        Criteria malePerson = new CriteriaMale();

        System.out.println("Males: ");
        printPerson(malePerson.meetCriteria(personList));
    }
    public static void printPerson(List<Person> persons){
        for (Person person: persons){
            System.out.println("Person : " + "Name " + person.getName() + " " + "Gender"
            + person.getGender() + "Maritial Person" + person.getMaritialStatus());
        }
    }

}
