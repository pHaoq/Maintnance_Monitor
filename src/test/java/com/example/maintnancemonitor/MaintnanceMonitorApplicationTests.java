package com.example.maintnancemonitor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MaintnanceMonitorApplicationTests {

    @Test
    void contextLoads() {
    }
    private MaintenanceController maintenanceMonitor=new MaintenanceController();

    String dMessage = "Everything operates as expected";
    @Test
    /**
     * checks the initial value of message
     */
    public void checktinit(){

        MaintenanceController controller = new MaintenanceController();

        try{
            Field message = MaintenanceController.class.getDeclaredField("message");
            message.setAccessible(true);
            assertEquals(message.get(controller),"Everything works as expected","The initial message should be: Everything works as expected");
        }catch (Exception e){
        }
    }
    @Test
    public void testsetMessage(){
        String message="New Message";
        maintenanceMonitor.setmessage(message);
        assertEquals(maintenanceMonitor.message(), message);
    }
    @Test
    public void testRest(){
        String rMessage="Some Message";
        maintenanceMonitor.setmessage(rMessage);
        maintenanceMonitor.reset();
        assertEquals(dMessage, maintenanceMonitor.message());
    }

    @Test
    public void testNull(){
        String nullMessage=null;
        maintenanceMonitor.setmessage(nullMessage);
        assertEquals(dMessage, maintenanceMonitor.message());
    }

    @Test
    public void testUpdate(){
        String iMessage="Intital Message";
        maintenanceMonitor.setmessage(iMessage);
        String uMessage="Updaed Message";
        maintenanceMonitor.setmessage(uMessage);
        assertEquals(uMessage, maintenanceMonitor.message());
    }

    @Test
    public void testResetWithoutsetMessage(){
        maintenanceMonitor.reset();
        assertEquals(dMessage, maintenanceMonitor.message());
    }

    @Test
    public void testResetWithdMessage(){
        maintenanceMonitor.setmessage(dMessage);
        maintenanceMonitor.reset();
        assertEquals(dMessage,maintenanceMonitor.message());
    }

}
