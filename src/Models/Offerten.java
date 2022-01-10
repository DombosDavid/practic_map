package Models;

import java.time.LocalDate;

public class Offerten
{

    private int Id;
    private String Unternehmensname;
    private float Preis;
    private int Mehrwertsteuer;
    private String Adresse;
    private String Ort;

    public Offerten(int id, String unternehmensname, float preis, int mehrwertsteuer, String adresse,String ort) {
        Id=id;
        Unternehmensname=unternehmensname;
        Preis=preis;
        Mehrwertsteuer=mehrwertsteuer;
        Adresse=adresse;
        Ort=ort;
    }

    public int getId()
    {
        return Id;
    }

    public String getUnternehmensname()
    {
        return Unternehmensname;
    }

    public float getPreis()
    {
        return Preis;
    }

    public int getMehrwertsteuer()
    {
        return Mehrwertsteuer;
    }

    public String getAdresse()
    {
        return Adresse;
    }

    public String getOrt()
    {
        return Ort;
    }

    public void setId(int id)
    {
        Id = id;
    }

    public void setUnternehmensname(String unternehmensname)
    {
        Unternehmensname = unternehmensname;
    }

    public void setPreis(float preis)
    {
        Preis = preis;
    }

    public void setMehrwertsteuer(int mehrwertsteuer)
    {
        Mehrwertsteuer = mehrwertsteuer;
    }

    public void setAdresse(String adresse)
    {
        Adresse = adresse;
    }

    public void setOrt(String ort)
    {
        Ort = ort;
    }

    @Override
    public String toString() {
        return "Offerten{" +
                "Id='" + Id + '\'' +
                "& Kategorie='" + Unternehmensname + '\'' +
                "& Preis=" + Preis +
                "& Menge=" + Mehrwertsteuer +
                "& Herstellungsdatum=" + Adresse +
                "& Ort="+Ort+
                '}';
    }
}
