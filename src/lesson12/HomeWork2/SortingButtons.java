package lesson12.HomeWork2;

import java.util.Comparator;
import java.util.TreeSet;

public class SortingButtons {

    public void sortByNameFromTo(TreeSet<TeaPot> teaPots) {
        TreeSet<TeaPot> forSorting = new TreeSet<>(new Comparator<TeaPot>() {
            @Override
            public int compare(TeaPot o1, TeaPot o2) {

                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getVolume(), o2.getVolume());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o1.getBodyMaterial().compareTo(o2.getBodyMaterial());
                }

                if (o1.getMonthOfGuarantee() != o2.getMonthOfGuarantee()) {
                    return o1.getMonthOfGuarantee() - o2.getMonthOfGuarantee();
                }


                return 0;
            }
        });

        forSorting.addAll(teaPots);

        for (TeaPot t : forSorting) {
            System.out.println(t);
        }
    }

    public void sortByNameToFrom(TreeSet<TeaPot> teaPots) {
        TreeSet<TeaPot> forSorting = new TreeSet<>(new Comparator<TeaPot>() {
            @Override
            public int compare(TeaPot o1, TeaPot o2) {

                if (!o1.getName().equals(o2.getName())) {
                    return o2.getName().compareTo(o1.getName());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getVolume(), o2.getVolume());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o1.getBodyMaterial().compareTo(o2.getBodyMaterial());
                }

                if (o1.getMonthOfGuarantee() != o2.getMonthOfGuarantee()) {
                    return o1.getMonthOfGuarantee() - o2.getMonthOfGuarantee();
                }


                return 0;
            }
        });

        forSorting.addAll(teaPots);

        for (TeaPot t : forSorting) {
            System.out.println(t);
        }

    }

    public void sortByPriceFromTo(TreeSet<TeaPot> teaPots) {
        TreeSet<TeaPot> forSorting = new TreeSet<>(new Comparator<TeaPot>() {
            @Override
            public int compare(TeaPot o1, TeaPot o2) {

                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }

                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getVolume(), o2.getVolume());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o1.getBodyMaterial().compareTo(o2.getBodyMaterial());
                }

                if (o1.getMonthOfGuarantee() != o2.getMonthOfGuarantee()) {
                    return o1.getMonthOfGuarantee() - o2.getMonthOfGuarantee();
                }


                return 0;
            }
        });

        forSorting.addAll(teaPots);

        for (TeaPot t : forSorting) {
            System.out.println(t);
        }

    }

    public void sortByPriceToFrom(TreeSet<TeaPot> teaPots) {
        TreeSet<TeaPot> forSorting = new TreeSet<>(new Comparator<TeaPot>() {
            @Override
            public int compare(TeaPot o1, TeaPot o2) {

                if (o1.getPrice() != o2.getPrice()) {
                    return o2.getPrice() - o1.getPrice();
                }


                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }


                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getVolume(), o2.getVolume());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o1.getBodyMaterial().compareTo(o2.getBodyMaterial());
                }

                if (o1.getMonthOfGuarantee() != o2.getMonthOfGuarantee()) {
                    return o1.getMonthOfGuarantee() - o2.getMonthOfGuarantee();
                }


                return 0;
            }
        });

        forSorting.addAll(teaPots);

        for (TeaPot t : forSorting) {
            System.out.println(t);
        }

    }

    public void sortByMaterialFromTo(TreeSet<TeaPot> teaPots) {
        TreeSet<TeaPot> forSorting = new TreeSet<>(new Comparator<TeaPot>() {
            @Override
            public int compare(TeaPot o1, TeaPot o2) {

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o1.getBodyMaterial().compareTo(o2.getBodyMaterial());
                }

                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getVolume(), o2.getVolume());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }

                if (o1.getMonthOfGuarantee() != o2.getMonthOfGuarantee()) {
                    return o1.getMonthOfGuarantee() - o2.getMonthOfGuarantee();
                }

                return 0;
            }
        });

        forSorting.addAll(teaPots);

        for (TeaPot t : forSorting) {
            System.out.println(t);
        }

    }

    public void sortByMaterialToFrom(TreeSet<TeaPot> teaPots) {
        TreeSet<TeaPot> forSorting = new TreeSet<>(new Comparator<TeaPot>() {
            @Override
            public int compare(TeaPot o1, TeaPot o2) {

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o2.getBodyMaterial().compareTo(o1.getBodyMaterial());
                }

                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o2.getPrice() - o1.getPrice();
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getVolume(), o2.getVolume());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }

                if (o1.getMonthOfGuarantee() != o2.getMonthOfGuarantee()) {
                    return o1.getMonthOfGuarantee() - o2.getMonthOfGuarantee();
                }


                return 0;
            }
        });

        forSorting.addAll(teaPots);

        for (TeaPot t : forSorting) {
            System.out.println(t);
        }

    }

    public void sortByGuaranteeFromTo(TreeSet<TeaPot> teaPots) {
        TreeSet<TeaPot> forSorting = new TreeSet<>(new Comparator<TeaPot>() {
            @Override
            public int compare(TeaPot o1, TeaPot o2) {

                if (o1.getMonthOfGuarantee() != o2.getMonthOfGuarantee()) {
                    return o1.getMonthOfGuarantee() - o2.getMonthOfGuarantee();
                }

                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getVolume(), o2.getVolume());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o1.getBodyMaterial().compareTo(o2.getBodyMaterial());
                }

                return 0;
            }
        });

        forSorting.addAll(teaPots);

        for (TeaPot t : forSorting) {
            System.out.println(t);
        }
    }

    public void sortByGuaranteeToFrom(TreeSet<TeaPot> teaPots) {
        TreeSet<TeaPot> forSorting = new TreeSet<>(new Comparator<TeaPot>() {
            @Override
            public int compare(TeaPot o1, TeaPot o2) {

                if (o1.getMonthOfGuarantee() != o2.getMonthOfGuarantee()) {
                    return o2.getMonthOfGuarantee() - o1.getMonthOfGuarantee();
                }

                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getVolume(), o2.getVolume());
                }

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o1.getBodyMaterial().compareTo(o2.getBodyMaterial());
                }

                return 0;
            }
        });

        forSorting.addAll(teaPots);

        for (TeaPot t : forSorting) {
            System.out.println(t);
        }
    }

    public void sortByVolumeFromTo(TreeSet<TeaPot> teaPots) {
        TreeSet<TeaPot> forSorting = new TreeSet<>(new Comparator<TeaPot>() {
            @Override
            public int compare(TeaPot o1, TeaPot o2) {

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o2.getVolume(), o1.getVolume());
                }

                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o1.getBodyMaterial().compareTo(o2.getBodyMaterial());
                }

                if (o1.getMonthOfGuarantee() != o2.getMonthOfGuarantee()) {
                    return o1.getMonthOfGuarantee() - o2.getMonthOfGuarantee();
                }


                return 0;
            }
        });

        forSorting.addAll(teaPots);

        for (TeaPot t : forSorting) {
            System.out.println(t);
        }
    }

    public void sortByVolumeToFrom(TreeSet<TeaPot> teaPots) {
        TreeSet<TeaPot> forSorting = new TreeSet<>(new Comparator<TeaPot>() {
            @Override
            public int compare(TeaPot o1, TeaPot o2) {

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getVolume(), o2.getVolume());
                }

                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o1.getBodyMaterial().compareTo(o2.getBodyMaterial());
                }

                if (o1.getMonthOfGuarantee() != o2.getMonthOfGuarantee()) {
                    return o1.getMonthOfGuarantee() - o2.getMonthOfGuarantee();
                }


                return 0;
            }
        });

        forSorting.addAll(teaPots);

        for (TeaPot t : forSorting) {
            System.out.println(t);
        }
    }

    public void sortByPowerFromTo(TreeSet<TeaPot> teaPots) {
        TreeSet<TeaPot> forSorting = new TreeSet<>(new Comparator<TeaPot>() {
            @Override
            public int compare(TeaPot o1, TeaPot o2) {

                if (o1.getPower() != o2.getPower()) {
                    return o2.getPower() - o1.getPower();
                }

                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getVolume(), o2.getVolume());
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o1.getBodyMaterial().compareTo(o2.getBodyMaterial());
                }

                if (o1.getMonthOfGuarantee() != o2.getMonthOfGuarantee()) {
                    return o1.getMonthOfGuarantee() - o2.getMonthOfGuarantee();
                }


                return 0;
            }
        });

        forSorting.addAll(teaPots);

        for (TeaPot t : forSorting) {
            System.out.println(t);
        }
    }

    public void sortByPowerToFrom(TreeSet<TeaPot> teaPots) {
        TreeSet<TeaPot> forSorting = new TreeSet<>(new Comparator<TeaPot>() {
            @Override
            public int compare(TeaPot o1, TeaPot o2) {

                if (o1.getPower() != o2.getPower()) {
                    return o1.getPower() - o2.getPower();
                }

                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }

                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }

                if (o1.getVolume() != o2.getVolume()) {
                    return Double.compare(o1.getVolume(), o2.getVolume());
                }

                if (!o1.getBodyMaterial().equals(o2.getBodyMaterial())) {
                    return o1.getBodyMaterial().compareTo(o2.getBodyMaterial());
                }

                if (o1.getMonthOfGuarantee() != o2.getMonthOfGuarantee()) {
                    return o1.getMonthOfGuarantee() - o2.getMonthOfGuarantee();
                }


                return 0;
            }
        });

        forSorting.addAll(teaPots);

        for (TeaPot t : forSorting) {
            System.out.println(t);
        }
    }
}

