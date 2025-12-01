public abstract class coffeeDecorator implements coffee {
	protected coffee coffee;

	public coffeeDecorator(coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		return coffee.getDescription();
	}

	@Override
	public double getCost() {
		return coffee.getCost();
	}
}
