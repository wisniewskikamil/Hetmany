package Hetmany;

public class Dane {

    static boolean Dane(String str_kolumny, String str_wiersze, String str_hetmany){

        try{
            Main.kolumny = Integer.parseInt(str_kolumny);
            Main.wiersze = Integer.parseInt(str_wiersze);
            Main.hetmany = Integer.parseInt(str_hetmany);
        }catch(NumberFormatException e)
        {
            return false;
        }

        if(Main.wiersze>0 && Main.kolumny>0 && Main.hetmany>-1 && Main.hetmany<=Main.wiersze*Main.kolumny){
            return true;
        }else {
            return false;
        }
    }
}

