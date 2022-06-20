  Model abstrakcji drzew iglastych i liściastych bazuję na abstrkcyjnej klasie Tree, 
po której oba rodzaje drzew dziedziczą cechy wspólne dla wszystkich gatunków. 
Implementacje tych klas odkrywają różnicę, które postanowiłem ukazać jako różny sposób wzrostu,
czy też fotosyntezy. Rozwiązanie zawarłem w folderze "trees".

  Przykładowe REST API spełniające założone wymagania zostało zawarte w folderze "rest".
Do realizacji zadania posłużyłem się Spring Bootem 2.
API posiada możliwość dodania lokalizacji urządzenia, odczytania wszystkich zapisanych lokalizacji,
oraz odczytania historii lokalizacji danego urządzenia. 
Poza podanymi w przykładzie parametrami, zostało dodane przeze mnie jeszcze pole informujące o dacie odczytu lokalizacji.
Dane zostają zapisywane przy użyciu bazy danych h2.
Rozwiązanie posiada również walidację przekazywanych parametrów (longitude i latitude z wskazanego zakresu wartości oraz deviceID większe od 0),
jak również testy potwierdzające poprawność działania aplikacji.

  W projekcie została użyta java 17.
