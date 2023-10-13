package lesson10.library;

import java.util.Objects;

public class Jurnal extends PrintEdition{
    private int numsInYear;

    public Jurnal() {
    }

    public Jurnal(String name, int year, String izdatelstvo, int numsInYear) {
        super(name, year, izdatelstvo);
        this.numsInYear = numsInYear;
    }

    public int getNumsInYear() {
        return numsInYear;
    }

    public void setNumsInYear(int numsInYear) {
        this.numsInYear = numsInYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Jurnal jurnal = (Jurnal) o;
        return numsInYear == jurnal.numsInYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numsInYear);
    }

    @Override
    public String toString() {
        return "Журнал: {" +
                "номер в году =" + numsInYear + super.toString() +
                '}';
    }
}
