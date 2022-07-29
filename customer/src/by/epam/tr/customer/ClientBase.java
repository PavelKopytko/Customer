package by.epam.tr.customer;

import java.util.ArrayList;

/*Создать второй класс, агрегирующий коллекцию типа Customer, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль*/

import java.util.List;
import java.util.Objects;

public class ClientBase {

	private List<Customer> customers;

	{
		customers = new ArrayList<Customer>();
	}

	public ClientBase() {
		super();
	}

	public ClientBase(List<Customer> customers) {
		super();
		this.customers = customers;
	}

	public void add(Customer customer) {
		customers.add(customer);
	}

	public boolean delete(String surname) {

		List<Customer> copy = new ArrayList<Customer>(customers);

		for (Customer cust : copy) {
			if (cust.getSurname().equalsIgnoreCase(surname)) {
				customers.remove(cust);
				return true;
			}
		}
		return false;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customers);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientBase other = (ClientBase) obj;
		return Objects.equals(customers, other.customers);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [customers=" + customers + "]";
	}

}
