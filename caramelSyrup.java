public class caramelSyrup extends coffeeDecorator {
	public caramelSyrup(coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Caramel Syrup";
	}

	@Override
	public double getCost() {
		return super.getCost() + 40.00;
	}
}
