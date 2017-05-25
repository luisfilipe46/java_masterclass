package com.masterclass;

public class Main {

    public static void main(String[] args) {
        /*
        Account bobsAccount = new Account("12345", 0.00, "Bob Brown",
                "Bob Brown", "(007) 123-4567");
        */
//        Account bobsAccount = new Account();
//
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.withdraw(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdraw(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdraw(100.0);
//
//        Account timsAccount = new Account("Tim",
//                "tim@email.com", "12345");
//        System.out.println(timsAccount.getNumber() + " name " +
//                timsAccount.getCustomerName());

        // exercise
        VipCostumer person1 = new VipCostumer();
        System.out.println(person1.getName());
        System.out.println(person1.getEmail());
        System.out.println(person1.getCreditLimit());


        VipCostumer person2 = new VipCostumer("Bob" , 25000.0);
        System.out.println(person2.getName());
        System.out.println(person2.getEmail());
        System.out.println(person2.getCreditLimit());

        VipCostumer person3 = new VipCostumer("Tim" ,
                "tim@email.com", 10.0);
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());
        System.out.println(person3.getCreditLimit());




    }
}
