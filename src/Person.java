public class Person {
//    Необходимо создать класс Person с полями: имя, возраст, пол.

    String name;
    int age;
    char sex;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //  Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.
    String getName(){
        if(sex == 'f'){
            return "Mrs " + name;
        } else if (sex == 'm'){
            return "Mr " + name;
        } else {
            return name;
        }
    }
}
