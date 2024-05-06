package liste;

import java.util.ArrayList;
import java.util.Scanner;

public class AddioVettori 
{
    static Scanner term = new Scanner(System.in);
    public static void main(String[] args) 
    {
    
        
        //Definizione di Vettore
        //Insieme di elementi ordinati (con indice) dello stesso tipo, di dimensione FISSA
        sottoprogrammaConLista();


        //Definizione di Lista
        //Insieme di elementi ordinati (con indice) dello stesso tipo, di dimensione VARIABILE


    }

    static void sottoprogrammaConVettore()
    {
        int dimensione = 0;

        System.out.println("Quante Stringhe vuoi inserire?");
        dimensione = Integer.parseInt(term.nextLine());

        String[] vettore = new String[dimensione];

        for(int i=0;i<dimensione;i++)
        {
            System.out.println("Ok, dammi la Stringa numero "+(i+1));
            vettore[i] = term.nextLine();
        }

        String res = "Ecco cosa hai inserito:\n";
        for(int i=0;i<vettore.length;i++)
        {
            res+= vettore[i]+ "\n" ;
        }

        System.out.println(res);
    }

    static void sottoprogrammaConLista()
    {

        //tipo di elementi dentro la lista
        ArrayList<String>   lista        =          new ArrayList<>();
        //String[]          vettore      =          new String[dimensione]

        String continuare = "";
        do
        {
            System.out.println("--Ok, dammi una Stringa");
            String str = term.nextLine();
            lista.add(str);//sto AGGIUNGENDO un elemento alla prima posizione libera della lista

            System.out.println("--Ora la lista contiene "+lista.size()+" elementi");

           System.out.println("Scrivi c per continuare, f per fermarti");
           continuare = term.nextLine();

        }while(continuare.equals("c"));

        String res = "Ecco cosa hai inserito:\n";
        for(int i=0;i<lista.size();i++)
        {
        // res+= vettore[i]+ "\n" ;
           res+= lista.get(i)+ "\n" ;
        }

        System.out.println(res);
    }
}
