package Collection;

import java.util.EnumMap;

enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
public class EnumMapPractice {
    public static void main(String[] args) {
        EnumMap<Day,String> schedule = new EnumMap<>(Day.class);
        schedule.put(Day.MONDAY,"Gym");
        schedule.put(Day.TUESDAY,"Work");
        schedule.put(Day.WEDNESDAY,"Eat");
        schedule.put(Day.THURSDAY,"Study");
        schedule.put(Day.FRIDAY,"Project");
        schedule.put(Day.SATURDAY,"Sports");
        schedule.put(Day.SUNDAY,"Rest");

        for(Day day : Day.values()){
            System.out.println(day+":"+schedule.get(day));
        }
    }
}
