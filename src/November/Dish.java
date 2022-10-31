package November;

public class Dish {

    private String name;
    private Integer calories;

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", type='" + type + '\'' +
                '}';
    }

    private String type;

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCalories() {
        return calories;
    }

    public Dish(String name, Integer calories, String type) {
        this.name = name;
        this.calories = calories;
        this.type = type;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Dish(String name, Integer calories) {
        this.name = name;
        this.calories = calories;
    }
}
