public class VariablesAndNames
{
	public static void main( String[] args )
	{
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		double space_in_a_car, carpool_capacity, average_passengers_per_car;
		
		// number of cars available
		cars = 100;
		
		// how many people a car can hold
		space_in_a_car = 4.0;
		
		// how many drivers are available
		drivers = 30;
		
		// how many passengers there are
		passengers = 90;
		
		// cars that do not have a driver
		cars_not_driven = cars - drivers;
		
		// how many cars have drivers
		cars_driven = drivers;
		
		// how many people can be carpooled
		carpool_capacity = cars_driven * space_in_a_car;
		
		// average passengers per car
		average_passengers_per_car = passengers / cars_driven;
		
		
		System.out.println( "There are " + cars + " cars available." );
		System.out.println( "There are only " + drivers + " drivers available." );
		System.out.println( "There will be " + cars_not_driven + " empty cars today." );
		System.out.println( "We can transport " + carpool_capacity + " people today." );
		System.out.println( "We have " + passengers + " to carpool today." );
		System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
	}
}

// http://programmingbydoing.com/a/variables-and-names.html
// 1. the decimal is not necessary because there is only a whole number of seats in a car.
// 2. floating point means there can be fraction/decimals presented
// 3. comments inserted
// 4. got it.
// 5. got it.

// Exercise 9