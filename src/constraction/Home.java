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
public class Home extends RealEstate {
    
   int numberOfRoomsInsideHome;
   boolean hasGarage;
   
    public Home( String ID, String Name, double Surface,int numberOfrooms, boolean hasGarage) {
        super(ID, Name, Surface);
        
        
        if(numberOfRoomsInsideHome <= 0) {
            
        throw new IllegalArgumentException("Invalid"); //check the input validty
        
                  }
        
          this.numberOfRoomsInsideHome = numberOfrooms;
          this.hasGarage = hasGarage;
          
    }

    
    public int getNumberOfrooms() {
        return numberOfRoomsInsideHome;
    }

    
    public void setNumberOfRoomsInsideHome(int numberOfRoomsInsideHome) {
         if(numberOfRoomsInsideHome <= 0) {
            
        throw new IllegalArgumentException("Invalid"); //check the input validty
        
                  }
  
        this.numberOfRoomsInsideHome = numberOfRoomsInsideHome;
    }

    
    
    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        
        this.hasGarage = hasGarage;
    }

    @Override
    public String toString() {
        return "Home{" + "numberOfrooms=" + numberOfRoomsInsideHome + ", hasGarage=" + hasGarage + '}';
    }
  
    }
