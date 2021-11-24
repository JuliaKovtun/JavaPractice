package task_3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Subject> subjects;

    public Student(final int id, final String name, final Subject subject){
        this.name = name;
        this.id = id;
        subjects = new ArrayList<Subject>();
        subjects.add(subject);
    }

    public Student(final int id, final String name){
        this.name = name;
        this.id = id;
        subjects = new ArrayList<Subject>();
    }

    public int getId() { return id; }
    public void setName(final String name) { this.name = name; }
    public String getName() { return name; }

    public void AddSubject(final String subject_name)
    {
        subjects.add(new Subject(subject_name));
    }
    public void AddSubject(final Subject subject)
    {
        subjects.add(subject);
    }

    public Subject findSubject(final String subject_name){
        for (final Subject subject : subjects) {
            if (subject.getName().equals(subject_name)) {
                return subject;
            }
        }
        return null;
    }

// Додає оцінку
    public void AddMark(final String subject_name, final int value)
    {
        Subject find_subject = findSubject(subject_name);
        if(find_subject  == null) {
            find_subject = new Subject(subject_name);
            AddSubject(find_subject);
        }
        find_subject.setMark(new Mark(value));
    }

//    Рахує середнє значення оцінок студента
    public double AverageValueAllSubject()
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

// Повертає всі оцінки студента
    public void getMarks() {
        for(final Subject subject: subjects){
            System.out.print(subject.getMark().getValue() + "\t");
        }
    }

    @Override
    public String toString() {
        return name + " "  + id + '\n'+
                subjects.toString() ;
    }
//
//    @Override
//    public String toString() {
//        return "Student: " + name + subject;
//    }
}
