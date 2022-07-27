package ru.netology.javaqa_mikitadv_homework12;
public class FilmManager {
    private String[] films = new String[0];
    protected  int max;
    public FilmManager (){
        this.max = 10;
    }
    public FilmManager (int max){
this.max = max;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[films.length] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length >= max) {
            resultLength = max;
        }
        else {
          resultLength = films.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
           result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}
