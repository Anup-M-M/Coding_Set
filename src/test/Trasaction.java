package test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Trasaction {

    private String name;

    private double amount;

    private LocalDate date;

    public Trasaction(String name, double amount, LocalDate date) {
        this.name = name;
        this.amount = amount;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Trasaction{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }

    public static void main(String[] args) {
        List<Trasaction> trasactionList = Arrays.asList(
                new Trasaction("EMI", 1000, LocalDate.of(2024,5, 12)),
                new Trasaction("Rent", 10000, LocalDate.of(2025,5, 12)),
                new Trasaction("Internet", 2000, LocalDate.of(2025,10, 12)),
                new Trasaction("fuel", 3000, LocalDate.of(2024,11, 12)),
                new Trasaction("EMI1", 2500, LocalDate.of(2025,5, 12)),
                new Trasaction("EMI2", 100, LocalDate.of(2024,3, 12)),
                new Trasaction("EMI3", 700, LocalDate.of(2024,2, 12))
        );

        trasactionList.stream()
                    .sorted(Comparator.comparing(Trasaction :: getDate).reversed())
                    .limit(5)
                    .forEach(System.out::println);
    }



}
