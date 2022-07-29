package by.epam.tr.customer;

public class Main {

	public static void main(String[] args) {

		ClientBase base = new ClientBase();

		ClientBaseLogic logic = new ClientBaseLogic();

		ClientBaseView view = new ClientBaseView();

		base.add(new Customer(1, "Ivanov", "Ivan", 1234_4560));
		base.add(new Customer(2, "Petrovich", "Petr", 4441_9654));
		base.add(new Customer(3, "Petrov", "Petr", 4441_9655));
		base.add(new Customer(4, "Kupriyanov", "Alexandr", 7841_4560));
		base.add(new Customer(5, "Pavlov", "Semen", "Semenovich", 4000_5687, 55555555));

		System.out.println("Sorted alphabetically");

		ClientBase alphabetting = logic.alphabetingSort(base);
		view.print(alphabetting);

		System.out.println("\nBase with credit card in interval");

		ClientBase intervalByCredit = logic.creditInterval(base, 4000_5687, 4441_9656);
		view.print(intervalByCredit);

	}

}
