package org.project;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableProg {


    public static void main(String[] args) {
        List<compareName> al = new ArrayList<compareName>();
        al.add(new compareName("Jasm"));
        al.add(new compareName("All"));
        al.add(new compareName("Man"));
        Collections.sort(al);
        System.out.println(al);
        /*for(compareName temp:al) {
            System.out.println(temp.toString());
        }*/
        }
}

class compareName implements Comparable<compareName> {

    private final String  name;

    public compareName(String name) {
        super();
        this.name = name;
    }

    @Override
    public int compareTo(compareName o) {
        if (o.name.length() == name.length()) {
            return 0;
        } else if (o.name.length() > name.length()) return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return name;
    }

}
