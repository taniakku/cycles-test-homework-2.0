package ru.netology.stats;

public class StatsService {

    //Месяц, когда был минимум родаж

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //Месяц, когда был максимум продаж

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //Сумма всех продаж за 12 месяцев

    public int sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //Посчитаем среднее кол-во продаж в месяц из суммы

    public int avgSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    //Посчитаем, в скольких месяцах продаж меньше avg

    public int belowAwgSales(long[] sales) {
        int months = 0;
        for (long sale : sales) {
            if (sale < avgSales(sales)) {
                months = months + 1;
            }
        }
        return months;
    }

    //Посчитаем, в скольких месяцах продаж больше avg

    public int aboveAwgSales(long[] sales) {
        int months = 0;
        for (long sale : sales) {
            if (sale > avgSales(sales)) {
                months = months + 1;
            }
        }
        return months;
    }

}
