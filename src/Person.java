public class Person {


    private   String name;
    private String surname;
    private int countTickets;

    public String getSurname() {
        return surname;
    }

    public int getCountTickets() {
        return countTickets;
    }
    public  String getName() {
        return name;
    }
    public void lowCountTickets() {
        countTickets--;
    }



    public Person(String name, String surname, int countTickets) {

        this.name = name;
        this.surname = surname;
        this.countTickets = countTickets;
    }
}
