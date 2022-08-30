package FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();

        // person -> P
        // person -> p
        // person -> p with S
        for(Person person: persons){
            if(person.getGender().equalsIgnoreCase("MALE")){
                // adding the male person to the list ( maleperson )
                malePersons.add(person);
            }
        }
        // returning the list
        return malePersons;
    }
}
