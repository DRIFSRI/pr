package com.devcolibri.databaseexam;

public class Valute
{
    Integer NumCode;
    String CharCode;
    Integer  Nominal;
    String Name;
    Double Value;

    Valute(Integer NumCode,
           String CharCode,
           Integer  Nominal,
           String Name,
           Double Value)
    {
        this.NumCode =NumCode;
        this.CharCode =CharCode;
        this.Nominal = Nominal;
        this.Name = Name;
        this.Value = Value;

        /*  NumCode
     CharCode
      Nominal
     Name
     Value*/
    }

    public String[] getArgs()
    {

        return new String[]{NumCode.toString(),CharCode,Nominal.toString(),Name.toString(),Value.toString()};
    }

    public String toString()
    {
        String s = "NumCode:"+NumCode+", CharCode:"+CharCode+", Nominal:"+Nominal+", Name:"+Name+", Value:"+Value;
        return s;
    }
}
