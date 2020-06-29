package fullStack.WinCalc.database;

public class cValute
{
    Integer NumCode;
    String CharCode;
    Integer Nominal;
    String Name;
    Double Value;
    cValute(Integer NumCode,
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
