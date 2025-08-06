package pl.coderslab.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ReservationServiceTest {

    // pola klasy aby były widoczne we wszytskich metodach
    ReservationHandler reservationHandlerMock;
    ReservationService reservationServiceMock;

    @BeforeEach
    void setUp() {
        reservationHandlerMock = mock(ReservationHandler.class);
        reservationServiceMock = new ReservationService(reservationHandlerMock);

    }

    @Test
    void processReservation_whenCanHandle() {
        Reservation reservation = new Reservation();
        when(reservationHandlerMock.canHandleReservation(reservation)).thenReturn(true);

        // testing process reservation
        Reservation result = reservationServiceMock.processReservation(reservation);

        assertEquals(ReservationService.ReservationStatus.CONFIRMED, result.getStatus());
        verify(reservationHandlerMock).prepare(reservation);
    }

}