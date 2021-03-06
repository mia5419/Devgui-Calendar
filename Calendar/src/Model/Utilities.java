package Model;

import java.util.GregorianCalendar;

/**
 * 
 * @author Kristian
 */
public class Utilities {
    protected static GregorianCalendar todaysDate = new GregorianCalendar();
    
    /**
     * Boolean that evaluates whether the input day is a specific day
     * relative to today. Offset decides which day in relation to 
     * todays date. So for example offset = 0 would mean it checks if tobeCompared
     * is today
     * @param toBeCompared Date to be compared
     * @param offset Number of days added or removed from todays day.
     * @return 
     */
    protected static boolean isSpecficDay(GregorianCalendar toBeCompared, int offset){
        
        //Last day of the year is a special case
        if(todaysDate.get(GregorianCalendar.DAY_OF_YEAR) == 365){
            return (offset == toBeCompared.get(GregorianCalendar.DAY_OF_YEAR) && todaysDate.getTime().getYear() == toBeCompared.getTime().getYear());
        }
        return (todaysDate.get(GregorianCalendar.DAY_OF_YEAR)+offset == toBeCompared.get(GregorianCalendar.DAY_OF_YEAR) && todaysDate.getTime().getYear() == toBeCompared.getTime().getYear());     
    }
    
    /**
     * Returns true if the date to be checked is in the intervall between
     * the current time and 23:59:59 on the following sunday.
     * @param toBeCompared Date that is to be checked
     * @return True or false depending on whether its in the intervall or not
     */
    protected static boolean isThisWeek(GregorianCalendar toBeCompared){
        int day_of_week = todaysDate.get(GregorianCalendar.DAY_OF_WEEK)-1;
        switch(day_of_week){
            default:
                return isSpecficDay(toBeCompared,0) || isSpecficDay(toBeCompared,1)|| isSpecficDay(toBeCompared,2)|| isSpecficDay(toBeCompared,3)|| isSpecficDay(toBeCompared,4)|| isSpecficDay(toBeCompared,5)|| isSpecficDay(toBeCompared,6);
            case 2:
                return isSpecficDay(toBeCompared,0) || isSpecficDay(toBeCompared,1)|| isSpecficDay(toBeCompared,2)|| isSpecficDay(toBeCompared,3)|| isSpecficDay(toBeCompared,4)|| isSpecficDay(toBeCompared,5);
            case 3:
                return isSpecficDay(toBeCompared,0) || isSpecficDay(toBeCompared,1)|| isSpecficDay(toBeCompared,2)|| isSpecficDay(toBeCompared,3)|| isSpecficDay(toBeCompared,4);
            case 4:
                return isSpecficDay(toBeCompared,0) || isSpecficDay(toBeCompared,1)|| isSpecficDay(toBeCompared,2)|| isSpecficDay(toBeCompared,3);
            case 5:
                return isSpecficDay(toBeCompared,0) || isSpecficDay(toBeCompared,1)|| isSpecficDay(toBeCompared,2);
            case 6:
                return isSpecficDay(toBeCompared,0) || isSpecficDay(toBeCompared,1);
            case 7:
                return isSpecficDay(toBeCompared,0);
                
        }
    }
    
    /**
     * Converts the input value (fahrenheit) to corresponding celcius value
     * @param fah
     * @return Celcius value of the corresponding input value
     */
    protected static int fahrenheitToCelcius(int fah){  
        int celcius = (int)(((double)fah-(double)32)/1.8);
        return celcius;
    }
}

