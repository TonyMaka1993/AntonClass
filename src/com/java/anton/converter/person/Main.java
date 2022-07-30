package anton.converter.person;

import anton.converter.person.impl.IGreetingImpl;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hobby hobby1 = new Hobby((byte) 1, "Психология", "Чтение книг по психологии, саморазвитию");
        Hobby hobby2 = new Hobby((byte) 2, "Фильмы", "Просмотр фильмов из ТОП-250 Кинопоиска");
        Hobby hobby3 = new Hobby((byte) 3, "Спорт", "Занимаюсь спортом, держу себя в форме. Иногда играю в футбол");
        List<Hobby> hobbies = new ArrayList<>();
        hobbies.add(hobby1);
        hobbies.add(hobby2);
        hobbies.add(hobby3);

        IGreetingImpl greeting = new IGreetingImpl("Anton", "Makarov",
                "Dmitrievich", "https://bitbucket.org/tony_makarov/", "+79308076023",
                "Получение востребованной профессии, создание портфолио работ, возможность получить шанс присоединиться к команде разработчиков", "Образование: НГТУ им. Р.Е.Алексеева, Институт ядерной энергетики и технической физики", hobbies);

        System.out.print(greeting.getFirstName() + " ");
        System.out.print(greeting.getLastName() + " ");
        System.out.println(greeting.getSecondName());
        System.out.println(greeting.getBitBucketUrl());
        System.out.println(greeting.getPhone());
        System.out.println(greeting.getCourseExpectation());
        System.out.println(greeting.getEducationInfo());
        System.out.println(hobby1);
        System.out.println(hobby2);
        System.out.println(hobby3);

    }
}