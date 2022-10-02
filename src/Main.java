import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {


        public static List<Person> generateClients () {
            List<Person> persons = new ArrayList<>();
            persons.add(new Person("Petya", "Zaycev", 5));
           persons.add(new Person("Nadya", "Moroz", 2));
            persons.add(new Person("Misha", "Vetrov", 1));
            persons.add(new Person("Oksana", "Tihaya", 5));
            persons.add(new Person("Vika", "Volnaya", 4));




            return persons;
        }

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        List<Person> everyone = generateClients();
        for (Person person : everyone) {
            queue.offer(person);
        }

        while (!queue.isEmpty()) {
            Person person =  queue.poll();
            System.out.println(person.getName() + " " + person.getSurname() + " прокатился на карусели");
            person.lowCountTickets();
            if(person.getCountTickets() > 0) {
                queue.offer(person);

            }

        }
    }


}
