package advisor;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Commands {

    public void commandNotFound() {
        System.out.println("Command not found.");
    }

    public void displayNewReleases() {
        System.out.println("---NEW RELEASES---");
        System.out.println(new Album("Mountains", List.of(new Artist("Sia"), new Artist("Diplo"), new Artist("Labrinth"))).toString());
        System.out.println(new Album("Runaway", List.of(new Artist("Lil Peep"))).toString());
        System.out.println(new Album("The Greatest Show", List.of(new Artist("Panic! At The Disco"))).toString());
        System.out.println(new Album("All Out Life", List.of(new Artist("Slipknot"))).toString());
    }

    public void displayNewFeatured() {
        System.out.println("---FEATURED---");
        System.out.println(new Playlist("Mellow Morning").getName());
        System.out.println(new Playlist("Wake Up and Smell the Coffee").getName());
        System.out.println(new Playlist("Monday Motivation").getName());
        System.out.println(new Playlist("Songs to Sing in the Shower").getName());
    }

    public void displayNewCategories() {
        System.out.println("---CATEGORIES---");
        System.out.println(new Category("Top Lists").getName());
        System.out.println(new Category("Pop").getName());
        System.out.println(new Category("Mood").getName());
        System.out.println(new Category("Latin").getName());
    }

    public void displayPersoPlaylists(Category category) {
        System.out.println("---" + category.getName() +  " PLAYLISTS---");
        System.out.println(new Playlist("Walk Like A Badass").getName());
        System.out.println(new Playlist("Rage Beats").getName());
        System.out.println(new Playlist("Arab Mood Booster").getName());
        System.out.println(new Playlist("Sunday Stroll").getName());
    }
    public void exit() {
        System.out.println("---GOODBYE!---");
    }
}