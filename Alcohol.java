package project;


 public class Alcohol extends Beverage
{
    
   private boolean isWeekend ;
   
   private final double WEEKEND_FEE = .6 ;
   
    
   //constructors for the code
   public Alcohol( String n , SIZE s , boolean iw ) 
    {
            super ( n , TYPE.ALCOHOL, s ) ; 
            
           
            isWeekend =iw ;
    }
    
  public String toString () 
   {
          String s = getBevName( ) +" ,  " +getSize() ;
            
          if (isWeekend )
            {
                   s += " Weekend " ;
                   
           }
            
           s += ", $ " +calcPrice() ;
            
           return s ;
   }
   
   public boolean equals (Alcohol a) 
    {
         if (super.equals(a) && isWeekend == a.getIsWeekend() ) 
         {
                 return true ;
         }
          else 
         {
                return false ;
         }
    }
    public double calcPrice () 
    
 {
          double price = super.getBasePrice() ;
          
          
            
           if (super.getSize() == SIZE.MEDIUM )
         {
                    price += super.getSizePrice( ) ;
                    
                    
         }
          else if (super.getSize( ) == SIZE.LARGE)
         {
                price += 2 * super.getSizePrice( ) ;
                
         }
            
          if ( isWeekend )
          {
               price += WEEKEND_FEE ;
          }
            
          return price ; 
   
 }
    
 public boolean getIsWeekend() 
   
    {
	 
         return isWeekend ;
            
    }
   
 public double getWeekendFee( ) 
  {
     return WEEKEND_FEE ;
     
  }
    
    public void setIsWeekend(boolean is ) 
    {
            isWeekend = is ;
            
    }
}