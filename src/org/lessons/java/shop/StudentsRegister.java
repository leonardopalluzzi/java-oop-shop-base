package org.lessons.java.shop;

public class StudentsRegister {

    private Student[] studentsArr;

    public StudentsRegister() {
        studentsArr = new Student[0];
    }

    public void setStudent(String firstName, String lastName, int age) {

        // creare il nuovo studente
        Student newStudent = new Student(firstName, lastName, age);

        // copio l'array in un altro
        Student[] tempArr = new Student[0];

        tempArr = this.studentsArr;

        // incremento length vecchio array di 1
        this.studentsArr = new Student[this.studentsArr.length + 1];

        // inserisco elemnto nell'utlima posizione
        for (int i = 0; i < studentsArr.length; i++) {
            if (i == studentsArr.length - 1) {
                studentsArr[i] = newStudent;
            } else {
                studentsArr[i] = tempArr[i];
            }
        }

    }

    public String getStudents() {
        String currentStudent = "";

        if (this.studentsArr != null && this.studentsArr.length > 0) {
            for (int i = 0; i < this.studentsArr.length; i++) {
                currentStudent += this.studentsArr[i].getStudet();
            }
            return currentStudent;
        } else {
            String message = "Non ci sono studenti nel registro";
            return message;
        }

    }

}
