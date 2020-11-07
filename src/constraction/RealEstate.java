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
public class RealEstate {
    private String buildingID;
    private String buildingName;
    private double surfcae;

    
    public RealEstate(String id, String name, double surfcae) {
         this.buildingName = name;

        if(buildingID == null) {
        throw new IllegalArgumentException("Invalid"); //check the input validty
        }
        
         this.buildingID = id;
        
        if(surfcae <= 0) {
        throw new IllegalArgumentException("Invalid"); //check the input validty
        }
        
         this.surfcae = surfcae;
         
        }

    public String getbuildingID() {
        return buildingID;
    }

    public void setbuildingID(String id) {
        
        if(buildingID == null) {
        throw new IllegalArgumentException("Invalid"); //check the input validty
        }
        
        this.buildingID = id;
    }

    public String getbuildingName() {
        return buildingName;
    }

    public void setbuildingName(String name) {
        
        if(buildingName == null){
            
        throw new IllegalArgumentException("Invalid"); //check the input validty
       
        }
        
        this.buildingName = name;
    }

    public double getSurfcae() {
        return surfcae;
    }

    public void setSurfcae(double surfcae) {
        
        if(surfcae <= 0) {
        throw new IllegalArgumentException("Invalid"); //check the input validty
        
        }
        
        this.surfcae = surfcae;
    }

    @Override
    public String toString() {
        return "RealEstate{" + "buildingID=" + buildingID + ", buildingName=" + buildingName + ", surfcae=" + surfcae + '}';
    }
    
}

    

