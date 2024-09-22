import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Manish");
        list.add("Manish");
        list.add("Manish");
        list.add("Manish");
        list.add("Ramesh");
        list.add("Mahesh");
        list.add("Mahesh");
        list.add("Mahesh");
        list.add("Reena");
        list.add("Reena");
        list.add("Reena");
        list.add("Reena");
        list.add("Reena");
        list.add("Reena");
            list.add("Reena");



        Iterator<String> iterator = list.iterator();
        ListIterator<String> listIterator = list.listIterator();
        listIterator.add("Raven");

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}