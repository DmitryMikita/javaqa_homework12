package ru.netology.javaqa_mikitadv_homework12;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class FilmManagerTest {

    @Test
    public void findFilms () {
        FilmManager manager = new FilmManager();
        manager.addFilm("1Film");
        manager.addFilm("2Film");
        manager.addFilm("3Film");
        manager.addFilm("4Film");
        manager.addFilm("5Film");

        String[] actual = manager.findAll();
        String[] expected = {"1Film", "2Film", "3Film","4Film","5Film"};
        Assertions.assertArrayEquals (expected,actual);
    }
    @Test
    public void findFilmsOne () {
        FilmManager manager = new FilmManager();
        manager.addFilm("Film1");

        String[] actual = manager.findAll();
        String[] expected = {"Film1"};
        Assertions.assertArrayEquals (expected,actual);
    }
    @Test
    public void findFilmsNoFilms () {
        FilmManager manager = new FilmManager();

        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals (expected,actual);
    }
    @Test
    public void findLastFilms () {
        FilmManager manager = new FilmManager();
        manager.addFilm("1Film");
        manager.addFilm("2Film");
        manager.addFilm("3Film");
        manager.addFilm("4Film");
        manager.addFilm("5Film");
        manager.addFilm("6Film");
        manager.addFilm("7Film");
        manager.addFilm("8Film");
        manager.addFilm("9Film");
        manager.addFilm("10Film");
        manager.addFilm("11Film");
        manager.addFilm("12Film");
        manager.addFilm("13Film");
        manager.addFilm("14Film");
        manager.addFilm("15Film");

        String[] actual = manager.findLast();
        String[] expected = {"15Film", "14Film", "13Film","12Film","11Film","10Film", "9Film", "8Film","7Film","6Film"};
        Assertions.assertArrayEquals (expected,actual);
    }
    @Test
    public void findLastFilmsMaxLessLenght () {
        FilmManager manager = new FilmManager(10);
        manager.addFilm("1Film");
        manager.addFilm("2Film");
        manager.addFilm("3Film");
        manager.addFilm("4Film");


        String[] actual = manager.findLast();
        String[] expected = {"4Film","3Film","2Film","1Film"};
        Assertions.assertArrayEquals (expected,actual);
    }
}

