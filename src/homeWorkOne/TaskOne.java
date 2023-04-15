package homeWorkOne;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        hashSet.add(9);
        Collections.addAll(hashSet, 1,4,5,6,7,8,4,3,2,45,6,4,3,2,4);
        Collections.addAll(linkedHashSet, 1,5,6,7,8,4,3,2,45,6,4,3,2,4);
        Collections.addAll(treeSet, 1,5,6,7,8,4,3,2,45,6,4,3,2,4);
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
        Set<String> hashSetString = new HashSet<>();
        Set<String> linkedHashSetString = new LinkedHashSet<>();
        Set<String> treeSetString = new TreeSet<>();
        Collections.addAll(hashSetString, "a","s","d","e","a","s","d","e","w","we","p","w","we","p");
        Collections.addAll(linkedHashSetString, "a","s","d","e","a","s","d","e","w","we","p","w","we","p");
        Collections.addAll(treeSetString, "a","s","d","e","A","s","D","e","w","we","p","w","we","p","%","9");
        System.out.println(hashSetString);
        System.out.println(linkedHashSetString);
        System.out.println(treeSetString);
    }
}

