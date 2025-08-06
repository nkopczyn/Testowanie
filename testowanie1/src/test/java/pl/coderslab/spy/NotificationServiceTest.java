package pl.coderslab.spy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

class NotificationServiceTest {

    @Test
    void notifyUser() {
        NotificationService notifServSpy = spy(NotificationService.class);
        notifServSpy.notifyUser("user123", "notifying");

        verify(notifServSpy).sendEmail("user123@example.com", "notifying");


    }
}
