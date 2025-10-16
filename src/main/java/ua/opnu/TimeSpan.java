package ua.opnu;


public class TimeSpan {

    // TODO: add class fields
    private int hours, minutes;

    public TimeSpan(int hours, int minutes) {
        // TODO: write constructor body
        if (hours < 0 || minutes < 0 || minutes > 59) {
            System.out.println("Некоректне значення часу в конструкторі");
            this.hours = 0;
            this.minutes = 0;
            return;
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        // TODO: write method body
        return minutes;
    }

    public void add(int hours, int minutes) {
        // TODO: write method body
        if (hours < 0 || minutes < 0 || minutes > 59) {
            System.out.println("Некоректні значення для додавання");
            return;
        }
        int totalMinutes = this.hours * 60 + this.minutes + hours * 60 + minutes;
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    public void addTimeSpan(TimeSpan timespan) {
        // TODO: write method body
        add(timespan.getHours(), timespan.getMinutes());
    }

    public double getTotalHours() {
        // TODO: write method body
        return this.hours + this.minutes / 60.0;
    }

    public int getTotalMinutes() {
        // TODO: write method body
        return this.hours * 60 + this.minutes;
    }

    public void subtract(TimeSpan span) {
        // TODO: write method body
        int totalMinutes = getTotalMinutes() - span.getTotalMinutes();
        if (totalMinutes < 0) {
            System.out.println("Не можна відняти більший часовий інтервал");
            return;
        }
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    public void scale(int factor) {
        // TODO: write method body
        if (factor <= 0) {
            System.out.println("Некоректне значення factor");
            return;
        }
        int totalMinutes = getTotalMinutes() * factor;
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }
}