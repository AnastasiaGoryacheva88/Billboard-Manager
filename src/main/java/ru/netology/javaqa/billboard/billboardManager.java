package ru.netology.javaqa.billboard;

public class billboardManager {


    private String[] billboard = new String[0];
    private int limit;


    public billboardManager() {
        limit = 10;
    }

    public billboardManager(int limit) {
        this.limit = limit;
    }

    public void add(String film) {
        String[] tmp = new String[billboard.length + 1];
        for (int i = 0; i < billboard.length; i++) {
            tmp[i] = billboard[i];
        }
        tmp[tmp.length - 1] = film;
        billboard = tmp;
    }

    public String[] findAll() {
        return billboard;
    }

    public String[] findLast() {

        int resultLength;
        if (limit < billboard.length) {
            resultLength = limit;
        } else {
            resultLength = billboard.length;
        }

        String[] result = new String[resultLength];


        for (int i = 0; i < resultLength; i++) {
            result[i] = billboard[billboard.length - 1 - i];

        }
        return result;

    }
}



