package FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale {

    public class CriteriaSingle implements Criteria {
        @Override
        public List<Person> meetCriteria(List<Person> persons) {
            List<Person> femalePerson = new ArrayList<>();

            // person -> P
            // person -> p
            // person -> p with S
            for (Person person : persons) {
                if (person.getGender().equalsIgnoreCase("FEMALE")) {
                    // adding the male person to the list ( maleperson )
                    femalePerson.add(person);
                }
            }
            // returning the list
            return femalePerson;
        }
    }
}

