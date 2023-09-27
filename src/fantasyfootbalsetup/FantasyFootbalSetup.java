/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fantasyfootbalsetup;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author moizb
 */
public class FantasyFootbalSetup {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
       int optionNum = mainMenu();
       if(optionNum ==1) 
           
           
           dataInput();
    }
    public static void mainMenu() {
        System.out.println("Welcome to the fantasy football program ! what would you like to do");
        System.out.println("Menu");
        System.out.println("2: Enter in a team");
        System.out.println("1:Initiliaze the program with data");
        System.out.println("2:Enter Team");
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
       // int optionNum = Integer.parseInt(option);
       return Integer.parseInt(option);
       
    }
    
    public static void dataInput() throws FileNotFoundException, IOException {
    BufferedReader br = new BufferedReader(new FileReader("FantasyFootballData1.csv"));
    String line = br.readLine();
    System.out.println("The First line is " + line);
    String[] playerData = line.split(",")
    
  }
