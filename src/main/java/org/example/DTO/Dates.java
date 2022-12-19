package org.example.DTO;

import java.util.Objects;

public class Dates {
    private int year;
    private int month;
    private int day;

    public Dates(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dates dates = (Dates) o;
        return year == dates.year && month == dates.month && day == dates.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return year + "." + month + "." + day;
    }
}
