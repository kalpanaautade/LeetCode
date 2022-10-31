package November;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDish {

    public enum calLevel {DIET, NORMAL, FAT};

    public static void main(String[] args) {


        List<Dish> menu = Arrays.asList(
                new Dish("Medu Vada", 50, "SouthIndian"),
                new Dish("Paratha", 70 , "Panjabi"),
                new Dish("Gulabjamun", 90 , "Maharashtrian"),
                new Dish("Salad", 20 , "Healthy"),
                new Dish("Quino", 20 , "Healthy"),
                new Dish("Rice", 80, "SouthIndian" )
        );

        // Count no of Dishes
      long nMenu=  menu.stream().count();
      //System.out.println(nMenu);

        //Max calorie Dish in Menu
        Optional<Dish> maxCalorieMenu= menu.stream().collect(Collectors.maxBy(Comparator.comparing( Dish::getCalories)));
        //System.out.println(maxCalorieMenu);

        //Name of Menus
        String menusName =menu.stream().map(Dish::getName).collect(Collectors.joining(", "));
        //System.out.println(menusName);

        String strManuName= menu.stream().map(Dish::getName).collect(Collectors.reducing((s1,s2) -> s1 +", "+ s2)).get();
        //System.out.println(strManuName);
//---------------------------------------------------------------------------------------------
        //Total Calories of all Menu
        Integer total=menu.stream().map(Dish::getCalories).reduce(Integer::sum).get();
        //System.out.println(total);

        Integer totalCal= menu.stream().collect(Collectors.reducing(0, Dish::getCalories, Integer::sum));
        Integer totalCal2= menu.stream().collect(Collectors.reducing(0, Dish::getCalories, (i,j) -> i+j ));
        //System.out.println(totalCal2);
   //------------------------------------------------------------------------------------------------
        //Max calorie Dish in Menu
       Optional<Dish> maxcalDish= menu.stream().max(Comparator.comparing(Dish::getCalories));
       //System.out.println(maxcalDish);

        Optional<Dish> maxcalDish2 =menu.stream().collect(Collectors.maxBy(Comparator.comparing(Dish::getCalories)));
        //System.out.println(maxcalDish2);

        Integer maxcalDish3 =menu.stream().map(Dish::getCalories).reduce(Integer::max).get();
        //System.out.println(maxcalDish3);
     //---------------------------------------------------------------------------------------------------

        //Grouping Menu by Type

        Map<String, List<Dish>> mapMenu= menu.stream().collect(Collectors.groupingBy(Dish::getType));

        //System.out.println(mapMenu);

        //-------------------------------------------------------------------------------------

        //Group By Calories level

        Map<calLevel, List<Dish>> mapCalLevelMenu= menu.stream().collect(Collectors.groupingBy(
                dish -> {
                    if (dish.getCalories()<=20) return calLevel.DIET;
                    else if (dish.getCalories()<=50) return calLevel.NORMAL;
                    else return calLevel.FAT;
                }    ));
        //System.out.println(mapCalLevelMenu);

        // Max Calories in each Dish::Type

        Map<String, Optional<Dish>> mapMaxCaloriesByGroup= menu.stream().collect(Collectors.groupingBy(Dish::getType,
                Collectors.maxBy(Comparator.comparing(Dish::getCalories))));
        //System.out.println(mapMaxCaloriesByGroup);

        //Group Dish By Type and Calories should be greater than 70
       /// menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.filtering( d -> d.getCalories() > 70) ,









    }
}
