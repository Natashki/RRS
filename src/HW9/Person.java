package HW9;

public class Person {
    //    Необходимо создать класс Person с полями: имя, возраст, пол.

    String name;
    int age;
    String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //  Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.
    public String getName(){
        if(sex.equals("f")){
            return "Mrs " + name;
        } else if (sex.equals("m")){
            return "Mr " + name;
        } else {
            return name;
        }
    }
}
