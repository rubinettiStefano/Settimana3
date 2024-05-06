package liste;

import java.util.ArrayList;
import java.util.Scanner;

import com.generation.db.Database;

import model.Piatto;

public class MainCattivo 
{
    public static void main(String[] args) 
    {
        Scanner term = new Scanner(System.in);
        //1) Chiedo piatti finchè l'utente ne ha voglia e li metto in una lista
        //2) controllo che tutti i piatti nella lista siano validi
        //3) SOLO se sono tutti validi, li inserisco nel db
        Database db = new Database("config.txt");
        
        ArrayList<Piatto> lista = new ArrayList<>();

        String continuare = "";
        do
        {
            Piatto p = new Piatto();
            System.out.println("Dammi il nome");
            p.nome = term.nextLine();
            System.out.println("Dammi il prezzo");
            p.prezzo = Double.parseDouble(term.nextLine());
    
            lista.add(p);
            
            System.out.println("Scrivi c per continuare, f per fermarti");
            continuare = term.nextLine();
        }while(continuare.equals("c"));


        boolean tuttiIpiattiSonoValidi = true;

        for(int i=0;i<lista.size();i++)
        {
            if(!lista.get(i).isValid())
                tuttiIpiattiSonoValidi = false;
        }

        if(tuttiIpiattiSonoValidi)
        {
            //inserisco
            for(int i=0;i<lista.size();i++)
            {
                db.insert(lista.get(i).generaInsert());
            }

            System.out.println("Tutti i piatti sono stati inseriti");
        }
        else
        {
            System.out.println("Metti i dati bene, te li ho buttati via tutti");
        }
    }
}
