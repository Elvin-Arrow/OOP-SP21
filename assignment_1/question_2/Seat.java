package assignment_1.question_2;

public class Seat {
    private String passengerName;
    private String seatType;
    private boolean bookingStatus;
    private int seatNumber;

    public Seat() {

    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public void bookSeat(String passengerName, int seatNumber) {
        this.passengerName = passengerName;
        this.seatNumber = seatNumber;
        bookingStatus = true;
        setSeatType("NON-SMOKING");
    }

    public boolean unBookSeat() {
        this.bookingStatus = false;

        return true;
    }

    public boolean isBookingStatus() {
        return bookingStatus;
    }

    public String getPassengerName() {
        return passengerName;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "passengerName='" + passengerName + '\'' +
                ", seatType='" + seatType + '\'' +
                ", bookingStatus=" + bookingStatus +
                ", seatNumber=" + seatNumber +
                '}';
    }
}
