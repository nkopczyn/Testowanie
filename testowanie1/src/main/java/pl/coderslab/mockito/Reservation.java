package pl.coderslab.mockito;

public class Reservation {
    public ReservationService.ReservationStatus status;

    public Reservation() {
        this.status = ReservationService.ReservationStatus.PENDING;
    }

    public ReservationService.ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationService.ReservationStatus status) {
        this.status = status;
    }
}
