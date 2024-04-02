package org.example.Java_.Java_Priority_Queue;

class Student implements Comparable<Student>{
    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student student) {
        if(this.cgpa!=student.cgpa) {
            return Double.compare(student.cgpa, this.cgpa);
        }
        if(this.name!=student.name) {
            return this.name.compareTo(student.name);
        }
        return Integer.compare(this.id, student.id);
    }
}
