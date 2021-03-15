package assignment_1.question_2;

public class Runner {
    public static void main(String[] args) {
        Bus bus = new Bus();

        if (bus.bookSeat("Sikander")) {
            System.out.println("Seat booked successfully");
        }
        if (bus.bookSeat("Ahmed")) {
            System.out.println("Seat booked successfully");
        }


        System.out.println(bus.getVacantSeats());

        bus.showBookings();

        System.out.println(bus.unBookSeat("Ahmed"));

        bus.showBookings();
    }
}
