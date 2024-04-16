# Programowanie obiektowe

Przejdź do treści modułu [0](#moduł-0), [1](#moduł-1), [2](#moduł-2),
[3](#moduł-3), [4](#moduł-4), [5](#moduł-5).

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

  * <https://en.wikibooks.org/wiki/Java_Programming>

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

## Zastrzeżenia

Zobacz plik [LICENSE](/LICENSE).
