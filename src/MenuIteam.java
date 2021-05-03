public class MenuIteam {
    // class variables
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;

    // constructors it takes all the necessary elements of para
    public MenuIteam(String name, String description, Double price){
     this.name = name;
     this.description = description;
     this.price = price;
     this.category = "Not categorized";

     this.isNew = false;
    }

    public MenuIteam(String name, String description, Double price, String category, Boolean isNew){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;

    }

    // methods
    // getters and setters

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public String getDescription() { return this.description; }

    public void setDescription(String description) { this.description = description; }

    public Double getPrice() { return this.price; }

    public void setPrice(Double price) { this.price = price; }

    public String getCategory() { return this.category; }

    public void setCategory(String category) { this.category = category; }

    public Boolean getIsNew() { return isNew; }

    public void setIsNew(Boolean aNew) { this.isNew = isNew; }
}
