import java.util.ArrayList;
import java.util.Date;

public class Menu {
  // class variables
  private ArrayList<MenuIteam> menuItems = new ArrayList<>();
  private Date lastUpdated;

  // constructor
    public Menu (){
      this.lastUpdated = new Date();
    }
    // Methods
    // Getters and Setters


    public ArrayList<MenuIteam> getMenuItems() { return this.menuItems; }

    public void setMenuItems (ArrayList <MenuIteam> menuIteams) { this.menuItems = menuIteams; }

    public Date getLastUpdated() { return this.lastUpdated; }

    public void setLastUpdated(Date lastUpdated) { this.lastUpdated = lastUpdated; }
}
