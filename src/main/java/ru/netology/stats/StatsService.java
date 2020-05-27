package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateMedium(long[] sales) {
        long sum = calculateSum(sales);
        long medium = sum / sales.length;
        return medium;
    }

    public long findMaxMonth(long[] sales) {
        long maxSale = 0;
        int numberMaxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (maxSale <= sales[i]) {
                maxSale = sales[i];
                numberMaxMonth = i + 1;
            }
        }
        return numberMaxMonth;
    }

    public long findMinMonth(long[] sales) {
        long minSale = sales[0];
        int numberMinMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (minSale >= sales[i]) {
                minSale = sales[i];
                numberMinMonth = i + 1;
            }
        }
        return numberMinMonth;
    }

    public long underMediumMonth(long[] sales) {
        long medium = calculateMedium(sales);
        int underMedium = 0;
        for (long sale : sales) {
            if (sale < medium) {
                underMedium += 1;
            }
        }
        return underMedium;
    }

    public long overMediumMonth(long[] sales) {
        long medium = calculateMedium(sales);
        int overMedium = 0;
        for (long sale : sales) {
            if (sale > medium) {
                overMedium += 1;
            }
        }
        return overMedium;
    }
}
