package FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePerson = new ArrayList<>();

        // person -> P
        // person -> p
        // person -> p with S
        for(Person person: persons){
            if(person.getMaritialStatus().equalsIgnoreCase("SINGLE")){
                // adding the male person to the list ( maleperson )
                singlePerson.add(person);
            }
        }
        // returning the list
        return singlePerson;

        // Single -> male or female || orCriteria and ANDcriteria
    }
}
