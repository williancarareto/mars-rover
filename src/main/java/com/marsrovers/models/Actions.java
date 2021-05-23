package com.marsrovers.models;

import java.util.List;

public enum Actions {
    MOVE('M'), LEFT('L'), RIGHT('R');

    private char action;

    Actions(char action) {
        this.action = action;
    }

    public char getAction() {
        return action;
    }

    public static List<Actions> convertToList(String actions){
        return null;
    }
}
