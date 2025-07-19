// linkedset
import java.util.LinkedHashSet;
import java.util.Set;
class Practise {
    public static void main(String[] args) {
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Apple");
        linkedSet.add("Banana");
        linkedSet.add("Cherry");
        for (String fruit : linkedSet) {
            System.out.println(fruit);
        }
    }
}


