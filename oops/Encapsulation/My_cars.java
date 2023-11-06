package oops.Encapsulation;

public class My_cars{
    private String carname;   // Access modifiers
    private String brandname;
    private int mf_date;

    public void setCarname(String carname){   // setters
        this.carname=carname;
    }
    public void setBrandname(String brandname){
        this.brandname=brandname;
    }
    public void setMf_date(int mf_date){
        this.mf_date=mf_date;
    }
    public String getCarname(){              // getters
        return carname;
    }
    public String getBrandname(){
        return carname;
    }
    public int getMf_date(){
        return mf_date;
    }
}
