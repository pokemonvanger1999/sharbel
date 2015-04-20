package nl.utwente.di;

/**
 * Created by Miep on 20-4-2015.
 */
public class Quoter {

    public double getBookPrice(String a){
        int result = 0;
        if(a.equals("1")){
            result = 10;
        }
        if(a.equals("2")){
            result = 45;
        }
        if(a.equals("3")){
            result = 20;
        }
        if(a.equals("4")){
            result = 35;
        }
        if(a.equals("5")){
            result = 50;
        }
        return result;
    }
}
