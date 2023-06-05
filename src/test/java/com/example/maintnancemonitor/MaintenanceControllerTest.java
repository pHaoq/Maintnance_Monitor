package com.example.maintnancemonitor;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceControllerTest {

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

}