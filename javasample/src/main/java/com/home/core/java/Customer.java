package com.home.core.java;

public class Customer implements Comparable<Customer> {
	private String firstName;
	private String lastName;
	private int id;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			Customer customer = (Customer) obj;
			if (this.id == customer.id
					&& this.firstName.equalsIgnoreCase(customer.firstName)
					&& this.lastName.equalsIgnoreCase(customer.lastName)) {
				return true;
			}
			return false;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hash = 56;
		hash = hash * this.id + this.firstName.hashCode();
		hash = hash * this.id + this.lastName.hashCode();
		System.out.println(hash);
		return hash;
	}

	public int compareTo(Customer o) {
		return this.lastName.compareToIgnoreCase(o.lastName);
	}

}
