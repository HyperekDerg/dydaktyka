# Programowanie obiektowe

Poniżej znajdują się materiały dydaktyczne dla kursu programowania obiektowego
w języku Java.

Przejdź do treści modułu [0](#moduł-0), [1](#moduł-1), [2](#moduł-2),
[3](#moduł-3), [4](#moduł-4), [5](#moduł-5), [6](#moduł-6), [7](#moduł-7),
[8](#moduł-8), [9](#moduł-9).

## Informacje organizacyjne

  * Ocena za laboratorium jest przyznawana za rozwiązanie zadań oraz za
    zrealizowanie projektu indywidualnego.
  * Zadania do rozwiązania na ocenę będą publikowane poniżej. Zadania z zajęć
    $`n`$ można oddawać do oceny na zajęciach $`n`$ lub $`n + 1`$.
    W usprawiedliwionych przypadkach można to uczynić w terminie późniejszym.
  * Projekt indywidualny należy oddać do oceny najpóźniej w dniu przedostatnich
    zajęć.
  * Pierwsze zajęcia nie są oceniane a ostatnie służą do omówienia wyników
    projektu indywidualnego.

## Źródła wiedzy

  * <https://docs.oracle.com/javase/tutorial/java/TOC.html>
  * <https://docs.oracle.com/javase/tutorial/uiswing/TOC.html>
  * <https://docs.oracle.com/javase/8/docs/api/>
  * <https://docs.oracle.com/en/java/javase/22/docs/api/index.html>
  * <https://en.wikibooks.org/wiki/Java_Programming>
  * <https://en.wikibooks.org/wiki/Java_Swings>
  * <https://www.youtube.com/java>
  * <https://dev.java/>
  * <https://inside.java/>
  * <https://openjfx.io/>

## Projekt indywidualny

  * Projekt indywidualny jest jednorazowym większym zadaniem na przedmiocie
    *Programowanie obiektowe*, w którym rozwiązuje się dany problem z użyciem
    graficznego interfejsu użytkownika.
  * Rozwiązanie tego zadania należy oddać do oceny najpóźniej w dniu
    przedostatnich zajęć.
  * Propozycje tematów projektów indywidualnych znajdują się poniżej. Treść
    projektu indywidualnego może też zostać zaproponowana przez osobę
    rozwiązującą zadanie, aczkolwiek wymaga ona akceptacji osoby prowadzącej
    zajęcia laboratoryjne.
  * Wybrany przez siebie temat projektu indywidualnego należy zgłosić do osoby
    prowadzącej zajęcia laboratoryjne.
  * Rozwiązanie zadania powinno składać się z następujących elementów:
      * kompilujący się kod źródłowy w formie plików o rozszerzeniu `.java`
      * komentarze zawarte w ww. kodzie źródłowym dokumentujące przeznaczenie
        klas oraz funkcji
      * plik `README.pdf`
  * W implementacji rozwiązania należy wykorzystać w odpowiedni sposób:
      * graficzny interfejs użytkownika, obsługa zdarzeń
      * klasy (zmienne składowe, konstruktory, metody składowe)
      * dziedziczenie klas, nadpisywanie metod oraz polimorfizm
      * interfejsy, klasy i metody abstrakcyjne
      * napisy (`String`) oraz wybrane kolekcje (np. `List`)
      * zapis i odczyt plików (obsługa strumieni)
      * wyjątki (włącznie ze stworzeniem własnej klasy wyjątków)
  * Komentarze zawarte w kodzie źródłowym powinny opisywać krótko przeznaczenie:
      * każdej klasy oraz interfejsu
      * większości metod (można pominąć opis oczywistych metod, np.
        konstruktorów)
      * innych elementów kodu istotnych do zrozumienia intencji programisty
  * Plik `README.pdf` powinien zawierać przynajmniej około 2 stron tekstu (dla
    formatu A4) oraz od jednego do kilku zrzutów ekranu z przykładowej sesji
    działania programu. W pliku `README.pdf` należy:
      * opisać rozwiązywany przez program problem
      * opisać sposób użycia programu w formie krótkiej instrukcji użytkownika
      * zawrzeć przykładowy rezultat działania programu na wybranych przez
        siebie danych wejściowych udokumentowany przynajmniej jednym zrzutem
        ekranu
      * zawrzeć diagram UML
  * Rozwiązanie należy wysłać na adres poczty elektronicznej osoby prowadzącej
    zajęcia.
  * Rozwiązanie powinno mieć formę archiwum `.zip`, `.tar`, `.tar.gz` lub
    `.tar.xz`. Archiwum powinno zawierać jedynie kod źródłowy z komentarzami
    oraz plik `README.pdf`. Nie należy w archiwum umieszczać innych plików,
    w szególności wykonywalnych. Przesłane archwium (po ewentualnej kompresji)
    powinno mieć rozmiar co najwyżej 1 MB.
  * Rozwiązanie podlega ocenie przez wzgląd na:
      * zgodność z ww. wymaganiami
      * funkcjonalność
      * jakość i ilość kodu źródłowego
      * jakość i ilość komentarzy w kodzie źródłowym
      * zawartość pliku `README.pdf`
  * Uwaga! Rozwiązanie niekompilujące się otrzymuje ocenę zerową.

### Propozycje tematów projektów indywidualnych

Poniżej przedstawiono propozycje tematów projektów indywidualnych. W trakcie
rozwiązywania zadania wybrany przez siebie temat należy rozwinąć tak, aby
w implementacji rozwiązania znalazły się wszystkie wymagane elementy opisane
wcześniej.

Uwaga! W rozwiązaniu zadania należy w pierwszej kolejności skupić się na
zastosowaniu reguł programowania obiektowego. (Algorytmika, choć jest bardzo
cenna, nie jest przedmiotem tego zadania.)

  * *Automat sprzedający* — program symulujący działanie automatu sprzedającego
    towary danego rodzaju (np. bilety albo napoje i przekąski)
  * *Bank* — symulacja działania banku z obsługą klientów oraz ich rachunków
    i transakcji
  * *Chemia* — baza danych związków chemicznych wraz z ich klasyfikacją
  * *Dziennik sportowy* — program dla osób uprawiających sport umożliwiający
    zapisywanie i analizowanie codziennych postępów w ćwiczeniach (np. długości
    przebytych tras wraz z odpowiadającym czasem)
  * *Fiszki* — nauka słów w różnych językach obcych
  * *Gra planszowa* — wybrana prosta gra planszowa (np. kółko i krzyżyk)
    z historią rozegranych partii i profilami graczy
  * *Kalkulator naukowy* — program kalkulatora w wersji naukowej umożliwiający
    m.in. konwersję jednostek
  * *Klasyfikacja biologiczna* — program służący do zarządzania bazą danych
    gatunków biologicznych
  * *Konfigurator PC* — program przeznaczony do samodzielnej konfiguracji
    komputera składanego z wybranych przez użytkownika podzespołów
  * *Książka kucharska* — program umożliwiający przechowywanie przepisów
    kucharskich wraz z informacjami o wartościach odżywczych posiłków
    i subiektywną oceną smaku potraw
  * *Menedżer haseł* — menedżer umożliwiający zapisywanie, odczytywanie
    i modyfikację haseł wykorzystywanych przez użytkownika w usługach
    internetowych
  * *Menedżer plików* — program umożliwiający najbardziej podstawowe operacje
     na plikach i katalogach (folderach)
  * *Menedżer zakładek* — niezależny od przeglądarki internetowej menedżer
    zakładek URL umożliwiający zapisywanie odnośników wraz z tytułami
    i kategoriami tematycznymi
  * *Odtwarzacz MIDI* — program umożliwiający generowanie dźwięku na podstawie
    tekstowych plików wejściowych wykorzystujących notację MIDI
  * *Odtwarzacz muzyczny* — program umożliwiający odtwarzanie plików dźwiękowych
    w formacie WAV
  * *Rezerwacja sal* — program symulujący system rezerwacji sal w budynku (np.
    uczelni) umożliwiający różnym grupom osób uprawnionych rezerwację sal
    o odpowiednich parametrach (liczbie stanowisk, wyposażeniu)
  * *Teatr* — program ułatwiający zarządzanie teatrem poprzez możliwość edycji
    wystawianych sztuk, wymaganych rekwizytów oraz zatrudnienia obsady
  * *Układ okresowy pierwiastków* — program służący do prezentacji danych na
    temat pierwiastków układu okresowego
  * *Wąż* — gra w węża
    ([Snake](https://en.wikipedia.org/wiki/Snake_(video_game_genre)))
    z możliwością konfiguracji i zapamiętywania wyników

## Moduł 0

*Nieoceniane zajęcia wstępne.*

## Moduł 1

### Zmienne składowe klasy. Konstruktory. Metody składowe

Przykład (pełny przykład znajduje się w katalogu
[Rectangle/](/programowanie-obiektowe/examples/01/Rectangle/)):
```java
public class Rectangle {
    // Zmienne składowe
    private double a;
    private double b_; // Inna konwencja…

    // Konstruktor
    public Rectangle(double a, double b) {
        this.a = a;
        b_ = b; // … która nie wymaga tutaj użycia `this`.
    }

    // Metody składowe
    public double area() { return a * b_; }
    public double get_a() { return a; }
    public double get_b() { return b_; }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4.2, 1.0);
        System.out.println("Wymiary: " + r.get_a() + " x " + r.get_b());
        System.out.println("Powierzchnia: " + r.area());
    }
}
```

Wynik działania przykładu:
> Wymiary: 4.2 x 1.0  
> Powierzchnia: 4.2

### Wczytywanie danych. Liczby pseudolosowe

Przykład (pełny przykład znajduje się w katalogu
[Random/](/programowanie-obiektowe/examples/01/Random/)):
```java
import java.util.Scanner; // Dzięki temu później można napisać `Scanner`
                          // zamiast `java.util.Scanner`.

public class Random {
    public static void main(String[] args) {
        // Obiekt `s` umożliwia odczyt ze standardowego wejścia.
        Scanner s = new Scanner(System.in);
        System.out.println("Program losuje wartości z przedziału [a * pi, b * pi].");
        System.out.print("Podaj wartość a: ");
        double a = s.nextDouble();
        System.out.print("Podaj wartość b: ");
        double b = s.nextDouble();
        s.close();
        
        // Obiekt `r` będzie generował liczby pseudolosowe.
        java.util.Random r = new java.util.Random();
        double res = (r.nextDouble() * (b - a)) + a;
        res *= Math.PI;
        System.out.println("Wylosowana wartość: " + res);
    }
}
```

Wynik działania przykładu:
> Program losuje wartości z przedziału [a * pi, b * pi].  
> Podaj wartość a: 0  
> Podaj wartość b: 1  
> Wylosowana wartość: 1.1054802036741138

### Dodatek: Graficzny interfejs użytkownika

Przykład (pełny przykład znajduje się w katalogu
[GUI/](/programowanie-obiektowe/examples/01/GUI/)):
```java
import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        double x =
            Double.parseDouble(JOptionPane.showInputDialog("Podaj wartość zmiennoprzecinkową"));
        JOptionPane.showMessageDialog(null, Double.toString(x));
    }
}
```

### Zadania

#### 1.1 *Body Mass Index*

Napisz klasę przechowującą masę (w kilogramach) oraz wzrost (w metrach)
i posiadającą metodę obliczającą wartość parametru BMI (*body mass index*).
Wartość parametru BMI oblicza się według wzoru:
```math
\textnormal{BMI} =
\frac{\textnormal{masa}_{\textnormal{kg}}}{\textnormal{wzrost}_{\textnormal{m}}^2}
```
Masa oraz wzrost powinny zostać zakapsułkowane, tzn. powinny one być zmiennymi
prywatnymi. Ich wartości powinny być inicjowane z użyciem konstruktora.

Wykorzystaj ww. klasę do obliczeń na podstawie danych wczytanych z klawiatury
w trakcie działania programu. Program powinien wyświetlać nie tylko rezultat
obliczeń BMI, ale też następujący wynik opisowy otrzymany poprzez zastosowanie
instrukcji warunkowej:
  * *wygłodzenie* ($`\textnormal{BMI} < 16`$)
  * *wychudzenie* ($`\textnormal{BMI} \in [16; 17)`$)
  * *niedowaga* ($`\textnormal{BMI} \in [17; 18{,}5)`$)
  * *optimum* ($`\textnormal{BMI} \in [18{,}5; 25)`$)
  * *nadwaga* ($`\textnormal{BMI} \in [25; 30)`$)
  * *otyłość I stopnia* ($`\textnormal{BMI} \in [30; 35)`$)
  * *otyłość II stopnia* ($`\textnormal{BMI} \in [35; 40)`$)
  * *otyłość III stopnia* ($`\textnormal{BMI} \geq 40`$)

#### 1.2 Wahadało matematyczne

Okres drgań wahadła matematycznego w przybliżeniu małych drgań jest równy:
```math
T = 2 \pi \sqrt{\frac{l}{g}}
```
gdzie $`l`$ jest długością nici a
$`g = 9{,}80665\,\textnormal{m}/\textnormal{s}^2`$ — przyspieszeniem ziemskim.

Stwórz klasę *Pendulum* opisującą ww. wahadło, które będzie posiadać:
  * prywatną zmienną składową z wartością długości nici $`l`$
  * konstruktor inicjujący ww. zmienną
  * dwie metody składowe: zwracającą (*get_length*) i zmieniającą (*set_length*)
    długość nici $`l`$
  * kolejną metodę składową o nazwie *get_period* zwracającą długość okresu
    $`T`$

Stwórz zmienną klasy *Pendulum* dla długości nici wylosowanej z przedziału
$`[1\,\textnormal{cm}; 10\,\textnormal{cm}]`$ i wypisz długość okresu dla tego
wahadła. Następnie, korzystając z pętli *for*, prześledź wypisując na ekranie
zależność długości okresu od długości nici rozpoczynając od uprzednio
wylosowanej długości a następnie wielokrotnie zwiększając za każdym razem tę
wielkość o połowę aktualnej wartości.

### Bibliografia

  * <https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html>
  * <https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html>
  * <https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html>

## Moduł 2

### Tablice

Przykład (pełny przykład znajduje się w katalogu
[Array/](/programowanie-obiektowe/examples/02/Array/)):
```java
import java.util.Scanner;
import java.util.Random;

public class Array {
    public static int get_length(java.io.InputStream is) {
        Scanner s = new Scanner(is);
        int n = s.nextInt();
        s.close();
        return n;
    }
    
    public static void random(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; ++i) {
            array[i] = r.nextInt(10);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Program wypełnia losowo n-elementową tablicę.");
        System.out.print("Podaj wartość n: ");
        int n = get_length(System.in);
        
        int arr[] = new int[n];
        random(arr);
        
        System.out.print("Wylosowane wartości: ");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}
```

Wynik działania przykładu:
> Program wypełnia losowo n-elementową tablicę.  
> Podaj wartość n: 3  
> Wylosowane wartości: 5 8 0 

Przykład (pełny przykład znajduje się w katalogu
[Two_dimensions/](/programowanie-obiektowe/examples/02/Two_dimensions/)):
```java
public class Two_dimensions {
    private int arr_[][];
    
    public Two_dimensions(int size_x, int size_y) {
        arr_ = new int[size_x][size_y];
    }
    
    public int at(int x, int y) {
        return arr_[x][y];
    }
    
    public void at(int x, int y, int val) {
        arr_[x][y] = val;
    }
    
    public int size_x() {
        return arr_.length;
    }
    
    public int size_y() {
        return arr_[0].length;
    }
    
    public static void main(String[] args) {
        Two_dimensions td = new Two_dimensions(2, 3);
        System.out.println("Program wykorzystuje tablicę "
                           + td.size_x() + " x " + td.size_y() + ".");
        
        for (int i = 0; i < td.size_x(); ++i) {
            for (int j = 0; j < td.size_y(); ++j) {
                td.at(i, j, (i + 1) * (j + 2));
            }
        }

        for (int i = 0; i < td.size_x(); ++i) {
            for (int j = 0; j < td.size_y(); ++j) {
                System.out.print(td.at(i, j) + " ");
            }
            System.out.println();
        }
    }
}
```

Wynik działania przykładu:
> Program wykorzystuje tablicę 2 x 3.  
> 2 3 4   
> 4 6 8 

### Klasa `String`

Przykład (pełny przykład znajduje się w katalogu
[Hello_kitty/](/programowanie-obiektowe/examples/02/Hello_kitty/)):
```java
public class Hello_kitty {
    public static void main(String[] args) {
        String s1 = "Hello, kitty!";
        System.out.println("Zawartość s1: " + s1);

        String s2 = "Hello, kitty!";
        System.out.println("Zawartość s2: " + s2);

        if (s1.equals(s2)) {
            System.out.println("Obydwa napisy mają identyczną zawartość.");
        }

        for (int i = 0; i < s1.length(); ++i) {
            System.out.print(s1.charAt(i));
        }
        System.out.println();

        for (char c : s2.toCharArray()) {
            System.out.print(c);
        }
        System.out.println();
    }
}
```

Wynik działania przykładu:
> Zawartość s1: Hello, kitty!  
> Zawartość s2: Hello, kitty!  
> Obydwa napisy mają identyczną zawartość.  
> Hello, kitty!  
> Hello, kitty!

### Dodatek: Modyfikator `final` dla zmiennych

Przykład (pełny przykład znajduje się w katalogu
[Final/](/programowanie-obiektowe/examples/02/Final/)):
```java
public class Final {
    public final static int answer = 42;
    
    public static void main(String[] args) {
        final int my_answer = 42;
        if (my_answer == answer) {
            System.out.println("Odpowiedź prawidłowa!");
        }
        // answer++;    // Błąd!
        // my_answer++; // Błąd!
    }
}
```

Wynik działania przykładu:
> Odpowiedź prawidłowa!

### Zadania

#### 2.1 Macierze diagonalne

Napisz program, w którym stworzysz klasę odpowiedzialną za kwadratową macierz
diagonalną:
```math
A = \left[
\begin{array}{cccccc}
d_1 & 0 & 0 & \cdots & 0 \\
0 & d_2 & 0 & \cdots & 0 \\
0 & 0 & d_3 & \cdots & 0 \\
\vdots & \vdots & \vdots & \ddots & \vdots \\
0 & 0 & 0 & \cdots & d_n
\end{array}
\right]
```

Klasa ta powinna posiadać:
  * konstruktor przyjmujący liczbę elementów na diagonali $`n`$
  * metodę obliczającą tzw. ślad macierzy (ang. *trace*; ślad macierzy jest
    równy sumie elementów umieszczonych na diagonali)
  * metodę statyczną obliczającą iloczyn dwóch kwadratowych macierzy
    diagonalnych

W programie wykorzystaj stworzoną przez siebie klasę do przykładowych obliczeń,
do których wartości zostaną podane przez użytkownika na klawiaturze.

Uwaga: Zauważ, że do rozwiązania tego zadania nie trzeba (nie warto)
wykorzystywać tablic dwuwymiarowych.

#### 2.2 ROT13

Zaimplementuj program, który pobierze jedną linijkę tekstu od użytkownika
i zaszyfruje ją algorytmem ROT13. Algorytm ROT13 jest prostym szyfrem
podstawieniowym, w którym litera *A* jest zastępowana przez *N*, *B* przez *O*
itd. W analogiczny sposób szyfruje się małe litery alfabetu łacińskiego. Inne
znaki (np. białe lub interpunkcyjne) nie są szyfrowane. Załóż, że dane na
wejściu będą zawierać wyłącznie znaki z podstawowego alfabetu łacińskiego
oraz ewentualnie znaki białe lub interpunkcyjne.

Wynik działania programu:
> Podaj tekst: Tekst do zaszyfrowania.  
> Wynik: Grxfg qb mnfmlsebjnavn.

Uwaga: Jeśli `s` jest obiektem typu `Scanner` to kod:
```java
String line = s.nextLine();
```
umożliwia wczytanie pojedynczego wiersza z klawiatury.

Uwaga: Szyfrowanie ROT13 nie jest bezpieczne z oczywistych względów. Ten sam
algorytm służy zarówno do szyfrowania jak i deszyfrowania (tzn. algorytm posiada
tylko jeden klucz). Nazwa algorytmu wynika z faktu, że poszczególne litery są
zastępowane innymi oddalonymi o 13 znaków (a podstawowy alfabet łaciński posiada
26 znaków).

### Bibliografia

  * <https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html>
  * <https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html>

## Moduł 3

### Wyjątki

Przykład (pełny przykład znajduje się w katalogu
[Exceptions_showcase/](/programowanie-obiektowe/examples/03/Exceptions_showcase/)):
```java
public class Exceptions_showcase {
    private static void throw_exception() throws Exception {
        throw new Exception();
    }

    private static void try_catch_finally() {
        System.out.println("### Przykład 1 ###");
        try {
            System.out.println("Zaraz zostanie rzucony wyjątek.");
            throw_exception();
            System.out.println("Ten komunikat się nie wypisze.");
        } catch (Exception e) {
            System.out.println("Przechwycono wyjątek.");
        } finally {
            System.out.println(
                "Ten komunikat wypisze się w ostatniej kolejności.");
        }
        System.out.println("### Koniec przykładu 1 ###");
    }

    private static void try_finally() throws Exception {
        System.out.println("### Przykład 2 ###");
        try {
            System.out.println("Zaraz zostanie rzucony wyjątek.");
            throw_exception();
            System.out.println("Ten komunikat się nie wypisze.");
        } finally {
            System.out.println(
                "Ten komunikat *nie* wypisze się w ostatniej kolejności.");
        }
        System.out.println("Ten komunikat się nie wypisze.");
    }

    private static void try_catch3() {
        System.out.println("### Przykład 3 ###");
        try {
            final int a = 0;
            if (a != 42) {
                throw new ArithmeticException();
            }
            throw new java.io.IOException();
        } catch (java.io.IOException e) {
            System.out.println("Ten komunikat się nie wypisze.");
        } catch (ArithmeticException e) {
            System.out.println("Przechwycono wyjątek.");
        } catch (Exception e) {
            System.out.println("Ten komunikat się nie wypisze.");
        }
        System.out.println("### Koniec przykładu 3 ###");
    }
    
    public static void main(String[] args) {
        try_catch_finally();
        
        try {
            try_finally();
        } catch (Exception e) {
            System.out.println("Przechwycono wyjątek.");            
        } finally {
            System.out.println("### Koniec przykładu 2 ###");
        }

        try_catch3();
    }
}
```

Wynik działania programu:
> \#\#\# Przykład 1 \#\#\#  
> Zaraz zostanie rzucony wyjątek.  
> Przechwycono wyjątek.  
> Ten komunikat wypisze się w ostatniej kolejności.  
> \#\#\# Koniec przykładu 1 \#\#\#  
> \#\#\# Przykład 2 \#\#\#  
> Zaraz zostanie rzucony wyjątek.  
> Ten komunikat \*nie\* wypisze się w ostatniej kolejności.  
> Przechwycono wyjątek.  
> \#\#\# Koniec przykładu 2 \#\#\#  
> \#\#\# Przykład 3 \#\#\#  
> Przechwycono wyjątek.  
> \#\#\# Koniec przykładu 3 \#\#\#

### Wyjątek `ArrayIndexOutOfBoundsException`

Przykład (pełny przykład znajduje się w katalogu
[Array_bounds/](/programowanie-obiektowe/examples/03/Array_bounds/)):
```java
public class Array_bounds {
    public static void main(String[] args) {
        int arr[] = new int[42];
        
        try {
            System.out.println(arr[42]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Szczegóły wyjątku: " + e.getMessage());
        }
        
        try {
            System.out.println(arr[-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Szczegóły wyjątku: " + e.getMessage());
        }
    }
}
```

Wynik działania programu:
> Szczegóły wyjątku: Index 42 out of bounds for length 42  
> Szczegóły wyjątku: Index -1 out of bounds for length 42

### Wyjątek `ArithmeticException`

Przykład (pełny przykład znajduje się w katalogu
[Division_by_zero/](/programowanie-obiektowe/examples/03/Division_by_zero/)):
```java
public class Division_by_zero {
    public static void main(String[] args) {
        try {
            int a = 42;                // Uwaga: Dla typu double nie nastąpi
            int b = 0;                 // rzucanie wyjątku! (Obliczenia
            System.out.println(a / b); // zmiennoprzecinkowe obsługują specjalną
                                       // wartość "nieskończoność".)
        } catch (ArithmeticException e) {
            System.out.println("Szczegóły wyjątku: " + e.getMessage());
        }
    }
}
```

Wynik działania programu:
> Szczegóły wyjątku: / by zero

### Wyjątek `InputMismatchException`

Przykład (pełny przykład znajduje się w katalogu
[Input/](/programowanie-obiektowe/examples/03/Input/)):
```java
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj wartość całkowitą: ");
        try {
          int a = s.nextInt();
          System.out.println("Podano wartość: " + a);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Podana wartość nie jest prawidłowa.");
        }
        s.close();
    }
}
```

Wynik działania programu (przykład 1):
> Podaj wartość całkowitą: 42  
> Podano wartość: 42

Wynik działania programu (przykład 2):
> Podaj wartość całkowitą: 42.0  
> Podana wartość nie jest prawidłowa.

### Wyjątek `NumberFormatException`

Przykład (pełny przykład znajduje się w katalogu
[String_to_number/](/programowanie-obiektowe/examples/03/String_to_number/)):
```java
public class String_to_number {
    public static void main(String[] args) {
        try {
            String str1 = "42";
            int number1 = Integer.parseInt(str1);
            System.out.println("Udało się!");
            
            String str2 = "#42";
            int number2 = Integer.parseInt(str2);
            System.out.println("A tu już nie…");
        } catch (NumberFormatException e) {
            System.out.println("Szczegóły wyjątku: " + e.getMessage());
        }
    }
}
```

Wynik działania programu:
> Udało się!  
> Szczegóły wyjątku: For input string: "#42"

### Dodatek: Formatowanie liczb zmiennoprzecinkowych

Przykład (pełny przykład znajduje się w katalogu
[FP_formatting/](/programowanie-obiektowe/examples/03/FP_formatting/)):
```java
import java.text.DecimalFormat;

public class FP_formatting {
    public static void main(String[] args) {
        final double val = 137.035999084; // odwrócona stała struktury subtelnej
        
        // (1a)
        DecimalFormat df1a = new DecimalFormat("#.#");
        String str1a = df1a.format(val);
        System.out.println("Wartość: " + str1a);

        // (1b)
        DecimalFormat df1b = new DecimalFormat("#.##");
        String str1b = df1b.format(val);
        System.out.println("Wartość: " + str1b);
        
        // (2)
        String str2 = String.format("%.1f", val);
        System.out.println("Wartość: " + str2);
    }
}
```

Wynik działania programu:
> Wartość: 137  
> Wartość: 137,04  
> Wartość: 137,0

### Zadania

#### 3.1 Równanie kwadratowe

Przed nami *stare dobre* równanie kwadratowe:
```math
ax^2 + bx + c = 0, a \neq 0
```
którego wyróżnik:
```math
\Delta = b^2 - 4ac
```
określa liczbę pierwiastków rzeczywistych:
  * jeśli $`\Delta > 0`$ to równanie ma dwa pierwiastki:
    $`x_{1, 2} = (-b \pm \sqrt{\Delta}) / 2a`$
  * jeśli $`\Delta = 0`$ to równanie ma jeden pierwiastek:
    $`x = -b / 2a`$
  * jeśli $`\Delta < 0`$ to równanie nie ma pierwiastków rzeczywistych

Napisz klasę `Qudratic_equation`, która będzie posiadała:
  * konstruktor przyjmujący wartości parametrów $`a`$, $`b`$ oraz $`c`$ równania
    kwadratowego i rzucający wyjątek w przypadku, gdy $`a = 0`$
  * metodę `delta` obliczającą wyróżnik równania kwadratowego
  * metodę obliczającą pierwszy pierwiastek i rzucającą wyjątek jeśli
    $`\Delta < 0`$
  * metodę obliczającą drugi pierwiastek i rzucającą wyjątek jeśli
    $`\Delta \leq 0`$

Wszystkie funkcje składowe, które rzucają wyjątek powinny być odpowiednio
wyspecyfikowane z użyciem `throws`.

Wykorzystaj klasę `Quadratic_equation` w konstrukcji `try`-`catch`. Wartości
$`a`$, $`b`$ oraz $`c`$ wczytaj ze standardowego wejścia. Pokaż wyniki obliczeń
pierwiastka/pierwiastków.

#### 3.2 Wyjątki łańcuchowe

Sprawdż co się stanie, gdy wyrzucisz wyjątek w bloku `catch` po złapaniu
poprzedniego wyjątku.

Napisz program, w którym w bloku `catch` złapiesz wyjątek typu `Exception`
stworzony z napisem `Hello`. W tym samym bloku `catch` rzuć kolejny wyjątek
stworzony na bazie pierwszego, do którego dokleisz napisz `, kitty!`. Złap nowy
wyjątek w nowym bloku `catch` i sprawdź, czy otrzymujesz napis `Hello, kitty!`.

Wskazówka: Do rozwiązania tego zadania przyda się
[ten konstruktor](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html#Exception-java.lang.String-java.lang.Throwable-).

### Bibliografia

  * <https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/lang/ArithmeticException.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/lang/ArrayIndexOutOfBoundsException.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/lang/NumberFormatException.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/io/IOException.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/util/InputMismatchException.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/text/DecimalFormat.html>

## Moduł 4

### Własne klasy wyjątków

Własne klasy wyjątków można wprowadzić, gdy potrzebne jest doprecyzowanie
informacji o problemie w sytuacji gdy standardowe klasy są niewystarczające.

### Przykład minimalny

Przykład (pełny przykład znajduje się w katalogu
[Custom_exception_1/](/programowanie-obiektowe/examples/04/Custom_exception_1/)):

#### Plik `Custom_exception_1.java`
```java
public class Custom_exception_1 extends Exception {
    public Custom_exception_1(String msg) {
        super(msg);
    }
}
```

#### Plik `Main.java`
```java
public class Main {
    public static void main(String[] args) {
        try {
            throw new Custom_exception_1("Własny wyjątek");
        } catch (Custom_exception_1 e) {
            System.out.println("Złapano własny wyjątek.");
        } catch (Exception e) {
            System.out.println("Złapano wyjątek Exception.");
        }
    }
}
```

Wynik działania programu:
> Złapano własny wyjątek.

### Przykład rozszerzony

Przykład (pełny przykład znajduje się w katalogu
[Custom_exception_2/](/programowanie-obiektowe/examples/04/Custom_exception_2/)):

#### Plik `Custom_exception_2.java`
```java
public class Custom_exception_2 extends Exception {
    public Custom_exception_2(String msg) {
        super(msg);
    }
    
    public Custom_exception_2(String msg, Throwable e) {
        super(msg, e);
    }
}
```

#### Plik `Main.java`
```java
public class Main {
    public static void main(String[] args) {
        try {
            try {
                throw new Exception("42");
            } catch (Exception e) {
                if (e.getMessage().equals("42")) {
                    throw new Custom_exception_2("Własny wyjątek", e);
                }
            }
        } catch (Custom_exception_2 e) {
            System.out.println("Złapano: " + e.getMessage());
            System.out.println("Szczegóły: " + e.getCause());
        } catch (Exception e) {
            System.out.println("Złapano wyjątek Exception.");
        }
    }
}
```

Wynik działania programu:
> Złapano: Własny wyjątek  
> Szczegóły: java.lang.Exception: 42

### Zadania

#### 4.1 Międzynarodowa notacja nutowa

Międzynarodowa notacja nutowa (ang. *International Pitch Notation*) służy do
kodowania tonów dźwięków w muzyce.

Nuta w zapisie IPN jest kodowana z użyciem:
  * tradycyjnej nazwy tonu (C, D, E, F, G, A, B)
  * ewentualnego znaku chromatycznego (♯, ♭)
  * numeru oktawy będącego liczbą całkowitą zapisywanej w indeksie dolnym

Uwaga: Na potrzeby tego zadania zrezygnujemy z zapisywania numeru oktawy
w indeksie dolnym i będziemy stosować liczbę o zwykłej wysokości.

Oktawa składa się z następujących 12 nut:
  * C
  * C♯ (D♭)
  * D
  * D♯ (E♭)
  * E
  * F
  * F♯ (G♭)
  * G
  * G♯ (A♭)
  * A
  * A♯ (B♭)
  * B

Uwaga: Na potrzeby tego zadania zrezygnujemy z użycia symbolu ♭.

Przykład: Ton dźwięku jest związany z częstotliwością. Nuta A4 ma od 1834 roku
rekomendowaną częstotliwość 440 Hz. Nuta oktawę wyżej (czyli A5) ma dwukrotnie
wyższą częstotliwość równą 880 Hz. Z kolei A3 ma częstotliwość 220 Hz.

Napisz program, który będzie zawierał co najmniej dwie klasy. Pierwsza z nich
(`International_Pitch_Notation`) niech będzie odpowiedzialna za przechowywanie
zapisu nutowego IPN a druga (`International_Pitch_Notation_Exception`) niech
będzie klasą wyjątku zgłaszanego przy próbie zapisania nieprawidłowo zakodowanej
nuty.

Klasa odpowiedzialna za przechowywanie zapisu nutowego
`International_Pitch_Notation` powinna posiadać:
  * konstruktor przyjmujący argument typu `String` z zapisem tonu nuty podanym
    w międzynarodowej notacji nutowej, np. G♯3
  * metodę zwracającą wartość typu `String` odpowiadającą przechowywanej nazwie
    tonu (bez oktawy) wraz z ewentualnym znakiem chromatycznym, np. G♯
  * metodę zwracającą wartość typu `int` odpowiadającą przechowywanemu numerowi
    oktawy, np. 3
  * metody modyfikujące przechowywany ton (z użyciem argumentu typu `String`)
    oraz oktawę (z użyciem argumentu typu `int`)

Klasa wyjątku `International_Pitch_Notation_Exception` powinna posiadać dwa
konstruktory zgodnie z przykładem
[Custom_exception_2/](/programowanie-obiektowe/examples/04/Custom_exception_2/).

Wyjątek `International_Pitch_Notation_Exception` powinien być rzucany wtedy, gdy
jakaś metoda klasy `International_Pitch_Notation` próbuje zapisać nutę w sposób
niezgodny z notacją IPN, np. próbując ustawić wartość M♯4.

### Bibliografia

  * <https://docs.oracle.com/javase/tutorial/java/IandI/super.html>

## Moduł 5

### Pliki tekstowe: zapis i odczyt (wersja klasyczna)

Przykład (pełny przykład znajduje się w katalogu
[Classic/](/programowanie-obiektowe/examples/05/Classic/)):
```java
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Classic {
    private static String read(String filename) throws IOException {
        FileReader r = new FileReader(filename);
        String res = "";
        int c;
        while ((c = r.read()) != -1) {
            res += (char) c;
        }
        r.close();
        return res;
    }

    private static void write(String filename, String str) throws IOException {
        FileWriter w = new FileWriter(filename);
        w.write(str);
        w.close();
    }
    
    public static void main(String[] args) {
        final String filename = "file.txt";
        final String text = "Hello, kitty!";
        try {
            write(filename, text);
            String str = read(filename);
            if (str.equals(text)) {
                System.out.println("Zapis i odczyt prawidłowy.");
            }
        } catch (IOException e) {
            // Uwaga: Zastosowano poniżej strumień błędów System.err.
            System.err.println(e.getMessage());
        }
    }
}
```

Wynik działania przykładu:
> Zapis i odczyt prawidłowy.

### Pliki tekstowe: zapis i odczyt (wersja współczesna)

Przykład (pełny przykład znajduje się w katalogu
[Modern/](/programowanie-obiektowe/examples/05/Modern/)):
```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Modern {
    public static void main(String[] args) {
        final Path filepath = Paths.get("file.txt");
        final String poetry =
            "hello, kitty\n"
            + "my old friend\n"
            + "we are drinking\n"
            + "milk again\n";
        try {
            Files.write(filepath, poetry.getBytes());
            List<String> verses = Files.readAllLines(filepath);
            for (String line : verses) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
```

Wynik działania przykładu:
> hello, kitty  
> my old friend  
> we are drinking  
> milk again

### Pliki binarne: zapis i odczyt (serializacja i deserializacja obiektów)

Przykład (pełny przykład znajduje się w katalogu
[Serialize/](/programowanie-obiektowe/examples/05/Serialize/)):
```java
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Kitty implements Serializable {
    private String favorite_drink;
    
    public Kitty(String drink) {
        favorite_drink = drink;
    }

    public String get_favorite_drink() {
        return favorite_drink;
    }
}

public class Serialize {
    private static void serialize_kitty(String filename, Kitty kitty)
        throws IOException
    {
        FileOutputStream file_out = new FileOutputStream(filename);
        ObjectOutputStream object_out = new ObjectOutputStream(file_out);
        object_out.writeObject(kitty);
    }

    private static Kitty deserialize_kitty(String filename)
        throws IOException, ClassNotFoundException
    {
        FileInputStream file_in = new FileInputStream(filename);
        ObjectInputStream object_in = new ObjectInputStream(file_in);
        Kitty kitty = (Kitty) object_in.readObject();
        return kitty;
    }
    
    public static void main(String[] args) {
        try {
            String filename = "kitty.bin";
            Kitty kitty = new Kitty("milk, of course");
            serialize_kitty(filename, kitty);
            Kitty clone = deserialize_kitty(filename);
            System.out.println("Kitty's favorite drink: "
                               + clone.get_favorite_drink());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
```

Wynik działania przykładu:
> Kitty's favorite drink: milk, of course

### Zadania

#### 5.1 `uniq`

Napisz program, który będzie wczytywał wierszami plik tekstowy i wypisywał jego
zawartość do innego pliku tekstowego. Jeśli w pliku wejściowym dwie (lub więcej)
następujące po sobie linie są identyczne, to w pliku wyjściowym należy zapisać
taką linię tylko raz (pomijając następujące bezpośrednio po oryginale
duplikaty).

Nazwy plików powinny być podawane przez użytkownika w trakcie działania
programu. Jeśli plik wejściowy nie istnieje, to program powinien wypisywać
komunikat:
> Plik o podanej nazwie nie istnieje.

Uwaga: Program w swoim działania jest do pewnego stopnia podobny do polecenia
`uniq` z pakietu *GNU coreutils*.

### Bibliografia

  * <https://docs.oracle.com/javase/8/docs/api/java/io/FileReader.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/io/FileWriter.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/nio/file/Paths.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/util/List.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/io/FileInputStream.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/io/FileOutputStream.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/io/ObjectInputStream.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/io/ObjectOutputStream.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html>

## Moduł 6

### Dziedziczenie klas

Przykład (pełny przykład znajduje się w katalogu
[Cat_Example/](/programowanie-obiektowe/examples/06/Cat_Example/)):
```java
class Cat {
    private final String fur;

    public Cat(String fur) {
        this.fur = fur;
    }

    public String get_fur() {
        return fur;
    }

    public String description() {
        return "Cat with " + fur + " fur";
    }
}

class Wild_Cat extends Cat {
    private int sharpness_of_claws; // [0%, 100%]

    public Wild_Cat(String fur, int sharpness_of_claws) {
        super(fur);
        this.sharpness_of_claws = sharpness_of_claws;
    }

    public int get_sharpness_of_claws() {
        return sharpness_of_claws;
    }

    @Override public String description() {
        return
            "Wild "
            + super.description()
            + " and claws with sharpness of " + sharpness_of_claws + "%";
    }
}

public class Cat_Example {
    private static void example_1() {
        System.out.println("Example 1");
        Wild_Cat c = new Wild_Cat("black", 100);
        System.out.println(c.description());
        System.out.println(c.get_fur());
        System.out.println(c.get_sharpness_of_claws());
    }

    private static void example_2() {
        System.out.println("Example 2");
        Cat c = new Wild_Cat("black", 100);
        System.out.println(c.description());
        System.out.println(c.get_fur());
        // System.out.println(c.get_sharpness_of_claws()); // Błędny kod
    }
    
    public static void main(String[] args) {
        example_1();
        example_2();
    }
}
```

Wynik działania przykładu:
> Example 1  
> Wild Cat with black fur and claws with sharpness of 100%  
> black  
> 100  
> Example 2  
> Wild Cat with black fur and claws with sharpness of 100%  
> black

### Zadania

#### 6.1 Wielomiany

Stwórz klasę `Polynomial` reprezentującą dowolny wielomian ($`a_n \neq 0`$):
```math
p(x) = a_n x^n + \dots + a_1 x + a_0 = \sum_{i=0}^{n} a_i x^i
```
Niech klasa ta posiada:
  * prywatną tablicę wartości `double` reprezentującą współczynniki wielomianu
  * konstruktor inicjujący ww. tablicę
  * metodę `eval` obliczającą wartość wielomianu $`p(x)`$ w punkcie $`x`$
    podanym jako argument tej metody
  * metodę `deg` zwracającą stopień wielomianu, tzn. wartość $`n`$
  * metodę `description` zwracającą opis wielomianu, np. *wielomian stopnia 4*

Stwórz dwie klasy dziedziczące po `Polynomial`: `Linear_Polynomial`
(reprezentującą wielomian stopnia pierwszego, tzn. funkcję liniową) oraz
`Quadratic_Polynomial` (reprezentującą wielomian stopnia drugiego, tzn. funkcję
kwadratową).

Klasa `Linear_Polynomial` powinna umożliwić obliczenie nachylenia prostej
względem osi $`x`$ na wykresie reprezentującym funkcję liniową (zdefiniuj do
tego celu odpowiednią metodę). Wywołanie metody `description` powinno zwrócić
napis *wielomian liniowy*.

Klasa `Quadratic_Polynomial` powinna umożliwić obliczenie ekstremum funkcji
kwadratowej (zdefiniuj do tego celu odpowiednią metodę). Wywołanie metody
`description` powinno zwrócić napis *wielomian kwadratowy*.

Stwórz przykładowy program korzystający z klas `Polynomial`, `Linear_Polynomial`
oraz `Quadratic_Polynomial`.

#### 6.2 `JButton`

Stwórz klasę dziedziczącą po `JButton` o wybranej przez siebie nazwie. Niech ta
nowa klasa posiada konstruktor, który przyjmuje dwa argumenty:
  * pierwszy ustawiający napis na przycisku (niech będzie on przekazywany do
    klasy bazowej)
  * drugi ustawiający napis podpowiedzi wyświetlanej po najechaniu kursorem na
    przycisk (użyj funkcji `setToolTipText`)

Napisz przykładowy program, który wykorzystuje nową klasę oraz klasę `JFrame`.

### Bibliografia

  * <https://docs.oracle.com/javase/tutorial/java/concepts/inheritance.html>
  * <https://docs.oracle.com/javase/tutorial/java/annotations/predefined.html>

## Moduł 7

### Interfejsy

Przykład (pełny przykład znajduje się w katalogu
[Meow/](/programowanie-obiektowe/examples/07/Meow/)):
```java
interface Meowable {
    // Interfejs może zawierać:
    // - stałe
    int no_of_legs = 4;
    
    // - sygnatury metod
    String meow();

    // - metody domyślne
    default String eat() {
        return "O mnom mnom!";
    }

    // - metody statyczne
    static String purr() {
        return "Purr!";
    }

    // - typy zagnieżdżone
    class Kitty {}
}

interface Huntable {
    // Najczęściej są jednak używane sygnatury metod.
    boolean successful_hunting();
}

class Cat implements Meowable {
    public String meow() {
        return "Meow!";
    }

    int legs() {
        return no_of_legs;
    }
}

class Wild_Cat extends Cat implements Meowable, Huntable {
    @Override public String meow() {
        return "Meeeooow!!!";
    }

    @Override public String eat() {
        return "O mnom mnom!!!";
    }

    public boolean successful_hunting() {
        return new java.util.Random().nextBoolean();
    }
}

public class Meow {
    public static void main(String[] args) {
        Cat c = new Cat();
        Wild_Cat w = new Wild_Cat();
        Meowable.Kitty k = new Meowable.Kitty();

        System.out.println(c.meow() + " " + c.eat());
        System.out.println(w.meow());
        if (w.successful_hunting()) {
            System.out.println(w.eat());
        }
        // Meowable.no_of_legs = 5; // Błąd!
        System.out.println(Meowable.purr());
    }
}
```

Wynik działania przykładu:
> Meow! O mnom mnom!  
> Meeeooow!!!  
> O mnom mnom!!!  
> Purr!

### Klasy i metody abstrakcyjne

Przykład (pełny przykład znajduje się w katalogu
[Abstract_Meow/](/programowanie-obiektowe/examples/07/Abstract_Meow/)):
```java
abstract class Meow {
    private boolean hungry;

    Meow() {
        hungry = true;
    }

    public void set_hungry(boolean b) {
        hungry = b;
    }

    String meow() {
        return hungry? frustrated() : satisfied();
    }

    abstract String frustrated();
    abstract String satisfied();
}

class Cat extends Meow {
    @Override String frustrated() {
        return "Meowowowow!";
    }

    @Override String satisfied() {
        return "Meow!";
    }
}

public class Abstract_Meow {
    public static void main(String[] args) {
        Cat c = new Cat();
        System.out.println(c.meow());
        c.set_hungry(false);
        System.out.println(c.meow());
    }
}
```

Wynik działania przykładu:
> Meowowowow!  
> Meow!

### Zadania

#### 7.1 Historia naturalna

Napisz program, który sortuje wydarzenia w historii naturalnej przez wzgląd na
czas w którym one nastąpiły. W tym celu stwórz klasę `Natural_history_event`,
która przechowuje opis wydarzenia oraz datę rozumianą jako liczbę lat, która od
jego zaistnienia upłynęła. Dane typu `Natural_history_event` wczytaj do listy,
którą posortujesz z użyciem instrukcji `Collections.sort(list);`. Pamiętaj, że
obiekty klasy `Natural_history_event` można sortować pod warunkiem, że klasa ta
implementuje interfejs `Comparable`. Dane wczytaj według własnego uznania
z klawiatury bądź pliku a rezultat sortowania wyświetl na ekranie lub zapisz do
pliku. Oto zestaw przykładowych danych, których możesz użyć do testowania
swojego rozwiązania (*a* oznacza rok temu, *ka* — tysiąc lat temu, *Ma* — milion
lat temu, *Ga* — miliard lat temu):
  * 315 ka — *Homo sapiens*
  * 300 Ma — ssaki
  * 243 Ma — dinozaury
  * 11,6 Ma — chód na dwóch nogach
  * 170 ka — ubrania
  * 66,043 Ma — krater Chicxulub
  * 4,54 Ga — uformowanie Ziemi
  * 3,4 Ma — narzędzia kamienne
  * 13,8 Ga — Wielki Wybuch
  * 2,5 Ma — *Homo*
  * 90 Ma — naczelne
  * 20 Ma — człowiekowate
  * 800 Ma — zwierzęta
  * 35 Ma — wiechlinowate (trawy)
  * 270 ka — II wyjście z Afryki
  * 1,5 Ga — rozpad superkontynentu
  * 1,5 Ga — grzyby
  * 2,12 Ma — I wyjście z Afryki
  * 2,5 Ga — katastrofa tlenowa
  * 650 Ma — zamarznięta Ziemia

Uwaga: Określenie *historia naturalna* jest obecnie zbyt ogólnikowe, choć wciąż
bywa używane, np. w biologii ewolucyjnej.

#### 7.2 Kolekcja płyt

Napisz program symulujący kolekcję płyt CD (albumy muzyczne) i DVD (filmy).
Zarówno płyta CD jak i DVD ma tytuł i długość zawartego w niej materiału
(liczoną w sekundach). Płyta CD posiada nazwę artysty/zespołu, natomiast płyta
DVD dysponuje kodem regionu, do którego jest przeznaczona.

Swtórz klasę bazową `Disc` i odpowiednie klasy pochodne dla płyty CD oraz płyty
DVD. Napisz program wykorzystujący `List<Disc>`, który tworzy małą kolekcję płyt
i na ekranie wypisuje wszystkie informacje o wszystkich płytach w tej kolekcji
niezależnie od ich rodzaju.

API każdej z klas zaprojektuj tak, aby umożliwiało ono pobranie wartości każdego
pola danych z osobna. Stosuj kapsułkowanie danych i unikaj dostępu chronionego.
Zastosuj wiedzę z zakresu klas i metod abstrakcyjnych (interfejsy nie są
potrzebne do rozwiązania zadania). Pamiętaj, że używanie `@Override` jest dobrą
praktyką.

#### 7.3 Interfejsy a abstrakcyjne klasy bazowe

Interfejsy mogą być do pewnego stopnia zamienione przez abstrakcyjne klasy
bazowe. W szczególności odpowiedni fragment z przykładu
[Meow/](/programowanie-obiektowe/examples/07/Meow/) można zastąpić przez kod:
```java
abstract class Meowable {
    public final int no_of_legs = 4;
    
    abstract String meow();
    
    public String eat() {
        return "O mnom mnom!";
    }

    static String purr() {
        return "Purr!";
    }

    class Kitty {}
}

class Cat extends Meowable {
    @Override public String meow() {
        return "Meow!";
    }

    int legs() {
        return no_of_legs;
    }
}
```

Wskaż przykład wykorzystania pojęcia interfejsu, gdzie **nie można** zastąpić go
abstrakcyjną klasą bazową. (Zaprezentuj przykład kodu, który kompiluje się gdy
użyto interfejsu, ale nie można go skompilować po zmianie na abstrakcyjną
klasę bazową.)

### Bibliografia

  * <https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html>
  * <https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html>
  * <https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html>
  * <https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html>

## Moduł 8

### Graficzny interfejs użytkownika

  * Abstract Window Toolkit (AWT) — pierwotny interfejs graficzny języka Java
    zbudowany w oparciu o komponenty natywne danego systemu operacyjnego
  * Swing — niezależny od systemu operacyjnego interfejs oparty na AWT
  * JavaFX — najnowszy interfejs graficzny

Na ten moment ograniczymy się do interfejsów Swing oraz AWT.

### Swing

API interfejsu Swing zawiera wiele pakietów. Jednak w większości przypadków
wystarczą dwa:
  * `javax.swing`
  * `javax.swing.event`

Uwaga: Symbol `javax` oznacza “Java Extension”, który to termin ma obecnie
znaczenie historyczne. Z czasem API `javax` stało się integralną częścią Java.

Uwaga: Zamiast `javax.swing.event` można wykorzystywać `java.awt.event`.

### Hierarchia przechowywania

  * Każdy program Swing posiada co najmniej jeden kontener najwyższego poziomu,
    taki jak `JFrame` (główne okno aplikacji), `JDialog` (okno dialogowe) lub
    `JApplet` (aplety; znaczenie historyczne — zob. uwagę poniżej).
  * Każdy komponent może zostać zawarty tylko w jednym kontenerze nadrzędnym.

Uwaga: Aplety Java były w przeszłości popularnym rozwiązaniem do publikowania
interaktywnej zawartości w internecie. Zrezygnowano jednak z nich z powodów
bezpieczeństwa oraz kompatybilności. Funkcjonalność apletów Java uruchamianych
z poziomu przeglądarki internetowej została przejęta przez HTML, CSS oraz
JavaScript (a także przez WebAssembly).

### Przykłady

Poniżej znajduje się przykład z wykorzystaniem pozycjonowania bezwzględnego,
elementów interfejsu Swing oraz obsługi wydarzeń z interfejsu AWT.

Uwaga: Mimo, że przykład wykorzystuje pozycjonowanie bezwzględne, należy mieć
na uwadze, że w tworzeniu zaawansowanych aplikacji rekomenduje się wykorzystanie
menedżera układu.

Przykład (pełny przykład znajduje się w katalogu
[Degree_to_radian/](/programowanie-obiektowe/examples/08/Degree_to_radian/)):
```java
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Degree_to_radian extends JFrame {
    
    private JTextField value_field = new JTextField();
    private JLabel degree_label = new JLabel("°");
    private JButton convert_button = new JButton("=");
    private JLabel result_label = new JLabel();

    private final void set_icon() {
        ImageIcon img = new ImageIcon("../../../../fig/Kitty32x32.jpg");
        setIconImage(img.getImage());
    }
    
    private final void add_components() {
        add(value_field);
        add(degree_label);
        add(convert_button);
        add(result_label);
    }
    
    private final void set_bounds() {
        final int mx = 75; // "margines" w poziomie
        final int my = 10; // "margines" w pionie
        final int xx = 75; // szerokość komponentu
        final int yy = 30; // wysokość komponentu
        final int dx =  5; // szerokość odstępu poziomego
        final int dy =  5; // wysokość odstępu pionowego
        final int h  = 75; // wysokość ramki
        setBounds(0, 0, 4 * xx + 3 * dx + 2 * mx, h);
        value_field   .setBounds(                mx, my, xx, yy);
        degree_label  .setBounds(      mx + xx + dx, my, xx, yy);
        convert_button.setBounds(mx + 2 * (xx + dx), my, xx, yy);
        result_label  .setBounds(mx + 3 * (xx + dx), my, xx, yy);
    }
    
    private final void add_actions() {
        // Uwaga: Po `new` wykorzystano składnię tzw. klasy anonimowej.
        convert_button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    convert_to_radians(evt);
                }
            });
    }
    
    public Degree_to_radian() {
        super("Konwersja stopni na radiany");
        setLayout(null); // pozycjonowanie bezwzględne
        set_icon();
        add_components();
        set_bounds();
        add_actions();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    private void convert_to_radians(ActionEvent evt) {
        double val_deg = (double)(Double.parseDouble(value_field.getText()));
        double val_rad = val_deg * Math.PI / 180.;
        result_label.setText(String.format("%.2f", val_rad) + " rad");
    }
    
    public static void main(String args[]) {
        new Degree_to_radian().setVisible(true);
    }
}
```

Wynik działania przykładu:  
![Wynik działania przykładu](/programowanie-obiektowe/examples/08/Degree_to_radian/result.png)

Uwaga: Obramowanie wokół symbolu znaku równości jest artefaktem po kliknięciu
w przycisk.

Poniżej znajduje się przykład wykorzystujący menu.

Przykład (pełny przykład znajduje się w katalogu
[Menu_example/](/programowanie-obiektowe/examples/08/Menu_example/)):
```java
import javax.swing.*;

public class Menu_example extends JFrame {
    private JMenuBar menubar = new JMenuBar();
    private JMenu menu = new JMenu("Menu");
    private JMenuItem item1 = new JMenuItem("Element 1");
    private JMenuItem item2 = new JMenuItem("Element 2");

    private final void set_icon() {
        ImageIcon img = new ImageIcon("../../../../fig/Kitty32x32.jpg");
        setIconImage(img.getImage());
    }
    
    private final void add_components() {
        setJMenuBar(menubar);
        menubar.add(menu);
        menu.add(item1);
        menu.add(item2);
    }
    
    public Menu_example() {
        super("Program z menu");
        set_icon();
        add_components();
        setBounds(0, 0, 250, 125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new Menu_example().setVisible(true);
    }
}
```

Wynik działania przykładu:  
![Wynik działania przykładu](/programowanie-obiektowe/examples/08/Menu_example/result.png)

### Dodatek: Klasy anonimowe

Przykład (pełny przykład znajduje się w katalogu
[Anonymous_class/](/programowanie-obiektowe/examples/08/Anonymous_class/)):
```java
class My_class {
    public void f() {
        System.out.println("My_class.f");
    }
}

interface My_interface {
    void f();
}

public class Anonymous_class {
    public static void main(String args[]) {
        new My_class() {
            @Override public void f() {
                System.out.println("<anonymous class/class>.f");
            }
        }.f();

        new My_interface() {
            @Override public void f() {
                System.out.println("<anonymous class/interface>.f");
            }
        }.f();
    }
}
```
Wynik działania przykładu:
> <anonymous class/class>.f  
> <anonymous class/interface>.f

### Bibliografia

  * <https://docs.oracle.com/javase/8/docs/technotes/guides/awt/>
  * <https://docs.oracle.com/javase/8/docs/technotes/guides/swing/>
  * <https://docs.oracle.com/javase/tutorial/uiswing/events/>
  * <https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/java/awt/package-summary.html>
  * <https://docs.oracle.com/en/java/javase/22/docs/api/java.desktop/javax/swing/package-summary.html>
  * <https://www.oracle.com/technical-resources/articles/java/mixing-components.html>
  * <https://www.oracle.com/java/technologies/painting.html>
  * <https://docs.oracle.com/javase/8/javase-clienttechnologies.htm>
  * <https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html>
  * <https://docs.oracle.com/javase/tutorial/uiswing/layout/>
  * <https://docs.oracle.com/javase/8/docs/api/javax/swing/JTextField.html>
  * <https://docs.oracle.com/javase/8/docs/api/javax/swing/JLabel.html>
  * <https://docs.oracle.com/javase/8/docs/api/javax/swing/JButton.html>
  * <https://docs.oracle.com/javase/8/docs/api/javax/swing/JMenuBar.html>
  * <https://docs.oracle.com/javase/8/docs/api/javax/swing/JMenu.html>
  * <https://docs.oracle.com/javase/8/docs/api/javax/swing/JMenuItem.html>
  * Kirill Grouchnikov (Maj 2008), *Swing, RIA and JavaFX – interview with Amy
    Fowler*.
    <https://www.pushing-pixels.org/2008/05/19/swing-ria-and-javafx-interview-with-amy-fowler.html>

### Projekt indywidualny

Zadanie polega na zrealizowaniu jednego projektu indywidualnego zgodnie
z instrukcjami zawartymi w sekcji [Projekt indywidualny](#projekt-indywidualny)
i w terminie tam podanym.

## Moduł 9

### Wzorce projektowe

Podział wzorców:
  * behawioralne (czynnościowe)
  * kreacyjne (konstrukcyjne)
  * strukturalne

Wzorce mogą być klasowe i obiektowe.

Dalej znajdują się przykłady wzorców projektowych.

### Metoda szablonowa (behawioralny, klasowy)

Metoda szablonowa (*template method*) jest behawioralnym klasowym wzorcem
projektowym umożliwiającym wyspecyfikowanie ogólnego algorytmu w klasie bazowej
i doprecyzowanie szczegółów w klasach pochodnych.

Przykład (pełny przykład znajduje się w katalogu
[Travelling/](/programowanie-obiektowe/examples/09/Travelling/)):
```java
abstract class Traveller {
    public void travel(String starting_point,
                       String destination_point,
                       String things_to_take) {
        pack_the_luggage(things_to_take);
        leave(starting_point);
        cover_the_distance(starting_point, destination_point);
        enter(destination_point);
    }

    protected void pack_the_luggage(String things_to_take) {
        System.out.println("Pakuję: " + things_to_take);
    }

    protected void leave(String starting_point) {
        System.out.println("Opuszczam: " + starting_point);
    }

    abstract protected void cover_the_distance(String starting_point,
                                               String destination_point);

    protected void enter(String destination_point) {
        System.out.println("Przybywam do: " + destination_point);
    }
}

class Car_driver extends Traveller {
    @Override protected void cover_the_distance(String starting_point,
                                                String destination_point) {
        if (empty_tank()) {
            refuel();
        }
    }

    private Boolean empty_tank() {
        return new java.util.Random().nextBoolean();
    }

    private void refuel() {
        System.out.println("Tankowanie");
    }
}

class Cyclist extends Traveller {
    @Override protected void pack_the_luggage(String things_to_take) {
        System.out.println("Pakuję: " + things_to_take);
        System.out.println("Niestety, nie wszystko się zmieściło w bagażniku");
    }
    
    @Override protected void cover_the_distance(String starting_point,
                                                String destination_point) {
        if (is_raining()) {
            System.out.println("Pada deszcz");
            get_wet();
        }
        if (is_chased_by_a_dog()) {
            System.out.println("Goni mnie pies");
            escape();
        }
    }

    private Boolean is_raining() {
        return new java.util.Random().nextBoolean();
    }

    private void get_wet() {
        System.out.println("Moknę");
    }

    private Boolean is_chased_by_a_dog() {
        return new java.util.Random().nextBoolean();
    }

    private void escape() {
        System.out.println("Uciekam");
    }
}

public class Travelling {
    private static void travel(Traveller t) {
        t.travel("X", "Y", "plecak i zakupy");
    }
    
    public static void main(String[] args) {
        System.out.println("Podróż samochodem");
        travel(new Car_driver());
        System.out.println("Podróż rowerem");
        travel(new Cyclist());
    }
}
```

Wynik działania przykładu:
> Podróż samochodem  
> Pakuję: plecak i zakupy  
> Opuszczam: X  
> Tankowanie  
> Przybywam do: Y  
> Podróż rowerem  
> Pakuję: plecak i zakupy  
> Niestety, nie wszystko się zmieściło w bagażniku  
> Opuszczam: X  
> Pada deszcz  
> Moknę  
> Goni mnie pies  
> Uciekam  
> Przybywam do: Y

Diagram UML klas przykładu:
![Diagram UML klas przykładu](/programowanie-obiektowe/examples/09/Travelling/uml.svg)

### Fabryka abstrakcyjna (kreacyjny, obiektowy)

Fabryka abstrakcyjna (*abstract factory*) jest kreacyjnym obiektowym wzorcem
projektowym umożliwiającym tworzenie rodzin powiązanych obiektów bez
konieczności specyfikowania konkretnych klas.

Przykład (pełny przykład znajduje się w katalogu
[Cuisine/](/programowanie-obiektowe/examples/09/Cuisine/)):
```java
// Interfejsy abstrakcyjnych produktów na przykładzie posiłków:
// - zupa
interface Soup {
    Boolean is_hot();
}

// - danie główne
interface Main_course {
    Boolean contains_meat();
}

// - deser
interface Dessert {
    String main_ingredient();
}

// Interfejs fabryki abatrakcyjnej na przykładzie kuchni regionalnych.
interface Regional_cuisine {
    Soup prepare_soup();
    Main_course prepare_main_course();
    Dessert prepare_dessert();
}

// Klasy implementujące powyższe interfejsy znajdują się poniżej.

// Kuchnia polska: żurek, kotlet schabowy i sernik.

class Zurek implements Soup {
    public Boolean is_hot() { return true; }
}

class Kotlet_schabowy implements Main_course {
    public Boolean contains_meat() { return true; }
}

class Sernik implements Dessert {
    public String main_ingredient() { return "twaróg"; }
}

class Polish_cuisine implements Regional_cuisine {
    public Soup prepare_soup() { return new Zurek(); }
    public Main_course prepare_main_course() { return new Kotlet_schabowy(); }
    public Dessert prepare_dessert() { return new Sernik(); }
}

// Kuchnia włoska: stracciatella, lasagne al forno, panna cotta.

class Stracciatella implements Soup {
    public Boolean is_hot() { return true; }
}

class Lasagne_al_forno implements Main_course {
    public Boolean contains_meat() { return true; }
}

class Panna_cotta implements Dessert {
    public String main_ingredient() { return "śmietanka"; }
}

class Italian_cuisine implements Regional_cuisine {
    public Soup prepare_soup() { return new Stracciatella(); }
    public Main_course prepare_main_course() { return new Lasagne_al_forno(); }
    public Dessert prepare_dessert() { return new Panna_cotta(); }
}

// Wykorzystanie fabryki abstrakcyjnej do stworzenia kompletnych zestawów
// posiłków danej kuchni znajduje się poniżej.

public class Cuisine {
    private static void prepare_meal(Regional_cuisine factory) {
        System.out.println(factory.getClass().getName());
        System.out.println(factory.prepare_soup().getClass().getName());
        System.out.println(factory.prepare_main_course().getClass().getName());
        System.out.println(factory.prepare_dessert().getClass().getName());
    }
    
    public static void main(String[] args) {
        prepare_meal(new Polish_cuisine());
        prepare_meal(new Italian_cuisine());
    }
}
```

Wynik działania przykładu:
> Polish_cuisine  
> Zurek  
> Kotlet_schabowy  
> Sernik  
> Italian_cuisine  
> Stracciatella  
> Lasagne_al_forno  
> Panna_cotta

Diagram UML klas przykładu:
![Diagram UML klas przykładu](/programowanie-obiektowe/examples/09/Cuisine/uml.svg)

### Kompozyt (strukturalny, obiektowy)

Kompozyt (*composite*) jest strukturalnym obiektowym wzorcem projektowym
umożliwiającym składanie obiektów w strukturę drzewiastą i pracę ze strukturą
tak, jakby była ona pojedynczym obiektem.

Uwaga: Istnieją dwie odmiany kompozytu: *jednolita* oraz *bezpieczna typowo*.
Tutaj zostanie omówiona wersja bezpieczna typowo.

Przykład (pełny przykład znajduje się w katalogu
[Packaging/](/programowanie-obiektowe/examples/09/Packaging/)):
```java
// Klasa komponentu o nazwie `Item`.
class Item {
    private double value;
    public Item(double value) { this.value = value; }
    public double value() { return value; } // Metoda operacji wzorca kompozyt.
}

// Klasy liści o nazwach `Phone`, `Charger` i `Headphones`.

class Phone extends Item {
    public Phone(double value) { super(value); }
    public void make_call() {}
    // …
}

class Charger extends Item {
    public Charger(double value) { super(value); }
    public void charge() {}
    // …
}

class Headphones extends Item {
    public Headphones(double value) { super(value); }
    public void play() {}
    // …
}

// Klasa kompozytu o nazwie `Package`.
class Package extends Item {
    private java.util.Stack<Item> items = new java.util.Stack<Item>();

    public Package() { super(0.); }
    
    public void add(Item child) {
        items.push(child);
    }

    public Item get() {
        return items.pop();
    }

    // Metoda operacji wzorca kompozyt musi być tutaj nadpisana, aby prawidłowo
    // obsłużyć kompozycję.
    @Override public double value() {
        double res = 0.;
        for (Item i : items) {
            res += i.value();
        }
        return res;
    }
}

public class Packaging {
    // W paczce przychodzi telefon z ładowarką.
    private static Package phone_factory() {
        Package res = new Package();
        res.add(new Phone(479.));
        res.add(new Charger(20.));
        return res;
    }

    // W paczce przychodzą słuchawki.
    private static Package audio_factory() {
        Package res = new Package();
        res.add(new Headphones(59.));
        return res;
    }

    // W paczce przychodzą dwie mniejsze paczki.
    public static void main(String[] args) {
        Package delivery_package = new Package();
        delivery_package.add(phone_factory());
        delivery_package.add(audio_factory());
        System.out.println("Cena przesyłki: " + delivery_package.value());
    }
}
```

Wynik działania przykładu:
> Cena przesyłki: 558.0

Diagram UML klas przykładu:
![Diagram UML klas przykładu](/programowanie-obiektowe/examples/09/Packaging/uml.svg)

### Zadania

#### 9.1 Całkowanie numeryczne

Korzystając ze wzorca projektowego *metoda szablonowa* stwórz odpowiednią
hierarchię klas odpowiedzialną za numeryczne całkowanie funkcji:
  * Stwórz klasę bazową `Numerical_integration`, która posiada m.in. metodę
    `integrate` odpowiedzialną za całkowanie.
  * Stwórz klasy pochodne `Rectangle_rule` oraz `Trapezoidal_rule`, które
    umożliwiają całkowanie odpowiednio metodą prostokątów oraz trapezów.

Na podstawie ww. hierarchii klas stwórz program, który całkuje numerycznie
dowolnie wybraną przez siebie funkcję. Funkcja do całkowania może być:
  * zakodowana na stałe w rozwiązaniu albo
  * przekazywana jako argument konstruktora typu `DoubleFunction<double>`

Zaprezentuj wynik całkowania funkcji obliczony metodą prostokątów oraz trapezów
na wybranym przez siebie przedziale.

Uwaga: Całkowanie funkcji $`f(x)`$ na przedziale od $`a`$ do $`b`$ metodą
prostokątów polega na zastosowaniu przybliżenia:
```math
\int_a^b f(x)\, dx
\approx
\frac{b - a}{n}
\sum_{i = 0}^{n - 1} f\left( a + ( i + \alpha ) \cdot \frac{b - a}{n} \right)
```
gdzie $`\alpha \in [0, 1]`$ i proponowaną wartością jest $`\alpha = \frac{1}{2}`$.
W przypadku metody trapezów stosuje się przybliżenie:
```math
\int_a^b f(x)\, dx
\approx
\frac{1}{2} \frac{b - a}{n}
\sum_{i = 0}^{n - 1}
\left[
f\left( a + i \cdot \frac{b - a}{n} \right)
+
f\left( a + (i + 1) \cdot \frac{b - a}{n} \right)
\right]
```

#### 9.2 Sonda von Neumanna

Przeczytaj poniższy tekst z kategorii science-fiction.

> Jakiś czas temu upłynął rok 2100 i ludzkość wreszcie stała się cywilizacją
> typu I według klasyfikacji Kardasheva. Do osiągnięcia typu II (a tym bardziej
> III) jeszcze bardzo długa droga. Jednak już taki postęp naukowo-technologiczny
> umożliwił wykorzystywanie całej energii równoważnej tej, która dociera do
> Ziemi ze Słońca. Ilość dostępnej energii umożliwia opanowanie wybuchów
> wulkanów i trzęsień ziemi czy też kolonizowanie kosmosu. Ostatnią rewelacją
> było zbudowanie sondy von Neumanna, która po osiągnięciu celu swojej
> kosmicznej podróży potrafi wykonać pewnę pracę a także samodzielnie się
> zreplikować. Kilka potężnych korporacji z sektora górnictwa kosmicznego
> przystąpiło więc do rywalizacji o nowy segment rynku…

Firmy *A*, *B* oraz *C* produkują sondy von Neumanna do celów górnictwa
kosmicznego. Każda z nich dysponuje własnościowymi rozwiązaniami w zakresie
silników, mechanizmów replikujących sondę oraz narzędzi wydobywczych.
Rozwiązania nie są uniwersalne i komponenty danej firmy współpracują jedynie
z innymi komponentami tej samej firmy. Z użyciem wzorca projektowego *fabryka
abstrakcyjna* napisz program, który umożliwi zamodelowanie wytworzenia zestawu
zgodnych ze sobą podzespołów sondy von Neumanna według wyboru użytkownika.

#### 9.3 Powierzchnia użytkowa domu

Wróćmy do czasów współczesnych i nieco bardziej przyziemnych problemów.

Dom może składać się z pokoi mieszkalnych, przedpokoi, kuchni, spiżarek,
łazienek i garaży (dalej nazywanych *komponentami* domu). Powierzchnia użytkowa
domu jest równa sumie wchodzących w jej skład powierzchni użytkowych
poszczególnych komponentów. Korzystając ze wzorca projektowego *kompozyt* stwórz
odpowiednią hierarchię klas modelującą podany problem. Napisz program
wykorzystujący opracowaną hierarchię umożliwiający stworzenie instancji klasy
odpowiadającej za dom pytając o liczbę i powierzchnie użytkowe poszczególnych
komponentów. Niech program obliczy powierzchnię użytkową domu korzystając
z odpowiedniej metody wzorca kompozyt.

### Bibliografia

  * Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides. *Design Patterns:
    Elements of Reusable Object-Oriented Software*. Addison-Wesley (1994)
  * <https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html>
  * <https://refactoring.guru/design-patterns/template-method>
  * <https://refactoring.guru/design-patterns/abstract-factory>
  * <https://refactoring.guru/design-patterns/composite>
  * <https://agilemodeling.com/artifacts/classDiagram.htm>
  * <https://developer.ibm.com/articles/the-class-diagram/>
  * <https://docs.oracle.com/javase/8/docs/api/java/util/function/DoubleFunction.html>

## Zastrzeżenia

Zobacz plik [LICENSE](/LICENSE).
