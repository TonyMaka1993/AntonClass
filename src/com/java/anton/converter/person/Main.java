package anton.converter.person;

import anton.converter.person.impl.IGreetingImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hobby hobby1 = new Hobby((byte) 1, "Programming");
        Hobby hobby2 = new Hobby((byte) 2, "GYM");
        Hobby hobby3 = new Hobby((byte) 3, "CHESS");
        List<Hobby> hobbies = new ArrayList<>();
        hobbies.add(hobby1);
        hobbies.add(hobby2);
        hobbies.add(hobby3);

        IGreetingImpl greeting = new IGreetingImpl("Anton", "Second Name",
                "Last Name", "www.www.com", "123456",
                "Expectation", "Info", hobbies);

    }
}