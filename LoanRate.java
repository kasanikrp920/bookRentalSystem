package com.trimindtech.training.day08BookRental;

public class LoanRate {

    private double overDueRateAcademic;
    private double overDueRateNonAcademic;
    private static  double overdueAmount=0.0;
    private static double amount=1.0;


    public LoanRate(double overDueRateAcademic, double overDueRateNonAcademic) {
        this.overDueRateAcademic = overDueRateAcademic;
        this.overDueRateNonAcademic = overDueRateNonAcademic;
    }
    public double getOverDueRateAcademic() {
        return overDueRateAcademic;
    }

    public void setOverDueRateAcademic(double overDueRateAcademic) {
        this.overDueRateAcademic = overDueRateAcademic;
    }

    public double getOverDueRateNonAcademic() {
        return overDueRateNonAcademic;
    }

    public void setOverDueRateNonAcademic(double overDueRateNonAcademic) {
        this.overDueRateNonAcademic = overDueRateNonAcademic;
    }

    public static double getOverdueAmount() {
        return overdueAmount;
    }

    public static void setOverdueAmount(int days) {
        LoanRate.overdueAmount = overdueAmount;
    }

    public static double getAmount() {
        return amount;
    }

    public static void setAmount(int numOfDays) {
        LoanRate.amount =numOfDays *amount;
    }
}

