package by.htp.task01.start;

import by.htp.task01.entity.Depo;
import by.htp.task01.entity.Train;
import by.htp.task01.logic.TrainLogic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Train> trainList = new ArrayList<>();
        Depo depo = new Depo(trainList);
        TrainLogic logic = new TrainLogic();

        Train train1 = logic.createTrain("Minsk", 5, new Date(2021, 5, 5) );
        Train train2 = logic.createTrain("Grodno", 4, new Date(2021, 3, 3) );
        Train train3 = logic.createTrain("Minsk", 3, new Date(2021, 1, 1) );
        Train train4 = logic.createTrain("Grodno", 1, new Date(2021, 4, 4) );
        Train train5 = logic.createTrain("Minsk", 2, new Date(2021, 1, 1) );

        depo.addTrain(train1);
        depo.addTrain(train2);
        depo.addTrain(train3);
        depo.addTrain(train4);
        depo.addTrain(train5);

        logic.sortTrainsByNumber(depo);

        logic.sortTrainsByDestination(depo);

        logic.viewTrainInfo(depo.getTrainsList());

    }

}
