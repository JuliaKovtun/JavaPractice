package task_3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String middleName;
    private List<Subject> subjects;

    public Student(final int id, final String firstName,final String middleName, final String lastName, final Subject subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.id = id;
        subjects = new ArrayList<Subject>();
        subjects.add(subject);
    }

    public Student(final int id, final String firstName, final String middleName, final String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.id = id;
        subjects = new ArrayList<Subject>();
    }

    public int getId() { return id; }
    public void setFirstName(final String firstName) { this.firstName = firstName; }
    public String getFirstName() { return firstName; }
    public void setLastName(final String lastName) { this.lastName = lastName; }
    public String getLastName() { return lastName; }
    public void setMiddleName(final String middleName) { this.middleName = middleName; }
    public String getMiddleName() { return middleName; }

    public void addSubject(final String subject) { subjects.add(new Subject(subject)); }
    public void addSubject(final Subject subject)
    {
        subjects.add(subject);
    }

    public Subject findSubject(final String subjectName){
        for (final Subject subject : subjects) {
            if (subject.getName().equals(subjectName)) {
                return subject;
            }
        }
        return null;
    }

//      Додає оцінку
    public void AddMark(final String subjectName, final int value)
    {
        Subject subject = findSubject(subjectName);
        if(subject  == null) {
            subject = new Subject(subjectName);
            addSubject(subject);
        }
        subject.setMark(new Mark(value));
    }

//      Рахує середнє значення оцінок студента
    public double averageValueAllSubject()
    {
        double result=0;
        if (subjects.size()>0)
        {
            double sum=0;
            for (final Subject subject: subjects) {
                sum += subject.getMark().getValue();
            }
            result = sum/subjects.size();
        }
        return result;
    }

//      Повертає всі оцінки студента
    public void getMarks() {
        for(final Subject subject: subjects){
            System.out.print(subject.getMark().getValue() + "\t");
        }
    }

    @Override
    public String toString() {
        return '\n' + lastName + " " + firstName + " " +
                middleName + " " + id + '\n'+
                subjects.toString();
    }
}
