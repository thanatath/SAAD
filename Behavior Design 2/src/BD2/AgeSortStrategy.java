package BD2;

import java.util.Comparator;
import java.util.List;

public class AgeSortStrategy implements SortStrategy {
    // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!
    @Override
    public void customSort(List<Person> people) {
        people.sort((Person e1, Person e2) ->  e1.getAge().compareTo(e2.getAge()));
    }}


