package assignment_1.question_2;

public class Bus {
    private Seat[] seats;
    private int seatNumber;
    private int seatCount;
    private int vacantSeats;

    public Bus() {
        seatNumber = 0;
        seatCount = 14;
        vacantSeats = 14; // Default count
        seats = new Seat[vacantSeats];
    }

    public Bus(int numberOfSeats) {
        seatNumber = 0;
        seatCount = numberOfSeats;
        vacantSeats = numberOfSeats;
        seats = new Seat[numberOfSeats];
    }

    public boolean bookSeat(String passengerName) {
        if (vacantSeats > 0) {
            seats[seatNumber] = new Seat();
            seats[seatNumber].bookSeat(passengerName, seatNumber + 1);
            vacantSeats--;
            seatNumber++;
            return true;
        }
        return false;
    }

    public boolean bookSeat(String passengerName, String seatType) {
        if (bookSeat(passengerName)) {
            seats[seatNumber].setSeatType(seatType);
            return true;
        }
        return false;
    }

    public boolean bookSeats(String[] passengerName, int seatCount) {
        if (seatCount > vacantSeats) {
            return false;
        }
        for (String passenger : passengerName) {
            bookSeat(passenger);
        }
        return true;
    }

    public boolean unBookSeat(String passengerName) {
        Seat[] updatedSeats = new Seat[seatCount];
        boolean flag = false;
        int index = 0;
        for (Seat seat: seats
             ) {
            try {
                if (seat.getPassengerName().equals(passengerName)) {
                    seat.unBookSeat();
                    flag = true;
                } else {
                    updatedSeats[index] = seats[index];
                }
                index++;
            } catch (Exception e) {
                break;
            }
        }
        seats = updatedSeats;
        return flag;

    }

    public int getVacantSeats() {
        return vacantSeats;
    }

    public void showBookings() {
        for (Seat seat: seats
             ) {
            if (seat == null) break;
            System.out.println(seat);
        }
    }
}
