package lesson12.HomeWork2;

import java.util.Objects;

public class TeaPot implements Comparable<TeaPot> {

    private String name;

    private int price;

    private double volume;

    private int power;

    private String bodyMaterial;

    private int monthOfGuarantee;

    public TeaPot() {
    }

    public TeaPot(String name, int price, double volume, int power, String bodyMaterial, int monthOfGuarantee) {
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.power = power;
        this.bodyMaterial = bodyMaterial;
        this.monthOfGuarantee = monthOfGuarantee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public int getMonthOfGuarantee() {
        return monthOfGuarantee;
    }

    public void setMonthOfGuarantee(int monthOfGuarantee) {
        this.monthOfGuarantee = monthOfGuarantee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeaPot teaPot = (TeaPot) o;

        if (price != teaPot.price) return false;
        if (Double.compare(teaPot.volume, volume) != 0) return false;
        if (power != teaPot.power) return false;
        if (monthOfGuarantee != teaPot.monthOfGuarantee) return false;
        if (!Objects.equals(name, teaPot.name)) return false;
        return Objects.equals(bodyMaterial, teaPot.bodyMaterial);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        temp = Double.doubleToLongBits(volume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + power;
        result = 31 * result + (bodyMaterial != null ? bodyMaterial.hashCode() : 0);
        result = 31 * result + monthOfGuarantee;
        return result;
    }

    @Override
    public String toString() {
        return "Электрочайник {" +
                "назввание = '" + name + '\'' +
                ", цена = " + price +
                ", объём = " + volume +
                ", мощность = " + power +
                ", материал корпуса = '" + bodyMaterial + '\'' +
                ", гарантия(мес) = " + monthOfGuarantee +
                '}';
    }

    @Override
    public int compareTo(TeaPot o) {

        if (!this.name.equals(o.name)) {
            return this.name.compareTo(o.name);
        }

        if (this.price != o.price) {
            return this.price - o.price;
        }

        //
        if (this.volume != o.volume) {
            return Double.compare(this.volume, o.volume);
        }

        if (this.power != o.power) {
            return this.power - o.power;
        }

        if (this.bodyMaterial.equals(o.bodyMaterial)) {
            return this.bodyMaterial.compareTo(o.bodyMaterial);

        }

        if (this.monthOfGuarantee != o.monthOfGuarantee) {
            return this.monthOfGuarantee - o.monthOfGuarantee;
        }

        return 0;
    }
}