//Класс реализует сортировку по пункту назначения поезда
//Поезда с одинаковыми пунктами назначения упорядочены по времени отправления.

package by.htp.task01.logic;

import by.htp.task01.entity.Train;

import java.util.Comparator;

public class TrainDestinationComparator implements Comparator<Train> {


    public int compare(Train t1, Train t2) {

        if (t1.getDestination() == t2.getDestination()){
            return t1.getDispatchTime().compareTo(t2.getDispatchTime());
        }

        return t1.getDestination().compareTo(t2.getDestination());
    }


}
