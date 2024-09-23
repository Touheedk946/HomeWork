package Task_6HometaskAll;

import java.util.*;

public class CollectionsInterfaces {
    public static void main(String[] args) {
        // a) ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        // b) LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Fox");
        System.out.println("LinkedList: " + linkedList);

        // c) HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        System.out.println("HashMap: " + hashMap);

        // d) LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 1);
        linkedHashMap.put("B", 2);
        linkedHashMap.put("C", 3);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // e) HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Blue");
        hashSet.add("Green");
        System.out.println("HashSet: " + hashSet);

        // f) LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        linkedHashSet.add("JavaScript");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // g) TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Cat");
        treeSet.add("Bat");
        treeSet.add("Ant");
        System.out.println("TreeSet: " + treeSet);

        // h) TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        System.out.println("TreeMap: " + treeMap);
    }
}

