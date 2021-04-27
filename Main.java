class Main {
  private static String[] namenSpieler = { "Manuel Neuer", "Matthias Ginter", "Mats Hummels", "Bastian Schweinsteiger", "Mesult Oezil", "Lukas Podolski", "Miroslav Klose", "Thomas Mueller", "Julian Draxler", "Philipp Lahm", "Mario Goetze" };

public static void main(String[] args) {
    
    System.out.println("Sortiertes Array ausgeben!");

}

// Implementation der Binären Suche für integer-Werte (vgl. Buch A3 S148) 
  public static boolean binaereSuche(int[] pArray, int pSuchschluessel){
    int links, rechts, mitte;     // Indizes (Nummern) für den Zugriff auf bestimmte Speicherzellen
    links = 0;                    // linker Rand des Suchbereichs
    rechts = pArray.length -1;    // rechter Rand des Suchbereichs
    while (links <= rechts){      // Abbruchbedingung für Such-Schleife
      mitte = (int) Math.ceil((links + rechts)/2);  // Schaue das MITTLERE Element des (aktuellen) Suchbereichs an...
      if(pArray[mitte] == pSuchschluessel){   // ...ist es GLEICH dem gesuchten Wert, ...
        return true;                          // ... ist die Suche erfolgreich vorbei!
      }
      if(pArray[mitte] < pSuchschluessel){    // ist es KLEINER dem gesuchten Wert, 
        links = mitte +1;                     // ... verschiebe die LINKE Grenze des Suchbereichs (--> rechten Hälfte weitersuchen)
      }
      if(pArray[mitte] > pSuchschluessel){    // ist es GRÖßer dem gesuchten Wert, 
        rechts = mitte -1;                    // ... verschiebe die RECHTE Grenze des Suchbereichs (--> linke Hälfte weitersuchen)
      }
    }
    return false;
  }
   
// Implementation mit String-Array
  public static boolean binaereSuche(String[] pArray, String pSuchschluessel){
    int links, rechts, mitte;     // Indizes (Nummern) für den Zugriff auf bestimmte Speicherzellen
    links = 0;                    // linker Rand des Suchbereichs
    rechts = pArray.length -1;    // rechter Rand des Suchbereichs
    while (links <= rechts){      // Abbruchbedingung für Such-Schleife
      mitte = (int) Math.ceil((links + rechts)/2);  // Schaue das MITTLERE Element des (aktuellen) Suchbereichs an...
      if(pArray[mitte].compareToIgnoreCase(pSuchschluessel) == 0){   // ...ist es GLEICH dem gesuchten Wert, ...
        return true;                          // ... ist die Suche erfolgreich vorbei!
      }
      if(pArray[mitte].compareToIgnoreCase(pSuchschluessel) < 0){    // ist es KLEINER dem gesuchten Wert, 
        links = mitte +1;                     // ... verschiebe die LINKE Grenze des Suchbereichs (--> rechten Hälfte weitersuchen)
      }
      if(pArray[mitte].compareToIgnoreCase(pSuchschluessel) > 0){    // ist es GRÖßer dem gesuchten Wert
        rechts = mitte -1;                    // ... verschiebe die RECHTE Grenze des Suchbereichs (--> linke Hälfte weitersuchen)
      }
    }
    return false;
  }
}
