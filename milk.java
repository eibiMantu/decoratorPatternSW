public class milk extends coffeeDecorator {
	public milk(coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Milk";
	}

	@Override
	public double getCost() {
		return super.getCost() + 25.00;
	}
}
