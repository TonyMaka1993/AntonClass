package anton.converter.person;

import java.util.List;

public interface IGreeting {
    String getFirstName();

    String getSecondName();

    String getLastName();

    List<Hobby> getHobbies();

    String getBitBucketUrl();

    String getPhone();

    String getCourseExpectation();

    String getEducationInfo();
}