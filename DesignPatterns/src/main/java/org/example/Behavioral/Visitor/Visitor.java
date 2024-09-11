package org.example.Behavioral.Visitor;

public interface Visitor {
    void visitBank(Bank bank);
    void visitResident(Resident resident);
    void visitRestaurant(Restaurant restaurant);
}
