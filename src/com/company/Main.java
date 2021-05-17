package com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Conection conection = new Conection();
        Conection.URL = "https://api.coinlore.net/api/tickers/?start=200&limit=5";
        conection.run();

        String JsonStr = conection.jsonIn;

        ObjectMapper objectMapper = new ObjectMapper();
        JSON_DATA theObject = objectMapper.readValue(JsonStr, JSON_DATA.class);
        System.out.println(theObject);
        System.out.println("");
        theObject.getData().sort(Datum.byRankAsc);
        System.out.println(theObject);
        System.out.println("");
        theObject.getData().sort(Datum.byPriceUSDDesc);
        System.out.println(theObject);
        System.out.println("");
        theObject.getData().sort(Datum.byPriceUSDAsc);
        System.out.println(theObject);
        System.out.println("");
        theObject.getData().sort(Datum.byPriceBtcAsc);
        System.out.println(theObject);
        System.out.println("");
        theObject.getData().sort(Datum.byPriceBtcDesc);
        System.out.println(theObject);
        System.out.println("");
        System.out.println("Enter name, please");
        Scanner scanner = new Scanner(System.in);
        String variable = scanner.nextLine();
        Object fileteredDatum = theObject.filterByName(variable);
        System.out.println(fileteredDatum);
    }
}
