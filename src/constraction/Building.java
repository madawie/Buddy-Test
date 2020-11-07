/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constraction;

import java.util.ArrayList;

/**
 *
 * @author madawi
 */
public class Building extends RealEstate {
    
    private ArrayList<Apartment> buildingApartments;

    public Building(String id, String name, double surface ,ArrayList<Apartment> apartments) {
        super(id, name, surface);
        
        if(buildingApartments == null){
            
        throw new IllegalArgumentException("Invalid"); //check the input validty
        
                  }
        
        this.buildingApartments = apartments;
    }
    public int getNumberOfAppartments(){
       return buildingApartments.size();
    }

    public ArrayList<Apartment> getBuildingApartments() {
        return buildingApartments;
    }

    public void setApartments(ArrayList<Apartment> apartments) {
        
         if(buildingApartments == null){
            
        throw new IllegalArgumentException("Invalid"); //check the input validty
        
                  }
         
        this.buildingApartments = apartments;
    }

    @Override
    public String toString() {
        return "Building{" + "apartments=" + buildingApartments + '}';
    }
    
}


