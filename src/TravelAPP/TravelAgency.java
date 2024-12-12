package TravelAPP;

import java.util.ArrayList;
import java.util.List;

public class TravelAgency {
    private String agencyName;
    private List <Tour> tours;
    private List<Customer > customers;

    public TravelAgency(String agencyName) {
        this.agencyName = agencyName;
        this.tours = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void addTourAgancy(Tour tour){
        tours.add(tour);
        System.out.println("Tour"+ tour.getTourName()+" is add tour agency");
    }
    public void addCustomerAgancy(Customer customer){
        customers.add(customer);
        System.out.println("Customer"+ customer.getCustomerId()+" is add  agency list");
    }


    public void displayTourAgencyInfo(){
        for (Tour i : tours){
            i.displayDetails();
        }
    }

    public void displayCustomerAgencyInfo(){
        for (Customer i : customers){
            i.displayDetails1();
        }
    }


}
