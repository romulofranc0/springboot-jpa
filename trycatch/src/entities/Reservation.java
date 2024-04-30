package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    private Date checkOut;

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkin, Date checkout) {

        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new IllegalArgumentException("Reservation dates for update must be future dates");
        }
        if (!checkOut.after(checkIn)) {
            throw new IllegalArgumentException("check-out must be after check-in date");
        }

        this.checkIn = checkin;
        this.checkOut = checkout;
       
    }

    @Override
    public String toString() {
        return "Room: "
                + roomNumber
                + ", check-in date: "
                + sdf.format(checkIn)
                + ", check-out date: "
                + sdf.format(checkOut)
                + ", total days: "
                + duration()
                + " Nights.";
    }

}
