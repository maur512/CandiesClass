import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Candy> present = new ArrayList<Candy>();

        SweetCandy alenka = new SweetCandy("Alenka",8.1,30);
        SweetCandy mishka = new SweetCandy("mishka",4.1,20);
        SourCandy pompa = new SourCandy("pompa",6.1,40);
        SourCandy dupa = new SourCandy("dupa",2.1,50);

        present.add(alenka);
        present.add(mishka);
        present.add(pompa);
        present.add(dupa);

        double total_weight = 0;
        for(Candy c : present) {
            total_weight += c.getWeight();
        }
        System.out.println(total_weight);
        System.out.println("Candy до сортировки: ");
        System.out.println(present.toString());
        Collections.sort(present);
        System.out.println("Candy после сортировки по весу: ");
        System.out.println(present.toString());
        int shugar_search = 40;
        for (Candy c : present) {
            if(c.getShugar() == shugar_search) {
                System.out.println("Конфета по сахару с значением \"" + shugar_search + "\":");
                System.out.println(c.toString());
            }
        }
    }
}