package HW8;

import java.util.Arrays;

public class JournalMain {
    public static void main(String[] args){
        Journal[] students = {new Journal("Ivan"), new Journal("Oleg"), new Journal("Olga"), new Journal("Jordan")};

        setGradeFroLecture(1, 5,"Oleg",students);
        setGradeFroLecture(2, 3,"Oleg",students);
        setGradeFroLecture(3, 3,"Oleg",students);
        setGradeFroLecture(4, 5,"Oleg",students);
        setGradeFroLecture(1, 5,"Oleg",students);
        setGradeFroLecture(1, 3,"Ivan",students);
        setGradeFroLecture(1, 2,"Olga",students);
        System.out.println(Arrays.toString(allGradesForLecture(1,students)));
        System.out.println(Arrays.toString(allGradesFromAllStudents(students)));
        System.out.println("Average gardes Oleg " + countingAverageOfGrades(students, "Oleg"));
    }

    //Поставить оценку любому студенту за любое занятие (по номеру занятия).
    public static void setGradeFroLecture(int lecture, int grade, String name, Journal[] students){
        for(Journal student : students){
            if(student.getName().equals(name)){
                student.setGrades(lecture, grade);
                break;
            }
        }
    }

    //Распечатать все оценки всех студентов за одно занятие (по номеру)
    public static String[] allGradesForLecture(int lecture, Journal[] students){
        String[] res = new String[students.length];
        for(int i = 0; i < students.length; i++ ){
            if (lecture < students[i].getGrades().length && students[i].getGrades()[lecture] != 0){
                res[i] = students[i].getName() + " has grade "+ students[i].getGrades()[lecture] + " for " + lecture + " lecture";
            }else {
                res[i] = students[i].getName() + " has no grade for lecture " + lecture;
            }
        }
        return res;
    }

    //Распечатать все оценки всех студентов за весь курс
    public static String[] allGradesFromAllStudents(Journal[] students){
        String[] res = new String[students.length];
        int i = 0;
        for(Journal student : students){
            res[i] = student.getName() + " has grades: ";
            for(int grade : student.getGrades()){
                if(grade == 0){
                    res[i] +=  "- ";
                }else {
                    res[i] += grade + " ";
                }
            }
            i++;
        }
        return res;
    }


    //Посчитать средний балл любого студента.
    public static String countingAverageOfGrades(Journal[] students, String name) {
        for (Journal student : students) {
            if (student.getName().equals(name)) {
                int summa = 0;
                int counting = 0;
                for (int grade : student.getGrades()) {
                    if (grade != 0) {
                        summa += grade;
                        counting++;
                    }
                }
                return String.valueOf(summa / counting);
            }
        }
        return "no grades or student";
    }
}
