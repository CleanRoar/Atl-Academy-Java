package TravelAPP;

import java.util.List;

public class Customer {
    private int customerId;
    private List<Tour> customerPackagetour;

    public Customer(int customedId, List<Tour> customerPackageList) {
        this.customerId = customedId;
        this.customerPackagetour =customerPackageList;


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


    public void coustomerTourReserve(Tour tour){
        if (!tour.isReserved()){
            tour.isReserved();
            customerPackagetour.add(tour);
            System.out.println("Tour"+tour.getTourName()+"Has added List");
        }
        else {
            System.out.println("Tour paketi rezerv olunub artiq.");
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
}
