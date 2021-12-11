public Money calculatePay(Employee e) throws InvalidEmployeeType { 
    witch (e.type) { 
    case COMMISSIONED:
        return calculateCommissionedPay(e); 
    case HOURLY:
        return calculateHourlyPay(e); 
    case SALARIED:
    return calculateSalariedPay(e); 
    default:
        throw new InvalidEmployeeType(e.type);
    }
    }
    