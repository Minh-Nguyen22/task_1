package employees;

import java.util.HashMap;
import java.util.Map;

public class Accountant {

    private double sumOfSalaries;

    // Я использовал интерфейс Map с учетом на то, что при использовании базы данных
    // id всех работников будет уникальным.
    private Map<Integer, Double> mapOfEmployees = new HashMap<>();

    public void addToMap(Integer id, Double monthSalary){
        mapOfEmployees.put(id, monthSalary);
    }
    public Map<Integer, Double> getMapOfEmployees(){
        return mapOfEmployees;
    }

    public Double getSumOfSalaries(){
        for (Map.Entry<Integer, Double> employee : mapOfEmployees.entrySet())
            sumOfSalaries += employee.getValue();
        return sumOfSalaries;
    }
}
