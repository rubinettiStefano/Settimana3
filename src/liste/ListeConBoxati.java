package liste;

import java.util.ArrayList;

public class ListeConBoxati 
{
    public static void main(String[] args) 
    {
        //UNA LISTA, a differenza dei Vettori, NON può contenere primitivi
        //ArrayList<int> lista = new ArrayList<>();    

        //I tipi BOXATI sono versioni OGGETTIFICATE dei primitivi
        //int -> Integer
        //double -> Double
        //char -> Character
        //boolean -> Boolean

        //3 scopi
        //1) aggiungono metodi ai primitivi

        int a = 5;
        Integer b = 5; 
        //nonostante siano oggetti non seguono le stesse regole degli altri
        
        //2) Possiamo renderli null
        //int c = null;
        Integer d = null;

        // ClasseACaso ca = new ClasseACaso();
        // System.out.println(ca.stipendio);
        // System.out.println(ca.stipendioBoxato);
        //3) possiamo usarli nelle liste
        ArrayList<Integer> lista = new ArrayList<>();   

        lista.add(10);
        lista.add(65);
        lista.add(43);
        lista.add(63);
        lista.add(17);
        lista.add(3);

        Double somma = 0.0;

        for(int i=0;i<lista.size();i++)
        {
            somma+=lista.get(i);
        }
        System.out.println(somma);
    }
}
