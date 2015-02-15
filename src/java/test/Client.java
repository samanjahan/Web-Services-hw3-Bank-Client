/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import services.ServicesClient;

/**
 *
 * @author syst3m
 */
public class Client {
    public static void main(String[] args) {
        ServicesClient client = new ServicesClient();
        double amount = 200;
        System.out.println("result " + client.pay("saman", "12344", amount));
    }
    
}
