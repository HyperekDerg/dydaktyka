# Programowanie obiektowe

Przejdź do treści modułu [0](#moduł-0), [1](#moduł-1), [2](#moduł-2).

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

## Zastrzeżenia

Informacje zawarte na tej stronie nie powinny być interpretowane jako próba
przedstawienia czy wyrażenia opinii medycznej lub w inny sposób zaangażowania
się w praktykę medyczną.
