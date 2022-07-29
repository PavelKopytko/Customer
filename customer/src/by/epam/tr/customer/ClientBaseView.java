package by.epam.tr.customer;

public class ClientBaseView {

	public void print(ClientBase base) {
		for (Customer customer : base.getCustomers()) {
			System.out.println("Surname name: " + customer.getSurname() + " " + customer.getName() + " credit card: "
					+ customer.getCreditCard());
		}
	}

	public void print(Customer customer) {
		System.out.println("Surname name: " + customer.getSurname() + " " + customer.getName() + " credit card: "
				+ customer.getCreditCard());
	}

}
