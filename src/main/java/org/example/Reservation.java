package org.example;

public class Reservation {

    private int customerId;
    private int customerNumber;
    private String reservationType;
    private int customerCount;
    private String customerName;
    private String customerSurname;
    private String customerEmail;
    private String reservationRank;
    private String reservationTime;
    private String reservationDate;
    private boolean reservationStatus;

    public Reservation() {}

    public Reservation(int customerId, int customerNumber, String reservationType, int customerCount,
                       String customerName, String customerSurname, String customerEmail, String reservationRank,
                       String reservationTime, String reservationDate, boolean reservationStatus) {
        this.customerId = customerId;
        this.customerNumber = customerNumber;
        this.reservationType = reservationType;
        this.customerCount = customerCount;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerEmail = customerEmail;
        this.reservationRank = reservationRank;
        this.reservationTime = reservationTime;
        this.reservationDate = reservationDate;
        this.reservationStatus = reservationStatus;
    }

    @Override
    public String toString() {
        return reservationTime + " - " + customerName + " " + customerSurname;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(int customerCount) {
        this.customerCount = customerCount;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public boolean getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(boolean reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public void changeStatus(boolean nowyStatus) {
        this.reservationStatus = nowyStatus;
    }

    public boolean isActive() {
        return this.reservationStatus;
    }

    public void setReservationTime(String reservationTime) {
        this.reservationTime = reservationTime;
    }

    public String getReservationTime() {
        return this.reservationTime;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getReservationDate() {
        return this.reservationDate;
    }

    public void setReservationRank(String reservationRank) {
        this.reservationRank = reservationRank;
    }

    public String getReservationRank() {
        return this.reservationRank;
    }

    public void setReservationType(String reservationType) {
        this.reservationType = reservationType;
    }

    public String getReservationType() {
        return this.reservationType;
    }
}
