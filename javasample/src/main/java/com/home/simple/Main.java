package com.home.simple;

import java.util.Set;
import java.util.TreeSet;

import com.home.core.java.Customer;

public class Main {

	public static void main(String[] args) {

		Customer a = new Customer();
		a.setFirstName("Amit");
		a.setLastName("z");
		a.setId(1);

		Customer b = new Customer();
		b.setFirstName("Rahu");
		b.setLastName("X");
		b.setId(2);

		Customer c = new Customer();
		c.setFirstName("Deep");
		c.setLastName("S");
		c.setId(3);

		Customer d = new Customer();
		d.setFirstName("Seep");
		d.setLastName("P");
		d.setId(4);

		Set<Customer> list = new TreeSet<Customer>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);

		for (Customer cus : list) {
			System.out.println(cus.getId());
		}

	}

}
