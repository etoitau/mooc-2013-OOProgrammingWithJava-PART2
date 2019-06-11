/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }
    
    @Override
    public boolean equals(Object object) {
        if (object == null) 
            return false;
        if (this.getClass() != object.getClass())
            return false;
        RegistrationPlate plate = (RegistrationPlate) object;
        if (plate.regCode == null || plate.country == null)
            return false;
        if (!this.regCode.equals(plate.regCode) || !this.country.equals(plate.country))
            return false;
        return true;
    }
    
    @Override
    public int hashCode() {
        if (this.regCode == null || this.country == null)
            return 1;
        return this.regCode.hashCode() + this.country.hashCode();
    }

}
