package com.company;

import java.util.ArrayList;

public class Database {
    private ArrayList<JSON_DATA> dataBaseList;

    public void add(JSON_DATA json_data) {
        this.dataBaseList.add(json_data);
    }

    public JSON_DATA getObj(JSON_DATA json_data){
        return json_data;
    }

    public ArrayList<JSON_DATA> getDataBaseList() {
        return dataBaseList;
    }

    public Database(ArrayList<JSON_DATA> dataBaseList) {
        this.dataBaseList = dataBaseList;
    }

    public void setDataBaseList(ArrayList<JSON_DATA> dataBaseList) {
        this.dataBaseList = dataBaseList;
    }

    public Database() {
        dataBaseList = new ArrayList<>();
    }


    @Override
    public String toString() {
        return "HeroesDB{" +
                "heroesArrayList=" + dataBaseList +
                '}';
    }
}
