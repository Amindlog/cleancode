public abstract class Employee {
    public abstract boolean isPayDay();
    public abstract Money calculatePay();
    public abstract void deliverPay(Money pay);   
}

public interface EmploeeFactory{

    public Employee makeEmployee(EmmployeeRecord r) throws InvalidEmployeeType;

}

public css EmployeeFactoryImpl implements EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType { 
        switch (r.type) { 
            case COMMISSIONED:
                return new CommissionedEmployee(r) ; 

            case HOURLY:
                return new HourlyEmployee(r);

            case SALARIED:
                return new SalariedEmploye(r); 
                
            default:
                throw new InvalidEmployeeType(r.type);
        }
        
    }
    
}
    