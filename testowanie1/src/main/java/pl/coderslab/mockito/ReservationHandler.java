package pl.coderslab.mockito;

public class ReservationHandler {

    public boolean canHandleReservation(Reservation reserv) {
        if (reserv.getStatus() == ReservationService.ReservationStatus.PENDING) {
            return true;
        }
        return false;
    }

    public void prepare (Reservation reserv) {

    }
}
