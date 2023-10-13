package lesson12;

import java.util.Comparator;
import java.util.TreeSet;

public class SortButtons {

    public void sortByDiametrFromTo(TreeSet<Coin> coins){
        TreeSet<Coin> forSorting = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if(o1.getDiametr() != o2.getDiametr()){
                    return Double.compare(o1.getDiametr(), o2.getDiametr());
                }

                if (o1.getNominal() != o2.getNominal()){
                    return o1.getNominal() - o2.getNominal();
                }

                if (o1.getYear() != o2.getYear()){
                    return o1.getYear() - o2.getYear();
                }

                if (!o1.getMetall().equals(o2.getMetall())){
                    return o1.getMetall().compareTo(o2.getMetall()); // по разному вызывать можно метод сравнивания, выше ещё 2 примера
                }
                return 0;
            }
        });
      //  forSorting.add(coins);

        for (Coin c: forSorting){
            System.out.println(c);
        }

    }

    public void sortByDiametrToFrom(TreeSet<Coin> coins) {
        TreeSet<Coin> forSorting = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if(o1.getDiametr() != o2.getDiametr()){
                    return Double.compare(o2.getDiametr(), o1.getDiametr());
                }

                if (o1.getNominal() != o2.getNominal()){
                    return o2.getNominal() - o1.getNominal();
                }

                if (o1.getYear() != o2.getYear()){
                    return o2.getYear() - o1.getYear();
                }

                if (!o1.getMetall().equals(o2.getMetall())){
                    return o2.getMetall().compareTo(o1.getMetall()); // по разному вызывать можно метод сравнивания, выше ещё 2 примера
                }
                return 0;
            }
        });
       // forSorting.add(coins);

        for (Coin c: forSorting){
            System.out.println(c);
        }

    }

    //  public void sortByMetallFromTo(TreeSet<Coin> coins);{

    }
   // public void sortByDiametrFromTo(TreeSet<Coin> coins);{

