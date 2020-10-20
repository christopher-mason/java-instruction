package bmdb.ui;

import java.util.List;

import bmdb.business.Actor;
import bmdb.db.ActorDb;

public class BmdbApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Bootcamp Movie Database");
		System.out.println();
		System.out.println("COMMANDS");
		System.out.println("la - List actors");
		System.out.println("gabn - Get an actor by last name");
		System.out.println("exit - Exit application");
		
		String command = Console.getString("Enter command: ");
		while (!command.equalsIgnoreCase("exit")) {
			
			switch (command) {
			case "la":
				ActorDb actorDb = new ActorDb();
				List<Actor> actors = actorDb.getAll();
				System.out.println("Actors");
				for  (Actor actor : actors) {
					System.out.println(actor);
				}
				break;
			case "gabn":
				ActorDb actorDbGabn = new ActorDb();
				String lastName = Console.getString("Actor's last name: ");
				Actor actor = actorDbGabn.get(lastName);
				if (actor == null) {
					System.out.println("Actor not found");
				} else {
					System.out.println(actor);
				}
				break;
			}
			
			command = Console.getString("Enter command: ");
		}
	}

}
