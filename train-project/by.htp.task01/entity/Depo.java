package by.htp.task01.entity;

import java.util.ArrayList;
import java.util.List;

public class Depo {

    private List<Train> trainsList;

    public Depo() {
        trainsList = new ArrayList<Train>();
    }

    public Depo(List<Train> trainsList) {
        this.trainsList = trainsList;
    }
    
    public void addTrain (Train train){
        trainsList.add(train);
    }

    public List<Train> getTrainsList() {
        return trainsList;
    }

    public void setTrainsList(List<Train> trainsList) {
        this.trainsList = trainsList;
    }

    public Train getTrain(int trainIndex) {
        return trainsList.get(trainIndex);
    }

    public void setTrain(int trainIndex, Train train) {
        trainsList.set(trainIndex, train);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((trainsList == null) ? 0 : trainsList.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Depo other = (Depo) obj;
        if (trainsList == null) {
            if (other.trainsList != null)
                return false;
        } else if (!trainsList.equals(other.trainsList))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Depo{" +
                "trainsList=" + trainsList +
                '}';
    }
}
