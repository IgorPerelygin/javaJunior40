package lesson10.library;

import java.util.Objects;

public class PrintEdition {
    private String name;
    private int year;
    private String izdatelstvo;

    public PrintEdition() {
    }

    public PrintEdition(String name, int year, String izdatelstvo) {
        this.name = name;
        this.year = year;
        this.izdatelstvo = izdatelstvo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIzdatelstvo() {
        return izdatelstvo;
    }

    public void setIzdatelstvo(String izdatelstvo) {
        this.izdatelstvo = izdatelstvo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrintEdition that = (PrintEdition) o;
        return year == that.year && Objects.equals(name, that.name) && Objects.equals(izdatelstvo, that.izdatelstvo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, izdatelstvo);
    }

    @Override
    public String toString() {
        return " имя ='" + name + '\'' +
                ", год выпуска =" + year +
                ", издательство ='" + izdatelstvo;
    }
}
