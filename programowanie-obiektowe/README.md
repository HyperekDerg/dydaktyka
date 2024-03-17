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

### Klasa `String`

### Dodatek: Modyfikator `final` dla zmiennych

## Zastrzeżenia

Informacje zawarte na tej stronie nie powinny być interpretowane jako próba
przedstawienia czy wyrażenia opinii medycznej lub w inny sposób zaangażowania
się w praktykę medyczną.
