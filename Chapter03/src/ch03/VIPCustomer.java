package ch03;

public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentID;

//    public VIPCustomer() {
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//        customerGrade = "VIP";
//
//        System.out.println("VIPCustomer() call");
//    }

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";

        System.out.println("VIPCustomer(int, String) call");
    }

    public String getAgentID() {
        return agentID;
    }
}
