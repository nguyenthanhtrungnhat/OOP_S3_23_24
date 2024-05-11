/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assignment1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Assignment1 {

    public static void main(String[] args) {
        ArrayList<CD> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        CD cd = new CD();
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add CD");
            System.out.println("2. Search CD by CD title");
            System.out.println("3. Search CDs by collection");
            System.out.println("4. Search CDs by type");
            System.out.println("5. Delete CD by CD Id");
            System.out.println("6. Edit CD information by Id");
            System.out.println("7. Display all CDs");
            System.out.println("8. Sort the CD list ascending by year of release");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    cd.addCD();
                    break;
                case 2:
                    System.out.print("Enter CD title to search: ");
                    cd.searchByTitle();
                    break;
                case 3:
                    System.out.print("Enter CD collection to search: ");
                    cd.searchByCollection();
                    break;
                case 4:
                    System.out.print("Enter CD type to search (audio/video): ");
                    cd.searchByType();
                    break;
                case 5:
                    System.out.print("Enter CD Id to delete: ");
                    cd.deleteCdById();
                    break;
                case 6:
                    cd.editInformationById();
                    break;
                case 7:
                    System.out.println("List of CDs: ");
                    cd.DisplayAllCds();
                    break;
                case 8:
                    cd.sortByYor();
                    break;
                case 9:
                    cd.Exit();
                    break;

            }
        }
    }
}
