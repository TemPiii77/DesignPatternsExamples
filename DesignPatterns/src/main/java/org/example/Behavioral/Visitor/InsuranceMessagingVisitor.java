package org.example.Behavioral.Visitor;

import java.util.List;

public class InsuranceMessagingVisitor implements Visitor {

    public void sendInsuranceMails(List<Client> clients) {
        for (Client client : clients) {
            client.accept(this);
        }
    }

    @Override
    public void visitBank(Bank bank) {
        System.out.println("Visit Bank");
    }

    @Override
    public void visitResident(Resident resident) {
        System.out.println("Visit Resident");
    }

    @Override
    public void visitRestaurant(Restaurant restaurant) {
        System.out.println("Visit Restaurant");
    }
}
