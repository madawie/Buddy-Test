/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constraction;

/**
 *
 * @author madawi
 */
public class Apartment extends RealEstate {
     int numberOfRooms;
     int apartmentNumber;
     int floorNumber;

     
    public Apartment( String ID, String Name, double Surface,int numberOfRooms, int number, int floorNumber) {
        super(ID, Name, Surface);   
        
        
        if (numberOfRooms <= 0) {
        throw new IllegalArgumentException("Invalid"); //check the input validty
        }
         this.numberOfRooms = numberOfRooms;
         
         
         if (apartmentNumber <= 0) {
        throw new IllegalArgumentException("Invalid"); //check the input validty
        }
         this.apartmentNumber = number;
         
         
         if (floorNumber <= 0) {
        throw new IllegalArgumentException("Invalid"); //check the input validty
        }
          this.floorNumber = floorNumber;  
         
        }
    
    

    public void setNumberOfRooms(int numberOfRooms) {
        
        if (numberOfRooms <= 0) {
        throw new IllegalArgumentException("Invalid"); //check the input validty
                }
        
         this.numberOfRooms = numberOfRooms;
     
        }
    

    public void setApartmentNumber(int number) {
        
         if (apartmentNumber <= 0) {
        throw new IllegalArgumentException("Invalid"); //check the input validty
                 }
         
         this.apartmentNumber = number;
        }
    
    

    public void setFloorNumber(int floorNumber) {
        
         if (floorNumber <= 0) {
        throw new IllegalArgumentException("Invalid"); //check the input validty
                  }

        this.floorNumber = floorNumber;
        }
    
    

    public int getNumberOfRooms() {
        return numberOfRooms;
        }

    public int getApartmentNumber() {
        return apartmentNumber;
        }

    public int getFloorNumber() {
        return floorNumber;
        }

    @Override
    public String toString() {
        return "Apartment{" + "numberOfRooms=" + numberOfRooms + ", number=" + apartmentNumber + ", floorNumber=" + floorNumber + '}';
        }
     
    }
