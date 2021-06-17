package Hetmany;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;


public class ProgramTest {

    @Test
    @DisplayName("Sprawdzenie poprawności kodu gdy wierz jest zerem")
    public void wiersz_zero() {
        boolean czy_poprawne = Dane.Dane("5","0","5");
        assertFalse(czy_poprawne);
    }

    @Test
    @DisplayName("Sprawdzenie poprawności kodu gdy wierz jest ujemny")
    public void wiersz_ujemny() {
        boolean czy_poprawne = Dane.Dane("5","-2","5");
        assertFalse(czy_poprawne);
    }

    @Test
    @DisplayName("Sprawdzenie poprawności kodu gdy wierz jest Stringiem")
    public void wiersz_string() {
        boolean czy_poprawne = Dane.Dane("5","xxx","2");
        assertFalse(czy_poprawne);
    }

    @Test
    @DisplayName("Sprawdzenie poprawności kodu gdy kolumna jest zerem")
    public void kolumna_zero() {
        boolean czy_poprawne = Dane.Dane("0","5","5");
        assertFalse(czy_poprawne);
    }

    @Test
    @DisplayName("Sprawdzenie poprawności kodu gdy kolumna jest ujwmna")
    public void kolumna_ujemny() {
        boolean czy_poprawne = Dane.Dane("-5","2","5");
        assertFalse(czy_poprawne);
    }

    @Test
    @DisplayName("Sprawdzenie poprawności kodu gdy wierz jest Stringiem")
    public void kolumna_string() {
        boolean czy_poprawne = Dane.Dane("xxx","5","2");
        assertFalse(czy_poprawne);
    }

    @Test
    @DisplayName("Sprawdzenie poprawności kodu gdy hetman jest zerem")
    public void hetman_zero() {
        boolean czy_poprawne = Dane.Dane("5","2","0");
        assertTrue(czy_poprawne);
    }

    @Test
    @DisplayName("Sprawdzenie poprawności kodu gdy hetman jest ujemny")
    public void hetman_ujemny() {
        boolean czy_poprawne = Dane.Dane("5","2","-5");
        assertFalse(czy_poprawne);
    }

    @Test
    @DisplayName("Sprawdzenie poprawności kodu gdy wpisano za dużo hetmanów")
    public void hetman_za_duzy() {
        boolean czy_poprawne = Dane.Dane("5","2","15");
        assertFalse(czy_poprawne);
    }

    @Test
    @DisplayName("Sprawdzenie poprawności kodu gdy hetman jest Stringiem")
    public void hetman_za_string() {
        boolean czy_poprawne = Dane.Dane("5","2","xxx");
        assertFalse(czy_poprawne);
    }

    @Test
    @DisplayName("Sprawdzenie poprawności kodu gdy wszystko jest ok")
    public void wszystko_OK() {
        boolean czy_poprawne = Dane.Dane("5","2","7");
        assertTrue(czy_poprawne);
    }

    @Test
    @DisplayName("Sprawdzenie poprawności bić")
    public void bicia() {
        int[][] szachownica = {
                {1, 1, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 0, 0, 0, 0, 0, 0, 0}
        };
        int bicia = Program.Bicia(szachownica, 3,9);
        assertEquals(22, bicia);
    }

    @Test
    @DisplayName("Sprawdzenie poprawności bić gdy szachownica jest pusta")
    public void szachownica_pusta() {
        int[][] szachownica = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        int bicia = Program.Bicia(szachownica, 5,4);
        assertEquals(0, bicia);
    }

    @Test
    @DisplayName("Sprawdzenie poprawności bić gdy jest 1 hetman")
    public void szachownica_jeden() {
        int[][] szachownica = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},

        };
        int bicia = Program.Bicia(szachownica, 6,6);
        assertEquals(0, bicia);
    }

    @Test
    @DisplayName("Sprawdzenie poprawności bić gdy szachownica jest pusta")
    public void szachownica_hetmany_nie_bija_sie() {
        int[][] szachownica = {
                {1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0}
        };
        int bicia = Program.Bicia(szachownica, 5,5);
        assertEquals(0, bicia);
    }

    @Test
    @DisplayName("Sprawdzenie poprawności bić gdy szachownica jest pusta")
    public void szachownica_pelna() {
        int[][] szachownica = {
                {1, 1},
                {1, 1}
        };
        int bicia = Program.Bicia(szachownica, 2,2);
        assertEquals(12, bicia);
    }
}
