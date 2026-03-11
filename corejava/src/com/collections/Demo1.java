package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {
	public static void main(String args[]) {
		Collection<String> m = new ArrayList<>();
		m.add("hardik");
		m.add("Abhshiek");
		m.add("bhuvi");
		m.add("yuvi");

		System.out.println(m);

		Collection<String> f = new ArrayList<>();

		f.add("smriti");
		f.add("harlen");
		f.add("harman");
		f.add("prathika");

		System.out.println(f);

		Collection<String> cricketers = new ArrayList<>();

		cricketers.addAll(m);
		cricketers.addAll(f);
		cricketers.removeAll(m);
		System.out.println(cricketers);
		System.out.println(cricketers.containsAll(f));
		System.out.println(cricketers);

	}

}
