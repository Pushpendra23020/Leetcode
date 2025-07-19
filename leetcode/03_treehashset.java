//treehashset
import java.util.HashSet;
import java.util.Set;
class Practise {
    public static void main(String[] args) {
        Set<String> treeSet = new HashSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");

        for (String fruit : treeSet) {
            System.out.println(fruit);
        }
    }
}   

