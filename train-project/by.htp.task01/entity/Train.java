package by.htp.task01.entity;

import java.util.Date;


public class Train {

    private String destination;
    private int trainNumber;
    private Date dispatchTime;


    public Train(String destination, int trainNumber, Date dispatchTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.dispatchTime = dispatchTime;
    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Date getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(Date dispatchTime) {
        this.dispatchTime = dispatchTime;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dispatchTime == null) ? 0 : dispatchTime.hashCode());
        result = prime * result + ((destination == null) ? 0 : destination.hashCode());
        result = prime * result + trainNumber;
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
        Train other = (Train) obj;
        if (dispatchTime == null) {
            if (other.dispatchTime != null)
                return false;
        } else if (!dispatchTime.equals(other.dispatchTime))
            return false;
        if (destination == null) {
            if (other.destination != null)
                return false;
        } else if (!destination.equals(other.destination))
            return false;
        if (trainNumber != other.trainNumber)
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Поезд {" +
                "Пункт назначения '" + destination + '\'' +
                ", Номер поезда " + trainNumber +
                ", Время отправления " + dispatchTime +
                '}';
    }

}
