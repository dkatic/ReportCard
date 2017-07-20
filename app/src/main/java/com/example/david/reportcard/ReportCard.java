package com.example.david.reportcard;

/**
 * Created by david on 20.7.2017..
 */

public class ReportCard {

    private String subject;
    private int grade;

    public ReportCard(String subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "\n" + subject + " " + grade;
    }
}
