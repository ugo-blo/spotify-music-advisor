package advisor;

import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Scanner;

public class CLI {

    Map<String, Commands> commands;

    public CLI() {
        commands = Map.of(
                "new", new Commands(),
                "featured", new Commands(),
                "categories", new Commands(),
                "playlists", new Commands(),
                "exit", new Commands()
        );
    }

    public void addCommand(String commandName, Commands command) {
        commands.put(commandName, command);
    }

    public void executeCommand(String commandName, String categoryString) {
        switch (commandName) {
            case "new":
                commands.get("new").displayNewReleases();
                break;
            case "featured":
                commands.get("featured").displayNewFeatured();
                break;
            case "categories":
                commands.get("categories").displayNewCategories();
                break;
            case "playlists":
                commands.get("playlists").displayPersoPlaylists(new Category(categoryString));
                break;
            case "exit":
                commands.get("exit").exit();
                break;
            default:
                System.out.println("Command not found.");
                break;
        }
    }

    public void executeCLI() {
        Scanner scn = new Scanner(System.in);
        String[] input;
        String command;
        String category;
        do {
            input = scn.nextLine().split(" ");
            command = input[0];
            if (input.length > 1) category = input[1];
            else category = null;
            executeCommand(command, category);
        } while (!"exit".equals(command));
    }
}
