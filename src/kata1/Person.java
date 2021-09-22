package kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String name;
    private final  LocalDate fn;
    private final LocalDate fa = LocalDate.now();

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return fa;
    }
    
    public int getAge(){
        return (int) (Period.between(fn, fa).getYears());
    }

    public Person(String name, LocalDate fn) {
        this.name = name;
        this.fn = fn;
    }
}
