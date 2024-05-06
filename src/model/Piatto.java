package model;
//G.I.G.O.
//Garbage
//In
//Garbage
//Out
//Se nel mio programma entra spazzatura, il mio programma produrrà spazzatura
public class Piatto 
{
    public Integer id;
    public String nome;
    public Double prezzo;

    public Piatto(){}

    public Piatto(Integer id,String nome,Double prezzo)
    {
        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public Piatto(String nome,Double prezzo)
    {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public Piatto(String csv)
    {
        String[] parti = csv.split(",");
        this.id = Integer.parseInt(parti[0]);
        this.nome = parti[1];
        this.prezzo = Double.parseDouble(parti[2]);
    }

    public boolean isValid()
    {
        //RESTITUIRE TRUE se lo STATO di un oggetto è VALIDO, false se non lo è
                                            //isBlank è un metodo delle String che restituisce
                                            //true se la String non ha caratteri diversi dallo spazio
        boolean nomeValido      = nome!=null && !nome.isBlank();//"" "             "
        boolean prezzoValido    = prezzo!=null && prezzo>=0;
        boolean idValido        = id==null || id>0;
        return nomeValido && prezzoValido && idValido;
    }

    public String generaInsert() 
    {
       String template = "INSERT INTO piatti (nome,prezzo) VALUES ('[nome]',[prezzo])";

       template =   template
                    .replace("[nome]", nome)
                    .replace("[prezzo]", prezzo+"");
                    
       return template;             
    }
}
