/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tai.tran
 */
package com.mycompany.democolection;
import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args) {
		// Create a TreeMap object using the Person class that implements Comparable interface
		TreeMap<Person, String> treeMap = new TreeMap<>();
		// Add some key-value pairs to the TreeMap
		treeMap.put(new Person(2, "John"), "value1");
		treeMap.put(new Person(1, "Alice"), "value2");
		treeMap.put(new Person(3, "Bob"), "value3");

		// Iterate over the TreeMap and print the key-value pairs
		for (Map.Entry<Person, String> entry : treeMap.entrySet()) {
			Person key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key.getId() + " " + key.getName() + " " + value);
		}
	}
}

class Person implements Comparable<Person> {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// Implement the compareTo() method of the Comparable interface
	@Override
	public int compareTo(Person other) {
		return Integer.compare(this.id, other.getId());
	}
}
