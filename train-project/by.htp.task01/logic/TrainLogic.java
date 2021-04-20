package by.htp.task01.logic;

import by.htp.task01.entity.Depo;
import by.htp.task01.entity.Train;


import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class TrainLogic {


    public Train createTrain(String destination, int trainNumber, Date dispatchTime) {

        if (destination == null) {
            throw new RuntimeException("Пункт назначения пуст.");
        }
        if ((trainNumber == 0) || (trainNumber < 0)) {
            throw new RuntimeException("Номер поезда введен в неверном диапазоне");
        }
        if (dispatchTime == null) {
            throw new RuntimeException("Время отправления пусто");
        } else {
            return new Train(destination, trainNumber, dispatchTime);
        }

    }


    //Сортировка элементов массива по номерам поездов (вручную).
    public void sortTrainsByNumber(Depo depo){

        for (int i = 0; i < depo.getTrainsList().size() - 1; i ++){

            for (int j = 0; j < depo.getTrainsList().size() - 1; j++){

                if (depo.getTrainsList().get(j).getTrainNumber() > depo.getTrainsList().get(j+1).getTrainNumber()){

                    Train tr = depo.getTrainsList().get(j);
                    depo.setTrain(j, depo.getTrainsList().get(j+1));
                    depo.setTrain(j+1, tr);

                }

            }

        }

    }



    // Сортировка массива по пункту назначения, поезда с одинаковыми пунктами назначения
    //упорядочены по времени отправления (с использованием компаратора).
    public void sortTrainsByDestination (Depo depo){

        TrainDestinationComparator destinationComparator = new TrainDestinationComparator();
        depo.getTrainsList().sort(destinationComparator);

    }


    //Вывод информации о поезде, номер которого введен пользователем
    public void viewTrainInfo(List<Train> trainsList){
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()){
            System.out.println("Введите номер поезда");
        }

        int index = scanner.nextInt();
        for (Train train : trainsList){
            if (train.getTrainNumber() == index) {
                System.out.println(train);
            }
        }     
    }
    

    
}

