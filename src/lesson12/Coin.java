package lesson12;

import java.util.Objects;

public class Coin implements Comparable<Coin> {
    private double diametr;
    private String metall;
    private int nominal;
    private int year;

    public Coin() {

    }

    public Coin(double diametr, String metall, int nominal, int year) {
        this.diametr = diametr;
        this.metall = metall;
        this.nominal = nominal;
        this.year = year;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (Double.compare(diametr, coin.diametr) != 0) return false;
        if (nominal != coin.nominal) return false;
        if (year != coin.year) return false;
        return Objects.equals(metall, coin.metall);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(diametr);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (metall != null ? metall.hashCode() : 0);
        result = 31 * result + nominal;
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "diametr=" + diametr +
                ", metall='" + metall + '\'' +
                ", nominal=" + nominal +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        // this - первая монета
        // o - вторая монета

        // сортировка по номиналу (глвавная сортировка, можно поставить любую)
        if (this.nominal != o.nominal){
            return this.nominal - o.nominal;
        }

        if (this.year != o.year){
            return this.year - o.year;
        }

        if(this.diametr != o.diametr){
            return Double.compare(this.diametr, o.diametr);
        }

        if (!this.metall.equals(o.metall)){
            return this.metall.compareTo(o.metall); // по разному вызывать можно метод сравнивания, выше ещё 2 примера
        }


        return 0;
    }
}
