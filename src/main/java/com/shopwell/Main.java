package com.shopwell;

import com.shopwell.services.CashierService;
import com.shopwell.services.CustomerService;
import com.shopwell.services.ManagerService;
import com.shopwell.services.servicesimplementation.CashierServiceImpl;
import com.shopwell.services.servicesimplementation.CustomerServiceImpl;
import com.shopwell.services.servicesimplementation.ManagerServiceImpl;
import com.shopwell.staff.Cashier;
import com.shopwell.staff.Designation;
import com.shopwell.staff.Manager;

public class Main {
    public static void main(String[] args) {
        Store store = new Store("shopwell", 100000);
//        System.out.printf("%s has been created with capital of 100,000 naira", store.getName());
//
//        System.out.println("\n***************** Manager **************************\n");
//
        Manager manager = new Manager("John Mark", Designation.MANAGER, store);
//        System.out.printf("%s has been created the Manger of %s", manager.getName(), store.getName());
//
//        System.out.println("\n******************** Cashiers ***********************\n");
//
//        Cashier cashier = new Cashier("Harry Styles", Designation.CASHIER, store);
//        System.out.printf("%s has been created the new cashier of %s\n", cashier.getName(), store.getName());
//
//        Cashier cashier2 = new Cashier("Kendrick Lamar", Designation.CASHIER, store);
//        System.out.printf("%s has been created the new cashier of %s\n", cashier2.getName(), store.getName());
//
//
//        System.out.println("\n****************** Customer *************************\n");
//
//        Customer customer = new Customer("Jeff Hardy", 10000);
//        System.out.printf("%s has entered the store.", customer.getName());
//
//        System.out.println("\n*******************************************\n");
//
        ManagerService managerService = new ManagerServiceImpl(manager, store);
//        CashierService cashierService = new CashierServiceImpl(cashier, store);
//        CustomerService customerService = new CustomerServiceImpl(customer);
//
//        managerService.hireStaff(cashier);
//        managerService.hireStaff(cashier2);
//
        Product rice = new Product("Rice", 2000, PRODUCTCATEGORY.GROCERIES, 11);
        Product beer = new Product("Beer", 20, PRODUCTCATEGORY.GROCERIES, 0);
//
        managerService.addProduct(rice);
        managerService.addProduct(beer);
//
//        customerService.addToCart(rice, 2);
//        customerService.addToCart(beer, 2);
//
//        System.out.println("\n*******************************************\n");
//
//        cashierService.checkOutCustomer(customer);
//        managerService.fireStaff(cashier2);
//
//        System.out.println("\n******************** Manager ***********************\n");
//
//        managerService.addSalesToCompanyAccount(store.getDailySalesAccount());
//
//        System.out.println(managerService.getProductList());
//
//        managerService.fireStaff(cashier);

        store.ReadProductQuantityInExcelSheet();
    }
}