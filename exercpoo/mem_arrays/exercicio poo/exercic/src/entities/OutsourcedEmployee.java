package entities;

public class OutsourcedEmployee extends Employee{
    
    Double additionalCharge=1.1;

    

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }



    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour) {
        super(name, hours, valuePerHour);
    }

    @Override
    public double payment(){
        Double basePayment=super.payment();
        return basePayment*additionalCharge;

    }

    
}
