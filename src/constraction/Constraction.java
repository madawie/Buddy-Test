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
public class Constraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       //create home array to contains homes
       ArrayList <Home> homes  = new  ArrayList <Home> ();
       
       //create home objects and include them in Home array
       Home home1 = new Home("H1234","HM01",350,5,false);
       Home home2 = new Home("H1235","HM02",425,6,true);
       homes.add(home1);
       homes.add(home2);
       
       
       //create Apartment array to contains appartments
       ArrayList <Apartment> appartments  = new  ArrayList <Apartment> ();
 
       
       //create Apartment objects and include them in Apartment array
       Apartment aprtment1 = new Apartment("A1234","APP01",125,3,1,1);
       Apartment aprtment2 = new Apartment("A1236","APP03",200,4,3,2);
       Apartment aprtment3 = new Apartment("A1236","APP03",200,4,3,2);
      
       appartments.add(aprtment1);
       appartments.add(aprtment2);
   
       
       // create building objects to contains apartments
       Building building = new Building("Buliding1", "HJ",250,appartments);

       // display the largest apartment in the building
       System.out.println("the largest apartment in the building is : "+ largestApartment(building).getbuildingName());
       
       // display the number of appartment in floor 1
       System.out.println("Number of appartment in floor 1 is : "+ numberOfApartmentsInFloor(building,1));
       
       // display the number of appartment in floor 2 
       System.out.println("Number of appartment in floor 2 is : "+ numberOfApartmentsInFloor(building,2));
        
    }
    
    
        public static Apartment largestApartment(Building building) {
        
        ArrayList<Apartment> apartments = building.getBuildingApartments();

        Apartment largestApartment=building.getBuildingApartments().get(0);
            double largestSurface= largestApartment.getSurfcae(); 
            double currentSurface;


        for (int i = 1; i< building.getNumberOfAppartments();i++)   {

                currentSurface = apartments.get(i).getSurfcae(); 

           if (currentSurface >largestSurface) {
                largestSurface=currentSurface;
                largestApartment= apartments.get(i);
                               }

            else if (currentSurface == largestSurface)  {

           if (apartments.get(i).getNumberOfRooms() >largestApartment.getNumberOfRooms())
               largestApartment=apartments.get(i);

           
            else if (apartments.get(i).getNumberOfRooms()==largestApartment.getNumberOfRooms())    {
                
                
                int currentApartmnet_Number= apartments.get(i).getApartmentNumber();
                int LargestApartmnet_Number= largestApartment.getApartmentNumber();

                
           if (currentApartmnet_Number < LargestApartmnet_Number) 
               largestApartment = apartments.get(i);
                               }                    
                           }   
                       }

               return largestApartment;  

            }

    public static int numberOfApartmentsInFloor (Building building, int floorNumber)    {
        
        ArrayList <Apartment> apartments = building.getBuildingApartments();
        
        int NumberOfApartmnets = 0;
        
        for (int i = 0; i<building.getNumberOfAppartments();i++)    {
            Apartment currentApartment = apartments.get(i);
            
            if (currentApartment.getFloorNumber()==floorNumber)
                NumberOfApartmnets++;  
        }
        
     return NumberOfApartmnets;
     
    }
}


