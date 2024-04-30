package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reservation;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        try{
            System.out.println("Room number: ");
            int number = sc.nextInt();
            System.out.println("Check-in date: ");
            Date checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date: ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update your reservation: ");
            System.out.println("Check-in date: ");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date: ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);

            System.out.println("Updated reservation: " + reservation);
        }
        catch(ParseException e){
            System.out.println("Invalid date format");
        }
        catch(IllegalArgumentException e){
            System.out.println("error in reservation: "+e.getMessage());
        }

        sc.close();
        }

        
    }

