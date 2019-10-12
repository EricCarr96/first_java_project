
import javax.swing.JOptionPane;

 class Car{
 
 int carCylinder;
 String carType;
 int yearMade;

    {
     
    }
 
 
 int carCylinderGet(){
     return carCylinder;
     
 }
     String carTypeGet(){
         
         return carType;
     
   }
    
     int yearMadeGet(){
         
         return yearMade;
         
     }
     
    void carCylinderSet(int carCylinderReturned){
    carCylinder = carCylinderReturned;
    }
    void carTypeSet(String carTypeReturned){
    carType = carTypeReturned;
    }
    
     void yearMadeSet(int yearMadeReturned){
     yearMade = yearMadeReturned;
     }
    
     
     
     
     Car(int carCylinderInitialize, String carTypeInitialize, int yearMadeInitialize){
         
         carCylinder = carCylinderInitialize;
         carType = carTypeInitialize;
         yearMade = yearMadeInitialize;
     
     
     }

    
  
    
     
     
     
     
 
 }
 
 

public class Sample1 {
    static double calculateAveSales(){
    int count=0;
    double productPrice, totalProductPrice=0.0,salesAve;
    String moreItems="y";
    
    while(moreItems.equalsIgnoreCase("y")){
    
    productPrice= Double.parseDouble(JOptionPane.showInputDialog("Please provide product price"));
    
    totalProductPrice=totalProductPrice+productPrice;
    count++;
    
    moreItems=JOptionPane.showInputDialog("Do you have any more items?");
            
    
    
    }
    
    salesAve=totalProductPrice/count;
    return salesAve;
    }
    
    static double calculateProductShippingCost(){
    int count=0;
    double productShippingCost, totalProductShippingCost=0.0;
    String moreShipping="y";
    
    while(moreShipping.equalsIgnoreCase("y")){
    
    productShippingCost= Double.parseDouble(JOptionPane.showInputDialog("Please provide product shipping cost"));
    
    totalProductShippingCost=totalProductShippingCost+productShippingCost;
    
    
    moreShipping=JOptionPane.showInputDialog("Do you have any more items?");
            
    
    }
    
    
    
        
    return totalProductShippingCost;
    
    }

    public static void main(String[] args) {
        
        
    //Defined variables
    
        int carCylinderInitialize;
        String carTypeInitialize;
        int yearMadeInitialize;
        String placeHolder, outputMessage;
        double salesAve, totalProductShippingCost;
        
        Car car[]= new Car[100];
        
        for(int i=0; i<5; i++){
            
         carCylinderInitialize=0;
         carTypeInitialize="";
         yearMadeInitialize=0;
        
        //Asked the questions to the user
        while(carCylinderInitialize <2 || carCylinderInitialize >10){
            placeHolder=JOptionPane.showInputDialog("Please provide number of Cylinder's in car: "+i);
           if(placeHolder.matches("\\d+")) carCylinderInitialize = Integer.parseInt(placeHolder);
        }
        
        
        while(carTypeInitialize.isEmpty()){
        carTypeInitialize = JOptionPane.showInputDialog("Please provide Car type: "+i);
        }
        
        
        while(yearMadeInitialize <1980 || yearMadeInitialize >2020){
            placeHolder=(JOptionPane.showInputDialog("Please provide Year make: "+i));
            if(placeHolder.matches("\\d+"))yearMadeInitialize = Integer.parseInt(placeHolder);
        }
        
          car[i] = new Car(carCylinderInitialize,carTypeInitialize, (int) yearMadeInitialize);
            
        //Program Output
        
        System.out.println("Product" +i +" ID: "+ car[i].carCylinderGet());
        System.out.println("Product" +i + " Name: "+ car[i].carTypeGet());
        System.out.println("Product" +i + " Price: "+ car[i].yearMadeGet());
        }
        
        

        salesAve= calculateAveSales();
       totalProductShippingCost= calculateProductShippingCost();
       
       
       if(salesAve > 2000)
       {outputMessage="Significant Revenue";}
       else
       {outputMessage="";}
       
       
       JOptionPane.showMessageDialog(null, "Sales Average: "+ salesAve+"\n"+ 
                                                  outputMessage+ "\n"+
                                                     "Total Shipping cost: "+totalProductShippingCost);
    }
    
}

