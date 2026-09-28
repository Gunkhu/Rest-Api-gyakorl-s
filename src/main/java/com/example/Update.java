package com.example;

import hu.szit.resclient.ResClient;

public class Update {
    public static void main(String[] args) {
        String url = "http://localhost:8000/api/employees/6";
        ResClient client = new ResClient();


        String update = "{\"name\":\"Szilveszter István\",\"city\":\"Debrecen\",\"salary\":\"395\",\"positionId\":\"9\"}";
        String result = client.put(url, update);

    }
}
