package Additional;

public class Main {
    public static void main(String[] args) {
        Address myAddr = new Address();
        myAddr.setIndex(38100);
        myAddr.setCountry("Ukraine");
        myAddr.setCity("Poltava");
        myAddr.setStreet("Zugina");
        myAddr.setHouse("32B");
        myAddr.setApartment("11B");
        System.out.println(myAddr.getIndex() + ", " +
                myAddr.getCountry() + ", " +
                myAddr.getCity() + ", " +
                myAddr.getStreet() + ", " +
                myAddr.getHouse() + ", " +
                myAddr.getApartment()
        );

    }
}