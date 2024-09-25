package challenge2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendeeFilter {
    public static void main(String[] args) {

  //Predefined list of attendees
  List<Attendee> attendees = new ArrayList<>();
  attendees.add(new Attendee("Alex", "male"));
  attendees.add(new Attendee("Iulia", "female"));
  attendees.add(new Attendee("Dorin","male"));
  attendees.add(new Attendee("Petra","female"));

  //Scanner for input
  Scanner scanner =new Scanner(System.in);

  //Ask the user for the gender to filter

  System.out.println("Do you want to filter by 'male' or 'female'?");
  String filterGender = scanner.nextLine().toLowerCase();

  //Filter the list based on the chosen gender

  System.out.println("Filtered list of" + filterGender + "attendees:");

            for ( Attendee attendee :attendees){

            if (attendee.getGender().equals(filterGender)){
   System.out.println(attendee.getName());

            }
            }
            scanner.close();
}

    //A class to represent an Atendee with a name and gender
    static class Attendee {
        String name;
        String gender;

        Attendee(String name,String gender){
            this.name=name;
            this.gender=gender;
        }

        //Getter for name
        public String getName(){
            return name;
        }
        //Getter for gender

        public String getGender() {
            return gender;
        }
    }
}



