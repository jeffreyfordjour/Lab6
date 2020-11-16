/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frys
 */
public class Month {
    private int monthNumber;
    
    public Month() {
      monthNumber = 1;
    }
    
    public Month(int monthNumber) {
      if(monthNumber < 1 || monthNumber > 12) {
          this.monthNumber = 1;
      } else {
          this.monthNumber = monthNumber;
      }
    }
    
    public Month(String month) {
      switch(month.toLowerCase()) {
            case "january":
                this.monthNumber = 1;
                break;
            case "february":
                this.monthNumber = 2;
                break;
            case "march":
                this.monthNumber = 3;
                break;
            case "april":
                this.monthNumber = 4;
                break;
            case "may":
                this.monthNumber = 5;
                break;
            case "june":
                this.monthNumber = 6;
                break;
            case "july":
                this.monthNumber = 7;
                break;
            case "august":
                this.monthNumber = 8;
                break;
            case "september":
                this.monthNumber = 9;
                break;
            case "october":
                this.monthNumber = 10;
                break;
            case "november":
                this.monthNumber = 11;
                break;
            case "december":
                this.monthNumber = 12;
                break;
            default:
                this.monthNumber = 1;
                break;
      }
    }
    
    public void setMonthNumber(int monthNumber) {
         if(monthNumber < 1 || monthNumber > 12) {
              this.monthNumber = 1;
          } else {
              this.monthNumber = monthNumber;
          }
    }
    
    public int getMonthNumber() {
       return monthNumber;
    }
    
    public String getMonthName(int month) {
      switch(month) {
            case 1:
                return "january";
                
            case 2:
                return "february";
               
            case 3:
                return "march";
                
            case 4:
                return "april";
                
            case 5:
                return "may";
                
            case 6:
                return "june";
                
            case 7:
                return "july";
                
            case 8:
                return "august";
                
            case 9:
                return "september";
              
            case 10:
                return "october";
                
            case 11:
                return "november";
                
            case 12:
                return "december";
              
            default:
                return "january";
               
      }
     
    }
    public String toString(int month) {
        return getMonthName(month);
    }
    
    public boolean equals(Month month) {
       return month.getMonthNumber() == monthNumber;
    }
    
    public boolean greaterThan(Month month) {
       return month.getMonthNumber() < monthNumber;
    }
    
    public boolean lessThan(Month month) {
       return month.getMonthNumber() > monthNumber;
    }
    
}
