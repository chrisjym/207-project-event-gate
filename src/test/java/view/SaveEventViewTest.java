package view;

import entity.Event;
import entity.EventCategory;
import entity.Location;
import interface_adapter.save_event.SaveEventViewModel;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

/**
 * Test file to demo the SaveEventsView
 */
public class SaveEventViewTest {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Saved Events Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 700);
            frame.setLocationRelativeTo(null);

            // Create ViewModel
            SaveEventViewModel viewModel = new SaveEventViewModel();

            // Create View
            SaveEventsView saveEventsView = new SaveEventsView(viewModel);

            // Add to frame FIRST
            frame.add(saveEventsView);
            frame.setVisible(true);

            // THEN add demo events AFTER the view is visible
            // This ensures the UI is fully initialized before refreshing
            SwingUtilities.invokeLater(() -> {
                addDemoEvents(saveEventsView);
            });
        });
    }

    private static void addDemoEvents(SaveEventsView view) {
        // Demo Event 1: Sports
        Event event1 = new Event(
                "event1",
                "Toronto Raptors vs Lakers",
                "An exciting NBA matchup between two legendary teams. Watch Pascal Siakam lead the Raptors against LeBron James and the Lakers!",
                EventCategory.SPORTS,
                new Location("Scotiabank Arena, 40 Bay St, Toronto, ON", 43.6435, -79.3791),
                LocalDateTime.of(2025, 11, 28, 19, 30),
                "https://via.placeholder.com/500x700?text=Raptors+vs+Lakers"
        );

        // Demo Event 2: Music
        Event event2 = new Event(
                "event2",
                "Drake - For All The Dogs Tour",
                "Drake brings his chart-topping album to life in an unforgettable concert experience featuring special guests and stunning production.",
                EventCategory.MUSIC,
                new Location("Rogers Centre, 1 Blue Jays Way, Toronto, ON", 43.6414, -79.3894),
                LocalDateTime.of(2025, 12, 15, 20, 0),
                "https://via.placeholder.com/500x700?text=Drake+Concert"
        );

        // Demo Event 3: Arts & Theatre
        Event event3 = new Event(
                "event3",
                "Hamilton - The Musical",
                "Lin-Manuel Miranda's revolutionary musical about the life of Alexander Hamilton. An unmissable theatrical experience!",
                EventCategory.ARTS_THEATRE,
                new Location("Princess of Wales Theatre, 300 King St W, Toronto, ON", 43.6465, -79.3914),
                LocalDateTime.of(2026, 1, 10, 19, 0),
                "https://via.placeholder.com/500x700?text=Hamilton"
        );

        // Demo Event 4: Sports
        Event event4 = new Event(
                "event4",
                "Toronto Maple Leafs vs Montreal Canadiens",
                "The ultimate hockey rivalry! Experience the intensity of Leafs vs Habs at Scotiabank Arena.",
                EventCategory.SPORTS,
                new Location("Scotiabank Arena, 40 Bay St, Toronto, ON", 43.6435, -79.3791),
                LocalDateTime.of(2025, 12, 5, 19, 0),
                "https://via.placeholder.com/500x700?text=Leafs+vs+Habs"
        );

        // Demo Event 5: Music
        Event event5 = new Event(
                "event5",
                "The Weeknd - After Hours Tour",
                "Experience The Weeknd's incredible live performance featuring hits from After Hours and Dawn FM.",
                EventCategory.MUSIC,
                new Location("Scotiabank Arena, 40 Bay St, Toronto, ON", 43.6435, -79.3791),
                LocalDateTime.of(2025, 11, 20, 20, 30),
                "https://via.placeholder.com/500x700?text=The+Weeknd"
        );

        view.addSavedEvent(event1);
        view.addSavedEvent(event2);
        view.addSavedEvent(event3);
        view.addSavedEvent(event4);
        view.addSavedEvent(event5);
    }
}