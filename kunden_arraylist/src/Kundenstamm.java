import java.util.ArrayList;

public class Kundenstamm {

    private static final short anzahlKunden = 59;

    public static short getAnzahlKunden() {
        return anzahlKunden;
    }

    public static short getAnzahlKundenArrayList() { return (short) liesKundenAsArrayList().size(); }

    public static Kunde[] liesKunden() {

        Kunde[] kundenliste = new Kunde[getAnzahlKunden()];

        kundenliste[0]= new Kunde(1001,"Rolf","Birkhohl","07.09.1958","Rekumer Str. 18",45721,"Haltern am See","01.01.1990","m","verheiratet",3);
        kundenliste[1]= new Kunde(1020,"Heinz ","Birkhohl","27.01.1951","Bahnhofstr. 2",45768,"Marl","01.01.1990","m","ledig",0);
        kundenliste[2]= new Kunde(1030,"Klaus","Starke","02.08.1946","Am Bagno 10",48301,"Nottuln","01.01.1990","m","verheiratet",3);
        kundenliste[3]= new Kunde(1040,"Patrick","Kunze","05.07.1958","Am Sportplatz 32",48249,"Duelmen","01.01.1990","m","verheiratet",1);
        kundenliste[4]= new Kunde(1050,"Silke","Jochmann","16.10.1970","Olympiastrasse 22",48301,"Nottuln","01.03.2000","w","verheiratet",2);
        kundenliste[5]= new Kunde(1060,"Michael","Zimmer","16.12.1972","Weseler Str. 20",45721,"Haltern am See","02.07.1997","m","verheiratet",4);
        kundenliste[6]= new Kunde(2010,"Sarah","Kaes","27.11.1964","Bahnhofstr. 9",45721,"Haltern am See","01.01.1990","w","ledig",0);
        kundenliste[7]= new Kunde(2020,"Daniela","Rose","29.12.1960","Mondstrasse 12",48143,"Muenster","01.10.1998","w","verheiratet",1);
        kundenliste[8]= new Kunde(2025,"Herbert","Hinze","02.05.1963","Schillerstrasse 23",48143,"Muenster","15.06.1992","m","verheiratet",3);
        kundenliste[9]= new Kunde(2030,"Kevin","Zurni","19.07.1968","Hauptstrasse 33",48249,"Duelmen","01.07.1990","m","verheiratet",1);
        kundenliste[10]= new Kunde(3010,"Ernst","Breke","25.08.1967","Hauptstrasse 34",45768,"Marl","01.07.2010","m","verheiratet",2);
        kundenliste[11]= new Kunde(3020,"Sabine","Luetzler","20.05.1973","Grauten Ihl 24",48301,"Nottuln","01.08.1990","w","verheiratet",3);
        kundenliste[12]= new Kunde(3030,"Steffen","Kraus","13.09.1964","Kroegerweg 3",48155,"Muenster","01.07.1991","m","geschieden",2);
        kundenliste[13]= new Kunde(4005,"Anette","Griese","27.03.1969","Rappaportstasse 4",45768,"Marl","01.01.1992","w","verheiratet",3);
        kundenliste[14]= new Kunde(4010,"Edgar","Kohn","22.08.1972","Seestrasse 4",45721,"Haltern am See","01.07.1992","m","verheiratet",0);
        kundenliste[15]= new Kunde(4015,"Albrecht","Mueller","25.12.1973","Toni-Turek-Strasse 20",48301,"Nottuln","01.01.1993","m","verheiratet",2);
        kundenliste[16]= new Kunde(4020,"Bernhard","Beyer","25.07.1969","Bergstrasse 28",45768,"Marl","01.01.1993","m","verheiratet",0);
        kundenliste[17]= new Kunde(4025,"Barbara","Zachow","05.06.1972","Halterner Str. 1",48249,"Duelmen","01.06.1996","w","verheiratet",1);
        kundenliste[18]= new Kunde(4030,"Anne","Ostendorf","26.12.1992","Hochstrasse 58",46236,"Bottrop","01.08.2009","w","ledig",0);
        kundenliste[19]= new Kunde(4035,"Alfred","Kramer","20.02.1960","Oberhausener Str. 7",46236,"Bottrop","01.02.1994","m","ledig",0);
        kundenliste[20]= new Kunde(4040,"Eckhard","Elten","09.04.1962","Sythener Str. 30",45721,"Haltern am See","14.03.1994","m","verheiratet",0);
        kundenliste[21]= new Kunde(4045,"Birgit","Krieg","01.09.1994","Essener Str. 58",46236,"Bottrop","01.08.2010","w","ledig",0);
        kundenliste[22]= new Kunde(4050,"Dagmar","Blume","01.12.1976","Mondstrasse 13",48143,"Muenster","01.08.1995","w","verheiratet",4);
        kundenliste[23]= new Kunde(4055,"Carsten","Stipping","30.11.1963","Schillerstrasse 24",48143,"Muenster","01.09.1995","m","verheiratet",2);
        kundenliste[24]= new Kunde(4060,"Boris","Boelting","01.09.1974","Hauptstrasse 35",48879,"Gelsenkirchen","01.04.1996","m","verheiratet",3);
        kundenliste[25]= new Kunde(4065,"Claudia","Deinken","15.11.1969","Holtwicker Str. 2",45721,"Haltern am See","15.07.1996","w","verheiratet",5);
        kundenliste[26]= new Kunde(4070,"Bernd","Schnalte","12.07.1971","Rappaportstr. 17",45768,"Marl","01.01.1999","m","verheiratet",3);
        kundenliste[27]= new Kunde(4075,"Dirk","Kuernback","28.01.1974","Kroegerweg 4",48155,"Muenster","01.01.1999","m","ledig",0);
        kundenliste[28]= new Kunde(4080,"Elke","Sommer","04.07.1973","Rappaportstasse 5",45768,"Marl","01.01.1999","w","verheiratet",2);
        kundenliste[29]= new Kunde(4085,"Dieter","Schimmer","28.04.1956","Merschstrasse 29",45721,"Haltern am See","01.02.1999","m","verheiratet",4);
        kundenliste[30]= new Kunde(4090,"Jens","Schuller","23.12.1990","Dorstener Str. 7",46236,"Bottrop","18.03.1999","m","verheiratet",3);
        kundenliste[31]= new Kunde(4095,"Barbara","Scmitt","29.01.1981","Muenster Str. 5",48249,"Duelmen","01.10.2000","w","ledig",0);
        kundenliste[32]= new Kunde(4100,"Detmar","Schaffer","06.07.1968","Am Bagno 42",48301,"Nottuln","01.01.2001","m","ledig",0);
        kundenliste[33]= new Kunde(4105,"Claus","Laufen","04.02.1971","Am Sportplatz 34",45721,"Haltern am See","01.01.2001","m","ledig",0);
        kundenliste[34]= new Kunde(4110,"Barbara","Pfitzner","28.10.1970","Olympiastrasse 24",48301,"Nottuln","01.02.2001","w","geschieden",0);
        kundenliste[35]= new Kunde(4115,"Barbara","Mueller","13.06.1972","Kolpingstrasse 20",45721,"Haltern am See","01.03.2001","w","ledig",0);
        kundenliste[36]= new Kunde(4120,"Christiane","Tambert","21.01.1977","Carl-Diem-Ring 5",45721,"Haltern am See","02.02.1998","w","ledig",0);
        kundenliste[37]= new Kunde(4125,"Dagmar","Burger","14.10.1982","Mondstrasse 14",48143,"Muenster","01.04.2001","w","verheiratet",3);
        kundenliste[38]= new Kunde(4130,"Diana","Busch","10.08.1995","Schillerstrasse 25",48143,"Muenster","01.08.2010","w","ledig",0);
        kundenliste[39]= new Kunde(4135,"Bernd","Csikali","01.10.1990","Hauptstrasse 37",45657,"Recklinghausen","01.08.2009","m","ledig",0);
        kundenliste[40]= new Kunde(4140,"Carlos","Carluccio","15.08.1991","Hauptstrasse 38",45657,"Recklinghausen","01.08.2008","m","ledig",0);
        kundenliste[41]= new Kunde(4145,"Barbara","van Meuken","30.08.1970","Hagenstr. 28",45768,"Marl","01.10.2001","w","verheiratet",0);
        kundenliste[42]= new Kunde(4150,"Anita","Schlattmann","19.05.1967","Kroegerweg 5",48155,"Muenster","20.11.2001","w","verheiratet",1);
        kundenliste[43]= new Kunde(4155,"Bernd","Musshalt","11.07.1976","Rappaportstasse 6",45768,"Marl","01.01.2002","m","verheiratet",2);
        kundenliste[44]= new Kunde(4160,"Derek","Malanig","12.04.1969","Recklinghaeuser Strasse 30",45721,"Haltern am See","01.03.2002","m","verheiratet",2);
        kundenliste[45]= new Kunde(4165,"Adolf","Koehnleinen","13.07.1981","Lavesumer Str. 60",45721,"Haltern am See","01.04.2002","m","verheiratet",2);
        kundenliste[46]= new Kunde(4170,"Eberhard","Schnageshagen","29.10.1968","Am Bagno 50",48301,"Nottuln","01.09.2002","m","ledig",0);
        kundenliste[47]= new Kunde(4175,"Denise","Bauer-Grieten","26.08.1983","Am Bagno 58",48879,"Gelsenkirchen","01.10.2002","w","verheiratet",1);
        kundenliste[48]= new Kunde(4180,"Andreas","Netzen","31.03.1968","Am Sportplatz 35",45768,"Marl","28.10.2002","m","ledig",0);
        kundenliste[49]= new Kunde(4185,"Doris","Hornberg","24.01.1969","Gladbecker Str. 26 58",46236,"Bottrop","01.09.2009","w","verheiratet",3);
        kundenliste[50]= new Kunde(4190,"Penilla","Koettenbrink","15.03.1978","Lohaus Str. 15",45721,"Haltern am See","01.12.2003","w","ledig",0);
        kundenliste[51]= new Kunde(4195,"Bernd","Neigel","30.01.1990","Carl-Diem-Ring 6",48301,"Nottuln","01.02.2004","m","verheiratet",0);
        kundenliste[52]= new Kunde(4200,"Clemens","Elpers","26.04.1986","Mondstrasse 15",48143,"Muenster","01.08.2008","m","ledig",0);
        kundenliste[53]= new Kunde(4205,"Christian","Droemer","01.03.1980","Schillerstrasse 26",48143,"Muenster","01.08.2010","m","verheiratet",5);
        kundenliste[54]= new Kunde(4210,"Bernd","Scnieder","28.04.1977","Hauptstrasse 39",48879,"Gelsenkirchen","01.06.1998","m","verheiratet",2);
        kundenliste[55]= new Kunde(4215,"Carolin","Roters","25.07.1972","Melcherstrasse 4",45721,"Haltern am See","01.08.2004","w","ledig",0);
        kundenliste[56]= new Kunde(4220,"Birgit","Rabenhorst","10.08.1977","Grauten Ihl 27",48301,"Nottuln","01.09.1997","w","ledig",0);
        kundenliste[57]= new Kunde(4225,"Detlef","Stalberg","23.08.1991","Kroegerweg 6",48155,"Muenster","01.08.2008","m","ledig",0);
        kundenliste[58]= new Kunde(4230,"Dorothea","Stiegltz","10.02.1988","Rappaportstasse 7",45768,"Marl","01.08.2009","w","ledig",0);

        return kundenliste;

    }

    public static ArrayList<Kunde> liesKundenAsArrayList() {
        Kunde[] kundenArray = liesKunden();
        ArrayList<Kunde> kundenArrayList = new ArrayList<>();

        for (Kunde kunde : kundenArray) {
            kundenArrayList.add(kunde);
        }

        return kundenArrayList;
    }

}