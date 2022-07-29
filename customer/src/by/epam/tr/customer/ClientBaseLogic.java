package by.epam.tr.customer;

/*Найти и вывести: 
 * a) список покупателей в алфавитном порядке; 
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

import java.util.List;

public class ClientBaseLogic {

	public ClientBase alphabetingSort(ClientBase base) {

		List<Customer> alphabeting = base.getCustomers();

		boolean sorted = false;

		while (!sorted) {
			sorted = true;

			for (int i = 0; i < base.getCustomers().size() - 1; i++) {
				if (alphabeting.get(i).getSurname().compareToIgnoreCase(alphabeting.get(i + 1).getSurname()) > 0) {
					Customer temp = alphabeting.get(i);
					alphabeting.set(i, alphabeting.get(i + 1));
					alphabeting.set(i + 1, temp);
					sorted = false;

				}
			}
		}

		return new ClientBase(alphabeting);

	}

	public ClientBase creditInterval(ClientBase base, long a, long b) {

		ClientBase interval = new ClientBase();

		for (Customer customer : base.getCustomers()) {
			if (customer.getCreditCard() >= a && customer.getCreditCard() <= b) {
				interval.add(customer);
			}
		}

		return interval;

	}

}
