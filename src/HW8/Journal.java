package HW8;

public class Journal {
    String name;
    int[] grades;

    public Journal(String name){
        this.name = name;
        this.grades = new int[10];
    }

    void setGrades(int lecture, int grade){
        this.grades[lecture] = grade;
    }

    public String getName(){
        return name;
    }

    public int[] getGrades(){
        return grades;
    }
}
