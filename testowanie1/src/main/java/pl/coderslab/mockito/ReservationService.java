package pl.coderslab.mockito;

public class ReservationService {

    public enum ReservationStatus {
        PENDING,
        CONFIRMED,
        REJECTED
    }

    private final ReservationHandler reservationHandler;

    public ReservationService(ReservationHandler reservationHandler) {
        this.reservationHandler = reservationHandler;
    }

    public Reservation processReservation(Reservation reservation) {
        if (reservationHandler.canHandleReservation(reservation)) {
            reservationHandler.prepare(reservation);
            reservation.setStatus(ReservationStatus.CONFIRMED);
        } else {
            reservation.setStatus(ReservationStatus.REJECTED);
        }
        return reservation;
    }
}

