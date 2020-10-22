package bmdb.ui;

import java.time.LocalDate;
import java.util.List;

import bmdb.business.Actor;
import bmdb.db.ActorDb;

public class BmdbApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Bootcamp Movie Database");
		System.out.println();
		System.out.println("COMMANDS");
		System.out.println("la - List actors");
		System.out.println("aa - Add Actor");
		System.out.println("del - Delete Actor");
		System.out.println("gabn - Get an actor by last name");
		System.out.println("gabi - Get actor by ID");
		System.out.println("exit - Exit application");
		
		ActorDb actorDb = new ActorDb();
		
		String command = Console.getString("Enter command: ");
		while (!command.equalsIgnoreCase("exit")) {
			
			switch (command) {
			case "la":
				List<Actor> actors = actorDb.getAll();
				System.out.println("Actors");
				for  (Actor actor : actors) {
					System.out.println(actor);
				}
				break;
			case "aa":	
				String newFirstName = Console.getString("First name: ");
				String newLastName = Console.getString("Last name: ");
				String newGender = Console.getString("Gender: ");
				String newBirthDateStr = Console.getString("Birthdate (YYYY-MM-DD): ");
				LocalDate newBirthDate = LocalDate.parse(newBirthDateStr);
				
				Actor newActor = new Actor(0, newFirstName, newLastName, newGender, newBirthDate);
				
				if (actorDb.add(newActor)) {
					System.out.println("Actor added successfully");
				} else {
					System.out.println("Error adding actor");
				}
				break;
			case "del":
				long actorId = Console.getInt("Enter Actor ID: ");
				
				Actor deleteActor = actorDb.get(actorId);
				
				if (deleteActor == null) {
					System.out.println("Actor deleted successfully");
				} else {
					System.out.println("Error deleting acotr");
				}
				break;
			case "gabn":
				String lastName = Console.getString("Actor's last name: ");
				Actor actor = actorDb.getActorByLastName(lastName);
				if (actor == null) {
					System.out.println("Actor not found");
				} else {
					System.out.println(actor);
				}
				break;
				
			case "gabi":
				long id = Console.getInt("Actor ID: ");
				Actor actorById = actorDb.get(id);
				if (actorById == null) {
					System.out.println("ID not found");
				} else {
					System.out.println(actorById);
				} 
				break;
			}
			
			command = Console.getString("Enter command: ");
		} System.out.println("Bye!");
	}

}
