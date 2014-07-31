
public class Basics {
	private static int totalSeatsAvailable=2;public void func(int seats) {
		//BusReservation br = new BusReservation();
		//PassengerThread pt = (PassengerThread) Thread.currentThread();

		
		if (seats>this.getTotalSeatsAvailable()) {
		System.out.println("SOrry");
		} else {totalSeatsAvailable = totalSeatsAvailable-seats;System.out.println(totalSeatsAvailable);System.out.println("YESSSS");
		}
		}
		private int getTotalSeatsAvailable() {
			System.out.println(totalSeatsAvailable);
		return totalSeatsAvailable;
		}
		}