package advisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] input;
        String information;
        String playlistType;
        do {
            input = scn.nextLine().split(" ");
            information = input[0];
            if (input.length > 1) playlistType = input[1];
            else playlistType = null;
            switch (information) {
                case "new":
                    displayNewReleases();
                    break;
                case "featured":
                    displayFeaturedPlaylists();
                    break;
                case "categories":
                    displayAvailableCategories();
                    break;
                case "playlists":
                    displayPrecisePlaylists(playlistType);
                    break;
                case "exit":
                    System.out.println("---GOODBYE!---");
                    break;
                default:
                    System.out.println("Command not found.");
                    break;
            }
        } while (!"exit".equals(information));
    }

    public static void displayNewReleases() {
        System.out.println("---NEW RELEASES---");
        System.out.println("Mountains [Sia, Diplo, Labrinth]");
        System.out.println("Runaway [Lil Peep]");
        System.out.println("The Greatest Show [Panic! At The Disco]");
        System.out.println("All Out Life [Slipknot]");
    }

    public static void displayFeaturedPlaylists() {
        System.out.println("---FEATURED---");
        System.out.println("Mellow Morning");
        System.out.println("Wake Up and Smell the Coffe");
        System.out.println("Monday Motivation");
        System.out.println("Songs to Sing in the Shower");
    }

    public static void displayAvailableCategories() {
        System.out.println("---CATEGORIES---");
        System.out.println("Top Lists");
        System.out.println("Pop");
        System.out.println("Mood");
        System.out.println("Latin");
    }

    public static void displayPrecisePlaylists(String type) {
        String typeUpper = type.toUpperCase();
        System.out.println("---" + typeUpper + " PLAYLISTS---");
        System.out.println("Walk Like A Badass");
        System.out.println("Rage Beats");
        System.out.println("Arab Mood Booster");
        System.out.println("Sunday Stroll");
    }
}
