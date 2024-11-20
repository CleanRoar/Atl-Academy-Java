package OOP_Academy;

public class academy {

    public String name ;
    public String localAddress;


    public academy(String name, String localAddress) {
        this.name = name;
        this.localAddress = localAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    public void disPlayInfo(){
        System.out.println("Kursun adi :"+name+", Kursun unvani : "+localAddress);
    }
}
