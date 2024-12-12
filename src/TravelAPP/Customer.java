package TravelAPP;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private List<Tour> customerPackagetour;

    public Customer(int customerId, List<Tour> customerPackagetour) {
        this.customerId = customerId;
        this.customerPackagetour = customerPackagetour;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<Tour> getCustomerPackagetour() {
        return customerPackagetour;
    }

    public void setCustomerPackagetour(List<Tour> customerPackagetour) {
        this.customerPackagetour = customerPackagetour;
    }


    public void customerTourReserve(Tour tour){
        if (!tour.isReserved()){
            tour.reserveTourPackage();
            customerPackagetour.add(tour);
            System.out.println("Tour"+tour.getTourName()+" paket sizin siyahiya elave edildi");
        }
        else {
            System.out.println("Tour paketi artiq reserve olunub");
        }

    }

    public void coustomerTourCancel(Tour tour){
        if (customerPackagetour.contains(tour)){
            tour.canselTourPackage();
            customerPackagetour.remove(tour);
            System.out.println("Tour"+tour.getTourName()+" Has delete from the List");
        }
        else {
            System.out.println("Tour paketi rezerv olunub artiq.");
        }
    }

    public void displayDetails1() {
        System.out.println("Customer ID: " +customerId+" Reserved :"+ customerPackagetour);


    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerPackagetour=" + customerPackagetour +
                '}';
    }
}
