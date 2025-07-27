package com.day5proj1phase2.main;

import java.util.List;
import java.util.Scanner;

import com.day5proj1phase2.dao.Bugdao;
import com.day5proj1phase2.models.Bug;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("1.Insert Bug");
        System.out.println("2.Display all Bug details");
        System.out.println("3.Delete a Bug by ID");
        System.out.println("4.Update Bug status by ID");
        System.out.println("5.Exit");
        System.out.println("Enter Choice:");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter Bug Title:");
                String title = sc.next();
                System.out.println("Enter Bug Description:");
                String description = sc.next();
                System.out.println("Enter Bug Status:");
                String status = sc.next();
                Bug bug = new Bug();
                bug.setTitle(title);
                bug.setDescription(description);
                bug.setStatus(status);
                Bugdao bugDao = new Bugdao();
                bugDao.insertbBug(bug);
                break;
            case 2:
                Bugdao bg = new Bugdao();
                List<Bug> bugList = bg.Display();
                for (Bug b : bugList) { 
                    System.out.println("ID: " + b.getId()+", Title: "+ b.getTitle()+", Description: "+b.getDescription()+", Status: " + b.getStatus());
                }

                break;
            case 3:
                System.out.println("Enter Bug ID to delete:");
                int del = sc.nextInt();
                Bugdao bd = new Bugdao();    
                Bug b = new Bug();
                b.setId(del);
                bd.delete(b);
                System.out.println("Bug with ID "+ del+" deleted successfully.");
                break;
            case 4:
                System.out.println("Enter Bug ID to update:");
                int uid = sc.nextInt();
                System.out.println("Enter new Bug Status:");
                String stat = sc.next();
                Bug ubug = new Bug();
                ubug.setId(uid);
                ubug.setStatus(stat);
                Bugdao bdo = new Bugdao();
                bdo.update(ubug);
                System.out.println("Bug with ID "+ uid+" updated successfully.");
                
                break;
            case 5:
                System.out.println("Exit.");
                return;
            default:
                System.out.println("Invalid choice, please try again.");
        }
        
        




    }
    }
}
