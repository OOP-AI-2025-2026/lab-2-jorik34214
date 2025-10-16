package ua.opnu;

public class Student {
    String name;
    int year;
    String[] courses = new String[100];
    int count = 0;

    Student(String name, int year) {
        this.name = name;
        this.year = (year >= 1 && year <= 4) ? year : 1;
    }

    void addCourse(String c) {
        if (c != null && count < 100) courses[count++] = c;
    }

    void dropAll() {
        count = 0;
    }

    int getCourseCount() {
        return count;
    }

    String getName() {
        return name;
    }

    int getYear() {
        return year;
    }

    int getTuition() {
        return year * 20000;
    }
}
