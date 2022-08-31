package it.unikey;

import java.util.ArrayList;
@FunctionalInterface
public interface LambdaStartCode <Passenger>{
    public ArrayList<Passenger> startCode(ArrayList<Passenger> elem, ArrayList<Passenger> new_elem, char c);
}
