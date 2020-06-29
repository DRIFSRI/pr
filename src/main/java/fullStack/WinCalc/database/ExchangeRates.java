package fullStack.WinCalc.database;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;
import java.util.ArrayList;
//

import fullStack.WinCalc.database.ElementTable.cValute;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

//import javax.swing.text.Document;

//
public class ExchangeRates
{
    cTableValute ActualTable =null;
    ExchangeRates ActualExhangeRates=null;

    //Обновить таблицу валют
    private void Update()
    {
        //ActualTable.UpdateDate.setTime(4222);
        if ((ActualTable!=null)&& ActualTable.ActualTime())
            try
            {
                ActualTable = InspectValute();
            }
            catch (Exception c)
            {
                System.out.println("Not inspect valuta");
            }
        SQLConnection.Con(ActualTable.lValute,ActualTable.UpdateDate);
    }
    //Таблица валют + время
    private class cTableValute
    {
        ArrayList<cValute> lValute;
        Date UpdateDate;
        cTableValute(ArrayList<cValute>lValute,Date UpdateDate)
        {
            this.lValute =lValute;
            this.UpdateDate = UpdateDate;
        }
        //Функция определения времени обновления
        private boolean ActualTime()
        {
            return true;
        }

    }
    public ExchangeRates ExchangeRates()
    {
        if (ActualTable==null)
        {
            Update();
            ActualExhangeRates = this;
        }
        return ActualExhangeRates;
    }
    //получение таблицы валют с сайта
    public cTableValute InspectValute() throws Exception
    {
        ArrayList<cValute> lValute = new ArrayList<cValute>();
        Document dc = Jsoup.connect("http://www.cbr.ru/scripts/XML_daily.asp").get();

        for (Element e:dc.  select("Valute"))
        {
            lValute.add(new cValute(
                    Integer.parseInt(e.select("NumCode").text())
                    ,e.select("CharCode").text()
                    ,Integer.parseInt(e.select("Nominal").text())
                    ,e.select("Name").text()
                    ,Double.parseDouble(e.select("Value").text().replace(",","."))
            ));
        }
        String []mstr = dc.select("ValCurs").attr("Date").split("\\.");
        return new cTableValute(lValute, new Date(Integer.parseInt(mstr[2]), Integer.parseInt(mstr[1]), Integer.parseInt(mstr[0])));
    }
    //
    public Date getDate()
    {
        return ActualTable.UpdateDate;
    }
    //not work
    public String[] a()
    {
        return null;
    }

    public String getURLContent(String p_sURL)
    {
        URL oURL;
        URLConnection oConnection;
        BufferedReader oReader;
        String sLine;
        StringBuilder sbResponse;
        String sResponse = null;

        try
        {
            oURL = new URL(p_sURL);
            oConnection = oURL.openConnection();
            oReader = new BufferedReader(new InputStreamReader(oConnection.getInputStream()));
            sbResponse = new StringBuilder();

            while((sLine = oReader.readLine()) != null)
            {
                sbResponse.append(sLine);
            }

            sResponse = sbResponse.toString();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return sResponse;
    }
}