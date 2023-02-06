package ru.netology.javaqa.billboard;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class billboardManagerTest {

    billboardManager manager = new billboardManager();
    String film1 = "billboard I";
    String film2 = "billboard II";
    String film3 = "billboard III";
    String film4 = "billboard IV";
    String film5 = "billboard V";

    @Test
    public void findAll() {

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

        String[] expected = {
                film1,
                film2,
                film3,
                film4,
                film5,
        };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

        String[] expected = {

                film5,
                film4,
                film3,
                film2,
                film1,

        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void limitUp() {

        billboardManager manager = new billboardManager(11);

        String film1 = "film I";
        String film2 = "film II";
        String film3 = "film III";
        String film4 = "film IV";
        String film5 = "film V";
        String film6 = "film VI";
        String film7 = "film VII";
        String film8 = "film VIII";
        String film9 = "film IX";
        String film10 = "film X";
        String film11 = "film XI";

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.add(film11);

        String[] expected = {

                film11,
                film10,
                film9,
                film8,
                film7,
                film6,
                film5,
                film4,
                film3,
                film2,
                film1,

        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void limitDown() {

        billboardManager manager = new billboardManager(2);

        String film1 = "film I";
        String film2 = "film II";
        String film3 = "film III";
        String film4 = "film IV";
        String film5 = "film V";
        String film6 = "film VI";
        String film7 = "film VII";
        String film8 = "film VIII";
        String film9 = "film IX";
        String film10 = "film X";
        String film11 = "film XI";

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.add(film11);

        String[] expected = {

                film11,
                film10

        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}


