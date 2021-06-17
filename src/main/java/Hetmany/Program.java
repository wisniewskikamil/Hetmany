package Hetmany;

import java.util.Random;

public class Program {
    int[][] szachownica;

    public Program(int wiersze, int kolumny, int hetmany){
        Random generator = new Random();
        szachownica = new int[wiersze][kolumny];
        int ustaw_wiersz, ustaw_kolumna;


        for (int x = 0; x < wiersze; x++) {
            for (int y = 0; y < kolumny; y++) {
                szachownica[x][y] = 0;
            }
        }

        for (int i = 0; i < hetmany; i++) {
            for (; ; ) {
                ustaw_wiersz = generator.nextInt(wiersze);
                ustaw_kolumna = generator.nextInt(kolumny);

                if (szachownica[ustaw_wiersz][ustaw_kolumna] == 0) {
                    szachownica[ustaw_wiersz][ustaw_kolumna] = 1;
                    break;
                }
            }
        }

    }

//---------------------------------------------------------------------
//---------------------------------------------------------------------
//---------------------------------------------------------------------

    static int Bicia(int[][] szachownica, int wiersze, int kolumny){
        int bicia=0;
        int wiersz,zap1,zap2,kolumna;
        char alfabet = 'A';
        int cyfry = 1;

        wiersze = wiersze-1;
        kolumny = kolumny-1;

        for (wiersz = 0; wiersz <= wiersze; wiersz++) {
            for (kolumna = 0; kolumna <= kolumny; kolumna++) {
                if (szachownica[wiersz][kolumna] == 1) {
                    zap1 = wiersz;
                    zap2 = kolumna;
                    for (zap1 = wiersz + 1; zap1 <= wiersze; zap1++) {
                        if (zap1 > wiersze) {
                            break;
                        } else if (szachownica[zap1][zap2] == 1) {
                            bicia = bicia + 1;
                            break;
                        }
                    }

                    zap1 = wiersz;
                    zap2 = kolumna;

                    for (zap1 = wiersz - 1; zap1 >= 0; zap1--) {
                        if (zap1 < 0) {
                            break;
                        } else if (szachownica[zap1][zap2] == 1) {
                            bicia = bicia + 1;
                            break;
                        }
                    }

                    zap1 = wiersz;
                    zap2 = kolumna;

                    for (zap2 = kolumna + 1; zap2 <= kolumny; zap2++) {
                        if (zap2 > kolumny) {
                            break;
                        } else if (szachownica[zap1][zap2] == 1) {
                            bicia = bicia + 1;
                            break;
                        }
                    }

                    zap1 = wiersz;
                    zap2 = kolumna;

                    for (zap2 = kolumna - 1; zap2 >= 0; zap2--) {
                        if (zap2 < 0) {
                            break;
                        } else if (szachownica[zap1][zap2] == 1) {
                            bicia = bicia + 1;
                            break;
                        }
                    }

                    zap1 = wiersz;
                    zap2 = kolumna;

                    for (zap1 = wiersz - 1, zap2 = kolumna - 1; zap1 >= 0 || zap2 >= 0; zap1--, zap2--) {
                        if (zap1 < 0 || zap2 < 0) {
                            break;
                        } else if (szachownica[zap1][zap2] == 1) {
                            bicia = bicia + 1;
                            break;
                        }
                    }

                    zap1 = wiersz;
                    zap2 = kolumna;

                    for (zap1 = wiersz - 1, zap2 = kolumna + 1; zap1 >= 0 || zap2 <= kolumny; zap1--, zap2++) {
                        if (zap1 < 0 || zap2 > kolumny) {
                            break;
                        } else if (szachownica[zap1][zap2] == 1) {
                            bicia = bicia + 1;
                            break;
                        }
                    }

                    zap1 = wiersz;
                    zap2 = kolumna;

                    for (zap1 = wiersz + 1, zap2 = kolumna - 1; zap1 <= wiersze || zap2 >= 0; zap1++, zap2--) {
                        if (zap1 > wiersze || zap2 < 0) {
                            break;
                        } else if (szachownica[zap1][zap2] == 1) {
                            bicia = bicia + 1;
                            break;
                        }
                    }

                    zap1 = wiersz;
                    zap2 = kolumna;

                    for (zap1 = wiersz + 1, zap2 = kolumna + 1; zap1 <= wiersze || zap2 <= kolumny; zap1++, zap2++) {
                        if (zap1 > wiersze || zap2 > kolumny) {
                            break;
                        } else if (szachownica[zap1][zap2] == 1) {
                            bicia = bicia + 1;
                            break;
                        }
                    }

                }
            }
        }


        for (int a = 0; a <= kolumny; a++) {
            System.out.print(alfabet++ + " ");
        }
        System.out.println();

        for(int a=0;a<=kolumny*2;a++) {
            System.out.print("-");
        }

        System.out.println();
        for (int x = 0; x <= wiersze; x++) {
            for (int y = 0; y <= kolumny; y++) {
                if (szachownica[x][y] == 1) {
                    //System.out.print("|" + "X" + "|");
                    System.out.print(szachownica[x][y] + " ");
                } else
                    //System.out.print("|" + " " + "|");
                    System.out.print(szachownica[x][y] + " ");
            }
            System.out.println("|" + cyfry);
            cyfry++;
        }




        System.out.println();
        System.out.println("Bicie może nastąpić " + bicia + " razy");
        return bicia;
    }
}
