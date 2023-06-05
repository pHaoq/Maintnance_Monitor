package com.example.maintnancemonitor;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceControllerTest {
    private MaintenanceController maintenanceMonitor = new MaintenanceController();
    String sMessage = "Everything operates as expected";

    @Test
    /**
     * checks the initial value of message
     */
    public void checktinit() {

        MaintenanceController controller = new MaintenanceController();

        try {
            Field message = MaintenanceController.class.getDeclaredField("message");
            message.setAccessible(true);
            assertEquals(message.get(controller), "Everything works as expected", "The initial message should be: Everything works as expected");
        } catch (Exception e) {
        }
    }

    @Test
    public void testMessage() {
        String message = "New message";
        maintenanceMonitor.setmessage(message);
        assertEquals(maintenanceMonitor.message(), message);
    }

    @Test
    public void testReset() {
        String rMessage = "random message";
        maintenanceMonitor.setmessage((rMessage));
        maintenanceMonitor.reset();
        assertEquals(sMessage, rMessage);

    }

    @Test
    public void testUpdate() {
        String iMessage = "initial Message";
        maintenanceMonitor.setmessage(iMessage);
        String uMessage = "update Message";
        maintenanceMonitor.setmessage(uMessage);
        assertEquals(uMessage, maintenanceMonitor.message());
    }

    @Test
    public void testNull() {
        String nMessage = null;
        maintenanceMonitor.setmessage(nMessage);
        assertEquals(sMessage, maintenanceMonitor.message());
    }

    @Test
    public void testResetWithoutsetMessage() {
        maintenanceMonitor.reset();
        assertEquals(sMessage, maintenanceMonitor.message());
    }

    public void testRestWithsMessage() {
        maintenanceMonitor.setmessage(sMessage);
        maintenanceMonitor.reset();
        assertEquals(sMessage, maintenanceMonitor.message());
    }


}