/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js.pkg09;

/**
 *
 * Created by 21343002_Aini Rizkina
 */
public class ElevatorTest {
    public static void main(String[] args) {
         Elevator myElevator = new Elevator();
         myElevator.openDoor();
         myElevator.closeDoor();
         myElevator.goUp();
         myElevator.goUp();
         myElevator.goUp();
         myElevator.openDoor();
         myElevator.closeDoor();
         myElevator.goDown();
         myElevator.openDoor();
         myElevator.closeDoor();
         myElevator.goDown();
         myElevator.setFloor(myElevator.TOP_FlOOR);
         myElevator.openDoor();    
    } 
}
