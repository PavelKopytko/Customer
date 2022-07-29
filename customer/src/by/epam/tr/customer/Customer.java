package by.epam.tr.customer;

import java.util.Objects;

/*Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета*/

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String adress;
	private long creditCard;
	private long bankAccount;

	public Customer() {
		super();
	}

	public Customer(int id, String surname, String name, long creditCard, long bankAccount) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.creditCard = creditCard;
		this.bankAccount = bankAccount;
	}

	public Customer(int id, String surname, String name, long creditCard) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.creditCard = creditCard;
	}

	public Customer(int id, String surname, String name, String patronymic, long creditCard, long bankAccount) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.creditCard = creditCard;
		this.bankAccount = bankAccount;
	}

	public Customer(int id, String surname, String name, String patronymic, String adress, long creditCard,
			long bankAccount) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.adress = adress;
		this.creditCard = creditCard;
		this.bankAccount = bankAccount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public long getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(long creditCard) {
		this.creditCard = creditCard;
	}

	public long getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(long bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(adress, bankAccount, creditCard, id, name, patronymic, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(adress, other.adress) && bankAccount == other.bankAccount
				&& creditCard == other.creditCard && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(patronymic, other.patronymic) && Objects.equals(surname, other.surname);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic="
				+ patronymic + ", adress=" + adress + ", creditCard=" + creditCard + ", bankAccount=" + bankAccount
				+ "]";
	}

}
