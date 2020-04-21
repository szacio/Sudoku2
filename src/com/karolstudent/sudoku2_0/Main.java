package com.karolstudent.sudoku2_0;



/**
 * Created by Karol on 2020-04-14
 * Formatted sudoku site: http://www.sudoku-xls.com/TextArc.txt
 */
public class Main {
    public static void main(String[] args) {
        String sudoku = "\t3\t\t\t2\t4\t5\t\t6\n" +
                "9\t\t6\t\t1\t\t\t\t2\n" +
                "4\t\t7\t\t\t\t8\n" +
                "2\t6\t\t\t4\t\t\n" +
                "4\t\t\t8\t\t\n" +
                "1\t5\t\t\t\t\t\t\n" +
                "7\t\t\t\t5\t\t9\t\n" +
                "9\t\t\t\t7\t2\t5\t\n" +
                "5\t4\t\t2\t\t3\t\t\t";
        System.out.print(sudoku);
    }
}



/*
//import java.util.Arrays;

public class Sudoku {
    static boolean trybTestujący = false;
    public static void main(String[] args) {

        int[][] latweSudoku =
                {{1, 0, 3, 0, 8, 0, 9, 4, 2},
                        {9, 6, 7, 4, 5, 0, 1, 3, 0},
                        {4, 2, 0, 0, 3, 1, 0, 6, 5},
                        {0, 0, 6, 5, 0, 8, 0, 9, 0},
                        {7, 4, 2, 0, 0, 0, 8, 5, 1},
                        {0, 9, 0, 2, 0, 4, 3, 0, 0},
                        {6, 8, 0, 3, 4, 0, 0, 2, 9},
                        {0, 3, 9, 0, 6, 5, 4, 1, 7},
                        {5, 7, 4, 0, 2, 0, 6, 0, 3}};

        int[][] srednieSudoku =
                {{4,0,0,0,6,0,0,0,9},
                        {0,1,0,4,0,0,0,0,5},
                        {0,9,5,8,0,0,0,6,0},
                        {3,0,0,0,0,8,9,0,0},
                        {0,0,0,0,4,0,0,0,0},
                        {0,8,0,2,5,0,0,0,6},
                        {0,6,0,0,0,0,3,0,0},
                        {0,0,0,0,0,0,7,2,0},
                        {0,0,8,0,0,0,0,5,4}};
        //4 2 3 7 6 5 8 1 9
        //8 1 6 4 9 3 2 7 5
        //7 9 5 8 2 1 4 6 3
        //3 5 2 6 1 8 9 4 7
        //6 7 1 3 4 9 5 8 2
        //9 8 4 2 5 7 1 3 6
        //2 6 7 5 8 4 3 9 1
        //5 4 9 1 3 6 7 2 8
        //1 3 8 9 7 2 6 5 4

        int[][] trudneSudoku =
                {{3,0,0,0,1,9,5,0,0},
                        {0,0,7,2,0,0,0,0,0},
                        {5,9,0,0,0,0,3,0,0},
                        {0,4,0,0,9,0,7,0,0},
                        {0,0,2,0,0,0,0,0,8},
                        {0,0,1,0,0,0,6,2,0},
                        {0,0,0,0,0,0,4,6,0},
                        {0,0,0,0,0,0,0,5,0},
                        {0,1,6,3,0,4,0,0,0}};
        //3 2 8 4 1 9 5 7 6
        //1 6 7 2 3 5 8 9 4
        //5 9 4 7 6 8 3 1 2
        //8 4 5 6 9 2 7 3 1
        //6 3 2 5 7 1 9 4 8
        //9 7 1 8 4 3 6 2 5
        //2 5 9 1 8 7 4 6 3
        //4 8 3 9 2 6 1 5 7
        //7 1 6 3 5 4 2 8 9



//        int[][] sudoku = latweSudoku;
        int[][] robocze = trudneSudoku;
        int[][][] checkRobocze = new int[9][9][9];
//        int[][] iterKwadrat =
//                {       {r[0][0], r[0][1], r[0][2], r[1][0], r[1][1], r[1][2], r[2][0], r[2][1], r[2][2]},
//                        {r[0][3], r[0][4], r[0][5], r[1][3], r[1][4], r[1][5], r[2][3], r[2][4], r[2][5]},
//                        {r[0][6], r[0][7], r[0][8], r[1][6], r[1][7], r[1][8], r[2][6], r[2][7], r[2][8]},

//                        {r[3][0], r[3][1], r[3][2], r[4][0], r[4][1], r[4][2], r[5][0], r[5][1], r[5][2]},
//                        {r[3][3], r[3][4], r[3][5], r[4][3], r[4][4], r[4][5], r[5][3], r[5][4], r[5][5]},
//                        {r[3][6], r[3][7], r[3][8], r[4][6], r[4][7], r[4][8], r[5][6], r[5][7], r[5][8]},

//                        {r[6][0], r[6][1], r[6][2], r[7][0], r[7][1], r[7][2], r[8][0], r[8][1], r[8][2]},
//                        {r[6][3], r[6][4], r[6][5], r[7][3], r[7][4], r[7][5], r[8][3], r[8][4], r[8][5]},
//                        {r[6][6], r[6][7], r[6][8], r[7][6], r[7][7], r[7][8], r[8][6], r[8][7], r[8][8]}};


        System.out.println("Program rozwiaze to sudoku:");
        drukujDuzeSudoku(robocze);
        System.out.println("");


        int jeszczeJest = 0;
        checkRobocze = buduj81CheckBoxow(robocze);
        do {
            jeszczeJest = 0;
            outerloop:
            for (int y = 0; y < 9; y++) {
                for (int x = 0; x < 9; x++) {

                    // Wypelniam jesli jakas liczba pojawia sie tylko raz w kwadracie
                    int ktorySam = jestSamElementTablicy(checkRobocze[y][x]);
                    if (ktorySam != 0 && sprawdzLiczbe(ktorySam, y, x, robocze)) {
                        robocze[y][x] = ktorySam;
                        checkRobocze = akt81CheckBoxow(ktorySam, y, x, checkRobocze);
                        checkRobocze = aktParyCheckBox(checkRobocze);
                        jeszczeJest++;
                        if(trybTestujący) System.out.println("Wpisano cyfrę " + ktorySam + ". Kolumna: " + (x + 1)  + ". Wiersz: " + (y + 1) + ".");
                        break outerloop;
                    }

                    // Wypelniam jesli jakas liczba pojawia sie tylko raz w kwadracie/kolumnie/wierszu

                    for (int liczba = 1; liczba < 10; liczba++) {
                        boolean moge = (sprawdzLiczbe(liczba, y, x, robocze) && robocze[y][x] == 0 && checkRobocze[y][x][liczba - 1] == liczba);
                        //checkRobocze = buduj81CheckBoxow(robocze);
                        if (moge && (ileCheckKwadrat(liczba, y, x, checkRobocze) == 1 || ileCheckKolumna(liczba, y, x, checkRobocze) == 1 || ileCheckWiersz(liczba, y, x, checkRobocze) == 1)) {
                            robocze[y][x] = liczba;
                            checkRobocze = akt81CheckBoxow(liczba, y, x, checkRobocze);
                            checkRobocze = aktParyCheckBox(checkRobocze);
                            jeszczeJest++;
                            if(trybTestujący) System.out.println("Wpisano cyfrę " + liczba + ". Kolumna: " + (x + 1)  + ". Wiersz: " + (y + 1) + ".");

                        }
                    }
                }
            }



        } while (jeszczeJest > 0);
        drukujDuzeSudoku(robocze);
        //drukujMaleSudoku(robocze);
        //checkRobocze = aktParyCheckBox(checkRobocze);

        sprawdzSudoku(robocze);
        // drukujMaleSudoku(robocze);

        System.out.println("");
        //drukujMaleSudoku(trudne2);
        if(trybTestujący)drukuj81CheckBoxow(checkRobocze);

//    sprawdz czy jest i++ w rzadku;
//    jesli go nie ma to wywolaj funkcje

    }

    // Wystawia TRUE jesli w kolumnie, wierszu i kwadracie nie ma danej liczby
    static boolean sprawdzLiczbe(int liczba, int polY, int polX, int[][] sudoku) {

        if (sudoku[polY][polX] != 0) return false;
        int[][][] kwadracik = new int[3][3][9];
        //int count = 0;
        int xRogKw = (polX / 3) * 3;
        int yRogKw = (polY / 3) * 3;
        //System.out.println("");
        for (int yKwad = 0; yKwad < 3; yKwad++) { //polozenie wewnetrzne Y
            for (int xKwad = 0; xKwad < 3; xKwad++) { // polozenie wewnetrzne X
                kwadracik[polY / 3][polX / 3][3 * yKwad + xKwad] = sudoku[yRogKw + yKwad][xRogKw + xKwad];
                //System.out.print(kwadracik[yKwad][xKwad][3*yKwad+xKwad]);
                //count++;
            }
            //System.out.println("");
        }
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][polX] == liczba) return false;
            if (sudoku[polY][i] == liczba) return false;
//            if(liczba != 0){
//                System.out.println("W kwadracie: "+kwadracik[polY / 3][polX / 3][i]);
//                System.out.println("Liczba: "+liczba);
//            }

            if (kwadracik[polY / 3][polX / 3][i] == liczba) {
                return false;
            }
        }

        return true;
    }

    // Funkcja dla sprawdzania czy w checkBoxie jest tylko jeden element
    static int jestSamElementTablicy(int[] tempTab) {
        int counter = 0;
        int sum = 0;
        for (int i : tempTab) {
            if (i != 0) counter++;
            sum += i;
        }
        if (counter != 1) return 0;
        return sum;
    }

    // Docelowo ma sprawdzać, czy w checkBoxach kwadratu (3x3) podana liczba wystapiła tylko raz
    static int ileCheckKwadrat(int liczba, int polY, int polX, int[][][] tCheckSudoku) {
        int xRogKwadratu = (polX / 3) * 3;
        int yRogKwadratu = (polY / 3) * 3;
        int ileRazyCheck = 0;
        for (int yKw = 0; yKw < 3; yKw++) {           //ide po osi Y kwadratu
            for (int xKw = 0; xKw < 3; xKw++) {       //ide po osi X kwadratu
                if (tCheckSudoku[yRogKwadratu + yKw][xRogKwadratu + xKw][liczba - 1] == liczba) {
                    ileRazyCheck++;
                    //System.out.println("kwadrat: "+"x"+(xRogKwadratu+xKw+1)+" y"+(yRogKwadratu+yKw+1)+"   liczba:"+liczba+" ilerazy:"+ileRazyCheck);
                }
            }
        }
        //System.out.println(liczba+" wystapila "+ileRazyCheck+" razy");
        return ileRazyCheck;
    }

    // Docelowo ma sprawdzać, czy w checkBoxach całej kolumny podana liczba wystapiła tylko raz
    static int ileCheckKolumna(int liczba, int polY, int polX, int[][][] tCheckSudoku) {
        int ileRazyCheck = 0;
        for (int nrWiersza = 0; nrWiersza < 9; nrWiersza++) {           //ide po osi Y kwadratu
            if (tCheckSudoku[nrWiersza][polX][liczba - 1] == liczba) {
                ileRazyCheck++;
                //System.out.println("  kolumna: "+"x"+(polX+1)+" y"+(nrWiersza+1)+"   liczba:"+liczba+" ilerazy:"+ileRazyCheck);
            }
        }
        //System.out.println(liczba+" wystapila "+ileRazyCheck+" razy");
        return ileRazyCheck;
    }

    // Docelowo ma sprawdzać, czy w checkBoxach całego wiersza podana liczba wystapiła tylko raz
    static int ileCheckWiersz(int liczba, int polY, int polX, int[][][] tCheckSudoku) {
        int ileRazyCheck = 0;
        for (int nrKolumny = 0; nrKolumny < 9; nrKolumny++) {           //ide po osi Y kwadratu
            if (tCheckSudoku[polY][nrKolumny][liczba - 1] == liczba) {
                ileRazyCheck++;
                //System.out.println("    wiersz: x"+(nrKolumny+1)+" y"+(polY+1)+"   liczba:"+liczba+" ilerazy:"+ileRazyCheck);
            }
        }
        //System.out.println(liczba+" wystapila "+ileRazyCheck+" razy");
        return ileRazyCheck;
    }

    // Drukuje sudoku w "ładnej" ramce
    static void drukujDuzeSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] != 0) System.out.print(" " + sudoku[i][j]);
                else System.out.print("  ");

                if (j == 2 || j == 5) System.out.print(" ║ ");
                else if (j != 8) System.out.print(" │ ");
            }

            if (i == 2 || i == 5) System.out.println("\n═════════════╬══════════════╬══════════════");
            else if (i != 8) System.out.println("\n───┼────┼────║────┼────┼────║────┼────┼────");
        }
        System.out.println("");
    }

    // Drukuje proste sudoku, bez "kratki"
    static void drukujMaleSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] != 0) System.out.print(sudoku[i][j] + " ");
                else System.out.print(". ");
            }
            System.out.println("");
        }
    }

    // Funkcja tworzy macierz checkBoxów [nrWiersza][nrKolumny][liczby, np. 103400789], drukuje go
    static int[][][] buduj81CheckBoxow(int[][] sudoku) {
        // Wypelnianie checkboxów dla kazdego z 81 okienek
        boolean mozeTuByc = true;
        int[][][] checkRobocze = new int[9][9][9];
        for (int y = 0; y < 9; y++) {
            if(trybTestujący)System.out.println("Wykaz checkBoxow w " + (y + 1) + ". wierszu");
            for (int x = 0; x < 9; x++) {
                if(trybTestujący)System.out.print((x + 1) + ": ");
                for (int liczba = 1; liczba < 10; liczba++) {
                    mozeTuByc = sprawdzLiczbe(liczba, y, x, sudoku);
                    if (mozeTuByc) {
                        checkRobocze[y][x][liczba - 1] = liczba;
                        if(trybTestujący)System.out.print(checkRobocze[y][x][liczba - 1]);
                    }
                    if (!mozeTuByc) {
                        checkRobocze[y][x][liczba - 1] = 0;
                        if(trybTestujący)System.out.print(".");
                    }

                }
                if(trybTestujący)System.out.println("");
            }
            if(trybTestujący)System.out.println("");
        }
        if(trybTestujący)System.out.println("*************************************");
        return checkRobocze;
    }

    // Funkcja po wpisaniu liczby do sudoku usuwa ją z checkboxów w jej kolumnie, wierszu i kwadracie
    static int[][][] akt81CheckBoxow(int liczba, int polY, int polX, int[][][] checkBoxy) {
        int iter = 0;
        int rogY = (polY / 3) * 3;
        int rogX = (polX / 3) * 3;

        checkBoxy[polY][polX][liczba - 1] = 0;
        for (int yKw = 0; yKw < 3; yKw++) {
            for (int xKw = 0; xKw < 3; xKw++) {
                checkBoxy[polY][iter][liczba - 1] = 0;        // usun liczbe w kazdym checkBox kolumny
                checkBoxy[iter][polX][liczba - 1] = 0;        // usun liczbe w kazdym checkBox wiersza
                checkBoxy[rogY + yKw][rogX + xKw][liczba - 1] = 0;// usun liczbe w kazdym checkBox kwadratu
                checkBoxy[polY][polX][iter] = 0;            // wyczysc caly checkBox tam gdzie wpisałeś liczbę
                iter++;
            }
        }
        return checkBoxy;
    }

    // Funkcja na TRUDNIEJSZE sudoku, jesli jedyne możliwości w linii/wierszu pojawią się w kwadracie,
    // to nie wystapia gdzie indziej w tym kwadracie
    static int[][][] aktParyCheckBox(int[][][] checkBoxy) {
        // Kasowanie z checkboxow w kolumnie/wierszu liczb jesli  moga sie pojawic tylko w dwoch/trzech miejscach kwadratu (w linii)
        for (int Ykw = 0; Ykw < 3; Ykw++) {
            for (int Xkw = 0; Xkw < 3; Xkw++) {
                int rogY = Ykw * 3;
                int rogX = Xkw * 3;
                for (int liczba = 1; liczba < 10; liczba++) {
                    //int ileWKwadracie = 0;
                    for (int Iter = 0; Iter < 3; Iter++) {
                        int ileWWierszu = 0;
                        int ileWKolumnie = 0;
                        for (int iter = 0; iter < 3; iter++) {
                            if (checkBoxy[rogY + Iter][rogX + iter][liczba - 1] != 0) {
                                ileWWierszu++;
                            }
                            // ponizej sprytny myk: zamieniajac iter z Iter mamy obliczenia z priorytetem kolumn
                            if (checkBoxy[rogY + iter][rogX + Iter][liczba - 1] != 0) {
                                ileWKolumnie++;
                            }
                        }

                        // DZIAŁA! jeśli na caly wiersz liczba wystepuje tylko na wysokosci kwadratu, to czysci pozostale opcje z kwadratu
                        if (ileWWierszu > 1 && ileWWierszu == ileCheckWiersz(liczba, rogY + Iter, 0, checkBoxy)) { // czyszczenie kwadratu po wierszu
                            int jeden = (Iter + 1) % 3;
                            int drugi = (Iter + 2) % 3;
                            for (int i = 0; i < 3; i++) {
                                //czyszczenie dwóch innych wierszy kwadratu
                                checkBoxy[rogY + jeden][rogX + i][liczba - 1] = 0;
                                checkBoxy[rogY + drugi][rogX + i][liczba - 1] = 0;
                            }
                        }

                        // CZASEM PSUJE; jeśli na calą kolumnę liczba wystepuje tylko na wysokosci kwadratu, to czysci pozostale opcje z kwadratu
                        if (ileWKolumnie > 1 && ileWKolumnie == ileCheckKolumna(liczba, 0, rogX + Iter, checkBoxy)) { // czyszczenie kwadratu po kolumnach
                            int jeden = (Iter + 1) % 3;
                            int drugi = (Iter + 2) % 3;
                            for (int i = 0; i < 3; i++) {
                                //czyszczenie dwóch innych kolumn kwadratu
                                checkBoxy[rogY + i][rogX + jeden][liczba - 1] = 0;
                                checkBoxy[rogY + i][rogX + drugi][liczba - 1] = 0;
                            }
                        }

//                        //NIE DZIAŁA :( jesli wszystkie możliwe opcje z kwadratu są w jego wierszu, to czysci reszte tego wiersza
//                        if (ileWWierszu > 1 && ileCheckKwadrat(liczba, rogY, rogX, checkBoxy) == ileWWierszu) {
//                            //wyczysc wiersz poza tym kwadratem
//                            int jeden = (Iter + 1) % 3;
//                            int drugi = (Iter + 2) % 3;
//                            for (int i = 0; i < 9; i++) {
//                                if (i != (rogX + jeden) && i != (rogX + drugi)) {
//                                    checkBoxy[rogY + Iter][i][liczba - 1] = 0;
//                                }
//                            }
//                        }

//                        //CZASEM PSUJE; jesli wszystkie możliwe opcje z kwadratu są w jego kolumnie, to czysci reszte tej kolumny
//                        if (ileWWierszu > 1 && ileCheckKwadrat(liczba, rogY, rogX, checkBoxy) == ileWKolumnie) {
//                            //wyczysc kolumne poza tym kwadratem
//                            int jeden = (Iter + 1) % 3;
//                            int drugi = (Iter + 2) % 3;
//                            for (int i = 0; i < 9; i++) {
//                                if (i != (rogY + jeden) && i != (rogY + drugi)) {
//                                    checkBoxy[i][rogX + Iter][liczba - 1] = 0;
//                                }
//                            }
//                        }

                    }
                }
            }
        }

        return checkBoxy;
    }

    // Funkcja drukuje checkboxy kolejnych wierszy z podpisanymi z lewej kolumnami
    static void drukuj81CheckBoxow(int[][][] checkBoxy) {
        // Wypelnianie checkboxów dla kazdego z 81 okienek
        for (int y = 0; y < 9; y++) {
            System.out.println("Wykaz checkBoxow w " + (y + 1) + ". wierszu");
            for (int x = 0; x < 9; x++) {
                System.out.print((x + 1) + ": ");
                for (int liczba = 1; liczba < 10; liczba++) {
                    if (checkBoxy[y][x][liczba - 1] != 0) {
                        System.out.print(checkBoxy[y][x][liczba - 1]);
                    }
                    if (checkBoxy[y][x][liczba - 1] == 0) {
                        System.out.print(".");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("******** Koniec checkboxow *********");
    }

    // Funkcja zwraca informacje dot. tego czy sudoku jest poprawnie wypełnione (suma w wierszu = 45, malo wazna niescislosc)
    static void sprawdzSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            int suma = 0;
            for (int j = 0; j < 9; j++) {
                suma += sudoku[i][j];
                if (sudoku[i][j] == 0) {
                    System.out.println("Sudoku niepełne, brak m.in. (x" + (j + 1) + ",y" + (i + 1) + ")");
                    return;
                }
            }
            if (suma != 45) {
                System.out.println("Jest błąd w " + (i + 1) + ". linijce");
                return;
            }
        }
        System.out.println("Sudoku poprawne!:)");
    }
}



 */