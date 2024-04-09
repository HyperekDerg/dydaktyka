# Podstawy programowania

## Informacje organizacyjne

  * Przedmiot _Podstawy programowania_ składają się z wykładu oraz laboratorium
    komputerowego natomiast osobny przedmiot _Laboratorium z programowania_ to
    zajęcia stowarzyszone w formie dodatkowego laboratorium komputerowego.
  * Laboratorium z _Podstaw programowania_ to zajęcia o charakterze
    instruktażowym — zadania są rozwiązywane wspólnie z osobą prowadzącą zajęcia.
    Rozwiązania podlegają ocenie.
  * Rozwiązania na laboratorium z _Podstaw programowania_ powinny zostać oddane
    jeszcze w trakcie trwania zajęć. Dopuszcza się zaprezentowanie rozwiązanie
    na następnych zajęciach przy czym maksymalna ocena może wtedy wynieść 80%
    nominalnej punktacji.
  * _Laboratorium z programowania_ to indywidualna praca własna każdego
    uczestnika zajęć oceniana przez osobę prowadzącą zajęcia.
  * Sposób punktacji zadań z _Laboratorium z programowania_ ustala osoba
    prowadząca zajęcia.
  * Zadania do rozwiązania na laboratoriach obydwu przedmiotów są dostępne na
    stronie dr. inż. Mirosława Barańskiego umieszczonej pod adresem
    <https://mirek.ii.uph.edu.pl/programowanie/>.
  * W ramach laboratorium z _Podstaw programowania_ wymagane jest także
    rozwiązanie i obronienie zadania indywidualnego.
  * Propozycje zadań indywidualnych zostaną zaprezentowane do końca
    października danego roku akademickiego.
  * Za laboratorium z _Podstaw programowania_ można uzyskać 130 punktów za
    rozwiązywanie zadań oraz 70 punktów za rozwiązanie i obronienie zadania
    indywidualnego. W celu dopuszczenia do egzaminu należy uzyskać przynajmniej
    100 punktów. Wymagany do dopuszczenia do egzaminu próg punktacji zostanie
    obniżony w przypadku nieodbycia się zajęć laboratoryjnych.
  * Egzamin z przedmiotu _Podstawy programowania_ składa się z części pisemnej
    i ustnej. Na ocenę końcową składają się następujące składniki z wagami:
      * 40% laboratoria oraz zadanie indywidualne
      * 40% egzamin pisemny
      * 20% egzamin ustny
  * Finalna ocena z przedmiotu _Podstawy programowania_ jest przyznawana przez
    wykładowcę według następującej skali:
      * 91%-100% — bardzo dobra
      * 81%-90%  — dobra plus
      * 71%-80%  — dobra
      * 61%-70%  — dostateczna plus
      * 51%-60%  — dostateczna
      *  0%-50%  — niedostateczna
  * Ocena za przedmiot _Laboratorium z programowania_ jest przyznawana przez
    osobę prowadzącą daną grupę laboratorium według kryteriów danej osoby
    prowadzącej. O szczegóły należy pytać na zajęciach z _Laboratorium
    z programowania_.
  * Laboratoria z _Podstaw programowania_ oraz zajęcia z _Laboratorium
    z programowania_ mogą odbywać się wymiennie w ramach planu zajęć — więcej
    informacji otrzymają Państwo na bieżąco od osób prowadzących laboratoria.
  * W przypadku trudności z opanowaniem materiału zajęć dostępne dla Państwa
    dyspozycji są konsultacje u osób prowadzących zajęcia.
  * W sprawach nieuregulowanych powyższymi zapisami stosuje się przepisy
    Regulaminu studiów.

**Poniżej znajduje się robocza wersja konspektu wykładu.**

## 1. Wstęp do programowania

### Informatyka a programowanie

Można w przybliżeniu uznać, że informatyka ma się tak do programowania, jak
fizyka do inżynierii mechanicznej. Fizyka jest nauką ścisłą, która opisuje świat
z użyciem języka jakim jest matematyka. Inżynieria mechaniczna zaś wykorzystuje
prawa fizyki do opisu i konstrukcji urządzeń. Tak samo informatyka jest nauką
ścisłą a programowania wykorzystuje jej osiągnięcia do tworzenia programów
uruchamianych na urządzeniach elektronicznych.

*Informatyka* jest nauką o przetwarzaniu informacji w sposób automatyczny.

### Algorytm. Maszyna Turinga

*Algorytm* to skończony ciąg ściśle określonych instrukcji, zazwyczaj używanych
do rozwiązania jakiegoś problemu lub wykonania obliczeń.

*Maszyna Turinga* została zaproponowana przez Alana Turinga w 1936 i jest bardzo
prostym modelem obecnie stosowanego komputera. Abstrakcja ta składa się
z nieskończonej taśmy, głowicy i mechanizmu sterującego:
  * Taśma jest podzielona na pola (komórki). Na każdym polu może zostać zapisany
    symbol w języku maszyny.
  * Głowica służy do odczytywania i zapisywania symboli. Może ona się znaleźć
    nad dowolnym polem taśmy.
  * Mechanizm sterujący jest elementem maszyny, który decyduje o jej działaniu.
    Może on się znaleźć w danej chwili czasu w jednym ze skończenie wielu
    stanów.

Mechanizm sterujący podejmuje decyzje do wykonania przez maszynę Turinga.
Decyzja jest podejmowana na podstawie bieżącego stanu mechanizmu a także symbolu
znajdującego się w polu pod głowicą. Taką decyzją może być:
  * przesunięcie głowicy względem taśmy
  * zmiana zawartości pola taśmy
  * zmiana stanu mechanizmu

**Jak widać maszyna Turinga jest środowiskiem do wykonywania algorytmów.** Jest
też ona znacznie prostsza w opisie aniżeli dowolny fizyczny komputer, dlatego
znacznie łatwiej jest dokonywać rozumowania na temat wykonywania algorytmów.
Może to być zastosowane w opisie **złożoności obliczeniowej algorytmu**.
Warto przy okazji zauważyć, że komputery fizyczne mają formalnie mniejsze
możliwości wykonywania programów aniżeli maszyna Turinga, ponieważ ta ostatnia
ma nieskończenie wiele miejsca na taśmie. W granicy odpowienio małych programów
komputerowych ta różnica nie ma znaczenia.

*Hipoteza Churcha-Turinga:* Każdy problem intuicyjnie uznawany za obliczalny,
jest obliczalny przez maszynę Turinga.

Chociaż hipoteza Churcha-Turinga nie została udowodniona z powodu braku precyzji
określenia "**intuicyjnie uznawany** za obliczalny", to jednak żaden znany model
obliczeń nie jest w stanie wyrazić więcej aniżeli maszyna Turinga.

### Języki programowania

*Język programowania* $`\mathcal{L}`$ jest systemem notacji umożliwiającym
zapisywanie programów komputerowych.

Jeśli $`\mathcal{D}`$ jest zbiorem danych, to program można uznać jako następującą
funkcję częściową:
```math
\mathcal{P}^{\mathcal{L}}\colon \mathcal{D}\rightarrow \mathcal{D}
```
taką, że:
```math
\mathcal{P}^{\mathcal{L}}(\textnormal{dane wejściowe}) =
\textnormal{dane wyjściowe}
```
Program $`\mathcal{P}^{\mathcal{L}}`$ może nigdy nie kończyć się dla niektórych
danych wejściowych, dlatego też jest on określany jako funkcja częściowa (por.
problem stopu).

Zbiór wszystkich programów w języku $`\mathcal{L}`$ będzie oznaczany jako
$`\mathcal{Prog}^{\mathcal{L}}`$.

*Maszyną abstrakcyjną* $`\mathcal{M}_{\mathcal{L}}`$ dla języka $`\mathcal{L}`$
jest zbiór algorytmów i struktur umożliwiających przechowywanie i wykonywanie
programów napisanych w języku $`\mathcal{L}`$.

Wspomniana wyżej maszyna Turinga jest najbardziej podstawową maszyną
abstrakcyjną.

*Językiem maszynowym* dla maszyny abstrakcyjnej $`\mathcal{M}_{\mathcal{L}}`$
jest taki język $`\mathcal{L}`$, który jest *zrozumiały* przez interpreter tej
maszyny.

Językiem maszynowym dla maszyny Turinga są pewne napisy nad alfabetem złożonym
z symboli maszyny Turinga.

Językiem maszynowym dla współczesnego komputera są pewne napisy nad alfabetem
zero-jedynkowym związane z brakiem lub przepływem prądu w procesorze komputera.
Napisy te są równoważne semantycznie (znaczeniowo) z językiem asemblera danej
architektury komputera.

Współczesny komputer fizyczny jest również przykładem maszyny abstrakcyjnej.

### Języki interpretowane i kompilowane

Implementacja danego języka programowania może mieć formę *interpretowaną* lub
*kompilowaną*.

Niech $`\mathcal{M}_{0 \mathcal{L}_0}`$ oznacza maszynę abstrakcyjną z językiem
maszynowym $`\mathcal{L}_0`$.

Poprzez czysto interpretowaną implementację języka programowania $`\mathcal{L}`$
dla maszyny abstrakcyjnej $`\mathcal{M}_{0 \mathcal{L}_0}`$ rozumie się tzw.
interpreter, który może być zdefiniowany jako funkcja częściowa:
```math
\mathcal{I}_{\mathcal{L}}^{\mathcal{L}_0}\colon
\mathcal{Prog}^{\mathcal{L}} \times \mathcal{D} \rightarrow \mathcal{D}
```
która spełnia warunek:
```math
\mathcal{I}_{\mathcal{L}}^{\mathcal{L}_0}
(\mathcal{P}^{\mathcal{L}}, \textnormal{dane wejściowe}) =
\mathcal{P}^{\mathcal{L}} (\textnormal{dane wejściowe})
```

Poprzez czysto kompilowaną implementacją języka programowania $`\mathcal{L}`$
dla maszyny abstrakcyjnej $`\mathcal{M}_{0 \mathcal{L}_0}`$ rozumie się tzw.
kompilator, który może być zdefiniowany jako funkcja częściowa:
```math
\mathcal{C}_{\mathcal{L}}^{\mathcal{L}_0}\colon
\mathcal{Prog}^{\mathcal{L}} \rightarrow \mathcal{Prog}^{\mathcal{L}_0}
```
która spełnia warunek:
```math
\mathcal{C}_{\mathcal{L}}^{\mathcal{L}_0}
(\mathcal{P}^{\mathcal{L}}) (\textnormal{dane wejściowe}) =
\mathcal{P}^{\mathcal{L}} (\textnormal{dane wejściowe})
```

### Przykładowe style programowania

Uwaga: Jeden język programowania może wspierać więcej niż jeden styl
programowania. Na przykład C++ wspiera styl imperatywny, proceduralny,
funkcyjny, obiektowy i generyczny. Istnieją też języki programowania, w których
programuje się w jednym stylu. Na przykład Haskell jest językiem czysto
funkcyjnym.

#### ▸ Imperatywny styl programowania

W imperatywnym stylu programowania sterowanie programem jest zaprezentowane
wprost w kodzie źródłowym a stan programu (np. wartości zmiennych) ulegają
zmianom.

Przykład stylu imperatywnego w asemblerze (pełny przykład znajduje się w pliku
[loop-asm/loop.asm](/podstawy-programowania/examples/01/loop-asm/loop.asm)):
```asm
_start:
        mov rcx, 1000000000

loop:
        dec rcx         ; Dekrementacja rejestru rcx (licznika pętli).
        jnz loop        ; Skok do etykiety rozpoczynającej pętlę.
        ;; (Powyższe dwie instrukcje można skrócić za pomocą loop.)
```

Imperatywny styl programowania jest jednym z najbardziej popularnych. Jest
szeroko stosowany w różnych językach programowania.

#### ▸ Strukturalny/proceduralny styl programowania

W strukturalnym/proceduralnym stylu programowania wciąż stosuje się techniki
imperatywne. Są one jednak wzbogacone o bardziej zaawansowane środki kontroli
przepływu dzięki zastosowaniu instrukcji warunkowych, pętli oraz procedur
(funkcji). Oznacza to unikanie instrukcji typu *goto*.

Przykład stylu strukturalnego/proceduralnego w języku Python
([fractal-py/fractal.py](/podstawy-programowania/examples/01/fractal-py/fractal.py)):
```python
# Transformacja przekształcająca wektor [x, y] na nowy.
def transformation(c, x, y):
    x_new = c[0] * x[-1] + c[1] * y[-1]
    y_new = c[2] * x[-1] + c[3] * y[-1] + c[4]
    x.append(x_new)
    y.append(y_new)

# Paproć Barnsley'a (fraktal).
def Barnsley(x, y):
    cs = [[ 0.00,  0.00,  0.00,  0.16,  0.00], \
          [ 0.85,  0.04, -0.04,  0.85,  1.60], \
          [ 0.20, -0.26,  0.23,  0.22,  1.60], \
          [-0.15,  0.28,  0.26,  0.24,  0.44]]
    r = np.random.uniform(0,1)
    if r < 0.01:
        transformation(cs[0], x, y)
    elif r < 0.01 + 0.85:
        transformation(cs[1], x, y)
    elif r < 0.01 + 0.85 + 0.07:
        transformation(cs[2], x, y)
    else:
        transformation(cs[3], x, y)
```

#### ▸ Obiektowy styl programowania

W obiektowym stylu programowania procedury są zastąpione metodami klas.
Działanie programu polega m.in. na tworzeniu obiektów i wykonywaniu operacji
na nich. Dane są kapsułkowane, tzn. ukrywane przed „światem zewnętrznym”
w obiektach, a same operacje są wykonywane jedynie poprzez ściśle określone
interfejsy.

Przykład stylu obiektowego w języku C++
([stack-cc/stack.cc](/podstawy-programowania/examples/01/stack-cc/stack.cc)):
```cpp
class stack {
  struct item {
    int value;
    item* lower;
  };
  
public:
  stack() : top_{nullptr} {}

  void push(int val) {
    item* aux = top_;
    top_ = new item;
    top_->value = val;
    top_->lower = aux;
  }
  
  void pop() {
    if (top_) {
      item* aux = top_->lower;
      delete top_;
      top_ = aux;
    }
  }
  
  int top() const {
    assert(top_);
    return top_->value;
  }

  bool is_empty() const {
    return top_ == nullptr;
  }

  ~stack() {
    while (!this->is_empty()) {
      this->pop();
    }
  }

private:
  item* top_;
};
```

#### ▸ Generyczny styl programowania (metaprogramowanie)

W generycznym stylu programowania implementuje się algorytmy w sposób
uogólniony, zapominając niejako o konkretnych reprezentacjach typów danych.
W ten sposób tworzy się szablony, które później mogą być zastosowane do
dowolnych typów danych spełniających konkretne wymogi.

Przykład stylu generycznego w języku Object Pascal
([sort-pas/sort.pas](/podstawy-programowania/examples/01/sort-pas/sort.pas)):
```pascal
type
  generic BubbleSort<T> = class
    class procedure sort(var a: array of T);
  end;

  BubbleSortInteger = specialize BubbleSort<integer>;

  class procedure BubbleSort.sort(var a: array of T);
  var
    n, newn, i : integer;
    temp       : T;
  begin
    n := high(a);
    repeat
      newn := low(a);
      for i := low(a) + 1 to n do
      begin
        if a[i - 1] > a[i] then
        begin
          temp := a[i - 1];
          a[i - 1] := a[i];
          a[i] := temp;
          newn := i;
        end;
      end;
    n := newn;
    until n = low(a);
  end;
```

#### ▸ Funkcyjny styl programowania

Programowanie w stylu funkcyjnym polega na operowaniu na funkcjach wyższego
rzędu (tzn. funkcjach, które jako swoje argumenty mogą przyjmować inne funkcje
a także zwracać funkcje jako swój rezultat).

Przykład stylu funkcyjnego w języku Scheme
([conditional-scm/conditional.scm](/podstawy-programowania/examples/01/conditional-scm/conditional.scm)):
```lisp
(define true (lambda (x y) (x)))
(define false (lambda (x y) (y)))
(define if_then_else (lambda (a b c) (a b c)))

(define f0 (lambda () (write 'f0)))
(define f1 (lambda () (write 'f1)))

(if_then_else false f0 f1)
(newline)
(exit)
```

#### ▸ Programowanie w logice

Ostatnim stylem programowania do omówienia na ten moment jest programowanie
w logice. Jest to jeden z najmniej popularnych styli programowania, ale ma
istotne znaczenie dla rozwoju informatyki. Opiera się on na tzw. klauzulach
Horna, przestrzeni Herbranda i teorii unifikacji. Programy napisane w tym stylu
mogą służyć do natychmiastowego rozwiązywania zagadek logicznych.

Rozwiążmy zatem słynną zagadkę opublikowaną 17 grudnia 1962 w amerykańskim
magazynie *Life International*:
>   1. Jest pięć domów.
>   2. Anglik mieszka w czerwonym domu.
>   3. Hiszpan posiada psa.
>   4. Kawa jest pijana w zielonym domu.
>   5. Ukrainiec pija herbatę.
>   6. Zielony dom znajduje się bezpośrednio na prawo od domu z kości słoniowej.
>   7. Palacz Old Gold posiada ślimaki.
>   8. Kools jest palony w żółtym domu.
>   9. Mleko jest pijane w środkowym domu.
>   10. Norweg mieszka w pierwszym domu.
>   11. Mężczyzna, który pali Chesterfieldy, mieszka w domu obok mężczyzny
>       z lisem.
>   12. Kools jest palone w domu obok domu, gdzie trzymany jest koń.
>   13. Palacz Lucky Strike pija sok pomarańczowy.
>   14. Japończyk pali Parliaments.
>   15. Norweg mieszka obok niebieskiego domu.
>
> Teraz, kto pije wodę? Kto posiada zebrę?
>
> Dla przejrzystości należy dodać, że każdy z pięciu domów jest pomalowany na
> inny kolor, a ich mieszkańcy mają odmienne narodowości, posiadają inne
> zwierzęta, piją inne napoje i palą amerykańskie papierosy różnych marek
> [sic!]. Jeszcze jedno: w zdaniu 6 „prawo” oznacza Twoje prawo.

Przykład programowania w logice w języku Prolog
([zebra-pl/zebra.pl](/podstawy-programowania/examples/01/zebra-pl/zebra.pl)):
```prolog
houses(Hs) :- length(Hs, 5),
  member(h(czerwony, anglik, _, _, _), Hs),
  member(h(_, hiszpan, _, _, pies), Hs),
  member(h(zielony, _, kawa, _, _), Hs),
  member(h(_, ukrainiec, herbata, _, _), Hs),
  right(h(zielony, _, _, _, _), h(kosc_sloniowa, _, _, _, _), Hs),
  member(h(_, _, _, old_gold, slimaki), Hs),
  member(h(zolty, _, _, kool, _), Hs),
  Hs = [_, _,h(_, _, mleko, _, _), _, _],
  Hs = [h(_, norweg, _, _, _)|_],
  next(h(_, _, _, _, lis), h(_, _, _, chesterfield, _), Hs),
  next(h(_, _, _, kool, _), h(_, _, _, _, kon), Hs),
  member(h(_, _, sok_pomaranczowy, lucky_strike, _), Hs),
  member(h(_, japonczyk, _, parliament, _), Hs),
  next(h(_, norweg, _, _, _), h(niebieski, _, _, _, _), Hs),
  member(h(_, _, _, _, zebra), Hs), member(h(_, _, woda, _, _), Hs).
zebra_owner(Owner) :- houses(Hs), member(h(_, Owner, _, _, zebra), Hs).
water_drinker(Drinker) :- houses(Hs), member(h(_, Drinker, woda, _, _), Hs).
```

Uwaga: Brak wielkich liter wynika z wymogów języka Prolog.

### Generacje języków programowania

Współczesna klasyfikacja generacji języków programowania:

  * *Język programowania 1 generacji* (1GL, ang. *1st generation language*) to
    język maszynowy (zob. definicję wyżej) danego komputera. Komputer jest wtedy
    programowany bezpośrednio w swoim własnym języku bez potrzeby użycia
    procedury kompilacji/interpretacji. W przeszłości programowanie odbywało
    się poprzez użycie odpowiednich interfejsów sprzętowych. Obecnie 1GL jest
    stosowane np. do programowania sterowników obsługujących sprzęt.
  * *Język programowania 2 generacji* (2GL) to język asemblera. Język taki jest
    podobny do 1GL z tą istotną różnicą, że zamiast ciągów binarnych stosuje się
    mnemoniki, tzn. skróty od wyrazów języka naturalnego (np. `mov` lub `dec`),
    które z jednej strony ułatwiają pisanie i rozumienie kodów źródłowych,
    a z drugiej wymagają zastosowania procedury asemblacji (kompilacji z kodu
    2GL na kod 1GL).  
    Przykład: asembler x86-64.
  * *Język programowania 3 generacji* (3GL) to język niezależny od danej
    architektury sprzętowej znacznie ułatwiający tworzenie programów
    komputerowych. Język taki jest znacznie bardziej abstrakcyjny aniżeli 2G
    i ukrywa szczegóły danej architektury przed programistą.  
    Przykłady: C++, Object Pascal, Python, Scheme.
  * *Język programowania 4 generacji* (4GL) jest obecnie różnie definiowany.
    Można go rozumieć jako język, który operuje na zbiorach danych zamiast na
    bajtach, albo jako język dziedzinowy (mający wąskie zastosowanie
    aplikacyjne).  
    Przykład: R.
  * *Język programowania 5 generacji* (5GL) to język, w którym programista, aby
    rozwiązać problem, nie implementuje algorytmu a jedynie specyfikuje
    ograniczenia czego przykładem jest wyżej opisane rozwiązanie
    zagadki z zebrą.  
    Przykład: Prolog.

### Schematy blokowe

W celu zapisu algorytmu można wykorzystać *pseudokod*, będący czymś pośrednim
między potencjalnie nieprecyzyjnym językiem naturalnym a precyzyjnym językiem
programowania, lub *schemat blokowy*, będący graficzną wizualizacją wykonania
algorytmu. W tym podpunkcie zostaną przedstawione elementy notacji z użyciem
schematów blokowych.

  * *Blok graniczny* (ang. *terminal*), nazywany również *etykietą*, służy do
    określania początku lub końca algorytmu.  
    ![Blok graniczny](/podstawy-programowania/fig/flowchart/terminal.svg)
  * *Blok operacyjny* (ang. *process*) oznacza zestaw operacji zmieniających
    dane, np. przypisanie wartości do zmiennej. (Nazwa zmiennej w poniższym
    rysunku została celowo pozostawiona w języku angielskim.)  
    ![Blok operacyjny](/podstawy-programowania/fig/flowchart/process.svg)
  * *Predykat* lub *decyzja* (ang. *decision*) polega na sprawdzeniu czy dany
    warunek jest spełniony i wyborze jednej z dwóch możliwości.  
    ![Decyzja](/podstawy-programowania/fig/flowchart/decision.svg)
  * *Blok wejścia/wyjścia* (ang. *input/output*) reprezentuje operacje wejścia
    (np. wczytanie danych z klawiatury) oraz wyjścia (np. wypisanie danych na
    ekran).  
    ![Blok wejścia/wyjścia](/podstawy-programowania/fig/flowchart/in-out.svg)
  * *Łącznik* i *strzałka* (ang. *flowline*, *arrowhead*) są wykorzystywane do
    wskazania kolejności wykonywanych w algorytmie operacji. Standardowo
    korzysta się z łącznika gdy przepływ jest naturalny (od góry do dołu oraz
    z lewej do prawej). W przeciwnym razie należy użyć strzałki.  
    ![Łącznik i strzałka](/podstawy-programowania/fig/flowchart/flowline.svg)

### Notacja BNF

*Notacja BNF* (ang. *Backus-Naur form*) jest w informatyce używana m.in. do
opisu składni języków programowania (jest więc tzw. *metaskładnią*). Polega ona
na wyspecyfikowaniu tzw. *reguł produkcji*:
```
<symbol> ::= __wyrażenie__
```
gdzie:
  * `<symbol>` jest *zmienną nieterminalną*
  * znak `::=` oznacza, że `<symbol>` zostanie zastąpiony przez `__wyrażenie__`
  * `__wyrażenie__` składa się z sekwencji symboli terminalnych
    i nieterminalnych

Każda sekwencja w wyrażeniu `__wyrażenie__` jest odseparowana o następnej
symbolem `|` oznaczającym wybór.

Symbole `<`, `>`, `::=` oraz `|` to symbole metajęzyka. Pozostałe symbole są
znakami lub symbolami definiowanego języka.

Przykład: Notacja BNF dla zwykłego zapisu liczb całkowitych może być
następująca:
```
<minus> ::= -
<zero> ::= 0
<cyfra niezerowa> ::= 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
<cyfra> ::= <zero> | <cyfra niezerowa>
<sekwencja cyfr> ::= <cyfra> | <cyfra><sekwencja cyfr>
<liczba nieujemna> ::= <cyfra> | <cyfra niezerowa><sekwencja cyfr>
<liczba ujemna> :: <minus><cyfra niezerowa> | <minus><cyfra niezerowa><cyfra>
<liczba całkowita> ::= <liczba nieujemna> | <liczba ujemna>
```
Symbole `-`, `0`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8` oraz `9` są terminalne.
Pozostałe symbole, tzn. `<minus>`, `<zero>`, `<cyfra niezerowa>`, `<cyfra>`,
`<sekwencja cyfr>`, `<liczba nieujemna>`, `<liczba ujemna>` oraz `<liczba
całkowita>`, to symbole nieterminalne.

Notacja BNF, choć bardzo użyteczna, ma pewne wady. Nie ma chociażby możliwości
wyrażenia wprost powtórzeń (należy użyć rekurencji, por. `<sekwencja cyfr>`)
oraz symboli opcjonalnych (trzeba w tym celu użyć symboli pośrednich). Dlatego
też, w celu zaradzenia tym niedogodnościom, stworzono rozszerzenia dla BNF.
Jedym z nich jest *EBNF* (ang. *extended Backus-Naur form*).

## 2. Język C++ — wprowadzenie

Językiem programowania używanym w dalszej części wykładu będzie C++. Język ten
łączy długą historię z nowoczesnymi technikami.

### Historia

Praca nad C++, wtedy jeszcze nazywanym „C z klasami”, rozpoczęła się w 1979.
Wtedy to duński informatyk Bjarne Stroustrup mierzył się w New Jersey (Stany
Zjednoczone) z pewnym problemem z zakresu sieci komputerowych i systemów
operacyjnych a nowy język miał być właśnie rozwiązaniem tego problemu. Stworzony
język okazał się być rozwiązaniem wszechstronnym i z czasem zaczął być coraz
bardziej popularny.

Historia przed standardami języka:
  * 1979 — pierwsza implementacja nowego języka programowania, tzn. C z klasami
  * 1982 — opublikowano podręcznik użytkownika
  * 1985 — Cfront 1.0 oraz pierwsze wydanie książki “The C++ Programming
    Language” (TC++PL)
  * 1989 — Cfront 2.0
  * 1990 — “The Annotated C++ Reference Manual”
  * 1991 — Cfront 3.0 oraz drugie wydanie TC++PL

W 1988 C++ miał około 15 tysięcy użytkowników i pojawił się pomysł na jego
standardyzację.

Standardy języka:
  * 1998 (C++98) — pierwszy standard (skorygowany nieznacznie w 2003)
  * 2011 (C++11) — istotna aktualizacja języka (okres tzw. *nowoczesnego C++*)
  * 2014 (C++14) — małe rozszerzenie względem C++11
  * 2017 (C++17) — duże roszerzenie względem C++14
  * 2020 (C++20) — duże rozszerzenie względem C++17
  * 2023 (C++23) — zbliżająca się aktualizacja języka

Uwaga: Dla rozwiania ewentualnych wątpliwości warto zaznaczyć, że standardem
wykorzystanym w dalszej części wykładu będzie C++20.

### Właściwości

C++ jest językiem trzeciej generacji wspierającym imperatywny, proceduralny,
funkcyjny, obiektowy i generyczny styl programowania. C++ wywodzi się z dwóch
tradycji programistycznych, które bardzo dobrze opisują czym jest i czym
powinien pozostać język C++ mimo swojej ciągłej ewolucji:
  * Pierwsza tradycja jest powiązana z językiem C, BCPL oraz asemblerem. Wniosła
    ona wysoką wydajność kodu wykonywalnego poprzez *bezpośrednie odwzorowanie
    w sprzęcie*.
  * Druga tradycja jest związana z językiem Simula. Wprowadziła ona *abstrakcję
    bez narzutu*.

### Źródła wiedzy o języku

Językowi C++ jest poświęconych wiele materiałów edukacyjnych. Ważnym
uzupełnieniem kursu języka C++ jest:
  * serwis <https://cppreference.com>
  * konferencja CppCon <https://www.youtube.com/CppCon>

Ponadto warto wspomnieć, że istnieje:
  * dokument opisujący standard (obecnie z 2020 roku)

Uwaga: Standard jest zasadniczo przydatny tylko dla twórców języka lub twórców
kompilatorów.

Anglojęzyczne sugestie dotyczące materiałów w postaci książek do przeczytania
można znaleźć na stronie
<https://stackoverflow.com/questions/388242/the-definitive-c-book-guide-and-list/>.

Twórca języka, Bjarne Stroustrup, napisał również
[książkę na temat C++ przeznaczoną początkującym programistom](https://stroustrup.com/programming.html).

## 3. Instrukcje

Uwaga: Dla uproszczenia w opisie składni poszczególnych instrukcji pominięto
*atrybuty* a czasami zastosowano składnię nieformalną. Opis elementów składni
również został uproszczony dla klarowności podstawowego kursu programowania.
Więcej informacji o składni można znaleźć w serwisie <https://cppreference.com>.

Można stwierdzić nieprecyzyjnie, że *instrukcja* programu napisanego w języku
C++ jest fragmentem kodu źródłowego, który po kompilacji wykonuje się
w sekwencji. Oznacza to, że jeśli fragment kodu źródłowego `instrukcja_B`
następuje po fragmencie `instrukcja_A`, to w momencie działania programu
wykonuje się wpierw operacja `A` a następnie operacja `B`.

W języku C++ istnieje 9 typów instrukcji:
  1. instrukcja wyrażenia (ang. *expression statement*)
  2. instrukcja złożona (ang. *compound statement*)
  3. instrukcja wyboru (ang. *selection statement*)
  4. instrukcja iteracji (ang. *iteration statement*)
  5. instrukcja skoku (ang. *jump statement*)
  6. instrukcja z etykietą (ang. *labeled statement*)
  7. instrukcja deklaracji (ang. *declaration statement*)
  8. blok `try` (ang. *try block*)
  9. blok atomowy i synchronizowany (ang. *atomic and synchronized block*)

W następnych podpunktach zostaną omówione typy instrukcji o numerach 1-6. Do
numeru 7 wrócimy jeszcze w ramach tego kursu, aczkolwiek w ograniczony sposób.
Numery 8 i 9 pominiemy na ten
moment — jest to materiał odpowiednio na zaawansowany kurs języka C++ oraz na
kurs poświęcony przetwarzaniu współbieżnemu w języku C++.

### Instrukcja wyrażenia

*Instrukcja wyrażenia* to jeden z najczęściej spotykanych typów instrukcji
w języku C++. Instrukcja wyrażenia składa się z wyrażenia, tzn. sekwencji
operatorów i operandów, oraz znaku `;`:
```cpp
wyrażenie;
```

Instrukcja wyrażenia bez wyrażenia jest nazywana *instrukcją pustą*:
```cpp
;
```

Skoro wyrażenie jest sekwencją operatorów i operandów, przyjrzyjmy się przy
okazji operatorom języka C++.

Operator:
  * przypisania: `a = b`, `a += b`, `a -= b`, `a *=b `, `a /= b`, `a %= b`,
    `a &= b`, `a |= b`, `a ^= b`, `a <<= b`, `a >>= b`
  * inkrementacji: `++a`, `a++`
  * dekrementacji: `--a`, `a--`
  * arytmetyczny: `+a`, `-a`, `a + b`, `a - b`, `a * b`, `a / b`, `a % b`
  * arytmetyczny bitowy: `~a`, `a & b`, `a | b`, `a ^ b`, `a << b`, `a >> b`
  * logiczny: `!a`, `a && b`, `a || b`
  * porównania: `a == b`, `a != b`, `a < b`, `a > b`, `a <= b`, `a >= b`,
    `a <=> b`
  * dostępu: `a[...]`, `*a`, `&a`, `a->b`, `a.b`, `a->*b`, `a.*b`
  * wywołania funkcji: `a(...)`
  * przecinek: `a, b`
  * warunkowy: `a ? b : c`
  * specjalny: `static_cast`, `dynamic_cast`, `const_cast`, `reinterpret_cast`,
    operator rzutowania w stylu C, `new`, `delete`, `sizeof`, `sizeof...`,
    `typeid`, `noexcept`, `alignof`

### Instrukcja złożona

*Instrukcja złożona* nazywana też *blokiem* jest sekwencją instrukcji zgrupowaną
i traktowaną jak jedna instrukcja.

Składnia:
```cpp
{ instrukcja... (opcjonalnie) }
```
  * `instrukcja...` jest sekwencją instrukcji.

Uwagi:
  * Sekwencja instrukcji może być pusta.
  * Instrukcja złożona jest przydatna jako ciało pętli lub w instrukcji
    warunkowej.
  * Instrukcja złożona wprowadza tzw. *zakres*, który określa widoczność nazwy.

Przykład (pełny przykład znajduje się w pliku
[compound/compound.cc](/podstawy-programowania/examples/03/compound/compound.cc)):
```cpp
#include <iostream>

int
main()
{
  // Blok #1
  {
    int n = 42;
    std::cout << n << '\n';
  }
  // std::cout << n << '\n'; // Błąd! Zmienna n nie jest tu widoczna.

  const int n = 42;
  const int div = 7;
  int count = 0;
  for (int i = 0; i < n; ++i) { // Blok #2
    std::cout << "Obliczam podzielnosc liczby " << i << " przez " << div
              << ".\n";
    if (i % 7 == 0) { // Blok #3
      ++count;
      std::cout << "Liczba " << i << " jest podzielna przez " << div << ".\n";
    }
  }

  {   // Blok #4
    { // Blok #5
      std::cout << "W podanym zakresie jest " << count
                << " liczb podzielnych przez " << div << ".\n";
    }
  }
}
```

### Instrukcja wyboru

*Instrukcja wyboru* steruje przepływem programu wybierając jedną z wielu
możliwości. Istnieją następujące instrukcje wyboru:
  * instrukcja `if`
  * instrukcja `if`-`else`
  * instrukcja `switch`

#### ▸ Instrukcja `if` oraz `if`-`else`

Składnia:
```cpp
if (instrukcja_0 (opcjonalnie) warunek) instrukcja_1
if (instrukcja_0 (opcjonalnie) warunek) instrukcja_1 else instrukcja_2
```

  * `instrukcja_0` jest instrukcją wyrażenia, w tym instrukcją pustą `;`, lub
    pewną deklaracją, zazwyczaj pojedynczej zmiennej połączonej z jej
    zainicjowaniem.
  * `warunek` jest wyrażeniem konwertowalnym na wartość logiczną lub jest
    deklaracją zainicjowanej zmiennej nietablicowej.
  * `instrukcja_1` i `instrukcja_2` są dowolnymi instrukcjami, w tym złożonymi.
    `instrukcja_1` jest wykonywana jeśli `warunek` ewaluuje się do `true`.
    `instrukcja_2` jest wykonywana jeśli `warunek` ewaluuje się do `false`.

Uwaga: W przypadku użycia opcjonalnej instrukcji `instrukcja_0` składnię:
```cpp
if (instrukcja_0 warunek) instrukcja_1
if (instrukcja_0 warunek) instrukcja_1 else instrukcja_2
```
można *w przybliżeniu* przepisać odpowiednio jako:
```cpp
{
  instrukcja_0
  if (warunek)
    instrukcja_1
}
```
oraz:
```cpp
{
  instrukcja_0
  if (warunek)
    instrukcja_1
  else
    instrukcja_2
}
```

#### ▸ Instrukcja `switch`

Składnia:
```cpp
switch (instrukcja_0 (opcjonalnie) warunek) instrukcja_1
```

  * `instrukcja_0` jest instrukcją wyrażenia, w tym instrukcją pustą `;`, lub
    pewną deklaracją, zazwyczaj pojedynczej zmiennej połączonej z jej
    zainicjowaniem.
  * `warunek` jest wyrażeniem lub jest deklaracją zainicjowanej zmiennej
    nietablicowej. Wartość wyrażenia lub deklaracji `warunek` powinna być typu
    całkowitoliczbowego lub enumeracyjnego, lub klasy konwertowalnej na typ
    całkowitoliczbowy lub enumeracyjny.
  * `instrukcja_1` jest dowolną instrukcją, w tym złożoną, w której zezwala się
    na etykiety `case:` oraz `default:` a instrukcja `break` ma szczególne
    znaczenie.

Przykład (pełny przykład znajduje się w pliku
[switch/switch.cc](/podstawy-programowania/examples/03/switch/switch.cc)):
```cpp
#include <iostream>

int
main()
{
  std::cout << "Podaj liczbe naturalna z zakresu [0, 10]: ";
  int n;
  std::cin >> n;

  switch (n) {
    case 0:
      std::cout << "Zero.";
      break;
    case 1:
      std::cout << "Jeden.";
      break;
    case 2:
    case 3:
    case 5:
    case 7:
      std::cout << "Liczba pierwsza.";
      break;
    case 4:
    case 6:
    case 8:
    case 9:
    case 10:
      std::cout << "Liczba zlozona.";
      break;
    default:
      std::cout << "Liczba poza zakresem.";
  }

  std::cout << '\n';
}
```

Wynik działania przykładu:
> Podaj liczbe naturalna z zakresu [0, 10]: 5  
> Liczba pierwsza.

### Instrukcja iteracji

*Instrukcja iteracji* wielokrotnie powtarza ten sam kod. Istnieją następujące
instrukcje iteracji:
  * pętla `while`
  * pętla `do`-`while`
  * pętla `for`
  * zakresowa pętla `for`

Uwaga: W standardzie języka C++ z roku 2011 wprowadzono tzw. pętlę zakresową
i nie jest ona omawiana w tym miejscu.

#### ▸ Pętla `while`

Składnia:
```cpp
while ( warunek ) instrukcja
```
  * `warunek` jest wyrażeniem konwertowalnym na wartość logiczną, które jest
    ewaluowane przed każdą potencjalną iteracją pętli, lub jest deklaracją
    zmiennej, która jest inicjowana przed każdą potencjalną iteracją pętli.
    Jeśli otrzymana przez ewaluację lub inicjację wartość jest konwertowalna na
    `true`, wtedy faktycznie wykonywana jest iteracja pętli. W przeciwnym razie
    pętla jest kończona.
  * `instrukcja` jest dowolną instrukcją, w tym złożoną. `instrukcja` jest
    wykonywana w każdej iteracji pętli.

Przykład (pełny przykład znajduje się w pliku
[while/while.cc](/podstawy-programowania/examples/03/while/while.cc)):
```cpp
#include <iostream>

int
main()
{
  std::cout << "Sposob nr 1:\n";
  int n = 10;
  while (n > 0) {
    std::cout << n << "^2 = " << n * n << '\n';
    --n;
  }

  std::cout << '\n';
  
  std::cout << "Sposob nr 2:\n";
  int i = 10;
  while (int j = i * i) {
    std::cout << i-- << "^2 = " << j << '\n';
  }
}
```

Wynik działania przykładu:
> Sposob nr 1:  
> 10^2 = 100  
> 9^2 = 81  
> 8^2 = 64  
> 7^2 = 49  
> 6^2 = 36  
> 5^2 = 25  
> 4^2 = 16  
> 3^2 = 9  
> 2^2 = 4  
> 1^2 = 1  
>   
> Sposob nr 2:  
> 10^2 = 100  
> 9^2 = 81  
> 8^2 = 64  
> 7^2 = 49  
> 6^2 = 36  
> 5^2 = 25  
> 4^2 = 16  
> 3^2 = 9  
> 2^2 = 4  
> 1^2 = 1

#### ▸ Pętla `do`-`while`

Składnia:
```cpp
do instrukcja while ( warunek ) ;
```

  * `instrukcja` jest dowolną instrukcją, w tym złożoną. `instrukcja` jest
    wykonywana w każdej iteracji pętli.
  * `warunek` jest wyrażeniem konwertowalnym na wartość logiczną, które jest
    ewaluowane po każdej iteracji pętli. Jeśli otrzymana przez ewaluację wartość
    jest konwertowalna na `false`, wtedy pętla jest kończona.

Przykład (pełny przykład znajduje się w pliku
[do-while/do-while.cc](/podstawy-programowania/examples/03/do-while/do-while.cc)):
```cpp
#include <iostream>

int
main()
{
  char c = 'a';
  do {
    std::cout << c << ": " << static_cast<int>(c) << '\n';
  } while (c++ != 'z');
}
```

Wynik działania przykładu:
> a: 97  
> b: 98  
> c: 99  
> d: 100  
> e: 101  
> f: 102  
> g: 103  
> h: 104  
> i: 105  
> j: 106  
> k: 107  
> l: 108  
> m: 109  
> n: 110  
> o: 111  
> p: 112  
> q: 113  
> r: 114  
> s: 115  
> t: 116  
> u: 117  
> v: 118  
> w: 119  
> x: 120  
> y: 121  
> z: 122

#### ▸ Pętla `for`

Składnia:
```cpp
for ( instrukcja_0 warunek (opcjonalnie) ; wyrażenie (opcjonalnie) ) instrukcja
```

  * `instrukcja_0` jest instrukcją wyrażenia, w tym instrukcją pustą `;`, lub
    pewną deklaracją, zazwyczaj zmiennej licznika pętli połączonej z jego
    zainicjowaniem.
  * `warunek` jest wyrażeniem konwertowalnym na wartość logiczną, które jest
    ewaluowane przed każdą potencjalną iteracją pętli, lub jest deklaracją
    zmiennej, która jest inicjowana przed każdą potencjalną iteracją pętli.
    Jeśli otrzymana przez ewaluację lub inicjację wartość jest konwertowalna na
    `true`, wtedy faktycznie wykonywana jest iteracja pętli. W przeciwnym razie
    pętla jest kończona.
  * `wyrażenie` jest dowolnym wyrażeniem, które jest wykonywane po każdej
    iteracji pętli i zazwyczaj polega ono na inkrementacji licznika pętli.
  * `instrukcja` jest dowolną instrukcją, w tym złożoną. `instrukcja` jest
    wykonywana w każdej iteracji pętli.

Powyższy opis może być nieco nieintuicyjny, dlatego warto rozważyć pewne dwa
szczególne przypadki. Jeśli `instrukcja_0` jest instrukcją pustą a `warunek`
i `wyrażenie` zostały pominięte to otrzymujemy pętlę nieskończoną, np.:
```cpp
for (;;) {
  // Kod wykonywany w pętli nieskończonej.
}
```
Jeśli `instrukcja_0` jest deklaracją zmiennej licznika połączonej z jego
zainicjowaniem, `warunek` jest wyrażeniem konwertowalnym na wartość logiczną
a `wyrażenie` polega na inkrementacji licznika pętli to otrzymujemy klasyczną
pętlę `for`, np.:
```cpp
for (int i = 0; i < 42; ++i) {
 // Kod wykonywany 42 razy dla i równego odpowiednio 0, 1, ..., 41.
}
```

Przykład (pełny przykład znajduje się w pliku
[for/for.cc](/podstawy-programowania/examples/03/for/for.cc)):
```cpp
#include <iostream>

int
main()
{
  for (int i = 0; i < 10; i += 2) {
    std::cout << i << '\n';
  }
}
```

Wynik działania przykładu:
> 0  
> 2  
> 4  
> 6  
> 8

### Instrukcja skoku

Instrukcja skoku przekazuje przepływ programu. Istnieją następujące instrukcje
skoku:
  * instrukcja `break`
  * instrukcja `continue`
  * instrukcja `return` z opjonalnym wyrażeniem albo z użyciem listy inicjującej
  * instrukcja `goto`

Instrukcja `return` zostanie omówiona przy okazji punktu poświęconego funkcjom.
Instrukcja `goto` prawie nigdy nie powinna być używana i zostanie na ten moment
pominięta. Pozostałe dwie instrukcje są wytłumaczone poniżej.

#### ▸ Instrukcja `break`

Składnia:
```cpp
break ;
```

  * `break` jest instrukcją, która powoduje zakończenie pętli `while`,
    `do`-`while`, `for` (w tym zakresowej) oraz instrukcji `switch`.

Przykład (pełny przykład znajduje się w pliku
[break/break.cc](/podstawy-programowania/examples/03/break/break.cc)):
```cpp
#include <iostream>

int
main()
{
  for (int i = 0; i < 10; ++i) {
    for (int j = 0; ; ++j) {
      std::cout << "* ";
      if (j == i) {
        break; // Zakończenie wewnętrznej pętli.
      }
    }
    std::cout << '\n';
  }
}
```

Wynik działania przykładu:
> \*   
> \* \*   
> \* \* \*   
> \* \* \* \*   
> \* \* \* \* \*   
> \* \* \* \* \* \*   
> \* \* \* \* \* \* \*   
> \* \* \* \* \* \* \* \*   
> \* \* \* \* \* \* \* \* \*   
> \* \* \* \* \* \* \* \* \* \* 

#### ▸ Instrukcja `continue`

Składnia:
```cpp
continue ;
```

 * `continue` jest instrukcją, która powoduje ominięcie pozostałej części
   bieżącej iteracji w pętli `while`, `do`-`while` oraz `for` (w tym
   zakresowej).

Przykład (pełny przykład znajduje się w pliku
[continue/continue.cc](/podstawy-programowania/examples/03/continue/continue.cc)):
```cpp
#include <iostream>

int
main()
{
  for (int i = 0; i < 10; ++i) {
    if (i == 5)
      continue;
    for (int j = 0; j < 10; ++j) {
      if (i == j)
        continue;
      std::cout << "(" << i << ", " << j << ") ";
    }
    std::cout << '\n';
  }
}
```

Wynik działania przykładu:
> (0, 1) (0, 2) (0, 3) (0, 4) (0, 5) (0, 6) (0, 7) (0, 8) (0, 9)   
> (1, 0) (1, 2) (1, 3) (1, 4) (1, 5) (1, 6) (1, 7) (1, 8) (1, 9)   
> (2, 0) (2, 1) (2, 3) (2, 4) (2, 5) (2, 6) (2, 7) (2, 8) (2, 9)   
> (3, 0) (3, 1) (3, 2) (3, 4) (3, 5) (3, 6) (3, 7) (3, 8) (3, 9)   
> (4, 0) (4, 1) (4, 2) (4, 3) (4, 5) (4, 6) (4, 7) (4, 8) (4, 9)   
> (6, 0) (6, 1) (6, 2) (6, 3) (6, 4) (6, 5) (6, 7) (6, 8) (6, 9)   
> (7, 0) (7, 1) (7, 2) (7, 3) (7, 4) (7, 5) (7, 6) (7, 8) (7, 9)   
> (8, 0) (8, 1) (8, 2) (8, 3) (8, 4) (8, 5) (8, 6) (8, 7) (8, 9)   
> (9, 0) (9, 1) (9, 2) (9, 3) (9, 4) (9, 5) (9, 6) (9, 7) (9, 8) 


## 4. Typy danych i zmienne

### Instrukcja prostej deklaracji

W tym miejscu wrócimy jeszcze na chwilę do typów instrukcji omawiając szczególny
przypadek instrukcji deklaracji — instrukcję prostej deklaracji.

*Instrukcja prostej deklaracji* jest instrukcją, która wprowadza i stwarza jeden
lub więcej identyfikatorów, zazwyczaj zmiennych, które może opcjonalnie
zainicjować.

#### ▸ Instrukcja prostej deklaracji zmiennej

Na ten moment ograniczenie do instrukcji prostej deklaracji jest wciąż nazbyt
obszerne. Rozważmy zatem instrukcję prostej deklaracji zmiennej.

Składnia:
```cpp
sekwencja_specyfikatorów lista_deklaratorów ;
```

  * `sekwencja_specyfikatorów` jest sekwencją specyfikatorów opisaną poniżej.
  * `lista_deklaratorów` jest listą deklaratorów, tzn. identyfikatorów — nazw
    zmiennych, z opcjonalnymi wartościami, którymi te zmienne są inicjowane.

Uwaga: Deklarator może zostać zmodyfikowany z użyciem pewnych operatorów, np.
`[]` dla typu tablicowego — będzie to opisane niżej.

*Sekwencję specyfikatorów* ograniczymy na ten moment wyłącznie do następujących
kategorii:
  * wybrane *proste specyfikatory typu*
  * kwalifikator `const`

Przykłady prostych specyfikatorów typu:
  * `bool` — typ logiczny (a zarazem całkowitoliczbowy)
  * `char` — typ znakowy (a zarazem całkowitoliczbowy)
  * `int` — typ całkowitoliczbowy
  * `float`, `double` — typy zmiennoprzecinkowe
  * wcześniej zdefiniowana nazwa klasy, np. `std::string`

Istnieją także specyfikatory typu całkowitoliczbowego, które modyfikują:
  * rozmiar: `short`, `long`
  * kodowanie znaku: `signed`, `unsigned`

Kwalifikator `const` określa, że typ jest stałą.

Przykład:
```cpp
char c = 'A';
const unsigned int answer = 42;
double temperature;
```

### Reguły tworzenia identyfikatorów

Istnieją reguły tworzenia identyfikatorów, w tym nazw zmiennych. Precyzyjne
określenie tych reguł jest dość długie, dlatego ograniczymy się w tym momencie
do następującego opisu.

*Identyfikatorem* może być dowolnie długa sekwencja cyfr `0`-`9`, znaków `_`,
małych (`a`-`z`) i wielkich (`A`-`Z`) znaków alfabetu łacińskiego a także znaków
Unicode, które posiadają właściwość XID_Start lub XID_Continue, z zastrzeżeniem,
że:
  1. pierwszy znak jest małą lub wielką literą alfabetu łacińskiego, znakiem `_`
     lub znakiem Unicode posiadającym właściwość XID_Start
  2. pozostałe znaki (jeśli istnieją) są cyframi, małymi lub wielkimi literami
     alfabetu łacińskiego, znakami `_` lub znakami Unicode posiadającymi
     właściwość XID_Continue
  3. cała sekwencja nie została zarezerwowana przez standard języka

Zauważmy, że powyższy opis byłby kompletną definicją, gdyby nie punkt 3, którego
nie będziemy tutaj omawiać. Warto też zaznaczyć, że wsparcie kompilatorów dla
identyfikatorów posiadających znaki Unicode jest ograniczone, dlatego warto
unikać ich stosowania.

### Szerokość i zakres danych poszczególnych typów fundamentalnych

#### ▸ Typ logiczny `bool`

Szerokość typu `bool` jest zależna od implementacji. Zmienne tego typu mogą
przechowywać jedną z dwóch wartości: `true` lub `false`.

#### ▸ Typy całkowitoliczbowe, w tym znakowe

Standard określa minimalną szerokość typów całkowitoliczbowych a rzeczywista
wielkość bywa czasami większa (zależy to od *modelu danych* stosowanego
przez daną architekturę komputera i systemu operacyjnego).

Minimalne szerokości poszczególnych typów całkowitoliczbowych z wyłączeniem
`bool` według standardu języka C++:
  * `char` — 8 bitów
  * `short int`, `int` — 16 bitów
  * `long int` — 32 bity
  * `long long int` — 64 bity

Uwaga: Specyfikator kodowania znaku `signed`/`unsigned` nie zmienia szerokości
typu.

Może zadziwiać, że typy `short int` oraz `int` mają taką samą szerokość
minimalną. Z drugiej strony dla komputerów osobistych praktyczna realizacja
sytuacji gdzie rozmiar `short int` oraz `int` jest jednakowa właściwie już nie
występuje (miało to miejsce w przypadku wycofanej z użycia architektury Win16).

Szerokości typów na współczesnych 64-bitowych komputerach osobistych:
  * `char` — 8 bitów
  * `short int` — 16 bitów
  * `int` — 32 bity
  * `long int` — 32 lub 64 bity
  * `long long int` — 64 bity

Szerokość typu wpływa na zakres reprezentowalnych wartości i dla typów
całkowitoliczbowych zakres można łatwo wyznaczyć:
  * W przypadku liczb bez znaku (`unsigned`) wszystkie bity są wykorzystywane do
    kodowania cyfr. Dla szerokości równej $`n`$ bitów można zaprezentować liczby
    z zakresu $`[0, 2^n - 1]`$. Poniżej przedstawiono interesujące przypadki
    szerokości i zakresów wartości:
      * 8 bitów: $[0, 255]$
      * 16 bitów: $[0, 65535]$
      * 32 bity: $[0, 4294967295]$
      * 64 bity: $[0, 18446744073709551615]$
  * W przpadku liczb ze znakiem (`signed`) jeden bit jest wykorzystywany do
    kodowania znaku a pozostałe — do kodowania cyfr. Aby uniknąć problemu
    podwójnej reprezentacji wartości zero (+0, -0) wprowadzono kod
    uzupełnieniowy do dwójki i jest to jedyny kod zaakceptowany przez standard
    języka C++. Z użyciem tego kodu dla szerokości równej $`n`$ bitów można
    zaprezentować liczby z zakresu $`[2^{n - 1}, 2^{n - 1} - 1]`$. Poniżej
    przedstawiono interesujące przypadki szerokości i zakresów wartości:
      * 8 bitów: $`[-128, 127]`$
      * 16 bitów: $`[-32768, 32767]`$
      * 32 bitów: $`[-2147483648, 2147483647]`$
      * 64 bity: $`[-9223372036854775808, 9223372036854775807]`$

#### ▸ Typy zmiennoprzecinkowe

Istnieją trzy typy zmiennoprzecinkowe określone w standardzie języka C++:
  * `float` — typ zmiennoprzecinkowy o pojedynczej precyzji: 32 bity
  * `double` — podwójna precyzja: 64 bity
  * `long double` — rozszerzona precyzja: od 64 do 128 bitów w zależności od
    platformy (najpopularniejszym obecnie wyborem jest 80 bitów, choć można też
    z łatwością spotkać implementację opartą o 64 bity)

Sposób kodowania liczb zmiennoprzecinkowych określa standard IEEE 754:
  * *binary32*: 1 bit znaku, 8 bitów wykładnika, 23 bity mantysy
  * *binary64*: odpowienio 1, 11 i 52 bitów
  * *binary128*: 1, 15 i 112 bitów

W przypadku szerokości 80 bitów wykorzystuje się 1 bit znaku, 15 bitów
wykładnika oraz 64 bitów mantysy.

Uwaga: Pole wykładnika bywa też nazywane cechą liczby zmiennoprzecinkowej.

Podczas kodowania liczb zmiennoprzecinkowych może zostać użyta reprezentacja
*normalna* lub *subnormalna*. Na chwilę obecną pominiemy reprezentację
subnormalną i skoncentrujemy się jedynie na reprezentacji normalnej.

W reprezentacji normalnej stosuje się mantysę, która zawsze rozpoczyna się od
wartości 1 i nie jest ona wtedy kodowana w pamięci komputera. Precyzję
dziesiętną można zatem wtedy obliczyć jako
$`\log_{10} 2^{\textnormal{szerokość mantysy kodowanej + 1}}`$
co dla poszczególnych sposobów kodowania oznacza następującą liczbę cyfr
znaczących rozwinięcia dziesiętnego (wartości przybliżone):
  * *binary32* (23 bity mantysy kodowanej): 7
  * *binary64* (52): 15
  * kodowanie na 80 bitach (64): 19
  * *binary128* (112): 34

Zakres wykładników dla reprezentacji normalnej:
  * *binary32*: [-38, +38]
  * *binary64*: [-308, +308]
  * 80 bitów oraz *binary128*: [-4932, +4932]

Skąd biorą się powyższe wartości? Aby to wyjaśnić rozważmy przykład kodowania
*binary32*. Poniższa reprezentacja binarna zawiera informację o znaku,
wykładniku i mantysie i jest reprezentacją normalną pewnej liczby w kodowaniu
*binary32*:
```
0 00000001 00000000000000000000000
```

Co oznaczają te liczby? Pierwsze zero oznacza, że liczba jest dodatnia a ciąg
ostatnich 23 zer informuje, że mantysa jest równa 1 zgodnie z wcześniej
wspomnianą konwencją dla reprezentacji normalnej.

Informacja o wykładniku jest jednak nieco zawoalowana. Jedynka na najmniej
znaczącym bicie dawałaby wartość wykładnika $`2^0`$, czyli 1, co można byłoby
błędnie zinterpretować jako finalną wartość. W kodowaniu zmiennoprzecinkowym
stosuje się jednak przesunięcie wykładnika i od wykładnika o $`n`$ bitach należy
odjąć liczbę $`2^{n - 1} - 1`$. W tym przypadku $`n = 8`$ (reprezentacja
*binary32*), co oznacza, że należy odjąć liczbę 127.

Finalnie otrzymujemy wartość $`2^{-126} \approx 1{,}175494 \cdot 10^{-38}`$,
przy czym reprezentacja dziesiętna jest przybliżona z 7 cyframi rozwinięcia
dziesiętnego (1 cyfra przed separatorem dziesiętnym i 6 cyfr po separatorze).

## 5. Złożone typy danych

### Tablice

Przypomnijmy, że instrukcja prostej deklaracji zmiennej ma składnię:
```cpp
sekwencja_specyfikatorów lista_deklaratorów ;
```
gdzie `lista_deklaratorów` jest listą deklaratorów. Deklarator typu tablicowego
ma składnię opisaną niżej, gdzie wykorzystano operator `[]`.

Składnia:
```cpp
deklarator [wyrażenie (opcjonalnie)]
```

  * `deklarator` jest deklaratorem, tzn. identyfikatorem.
  * `wyrażenie` jest wyrażeniem stałym konwertowalnym na typ `std::size_t`
    i określa rozmiar tablicy, który powinien być większy od zera.

Uwagi:
  * Wyrażenie stałe oznacza, że jego wartość powinna być możliwa do obliczenia
    w momencie kompilacji.
  * Kompilatory mogą rozszerzyć `wyrażenie` na wyrażenie niebędące wyrażeniem
    stałym — jest to jednak niezgodne ze standardem (choć wykorzystanie tej
    możliwości bywa nierzadko praktykowane).
  * Typ `std::size_t` jest typem całkowitoliczbowym bez znaku adekwatnym do
    reprezentowania rozmiarów kontenerów w języku C++.
  * Zamiast zwykłych tablic często lepiej jest korzystać z kontenera
    `std::vector`. Będzie to opisane dalej.

Przykład:
```cpp
int arr[42];
char hello[] = { 'H', 'e', 'l', 'l', 'o', ',', ' ',
                 'w', 'o', 'r', 'l', 'd', '!', '\0' };
```

#### ▸ Tablice wielowymiarowe

Przykład:
```cpp
int arr[3][2] = {{0, 1}, {2, 3}, {4, 5}};
```

W przypadku tablic wielowymiarowych podtablice są umieszczane kolejno w pamięci.
Podobnie zresztą elementy każdej podtablicy są umieszczane kolejno w pamięci.
Powyższy przykład ma więc następujący układ danych w pamięci:
```
0 1 2 3 4 5
```
Oznacza to również, że najbardziej wydajny sposób na przetwarzanie elemenentów
tablicy polega na iterowaniu ostatniego indeksu w najbardziej zagnieżdżonej
pętli (pozwala to na wykorzystanie mechanizmu tzw. *cache prefetching*):
```cpp
const int max_x = 7;
const int max_y = 42;
double data[max_x][max_y];

// ...

double sum = 0.;
for (int x = 0; x < max_x, ++x) {
  for (int y = 0; y < max_y; ++y) {
    sum += data[x][y];
  }
}
```

### `std::vector`

Rozważmy sytuację, w której programista potrzebuje zadeklarować tablicę, której
rozmiar nie jest znany w momencie kompilacji. Jest to sytuacja często spotykana
— tablica taka nosi nazwę VLA (ang. *variable length array*). Przykładowy
program, który demonstruje wykorzystanie VLA jest zaprezentowany poniżej.

Przykład (pełny przykład znajduje się w pliku
[vla/vla.cc](/podstawy-programowania/examples/05/vla/vla.cc)):
```cpp
#include <cstdlib>
#include <iostream>
#include <random>

int
main()
{
  std::size_t n;
  std::cin >> n;
  int tab[n];

  std::mt19937 engine(std::random_device{}());
  for (std::size_t i = 0; i < n; ++i) {
    std::cout << (tab[i] = std::uniform_int_distribution<int>{ 0, 9 }(engine))
              << '\n';
  }
}
```

Ten program można skompilować i uruchomić. Dociekliwy Czytelnik zauważy jednak,
że coś jest nie tak z procedurą kompilacji powyższego programu. Kompilator GCC
wypisuje następujące ostrzeżenie:
> vla.cc: In function ‘int main()’:  
> vla.cc:10:7: warning: ISO C++ forbids variable length array ‘tab’ [-Wvla]

Okazuje się bowiem, że VLA nie jest częścią standardu języka C++ (choć dopuszcza
go język C w standardzie z roku 1999) i jest jedynie rozszerzeniem kompilatora.
Czy można znaleźć lepsze rozwiązanie?

Zanim odpowiemy sobie na to pytanie, rozważmy kolejny problem. Otóż nierzadko
zdarza się, że nie tylko rozmiar tablicy nie jest znany w momencie kompilacji,
ale przydałoby się go zmienić w trakcie wykonania programu. Do tego celu służy
dynamiczna alokacja pamięci, która w C++ może zostać zrealizowana poprzez użycie
operatorów `new` oraz `delete` w wersji tablicowej, tzn. poprzez `new[]` oraz
`delete[]`. Niestety taka forma dynamicznej alokacji pamięci jest rozwiązaniem
niewygodnym i podatnym na poważne błędy programistyczne, które mogą wieść do
katastrofalnych konsekwencji! Czy można znaleźć lepsze rozwiązanie?

Okazuje się, że zarówno problem VLA jak i dynamicznej alokacji pamięci w formie
tablic ma rozwiązanie w języku C++, które jest zarówno zgodne ze standardem jak
i bardzo wygodne w użyciu. Tym rozwiązaniem, jest kontener `std::vector`.

Szczegółowy opis kontenera `std::vector` można znaleźć np. na stronie
<https://en.cppreference.com/w/cpp/container/vector>. W pozostałej części tego
podpunktu skoncentrujemy się wyłącznie na wybranych własnościach tego kontenera.

`std::vector` jest jednym z wielu kontenerów dostępnych w języku C++. Swoją
funkcjonalnością może on w zdecydowanej większości przypadków zastępować zwykłą
tablicę. Precyzyjnie można ująć, że `std::vector` jest kontenerem sekwencyjnym
kapsułkującym tablicę o dynamicznym rozmiarze. Warto pamiętać, że `std::vector`
zajmuje więcej pamięci aniżeli zwykła tablica, ponieważ kontener ten
wyprzedzająco rezerwuje więcej pamięci aniżeli jest to w danej chwili potrzebne.
Kontener ten zwiększa ponadto swój rozmiar, gdyby zaalokowana wcześniej pamięć
nie wystarczała do przechowania dodatkowych danych.

Zobaczmy jak niestandardowy przykład wykorzystania VLA może zostać przepisany
w kanonicznej formie języka C++.

Przykład (pełny przykład znajduje się w pliku
[vector/vector.cc](/podstawy-programowania/examples/05/vector/vector.cc)):
```cpp
#include <cstdlib>
#include <iostream>
#include <random>
#include <vector>

int
main()
{
  std::vector<int> v;
  std::mt19937 engine(std::random_device{}());

  std::size_t n;
  std::cin >> n;

  for (std::size_t i = 0; i < n; ++i) {
    v.push_back(std::uniform_int_distribution<int>{ 0, 9 }(engine));
    std::cout << v.back() << '\n';
  }
}
```

### Struktury

*Struktura* jest typem złożonym składającym się z elementów zapisanych
sekwencyjnie według podanej kolejności.

Specyfikator typu struktury ma podczas jej definiowania składnię, której
uproszczony i przybliżony opis jest podany niżej. Do nieco bardziej kompletnej
składni będzie można wrócić przy okazji programowania w stylu obiektowym.

Składnia:
```cpp
struct nazwa (opcjonalnie) { lista_deklaracji }
```

  * `nazwa` jest nazwą definiowanej struktury.
  * `lista_deklaracji` jest listą dowolnej długości prostych deklaracji
    zmiennych.

Powyższy opis jest mocno uproszczony i nie uwzględnia wielu kategorii
składników, które mogą pojawić się podczas definiowania struktury, m.in. tych
związanych z programowaniem w stylu obiektowym lub generycznym. Na ten moment
zadowolimy się jednak taką uproszczoną wersją.

Przykład (pełny przykład znajduje się w pliku
[struct/struct.cc](/podstawy-programowania/examples/05/struct/struct.cc)):
```cpp
#include <cmath>
#include <iostream>

struct point_2d
{
  double x;
  double y;
};

int
main()
{
  point_2d zero(0., 0.);
  point_2d e_x(1., 0.);
  point_2d e_y(0., 1.);
  point_2d p(1., 1.);

  std::cout << "Poczatek ukladu wspolrzednych: (" << zero.x << ", " << zero.y
            << ").\n";
  std::cout << "Wersor e_x: (" << e_x.x << ", " << e_x.y << ").\n";
  std::cout << "Wersor e_y: (" << e_y.x << ", " << e_y.y << ").\n";

  std::cout << "Odleglosc punktu (1, 1) od (0, 0): "
            << std::hypot(p.x - zero.x, p.y - zero.y) << ".\n";
}
```

## 6. Funkcje

Czym są funkcje w języku C++? *Funkcja* to element języka, który umożliwia
połączenie sekwencji instrukcji z nazwą oraz listą argumentów. Sekwencja
instrukcji jest nazywana *ciałem funkcji*. Lista argumentów może być pusta.

Funkcja może zostać *zadeklarowana* oraz *zdefiniowana*. Deklaracja funkcji
wprowadza jej nazwę (identyfikator) i umożliwia użycie (wywołanie). Definicja
funkcji jest potrzebna do opisu wykonywanych czynności (jest to implementacja
zadeklarowanego identyfikatora). Funkcja może zostać zadeklarowana wielokrotnie
lecz zdefiniowana tylko jeden raz. Definicja funkcji może pojawić się
w miejscu, gdzie oczekiwana byłaby deklaracja.

### Deklaracja funkcji

Zacznijmy więc od deklaracji funkcji. Uproszczona składnia deklaracji funkcji
jest następująca.

Składnia:
```cpp
typ_zwracany deklarator ( lista_argumentów )
```

  * `typ_zwracany` jest typem wartości zwracanej przez funkcję z użyciem
    instrukcji `return` lub jest słowem `void`, jeśli funkcja nic nie zwraca.
  * `deklarator` jest identyfikatorem funkcji, tzn. jej nazwą.
  * `lista_argumentów` jest listą argumentów odseparowanych przecinkami. Lista
    może być pusta.

Przykład:
```cpp
#include <string>

int f(int);
double g();
std::string h(const char* str);
```

### Definicja funkcji

Uproszczona składnia definicji funkcji jest podobna do jej deklaracji. Jedyna
istotna na ten moment różnica jest taka, że definicja funkcji posiada *ciało*.

Składnia:
```cpp
typ_zwracany deklarator ( lista_argumentów ) ciało
```

  * `typ_zwracany`, `deklarator` oraz `lista_argumentów` zostały opisane przy
    okazji deklaracji funkcji.
  * `ciało` jest ciałem funkcji, tzn. instrukcją złożoną zawierającą zero lub
    więcej instrukcji otoczonych nawiasami klamrowymi `{` oraz `}`. Instrukcja
    złożona jest wykonywana w momencie wywołania funkcji.

Przykład:
```cpp
#include <cmath>
#include <string>
#include <vector>

int id(int x) {
  return x;
}

double answer() {
  return 42;
}

std::string to_string(const char* str) {
  return std::string(str);
}

std::vector<double> quadratic_eq(double a, double b, double c) {
  std::vector<double> res;
  double delta = b * b - 4 * a * c;
  if (delta >= 0) {
    res.push_back((-b + std::sqrt(delta)) / (2 * a));
    if (delta > 0) {
      res.push_back((-b - std::sqrt(delta)) / (2 * a));
    }
  }
  return res;
}
```

Uwagi:
  * Lista argumentów w definicji funkcji zawiera tzw. *argumenty formalne*,
    czyli identyfikatory wykorzystywane ciele definiowanej funkcji.
  * W momencie wywołania funkcji, w miejsce argumentów formalnych wstawiane są
    *argumenty właściwe* (*argumenty rzeczywiste*).

Przykład:
```cpp
int id(int x) {
  return x;
}

int main() {
  id(42);
  int n = 7;
  id(n);
}
```

W powyższym przykładzie `x` jest argumentem formalnym a `42` oraz `n` —
właściwymi.

### Instrukcja `return`

Instrukcja `return` jest instrukcją skoku.

Składnia:
```cpp
return wyrażenie (opcjonalnie) ;
```

  * `wyrażenie` jest wyrażeniem konwertowalnym na typ zwracany przez funkcję.
    W ramach instrukcjij skoku `return` wyrażenie `wyrażenie` jest ewaluowane,
    po czym bieżąca funkcja kończona a wartość zwrócona po ewentualnej konwersji
    do funkcji wywołującej.

Przykład (pełny przykład znajduje się w pliku
[piggy-bank/piggy-bank.cc](/podstawy-programowania/examples/06/piggy-bank/piggy-bank.cc)):
```cpp
#include <iostream>
#include <vector>

double
accumulate(std::vector<double> v);

int
main()
{
  std::vector<double> piggy_bank;
  piggy_bank.push_back(10.23); // styczeń
  piggy_bank.push_back(9.35);  // luty
  // ...
  piggy_bank.push_back(25.12); // grudzień

  double total =            // (*) Tutaj jest "wkładana" wartość res
    accumulate(piggy_bank); // z instrukcji return z funkcji accumulate.

  std::cout << "Calkowite oszczednosci w skarbonce: " << total << " zl\n";
}

double
accumulate(std::vector<double> v)
{
  double res = 0.;
  for (std::size_t i = 0; i < v.size(); ++i) {
    res += v.at(i);
  }
  return res; // Instrukcja return wykonuje skok z tego miejsca do linijki (*).
}
```

### Rekurencja

*Rekurencja* polega na wywołaniu w definicji danej funkcji jej samej.

Przykład (pełny przykład znajduje się w pliku
[factorial/factorial.cc](/podstawy-programowania/examples/06/factorial/factorial.cc)):
```cpp
#include <iostream>

using ulli_t = unsigned long long int;

ulli_t
factorial(ulli_t n);

int
main()
{
  // factorial(21) daje nieprawidłowy wynik dla typu ulli_t.
  for (int i = 0; i < 21; ++i) {
    std::cout << i << "! = " << factorial(i) << '\n';
  }
}

ulli_t
factorial(ulli_t n)
{
  return n == 0 ? 1 : n * factorial(n - 1);
}
```

W powyższym przykładzie w definicji funkcji `factorial` następuje wywołanie
funkcji `factorial` — mamy więc do czynienia z rekurencją.

Wynik działania przykładu:
> 0! = 1  
> 1! = 1  
> 2! = 2  
> 3! = 6  
> 4! = 24  
> 5! = 120  
> 6! = 720  
> 7! = 5040  
> 8! = 40320  
> 9! = 362880  
> 10! = 3628800  
> 11! = 39916800  
> 12! = 479001600  
> 13! = 6227020800  
> 14! = 87178291200  
> 15! = 1307674368000  
> 16! = 20922789888000  
> 17! = 355687428096000  
> 18! = 6402373705728000  
> 19! = 121645100408832000  
> 20! = 2432902008176640000

Przykład (pełny przykład znajduje się w pliku
[Fibonacci/Fibonacci.cc](/podstawy-programowania/examples/06/Fibonacci/Fibonacci.cc)):
```cpp
#include <iostream>

int counter = 0;

int
Fibonacci(int n)
{
  counter++;
  return n == 0 ? 0 : n == 1 ? 1 : Fibonacci(n - 1) + Fibonacci(n - 2);
}

int
main()
{
  const int i = 42;
  const int res = Fibonacci(i);
  std::cout << "Fibonacci(" << i << ") = " << res << " (" << counter
            << " wywolan funkcji Fibonacci)\n";
}
```

Wynik działania przykładu:
> Fibonacci(42) = 267914296 (866988873 wywolan funkcji Fibonacci)

### Przeciążanie funkcji

W języku C++ istnieje możliwość *przeciążania* funkcji, tzn. specyfikowania
więcej niż jednej funkcji o takiej samej nazwie.

Przykład (pełny przykład znajduje się w pliku
[overload/overload.cc](/podstawy-programowania/examples/06/overload/overload.cc)):
```cpp
#include <iostream>
#include <string>
#include <vector>

void
print(int i)
{
  std::cout << "Liczba calkowita: " << i << '\n';
}

void
print(double d)
{
  std::cout << "Liczba zmiennoprzecinkowa: " << d << '\n';
}

void
print(std::vector<std::string> v)
{
  std::cout << "Kontener std::vector zawierający napisy std::string:\n";
  for (std::size_t i = 0; i < v.size(); ++i) {
    std::cout << i + 1 << ". " << v.at(i) << '\n';
  }
  std::cout << "Calkowita liczba napisow: " << v.size() << '\n';
}

int
main()
{
  print(42);
  print(137.035999084);
  std::vector<std::string> v = {
    "\"Answer to the Ultimate Question of Life, The Universe, and Everything\"",
    "odwrotnosc stalej struktury subtelnej"
  };
  print(v);
}
```

Wynik działania przykładu:
> Liczba calkowita: 42  
> Liczba zmiennoprzecinkowa: 137.036  
> Kontener std::vector zawierający napisy std::string:  
> 1\. "Answer to the Ultimate Question of Life, The Universe, and Everything"  
> 2\. odwrotnosc stalej struktury subtelnej  
> Calkowita liczba napisow: 2

Czym powinny się różnić funkcje o tej samej nazwie, aby zostały prawidłowo
przeciążone? Mogą one się różnić liczbą argumentów formalnych lub ich typem.
Jeśli dwie funkcje o tej samej nazwie różnią się wyłącznie typem zwracanej
wartości to nastąpi błąd kompilacji. Lista prawidłowych i nieprawidłowych różnic
jest dłuższa, lecz na ten moment ograniczymy się wyłącznie do wyżej
wymienionych.

## 7. Zakres

Każda deklaracja w C++ jest widoczna w jakimś zakresie. W tym punkcie zostaną
omówione czym są *widoczność* oraz *zakres*. Zostaną przedstawione wybrane
przykłady zakresów.

Rozważmy na początek prosty przykład.

Przykład (pełny przykład znajduje się w pliku
[scope/scope.cc](/podstawy-programowania/examples/07/scope/scope.cc)):
```cpp
#include <iostream>

void
f()
{
  int a = 42;
  std::cout << "Zmienna a (f) ma wartosc " << a << ". "
            << "Znajduje sie pod adresem " << &a << ".\n";
}

int
main()
{
  int a = 7;
  std::cout << "Zmienna a (main) ma wartosc " << a << ". "
            << "Znajduje sie pod adresem " << &a << ".\n";
  f();
  std::cout << "Zmienna a (main) ma wartosc " << a << ". "
            << "Znajduje sie pod adresem " << &a << ".\n";
}
```

Wynik działania przykładu:
> Zmienna a (main) ma wartosc 7. Znajduje sie pod adresem 0x7ffcc35f1d24.  
> Zmienna a (f) ma wartosc 42. Znajduje sie pod adresem 0x7ffcc35f1d04.  
> Zmienna a (main) ma wartosc 7. Znajduje sie pod adresem 0x7ffcc35f1d24.

Uwaga: O adresowaniu pamięci komputera poświęcony jest osobny punkt tego
skryptu. Na cwhilę obecną wystarczy wiedzieć, że kod `&a` oznacza adres zmiennej
`a` to znaczy jej położenie w pamięci komputera oraz że adres jest nieujemną
liczbą całkowitą notowaną zazwyczaj w systemie szesnastkowym. Adres zmiennej
może być różny w różnych uruchomieniach tego samego programu.

Przebieg działania powyższego przykładu jest następujący. Uruchamiana jest
funkcja `main`, gdzie tworzona jest zmienna o nazwie `a` o wartości `7`. Po
wypisaniu komunikatu na temat tej zmiennej wywoływana jest funkcja `f`, gdzie
tworzona jest zmienna `a` o wartości `42`. Po wypisaniu komunikatu działanie
funkcji `f` kończy się i następuje powrót do funkcji `main`, gdzie wypisywany
jest jeszcze jeden komunikat.

Szczegółowa analiza wypisywanych komunikatów pozwala dojść do wniosku, że
zmienna `a` z funkcji `main` oraz zmienna `a` z funkcji `f` są innymi bytami.
Widać to wprost dzięki znajomości adresów oraz pośrednio dzięki wypisywanym
wartościom.

Dlaczego, pomimo identycznej nazwy, obydwie zmienne są różne? Dzieje się tak,
ponieważ obydwie zmienne znajdują się w różnych *zakresach*. Zmienna
zadeklarowana w danej funkcji znajduje się w zakresie powiązanym z tą funkcją.

W dalszej części punktu omówiono różne przykłady zakresów.

### Zakres globalny

*Zakres globalny* zawiera w sobie cały program. Jest to jedyny zakres, który nie
zawiera się w żadnym innym zakresie.

### Zakres blokowy

*Zakres blokowy* jest wprowadzany poprzez użycie instrukcji wyboru `if` oraz
`switch`, pętli `while`, `do`-`while` oraz `for` (w tym zakresowej pętli `for`)
a także instrukcji złożonej. Zobaczmy to na przykładzie pętli `for`:
```cpp
for (int i = 0; i < 42; ++i) // Zmienna i rezyduje w zakresie wprowadzonym przez
  std::cout << i << '\n';    // pętlę for.
// Ten punkt jest poza zakresem wprowadzonym przez pętlę for. Zmienna i jest
// niedostępna.
```

Instrukcja złożona, nazywana też blokiem, była omówiona wraz z przykładem
zawartym w pliku
[compound/compound.cc](/podstawy-programowania/examples/03/compound/compound.cc)).
W pliku tym widać bloki o numerach od 1 do 5 i każdy z nich wprowadza zakres
blokowy.

Uwaga: Zakres wprowadzony przez blok numer 5 jest zawarty w zakresie
wprowadzonym przez blok 4. Zakres wprowadzony przez blok 2 jest zawarty
w zakresie wprowadzonym przez pętlę `for`.

### Zakres argumentu funkcji

Każdy argument z listy argumentów w deklaracji bądź definicji funkcji wprowadza
nowy zakres, który rozpoczyna się tym argumentem i kończy się odpowiednio wraz
z końcem deklaracji lub wraz z końcem ciała definiowanej funkcji.

Przykład:
```cpp
void f(
       int n,    // Rozpoczyna się zakres wprowadzony przez n.
       double d  // A tutaj rozpoczyna się zakres wprowadzony przez d.
      );         // Kończy się zakres wprowadzony przez n oraz d.

double
sum_of_squares(
               double x, // Początek zakresu wprowadzonego przez x.
               double y  // . . . . . . . . . . . . . . . . . .  y.
              ) {
  double res = x * x + y * y;
  return res;
}                        // Koniec zakresów wprowadzonych przez x oraz y.
```

Uwaga: W powyższym przykładzie celowo nie zachowano stylu kodowania, aby
wskazać początek i koniec danego zakresu.

## 8. Wskaźniki

Przypomnijmy, że instrukcja prostej deklaracji zmiennej ma składnię:
```cpp
sekwencja_specyfikatorów lista_deklaratorów ;
```
gdzie `lista_deklaratorów` jest listą deklaratorów.

Deklarator typu wskaźnikowego ma składnię opisaną niżej:

Składnia:
```cpp
* const (opcjonalnie) deklarator
```

  * `const` jest opcjonalnym kwalifikatorem `const`, który określa, że wskaźnik
    jest stały.
  * `deklarator` jest deklaratorem.

Przykłady:
```cpp
int x = 42;
const int c = 7;

int* p0 = &x;             // wskaźnik na zmienną typu int

const int* p2 = &c;       // wskaźnik na stałą typu int
int const* p3 = &c;       // jw.

int* const p4 = &x;       // stały wskaźnik na zmienną typu int

const int* const p5 = &c; // stały wskaźnik na stałą typu int
int const* const p6 = &c; // jw.
```

Uwaga: W powyższym przykładzie ograniczono się wyłącznie do wskaźników na typ
`int` oraz `const int`.

Zauważmy, że w celu pobrania adresu wykorzystano operator `&`.

W celu uzyskania wartości wskazywanej przez wskaźnik należy wykorzystać tzw.
*dereferencję* (zwaną też *wyłuskaniem*), którą otrzymuje się poprzez
zastosowanie operatora `*`.

Przykład:
```cpp
int x = 42;
std::cout << "x = " << x << '\n';

int* p = &x;
std::cout << "x = " << *p << '\n';
```

Wynik działania przykładu:
> x = 42  
> x = 42

### Wskaźnik pusty `nullptr`

Do wskaźnika, który nie wskazuje na dane, należy przypisać specjalną wartość
określaną przez literał `nullptr`. Warto zrobić to już w momencie zainicjowania
zmiennej wskaźnikowej.

Przykład:
```cpp
int* p = nullptr;
double* q = nullptr;
```

Wskaźnik pusty nie wskazuje na żadne dane — informuje o tym jego specjalna
wartość. Co więcej, poprawnie skonstruowany kod źródłowy sprawdza czy ma do
czynienia z pustym wskaźnikiem.

Jak to może wyglądać w praktyce? Zobaczymy to na przykładzie szkieletu aplikacji
okienkowej, gdzie wykorzystano tzw. *widget* (*window gadget*).

Przykład:
```cpp
struct Widget;

Widget*
make_widget()
{
  Widget* res;
  // Tutaj może znaleźć się kod tworzący element interfejsu (widget).
  // W przypadku niepowodzenia tworzenia wykonywana jest poniższa instrukcja.
  res = nullptr;
  return res;
}

void
update_widget(Widget* w)
{
  if (w != nullptr) {
    // Widget należy zaktualizować tylko jeśli został poprawnie utworzonony.
    // Tutaj może znaleźć się kod aktualizujący widget.
  }
}

void
destroy_widget(Widget* w)
{
  if (w) {
    // Instrukcja if (w) działa tak samo jak if (w != nullptr).
  }
}

int
main()
{
  Widget* w = make_widget();
  update_widget(w);
  destroy_widget(w);
}
```

### Wskaźnik typu `void`

Mimo, że nie istnieje typ danych `void` a samo to słowo ma szczególne znaczenie,
istnieje możliwość zdefiniowania wskaźnika typu `void`.

Przykład:
```cpp
struct s
{
  int n;
};

double x = 0.5;
const s y = { 7 };

void* p = &x;
const void* q = &y;
```

Uwaga: Wskaźniki typu `void` są wykorzystywane w języku C w celu osiągnięcia
polimorfizmu. W języku C++ istnieją lepsze rozwiązania takie jak polimorfizm
statyczny z wykorzystaniem szablonów.

### Wskaźnik na funkcję

Istnieje możliwość stworzenia wskaźnika na funkcję.

Przykład:
```cpp
int sum(int a, int b) { return a + b; }
int (*p)(int, int) = &sum;
```

Aby zainicjować wartość wskaźnika na funkcję należy podać nazwę funkcji
poprzedzoną opcjonalnie operatorem `&`.

Uwaga: Zamiast `int (*p)(int, int) = &sum;` można opuścić operator `&` i napisać
`int (*p)(int, int) = sum;`. Dzieje się tak, ponieważ następuje niejawna
konwersja nazwy funkcji na adres początku jej kodu wykonywalnego w kontekście
wymagającym podania adresu.

W celu wywołania funkcji, do której znany jest wskaźnik należy zwyczajowo
zastosować dereferencję:
```cpp
std::cout << (*p)(1, 2) << '\n'; // Wypisze wartość 3.
```

Uwaga: A jak stworzyć tablicę wskaźników na funkcje? Oto przykład tablicy
(rozmiaru 7) wskaźników na funkcje przyjmujące dwa argumenty typu double
i niezwracające niczego: `void (*p[7])(double, double);`. Składnię można
uprościć stosując alias `using F = void(double, double);`. Wtedy wystarczy
deklaracja o skróconej i bardziej znajomej postaci `F* p[7];`.

## 9. Referencje

Istnieją dwa rodzaje referencji w języku C++. Są to referencje do l-wartości
oraz do r-wartości. Na ten moment ograniczymy się do tego pierwszego (i zarazem
starszego) rodzaju.

Przypomnijmy, że instrukcja prostej deklaracji zmiennej ma składnię:
```cpp
sekwencja_specyfikatorów lista_deklaratorów ;
```
gdzie `lista_deklaratorów` jest listą deklaratorów.

Deklarator typu referencyjnego ma składnię opisaną niżej:

Składnia:
```cpp
& deklarator
```

  * `deklarator` jest deklaratorem.

Uwaga: Referencja musi zostać zainicjowana.

Przykłady:
```cpp
int n = 0;
int& r = n;
r = 42;
std::cout << n << '\n'; // Wypisze wartość 42.
```

Jak widać na powyższym przykładzie referencje służą do tworzenia *aliasów*
(nowych nazw) dla zmiennych. Referencja `r` jest nową nazwą dla `n`
i modyfikacja wartości `r` oznacza modyfikację `n`, ponieważ `n` oraz `r` są tym
samym obiektem.

Jakie jest typowe zastosowanie referencji? Zobaczmy to na przykładzie argumentów
funkcji.

Przykład (pełny przykład znajduje się w pliku
[replace/replace.cc](/podstawy-programowania/examples/09/replace/replace.cc)):
```cpp
#include <iostream>
#include <string>

void
replace(std::string& s, char from, char to)
{
  for (std::size_t i = 0; i < s.size(); ++i) {
    if (s.at(i) == from) {
      s.at(i) = to;
    }
  }
}

int
main()
{
  std::string s = "Programowanie w C++";
  std::cout << "Napis oryginalny: " << s << '\n';
  replace(s, ' ', '*');
  std::cout << "Napis zmodyfikowany: " << s << '\n';
}
```

Wynik działania przykładu:
> Napis oryginalny: Programowanie w C++  
> Napis zmodyfikowany: Programowanie\*w\*C++

Zauważmy, że dzięki zastosowaniu referencji obiekt `s` z funkcji `main`
powyższego przykładu nie jest kopiowany do funkcji `replace`. Dzięki temu
funkcja `replace` modyfikuje oryginał, co było w tym przypadku zamierzone. Co
więcej, brak kopiowania obiektu oznacza niejednokrotnie oszczędność (w pamięci
oraz w czasie wykonania). Dlatego referencje warto wykorzystywać.

Trzeba tylko wiedzieć jak prawidłowo użyć referencji. Rozważmy poniższy
przykład.

Przykład:
```cpp
#include <iostream>
#include <string>

std::string
join(std::string& s1, std::string& s2)
{
  return s1 + s2;
}

int
main()
{
  std::string s = "Programowanie ";
  std::string t = "jest proste!\n";
  std::cout << join(s, t);
}
```

Wynik działania przykładu:
> Programowanie jest proste!

Funkcja `join` łączy dwa napisy podane jako referencje. Dzięki temu nie
następuje kopiowanie napisów typu `std::string` do funkcji. Wszystko działa
bardzo dobrze… do czasu gdy nie zmodyfikujemy lekko wywołania funkcji. Oto więc
nowa funkcja `main`:

```cpp
int
main()
{
  std::string s = "Programowanie ";
  std::cout << join(s, "jest proste!\n");
}
```

Co się zmieniło? Zamiast podać drugi argument jako zmienną `t` postanowiliśmy
przekazać go do funkcji `join` jako napis w stylu języka C z intencją, aby
w międzyczasie został wywołany konstruktor `std::string` a wynik przypisany do
argumentu `s2` funkcji `join`. I faktycznie konstruktor `std::string` został
wywołany — została stworzona tymczasowa nienazwana wartość typu `std::string`.
Po tym próbowano przypisać tę tymczasową wartość do referencji `s2` a to się nie
udało — oto odpowiednie fragmenty błędu generowanego przez kompilator GCC:

> error: cannot bind non-const lvalue reference of type ‘std::string&’ […] to an
> rvalue of type ‘std::string’

Płynie stąd ważny wniosek: do referencji (do l-wartości) nie można przypisać
wartości tymczasowej. Istnieją dwa rozwiązania tego problemu — można zastosować
stałą referencję do l-wartości lub referencję do r-wartości. Na ten moment
ograniczymy się do pierwszego rozwiązania.

Czym jest stała referencja (do l-wartości)? Rozważmmy poniższy przykład.

Przykład:
```cpp
int n = 42;
const int& r = n;
n++; // Teraz n jest równe 43.
r--; // Błąd! Ta linijka się nie skompiluje.
```

Fragment `const int& r = n;` jest stałą referencją, co oznacza, że `r` jest
referencją (aliasem, nową nazwą dla `n`), ale z jej użyciem nie można
zmodyfikować wartości zmiennej `n`. Korzystając z tej wiedzy można już rozwiązać
poprawnie wcześniejszy przykład.

Przykład (pełny przykład znajduje się w pliku
[join/join.cc](/podstawy-programowania/examples/09/join/join.cc)):
```cpp
#include <iostream>
#include <string>

std::string
join(const std::string& s1, const std::string& s2)
{
  return s1 + s2;
}

int
main()
{
  std::string s = "Programowanie ";
  std::cout << join(s, "jest proste!\n");
}
```

Powyższy przykład działa już poprawnie. Prawda, że programowanie jest proste?

## 10. Programowanie obiektowe

W języku C++ istnieje możliwość definiowania własnych typów danych. Widzieliśmy
to na przykładzie struktur, gdzie zdefiniowaliśmy typ `point_2d` (zob. przykład
[struct/struct.cc](/podstawy-programowania/examples/05/struct/struct.cc)).
Rozszerzmy typ `point_2d`.

Przykład (pełny przykład znajduje się w pliku
[point_2d/point_2d.cc](/podstawy-programowania/examples/10/point_2d/point_2d.cc)):
```cpp
#include <cmath>
#include <iostream>

class point_2d
{
public:
  point_2d(double x, double y)
    : x_(x)
    , y_(y)
  {
  }

  double get_x() const { return x_; }
  double get_y() const { return y_; }

  double distance_from_zero() const { return std::hypot(x_, y_); }

private:
  double x_;
  double y_;
};

int
main()
{
  point_2d zero(0., 0.);
  point_2d e_x(1., 0.);
  point_2d e_y(0., 1.);
  point_2d p(1., 1.);

  std::cout << "Poczatek ukladu wspolrzednych: (" << zero.get_x() << ", "
            << zero.get_y() << ").\n";
  std::cout << "Wersor e_x: (" << e_x.get_x() << ", " << e_x.get_y() << ").\n";
  std::cout << "Wersor e_y: (" << e_y.get_x() << ", " << e_y.get_y() << ").\n";

  std::cout << "Odleglosc punktu (1, 1) od (0, 0): " << p.distance_from_zero()
            << ".\n";
}
```

Mimo, że powyższy program jest krótki, to pojawiło się w nim kilka nowości:
  * słowo `class` służące do deklarowania i definiowania klas
  * specyfikatory dostępu `public` oraz `private`
  * konstruktor (`point_2d::point_2d`)
  * metody klasy (`get_x`, `get_y`, `distance_from_zero`)
  * kapsułkowanie danych (`x_`, `y_`)

W dalszej części tego punktu przyjrzymy się dokładniej wyżej wymienionym
pojęciom.

### Klasy i obiekty

Mowi się, że *klasa jest modelem dla zbioru obiektów*. Tylko co to oznacza?
Przyjrzyjmy się ponownie przykładowi
[point_2d/point_2d.cc](/podstawy-programowania/examples/10/point_2d/point_2d.cc).
Została tam zdefiniowana klasa `point_2d` oraz kilka obiektów tej klasy
o nazwach `zero`, `e_x`, `e_y` oraz `p`. Możemy więc w ramach języka C++
stwierdzić, że klasa jest typem a obiekty są zmiennymi (instancjami) tego typu.

Klasa posiada identyfikującą ją nazwę, np. `point_2d` lub `std::vector<int>`.
Dzięki tej nazwie można tworzyć obiekty tej klasy. Do tego celu wykorzystywane
są konstruktory, o których powiemy sobie więcej za chwilę.

Klasa określa jakie dane są przechowywane w jej instancjach. W przypadku
`point_2d` są to dwie dane typu `double` o nazwach `x_` oraz `y_`. Określone są
też prawa dostępu do tych danych i w naszym przykładzie te dane są dostępne
wyłącznie z poziomu kodu samej klasy. Zostanie to omówione obszerniej nieco
dalej.

Klasa posiada metody, nazywane też funkcjami składowymi. Funkcje składowe są,
jak nazwa wskazuje, funkcjami. Jednakże funkcje składowe mają pewnę szczególną
własność odróżniającą je od zwykłych funkcji — są one wywoływane na rzecz
obiektów danej klasy.

### Kapsułkowanie danych

*Kapsułkowanie* (*hermetyzacja*) polega na ograniczeniu dostępu do danych
przechowywanych przez obiekt poprzez ukrycie ich w części prywatnej. Zauważmy,
że dane składowe `x_` oraz `y_` przykładu
[point_2d/point_2d.cc](/podstawy-programowania/examples/10/point_2d/point_2d.cc)
nie są dostępne wprost poza kodem klasy. W szczególności próba odwołania się do
pola `x_` lub `y_` np. z poziomu funkcji `main()` poprzez kod `e_x.x_` zakończy
się błędem kompilacji.

Kapsułkowanie wraz z metodami klasy umożliwia precyzyjną kontrolę dostępu do
przechowywanych damych. W ww. przykładzie po zainicjowaniu obiektu danymi nie
było możliwości ich modyfikacji a dostęp do nich był ograniczony wyłącznie do
ich odczytu poprzez metody `point_2d::get_x` oraz `point_2d::get_y`. Programista
może modyfikować zestaw metod aby umożliwiać i uniemożliwiać odczyt
i modyfikację prywatnych (zakapsułkowanych) danych.

Kapsułkowanie danych jest w języku C++ realizowane poprzez specyfikator dostępu
`private`.

### Specyfikatory dostępu `public` oraz `private`

Nazwa każdego składnika klasy ma przypisane prawa dostępu. Dostęp może być:
  * publiczny (`public`)
  * chroniony (`protected`)
  * prywatny (`private`)

Kiedy nazwa składnika klasy jest używana gdzieś w programie, sprawdzane są prawa
dostępu. Publiczne prawa dostępu umożliwiają dostęp z dowolnego miejsca programu
a prywatne prawa dostępu — wyłącznie dostęp z poziomu danej klasy. Chronione
prawa dostępu zostaną na ten moment pominięte. Zobaczmy jak publiczne i prywatne
prawa dostępu działają w praktyce na poniższym przykładzie.

Przykład:
```cpp
class test
{
public:
  void public_f() const { private_f(); }

private:
  void private_f() const {}
};

int
main()
{
  test t;
  t.public_f();
  t.private_f(); // Ten wiersz jest błędny!
}
```

Powyższy przykład nie skompiluje się. Fragment komunikatu błędu zgłoszonego
przez kompilator GCC jest następujący:
> error: ‘void test::private_f() const’ is private within this context

Można zobaczyć na tym przykładzie, że składowe publiczne są dostępne wszędzie,
ale prywatne są dostępne tylko z poziomu kodu samej klasy.

#### ▸ `class` a `struct`

Ze specyfikatorami dostępu wiąże się pewien fakt. Otóż w języku C++ struktury
i klasy są tym samym z dokładnością do domyślnych praw dostępu. Jeśli
w definicji struktury nie zostanie użyty specyfikator dostępu, to jej składniki
są dostępne publicznie:
```cpp
struct point {
  double x;
  double y;
};

point p;
p.x = 0.0;
p.y = 1.0;
```

Jeśli w definicji klasy nie zostanie użyty specyfikator dostępu, to jej
składniki mają dostępność prywatną:
```cpp
class point {
  double x;
  double y;
};

point p;
// Nie można odwołać się do p.x ani p.y z poziomu tego miejsca!
```

Można stwierdzić, że `struct x { składowe }` jest tym samym co `class x {
public: składowe }` zaś `class y { składowe }` jest tym samym co `struct y {
private: składowe }`.

### Konstruktory

Czym jest konstruktor? Konstruktor jest specjalną funkcją składową klasy, która
jest wywoływana automatycznie podczas tworzenia obiektów tej klasy i służy do
inicjowania tych obiektów. Wrócmy do przykładu z pliku
[point_2d/point_2d.cc](/podstawy-programowania/examples/10/point_2d/point_2d.cc)
i przyjrzyjmy się bliżej konstruktorowi klasy `point_2d`:
```cpp
  point_2d(double x, double y)
    : x_(x)
    , y_(y)
  {
  }
```

Korzystając z innego stylu kodowania można ten konstruktor przepisać tak:
```cpp
  point_2d(double x, double y) : x_(x), y_(y) {
  }
```

Nazwa konstruktora klasy `point_2d` to `point_2d`. Jest regułą, że nazwa
konstruktora jest nazwą klasy.

Konstruktor jest funkcją (choć specjalną), dlatego może on przyjmować argumenty.
W przykładzie konstruktor `point_2d` przyjmuje dwa argumenty typu `double`,
które służą do zainicjowania danych składowych obiektu `point_2d`, tzn. `x_`
oraz `y_`. Do zainiacjowania służy tzw. *lista inicjująca*, która rozpoczyna się
od znaku dwukropka i składa się z elementów inicjujących poszczególne składowe:
```cpp
  point_2d(double x, double y) : x_(x), y_(y) {
  //                           ^^^^^^^^^^^^^^
  //                           To  jest lista
  //                           inicjująca.
```

Konstruktor jest funkcją (choć specjalną), dlatego posiada ciało, które jest
zawarte między klamerkami `{` oraz `}`. Często się zdarza, że ciało jest puste.

Konstruktor jest funkcją (choć specjalną). Przy okazji specyfikowania
konstruktora nie podaje się typu zwracanego przez tę funkcję tak jak robi się to
przy zwykłych funkcjach.

Na zakończenie warto jeszcze przytoczyć jedną uwagę dotyczącą listy inicjującej
oraz ciała funkcji.

Uwaga: Niektórzy programiści C++ unikają listy inicjującej i zamiast napisać:
```cpp
  point_2d(double x, double y) : x_(x), y_(y) {
  }
```
wolą użyć:
```cpp
  point_2d(double x, double y) {
    x_ = x;
    y_ = y;
  }
```
Jest to jednak błędna strategia. Można to łatwo sprawdzić testując obydwa
rozwiązania ze zmienioną częścią prywatną ww. przykładu:
```cpp
private:
  const double x_;
  const double y_;
```

### Metody klas (funkcje składowe)

*Metoda klasy* jest funkcją, którą można wywołać na rzecz obiektu stosując
notację z operatorem dostępu do składowej. Jeśli `X` jest klasą, to dla obiektu
`x` tej klasy wywołanie:
```cpp
x.f();
```
oznacza użycie metody `f` na rzecz `x` a operator `.` użyty do wywołania jest
operatorem dostępu do składowej.

W przykładzie z pliku
[point_2d/point_2d.cc](/podstawy-programowania/examples/10/point_2d/point_2d.cc)
metodami klasy `point_2d` są `get_x`, `get_y` oraz `distance_from_zero`. Widać
tutaj, że metody klasy definiuje się w sposób podobny do zwykłych funkcji,
aczkolwiek z pewnymi wyjątkami. Pierwszy jest raczej dość oczywisty — metoda
klasy należy do klasy, więc można zdefiniować ją wewnątrz definicji klasy. Drugi
wyjątek jest mniej oczywisty — metoda klasy może mieć kwalifikator `const`, co
będzie wyjaśnione dalej.

#### ▸ Metody klas z kwalifikatorem `const`

Przykład (pełny przykład znajduje się w pliku
[const/const.cc](/podstawy-programowania/examples/10/const/const.cc)):
```cpp
#include <iostream>

class counter
{
public:
  void increment() { ++n_; }
  void reset() { n_ = 0; }
  int get() const { return n_; }

private:
  int n_;
};

int
main()
{
  counter c{};
  for (int i = 0; i < 3; ++i) {
    c.increment();
    std::cout << c.get() << '\n';
  }
  c.reset();
  std::cout << c.get() << '\n';
}
```

Wynik działania przykładu:
> 1  
> 2  
> 3  
> 0

### Destruktory

Destruktor jest specjalną funkcją składową. Jest on wywoływany w momencie
zakończenia czasu istnienia obiektu, aby zwolnić zasoby zaalokowane ten przez
obiekt. Jeżeli klasa nie posiada zdefiniowanego destruktora może zostać on
wygenerowany przez kompilator (tzw. *definicja niejawna*). Destruktor
zdefiniowany niejawnie ma puste ciało.

Uwaga: W przypadku ręcznego zarządzania zasobami, destruktor nie powinien mieć
pustego ciała.

Nazwa destruktora jest nazwą klasy poprzedzoną znakiem tyldy (`~`).

Przykład (pełny przykład znajduje się w pliku
[destructor/destructor.cc](/podstawy-programowania/examples/10/destructor/destructor.cc)):
```cpp
#include <iostream>

class verbose
{
public:
  verbose() { std::cout << "Konstruktor\n"; }
  ~verbose() { std::cout << "Destruktor\n"; }
  void get() const { std::cout << "Metoda skladowa\n"; }
};

int
main()
{
  for (int i = 0; i < 3; ++i) {
    verbose v{};
    v.get();
  }
}
```
Wynik działania przykładu:
> Konstruktor  
> Metoda skladowa  
> Destruktor  
> Konstruktor  
> Metoda skladowa  
> Destruktor  
> Konstruktor  
> Metoda skladowa  
> Destruktor

### `this`

Wyrażenie `this` ma wartość równą adresowi obiektu, na rzecz którego wywoływana
jest funkcja składowa (z pewnymi wyjątkami, które na ten moment musimy pominąć).

Jeśli funkcja składowa posiada kwalifikator `const` wtedy wyrażenie `*this` jest
traktowane jako stałe.

Przykład (pełny przykład znajduje się w pliku
[this/this.cc](/podstawy-programowania/examples/10/this/this.cc)):
```cpp
#include <iostream>

class counter
{
public:
  counter& increment()
  {
    ++n_;
    return *this;
  }

  counter& reset()
  {
    n_ = 0;
    return *this;
  }

  int get() const { return n_; }

private:
  int n_;
};

int
main()
{
  counter c{};
  for (int i = 0; i < 3; ++i) {
    std::cout << c.increment().get() << '\n';
  }
  std::cout << c.reset().get() << '\n';
}
```

Wynik działania przykładu jest taki sam jak przykładu
[const/const.cc](/podstawy-programowania/examples/10/const/const.cc).

Uwaga: W tym momencie powinien być już zrozumiały przykład
[stack-cc/stack.cc](/podstawy-programowania/examples/01/stack-cc/stack.cc)
z początku kursu.

### Deklaracja przyjaźni

*Deklaracja przyjaźni* może wystąpić w ciele klasy. Umożliwia ona funkcji lub
innej klasie dostęp do prywatnych (i chronionych) składowych klasy.

Przykład (pełny przykład znajduje się w pliku
[friend/friend.cc](/podstawy-programowania/examples/10/friend/friend.cc)):
```cpp
#include <iostream>
#include <string>

class hello_kitty
{
public:
  hello_kitty(const std::string& text)
    : my_secret_{ "Hello, kitty! " + text + '\n' }
  {
  }

  friend std::ostream& operator<<(std::ostream& os, const hello_kitty& kitty);

private:
  std::string my_secret_;
};

std::ostream&
operator<<(std::ostream& os, const hello_kitty& kitty)
{
  os << kitty.my_secret_;
  return os;
}

int
main()
{
  hello_kitty kitty{ "I love milk too!" };
  std::cout << kitty; // Wywołanie funkcji operator<<.
}
```

Wynik działania przykładu:
> Hello, kitty! I love milk too!

## 11. Pliki

Obsługa plików ma wiele wspólnego z poznaną już w międzyczasie obsługą wejścia
(strumień `cin`) oraz wyjścia (strumień `cout`).

Plik nagłówkowy odpowiedzialny za obsługę plików to `fstream`:
```cpp
#include <fstream>
```

Klasy odpowiedzialne za obsługę strumieni plikowych to `std::ifstream`
(strumienie wejściowe), `std::ofstream` (strumienie wyjściowe) oraz
`std::fstream` (strumienie dwukierunkowe).

### Klasa `std::ifstream`

Przykład (pełny przykład znajduje się w pliku
[ifstream/ifstream.cc](/podstawy-programowania/examples/11/ifstream/ifstream.cc)):
```cpp
#include <fstream>
#include <iostream>

int
main()
{
  char c;
  std::ifstream file{ "ifstream.cc" };
  while (file >> std::noskipws >> c) {
    std::cout << c;
  }
}
```

Uwaga: W powyższym przykładzie konstruktor `std::ifstream` otwiera plik
`ifstream.cc` do odczytu (tzn. z obiektu `file` można teraz korzystać podobnie
jak z obiektu `cin`) a destruktor wywołany automatycznie przed zakończeniem
funkcji `main` zamyka ten plik. Program działa poprawnie ponieważ plik
`ifstream.cc` znajduje się w bieżącym katalogu. Funkcja `std::noskipws`
umożliwia wczytanie białych znaków (takich jak znak spacji).

Wynikiem działania przykładu jest wypisanie kodu źródłowego programu przykładu.

Obiekt strumienia plikowego (nie tylko `std::ifstream`) w kontekście logicznym
zwraca wartość logiczną, która informuje czy strumień nadaje się do operacji
wejścia/wyjścia.

### Klasa `std::ofstream`

Przykład (pełny przykład znajduje się w pliku
[ofstream/ofstream.cc](/podstawy-programowania/examples/11/ofstream/ofstream.cc)):
```cpp
#include <ctime>
#include <fstream>

int
main()
{
  std::ofstream file{ "time.txt" };
  file << std::time(nullptr) << '\n';
}
```

Uwaga: W powyższym przykładzie plik `time.txt` nie musi istnieć w bieżącym
katalogu, aby program działał poprawnie. Jeśli taki plik istnieje to jego
zawartość zostanie nadpisana co można sprawdzić uruchamiając wielokrotnie
program i sprawdzając zawartość pliku wynikowego.

Wynikiem działania przykładu jest plik wyjściowy z bieżącym czasem (zob. punkt
*Notes* na stronie dokumentacji funkcji
[std::time](https://en.cppreference.com/w/cpp/chrono/c/time)).

### Klasa `std::fstream`

Klasa `std::fstream` łączy własności klas `std::ifstream` oraz `std::ofstream`
umożliwiając obsługę wejścia/wyjścia plikowego.

### Tryby otwarcia pliku

  * `in` — otwiera do plik do odczytu (domyślne zachowanie `std::ifstream`)
  * `out` — otwiera plik do zapisu (domyślne zachowanie `std::ofstream`)
  * `binary` — otwiera plik w trybie binarnym
  * `app`, `ate` — przechodzi do końca strumienia odpowiednio przed każdym
     zapisem (dla `app`) lub bezpośrednio po otwarciu (dla `ate`)
  * `trunc` — pomija zawartość strumienia w momencie otwarcia

Poniżej znajduje się lekko zmodyfikowany program jednego z wcześniejszych
przykładów.

Przykład (pełny przykład znajduje się w pliku
[ios-app/ios-app.cc](/podstawy-programowania/examples/11/ios-app/ios-app.cc)):
```cpp
#include <ctime>
#include <fstream>

int
main()
{
  std::ofstream file{ "time.txt", std::ios::out | std::ios::app };
  file << std::time(nullptr) << '\n';
}
```

Tym razem wynikiem działania przykładu jest dodawanie do końca stworzonego pliku
wyjściowego nowej informacji o czasie.

### Tryb binarny

Przykład (pełny przykład znajduje się w pliku
[binary/binary.cc](/podstawy-programowania/examples/11/binary/binary.cc)):
```cpp
#include <fstream>
#include <iostream>
#include <string>

void
encode_to_binary_file(const std::string& filename, int value)
{
  std::ofstream file{ filename, std::ios::binary };
  file.write(reinterpret_cast<const char*>(&value), sizeof(value));
}

int
decode_from_binary_file(const std::string& filename)
{
  std::ifstream file{ filename, std::ios::binary };
  int n;
  file.read(reinterpret_cast<char*>(&n), sizeof(n));
  return n;
}

int
main()
{
  const std::string file{ "file.bin" };
  encode_to_binary_file(file, 42);
  std::cout << decode_from_binary_file(file) << '\n';
}
```

Wynik działania przykładu:
> 42

Poza wypisaniem na standardowy strumień wyjściowy wynikiem działania programu
jest też stworzenie pliku binarnego zawierającego binarną reprezentację liczby
42 w systemie kodowania odpowiednim dla maszyny, na którym program został
uruchomiony.

Uwaga: Operator `reinterpret_cast` w powyższym przykładzie służy do *paronomazji
typów* (*type punning*) i jest potencjalnie niebezpieczny — paronomazja może
wieść do naruszenia *ścisłych zasad aliasowania* (*strict aliasing rule*).

### Wskaźniki strumienia

Strumień wejścia/wyjścia posiada dwa wskaźniki:
  * wejścia `g` (*get*)
  * wyjścia `p` (*put*)

Do obsługi wskaźników wejścia/wyjścia można wykorzystać metody odczytujące
(`tellg`, `tellp`) oraz ustawiające pozycję wskaźnika (`seekg`, `seekp`).

Przykład (pełny przykład znajduje się w pliku
[size/size.cc](/podstawy-programowania/examples/11/size/size.cc)):
```cpp
#include <fstream>
#include <iostream>
#include <string>

std::streamsize
file_size(const std::string& filename)
{
  // Uwaga: Lepiej jest korzystać ze strumienia wejściowego std::ifstream
  // aniżeli ze strumienia wyjściowego std::ofstream do pomiaru rozmiaru pliku.
  // Czy wiesz dlaczego?
  std::ifstream file{ filename };
  file.seekg(0, std::ios::end); // Ustawienie wskaźnika wejściowego.
  return file.tellg();          // Pobranie pozycji wskaźnika wejściowego.
}

int
main()
{
  std::cout << "Rozmiar pliku: " << file_size("size.cc") << '\n';
}
```

Wynik działania przykładu:
> Rozmiar pliku: 564

Jest to prawidłowy rozmiar pliku w bajtach.

## 12. Szablony

Szablony są funkcjonalnością języka C++ umożliwiającą tworzenie m.in. rodzin
klas lub funkcji.

Uwaga: Szablony C++ są mechanizmem czasu kompilacji kompletnym w sensie Turinga.
Oznacza to, że można z ich użyciem symulować dowolną maszynę Turinga i w efekcie
wykonać dowolne jej obliczenia (por. hipotezę Churcha-Turinga) już w trakcie
kompilacji.

Uwaga: W przypadku podziału programu komputerowego na pliki nagłówkowe
i implementacji, szablony są umieszczane w plikach nagłówkowych.

Szablony służą do realizacji stylu generycznego, którego przykład w języku
Object Pascal
([sort-pas/sort.pas](/podstawy-programowania/examples/01/sort-pas/sort.pas))
widzieliśmy już na początku kursu. Zobaczmy odpowiednik tego przykładu napisany
w języku C++.

### Szablony funkcji

Przykład (pełny przykład znajduje się w pliku
[sort/sort.cc](/podstawy-programowania/examples/12/sort/sort.cc)):
```cpp
#include <algorithm>
#include <cstddef>
#include <iostream>
#include <iterator>

template<typename T>
void
sort(T* a, std::size_t n)
{
  do {
    std::size_t new_n = 0;
    for (std::size_t i = 1; i < n; ++i) {
      if (a[i - 1] > a[i]) {
        std::swap(a[i - 1], a[i]);
        new_n = i;
      }
    }
    n = new_n;
  } while (n > 0);
}

template<typename T>
void
print_array(std::ostream& os, T* a, std::size_t n)
{
  for (std::size_t i = 0; i < n; ++i) {
    os << a[i] << ' ';
  }
  os << '\n';
}

int
main()
{
  int tab0[] = { 0, 7, 3, 42, 12, 100, 50 };
  print_array(std::cout, tab0, std::size(tab0));
  sort(tab0, std::size(tab0));
  print_array(std::cout, tab0, std::size(tab0));

  std::string tab1[] = { "fonon",  "plazmon",  "ekscyton", "polaryton",
                         "dziura", "elektron", "foton" };
  print_array(std::cout, tab1, std::size(tab1));
  sort(tab1, std::size(tab1));
  print_array(std::cout, tab1, std::size(tab1));
}
```

Wynik działania przykładu:
> 0 7 3 42 12 100 50   
> 0 3 7 12 42 50 100   
> fonon plazmon ekscyton polaryton dziura elektron foton   
> dziura ekscyton elektron fonon foton plazmon polaryton 

Przyjrzyjmy się wywołaniu funkcji sortujących (a dokładniej ich specjalizacji
szablonu funkcji). Okazuje się, że prawidłowymi byłyby również wywołania:
```cpp
  sort<int>(tab0, std::size(tab0));
```
lub:
```cpp
  sort<>(tab1, std::size(tab1));
```
Oznacza to, że w składni języka C++ istnieją trzy sposoby na odwołanie się do
szablonu (nie tylko zresztą funkcji):
  * `nazwa_szablonu<lista_parametrów>`
  * `nazwa_szablonu<>`
  * `nazwa_szablonu`

Ostatnia forma jest najkrótsza w związku z tym najbardziej korzystna, ale nie
zawsze jest możliwa do zastosowania (ponieważ może zawieść dedukcja typów).
W takich sytuacjach przydatna jest pierwsza forma, gdzie *explicite* podaje się
wszystkie typy specjalizacji. Drugą formę (z pustymi nawiasami ostrymi) na ten
moment pozostawimy, ponieważ jest ona najbardziej przydatna w zaawansowanym
metaprogramowaniu.

Uwaga: Nazwę typu wykorzystanego w szablonie można użyć w ciele funkcji
szablonowej dokładnie tak samo jak nazwy zwykłych typów:
```cpp
template<typename T>
void
swap(T& a, T& b)
{
  T temp = a;
  a = b;
  b = temp;
}
```

### Szablony klas

Przykład (pełny przykład znajduje się w pliku
[counted_proxy/counted_proxy.cc](/podstawy-programowania/examples/12/counted_proxy/counted_proxy.cc)):
```cpp
#include <cassert>
#include <cstddef>
#include <string>

template<typename T>
class counted_proxy
{
public:
  counted_proxy(const T& t)
    : t_{ t }
    , counter_{ 0 }
  {
  }

  T get() const
  {
    ++counter_;
    return t_;
  }

  counted_proxy& set(const T& t)
  {
    counter_ = 0;
    t_ = t;
    return *this;
  }

  std::size_t get_counter() const { return counter_; }

private:
  T t_;
  mutable std::size_t counter_;
};

int
main()
{
  counted_proxy<std::string> cp{ "Piggy Bank" };
  assert(cp.get_counter() == 0);
  cp.get();
  assert(cp.get_counter() == 1);
  cp.set("Hello, kitty!");
  assert(cp.get_counter() == 0);
}
```

Uwaga: Instrukcja `assert(wyrażenie)` stwierdza, że `wyrażenie` ma wartość
`true`, co implikuje dalsze wykonanie programu. Gdyby jednak `wyrażenie` miało
wartość `false` to program kończy swoje wykonanie z błędem. Oznacza to, że:
```cpp
assert(true);
```
jest instrukcją, przez którą program przechodzi bezbłędnie. Natomiast:
```cpp
assert(false);
```
jest instrukcją, która spowoduje zakończenie programu z błędem. Asercje
są elementem *defensywnego* stylu programowania, służacego do wczesnego
wyłapywania błędów. Służą one jako podstawa *automatycznych testów
jednostkowych*. Na przykład, dla programu:
```cpp
#include <cassert>

int
main()
{
  const double a = 0.5;
  assert(a + a == 1.0);

  const double b = 0.1;
  assert(3 * b == 0.3);
}
```
można otrzymać na wyjściu:
> a.out: example.cc:10: int main(): Assertion `3 * b == 0.3' failed.  
> Przerwane (zrzut pamięci)

Uwaga: Programista, który lubi asercje, ma więcej wolnego czasu.

### Parametry szablonów niebędące typami

Parametrem szablonu może być również, z pewnymi ograniczeniami, argument
niebędący typem.

Przykład (pełny przykład znajduje się w pliku
[array/array.cc](/podstawy-programowania/examples/12/array/array.cc)):
```cpp
#include <cassert>
#include <cstddef>

template<typename T, std::size_t N>
class array
{
public:
  T& operator[](std::size_t i)
  {
    check_bounds(i);
    return a_[i];
  }

  const T& operator[](std::size_t i) const
  {
    check_bounds(i);
    return a_[i];
  }

  std::size_t size() const { return N; }

private:
  void check_bounds(std::size_t i) const { assert(i < N); }

private:
  T a_[N] = {}; // Kompilator wygeneruje konstruktor za nas i zainicjuje tablicę
                // domyślną wartością dla T…
};

class test
{
public:
  test()
    : x_{ 42 } // … która w tym przypadku jest równa 42.
  {
  }

  int get() const { return x_; }
  void set(int x) { x_ = x; }

private:
  int x_;
};

int
main()
{
  array<test, 7> a{};
  assert(a.size() == 7);
  assert(a[3].get() == 42);
  a[3].set(100);
  assert(a[3].get() == 100);
}
```

## 13. Funkcje lambda

*Funkcja lambda* (nazywana też *funkcją anonimową*) jest funkcją, która nie
posiada nazwy.

Funkcje lambda są elementem rachunku lambda zapoczątkowanego przez Alonzo
Churcha i stanowią istotny element programowania funkcyjnego (Alonzo Church,
Haskell Curry).

Uwaga: Rachunek $`\lambda`$ może zostać bardzo zwięźle sformułowany w notacji
BNF. Można to zobaczyć np. na stronie
<https://www.cs.cornell.edu/courses/cs3110/2008fa/recitations/rec26.html>.

W języku C++ funkcje lambda mają bardzo szerokie możliwości. Dlatego na ten
moment skoncentrujemy się wyłącznie na wybranych aspektach.

Pusta funkcja lambda to `[]() {}`. Niczego ona nie robi. Możemy to zobaczyć
w poniższym przykładzie, gdzie została ona wywołana:
```cpp
int
main()
{
  []() {}();
}
```
Instrukcja `[]() {}();` składa się z funkcji lambda `[]() {}`, która została
wywołana z użyciem operatora nawiasy okrągłe `()` leżącego bezpośrednio przed
znakiem średnika.

Pusta funkcja lambda nie jest szczególnie użyteczna. Zobaczmy więc funkcję,
która przyjmuje argument i go zwraca (w tym przypadku do systemu operacyjnego):
```cpp
int
main()
{
  auto f = [](int x) { return x; };
  return f(0);
}
```

Uwaga: W powyższym przykładzie wykorzystano dedukcję typów `auto`, której
omówienie nie wchodzi w skład niniejszego kursu. Wystarczy założyć na ten
moment, że słowem `auto` można zastąpić sekwencją specyfikatorów w instrukcji
prostej deklaracji zmiennej. A więc, zamiast np. `int i = 42;` można napisać
`auto i = 42;` i typ `i` zostanie wydedukowany na podstawie wartości, którą
została zainicjowana zmienna `i`. Użycie `auto` w przypadku funkcji lambda jest
konieczne, ponieważ każda funkcja lambda ma swój własny unikalny typ.

W powyższym przykładzie wyrażenie lambda zostało przypisane do zmiennej `f`, po
czym zmienną tą można wykorzystać tak jak zwykłą funkcję, tzn. wywołać z użyciem
operatora nawiasy okrągłe.

Zastanówmy się, gdzie funkcje lambda mogą się przydać. W tym celu korzystajmy
z omówionego wcześniej przy okazji szablonów przykładu z sortowaniem.

Przykład (pełny przykład znajduje się w pliku
[sort/sort.cc](/podstawy-programowania/examples/13/sort/sort.cc)):
```cpp
#include <algorithm>
#include <cstddef>
#include <iostream>
#include <iterator>

template<typename T, typename Comp>
void
sort(T* a, std::size_t n, Comp comp)
{
  do {
    std::size_t new_n = 0;
    for (std::size_t i = 1; i < n; ++i) {
      if (comp(a[i - 1], a[i])) {
        std::swap(a[i - 1], a[i]);
        new_n = i;
      }
    }
    n = new_n;
  } while (n > 0);
}

template<typename T>
void
print_array(std::ostream& os, T* a, std::size_t n)
{
  for (std::size_t i = 0; i < n; ++i) {
    os << a[i] << ' ';
  }
  os << '\n';
}

int
main()
{
  int tab[] = { 0, 7, 3, 42, 12, 100, 50 };
  print_array(std::cout, tab, std::size(tab));
  sort(tab, std::size(tab), [](int a, int b) { return a > b; });
  print_array(std::cout, tab, std::size(tab));
  sort(tab, std::size(tab), [](int a, int b) { return a < b; });
  print_array(std::cout, tab, std::size(tab));
}
```

Wynik działania przykładu:
> 0 7 3 42 12 100 50   
> 0 3 7 12 42 50 100   
> 100 50 42 12 7 3 0 

Podobną funkcjonalność można osiągnąć stosując zwykłe funkcje lub funktory
(struktury ze zdefiniowaną funkcją składową `operator()`). Jednak obydwa
rozwiązania są zazwyczaj znacznie dłuższe aniżeli zastosowanie funkcji lambda.

## 14. Biblioteka standardowa

Biblioteka standardowa języka C++ (*C++ Standard Library*) jest kolekcją
funkcjonalności (przede wszystkim szablonów klas i funkcji) napisanych w języku
C++ (a dokładniej z użyciem jego „centralnej” części) i umieszczonych
w standardzie języka.

### Pliki nagłówkowe biblioteki standardowej języka C++

Funkcjonalność biblioteki standardowej jest podzielona na pliki nagłówkowe,
których lista znajduje się poniżej. W nawiasach okrągłych podano standard języka
C++, w którym wprowadzono dany plik nagłówkowy z ewentualną informacją
„przestarzałe” lub „usunięte” oraz informacją czy funkcjonalność jest narzędziem
zaczerpniętym z języka C.

Pliki nagłówkowe języka C++:
  * `<algorithm>` (C++98)
  * `<any>` (C++17)
  * `<array>` (C++11)
  * `<atomic>` (C++11)
  * `<barrier>` (C++20)
  * `<bit>` (C++20)
  * `<bitset>` (C++98)
  * `<cassert>` (C++98, narzędzia języka C)
  * `<ccomplex>` (C++11, przestarzałe w C++17, usunięte w C++20)
  * `<cctype>` (C++98, narzędzia języka C)
  * `<cerrno>` (C++98, narzędzia języka C)
  * `<cfenv>` (C++11, narzędzia języka C)
  * `<cfloat>` (C++98, narzędzia języka C)
  * `<charconv>` (C++17)
  * `<chrono>` (C++11)
  * `<cinttypes>` (C++11, narzędzia języka C)
  * `<ciso646>` (C++98, usunięte w C++20)
  * `<climits>` (C++98, narzędzia języka C)
  * `<clocale>` (C++98, narzędzia języka C)
  * `<cmath>` (C++98, narzędzia języka C)
  * `<codecvt>` (C++11, przestarzałe w C++17)
  * `<compare>` (C++20)
  * `<complex>` (C++98)
  * `<concepts>` (C++20)
  * `<condition_variable>` (C++11)
  * `<coroutine>` (C++20)
  * `<csetjmp>` (C++98, narzędzia języka C)
  * `<csignal>` (C++98, narzędzia języka C)
  * `<cstdalign>` (C++11, przestarzałe w C++17, usunięte w C++20)
  * `<cstdarg>` (C++98, narzędzia języka C)
  * `<cstdbool>` (C++11, przestarzałe w C++17, usunięte w C++20)
  * `<cstddef>` (C++98, narzędzia języka C)
  * `<cstdint>` (C++11, narzędzia języka C)
  * `<cstdio>` (C++98, narzędzia języka C)
  * `<cstdlib>` (C++98, narzędzia języka C)
  * `<cstring>` (C++98, narzędzia języka C)
  * `<ctgmath>` (C++11, przestarzałe w C++17, usunięte w C++20)
  * `<ctime>` (C++98, narzędzia języka C)
  * `<cuchar>` (C++11, narzędzia języka C)
  * `<cwchar>` (C++98, narzędzia języka C)
  * `<cwctype>` (C++98, narzędzia języka C)
  * `<deque>` (C++98)
  * `<exception>` (C++98)
  * `<execution>` (C++17)
  * `<filesystem>` (C++17)
  * `<format>` (C++20)
  * `<forward_list>` (C++11)
  * `<fstream>` (C++98)
  * `<functional>` (C++98)
  * `<future>` (C++11)
  * `<initializer_list>` (C++11)
  * `<iomanip>` (C++98)
  * `<ios>` (C++98)
  * `<iosfwd>` (C++98)
  * `<iostream>` (C++98)
  * `<istream>` (C++98)
  * `<iterator>` (C++98)
  * `<latch>` (C++20)
  * `<limits>` (C++98)
  * `<list>` (C++98)
  * `<locale>` (C++98)
  * `<map>` (C++98)
  * `<memory>` (C++98)
  * `<memory_resource>` (C++17)
  * `<mutex>` (C++11)
  * `<new>` (C++98)
  * `<numbers>` (C++20)
  * `<numeric>` (C++98)
  * `<optional>` (C++17)
  * `<ostream>` (C++98)
  * `<queue>` (C++98)
  * `<random>` (C++11)
  * `<ranges>` (C++20)
  * `<ratio>` (C++11)
  * `<regex>` (C++11)
  * `<scoped_allocator>` (C++11)
  * `<semaphore>` (C++20)
  * `<set>` (C++98)
  * `<shared_mutex>` (C++14)
  * `<source_location>` (C++20)
  * `<span>` (C++20)
  * `<sstream>` (C++98)
  * `<stack>` (C++98)
  * `<stdexcept>` (C++98)
  * `<stop_token>` (C++20)
  * `<streambuf>` (C++98)
  * `<string>` (C++98)
  * `<string_view>` (C++17)
  * `<strstream>` (C++98)
  * `<syncstream>` (C++20)
  * `<system_error>` (C++11)
  * `<thread>` (C++11)
  * `<tuple>` (C++11)
  * `<typeindex>` (C++11)
  * `<typeinfo>` (C++98)
  * `<type_traits>` (C++11)
  * `<unordered_map>` (C++11)
  * `<unordered_set>` (C++11)
  * `<utility>` (C++98)
  * `<valarray>` (C++98)
  * `<variant>` (C++17)
  * `<vector>` (C++98)
  * `<version>` (C++20)

Funkcjonalność udostępniana przez ww. pliki nagłówkowe to w szczególności:
  * algorytmy (<https://en.cppreference.com/w/cpp/algorithm>)
  * iteratory (<https://en.cppreference.com/w/cpp/iterator>)
  * koncepty/*concepts* (<https://en.cppreference.com/w/cpp/concepts>)
  * kontenery (<https://en.cppreference.com/w/cpp/container>)
  * lokalizacja (<https://en.cppreference.com/w/cpp/locale>)
  * metaprogramowanie (<https://en.cppreference.com/w/cpp/meta>)
  * napisy (<https://en.cppreference.com/w/cpp/string>)
  * narzędzia (<https://en.cppreference.com/w/cpp/utility>)
  * obliczenia numeryczne (<https://en.cppreference.com/w/cpp/numeric>)
  * obsługa błędów (<https://en.cppreference.com/w/cpp/error>)
  * system plików (<https://en.cppreference.com/w/cpp/filesystem>)
  * wejscie/wyjście (<https://en.cppreference.com/w/cpp/io>)
  * współbieżność (<https://en.cppreference.com/w/cpp/thread>)
  * wyrażenia regularne (<https://en.cppreference.com/w/cpp/regex>)
  * zakresy/*ranges* (<https://en.cppreference.com/w/cpp/ranges>)

### Kontenery

Kontenery biblioteki standardowej języka C++ można podzielić na dwie grupy:
  * kontenery sekwencyjne (`std::array`, `std::deque`, `std::forward_list`,
    `std::list`, `std::vector`)
  * kontenery asocjacyjne (`std::map` oraz `std::multiset`, `std::set` oraz
    `std::multimap`)
  * nieuporządkowane kontenery asocjacyjne (`std::unordered_map` oraz
    `std::unordered_multimap`, `std::unordered_set` oraz
    `std::unordered_multiset`)

Kontener sekwencyjny to taki, który samodzielnie nie zmienia kolejności
wstawionych elementów. Kontener asocjacyjny może zmieniać kolejność elementów.

#### ▸ `std::vector` (kontener sekwencyjny)

Uwaga: Kontener sekwencyjny `std::vector` został już omówiony wcześniej.

#### ▸ `std::set` (kontener asocjacyjny)

Przykład (pełny przykład znajduje się w pliku
[set/set.cc](/podstawy-programowania/examples/14/set/set.cc)):
```cpp
#include <iostream>
#include <random>
#include <set>

std::mt19937 engine{ std::random_device{}() };

int
random(int a, int b)
{
  return std::uniform_int_distribution<int>{ a, b }(engine);
}

int
main()
{
  std::set<int> numbers;

  for (int i = 0; i < 10; ++i) {
    const int draw = random(0, 100);
    std::cout << "Wylosowano liczbe " << draw << ".\n";
    numbers.insert(draw);
  }

  std::cout << "Zawartosc kontenera set: ";
  for (auto x : numbers) {
    std::cout << x << ' ';
  }
  std::cout << std::endl;
}
```

Wynik działania przykładu:
> Wylosowano liczbe 11.  
> Wylosowano liczbe 39.  
> Wylosowano liczbe 90.  
> Wylosowano liczbe 64.  
> Wylosowano liczbe 93.  
> Wylosowano liczbe 48.  
> Wylosowano liczbe 30.  
> Wylosowano liczbe 93.  
> Wylosowano liczbe 42.  
> Wylosowano liczbe 41.  
> Zawartosc kontenera set: 11 30 39 41 42 48 64 90 93 

Uwaga: Wynik działania powyższego przykładu może różnić się pomiędzy
poszczególnymi wywołaniami programu.

Uwaga: `std::multiset` jest podobny do kontenera `std::set` z tą różnicą, że
`std::multiset` zezwala na wielokrotne wystąpienia klucza o tej samej wartości.

Uwaga: Kontenery `std::unordered_set` oraz `std::unordered_multiset` są
odpowiednikami odpowiednio kontenerów `std::set` oraz `std::multiset` z tą
różnicą, że `std::unordered_set` oraz `std::unordered_multiset` nie zachowują
porządku sortowania.

#### ▸ `std::map` (kontener asocjacyjny)

Przykład (pełny przykład znajduje się w pliku
[map/map.cc](/podstawy-programowania/examples/14/map/map.cc)):
```cpp
#include <iostream>
#include <map>
#include <string>

int
main()
{
  std::map<char, unsigned int> counter;
  std::string str{ "Hello, kitty! I love milk too!" };
  for (char c : str) {
    counter[c]++;
  }
  for (auto pair : counter) {
    std::cout << "Znak: " << pair.first << " Liczba wystapien: " << pair.second
              << '\n';
  }
}
```

Wynik działania przykładu:
> Znak: &nbsp; Liczba wystapien: 5  
> Znak: ! Liczba wystapien: 2  
> Znak: , Liczba wystapien: 1  
> Znak: H Liczba wystapien: 1  
> Znak: I Liczba wystapien: 1  
> Znak: e Liczba wystapien: 2  
> Znak: i Liczba wystapien: 2  
> Znak: k Liczba wystapien: 2  
> Znak: l Liczba wystapien: 4  
> Znak: m Liczba wystapien: 1  
> Znak: o Liczba wystapien: 4  
> Znak: t Liczba wystapien: 3  
> Znak: v Liczba wystapien: 1  
> Znak: y Liczba wystapien: 1

Uwaga: W powyższym przykładzie typem klucza jest `char` a typem wartości jest
`unsigned int`. W kontenerze `std::map` klucze nie mogą się powtarzać.

Uwaga: Poza kontenerem `std::map` istnieją też `std::multimap`, `unordered_map`
oraz `unordered_multimap`.

### Algorytmy

Przykład (pełny przykład znajduje się w pliku
[algorithm/algorithm.cc](/podstawy-programowania/examples/14/algorithm/algorithm.cc)):
```cpp
#include <algorithm>
#include <cassert>
#include <iostream>
#include <random>
#include <vector>

std::mt19937 engine{ std::random_device{}() };

template<typename C>
void
print_container(std::ostream& os, const std::string& str, const C& c)
{
  os << str << ": ";
  std::for_each(c.begin(), c.end(), [&](auto x) { os << x << ' '; });
  os << '\n';
}

int
main()
{
  const std::size_t sz = 10;
  std::vector<int> v(sz);
  assert(v.size() == sz);
  print_container(std::cout, "Poczatkowa zawartosc kontenera", v);

  std::generate(v.begin(), v.end(), []() {
    return std::uniform_int_distribution<int>{ 0, 9 }(engine);
  });
  print_container(std::cout, "Kontener po losowaniu zawartosci", v);

  if (std::any_of(v.begin(), v.end(), [](auto x) { return x % 2 == 0; })) {
    std::cout << "W kontenerze jest co najmniej jeden element parzysty.\n";
  } else {
    std::cout << "W kontenerze nie ma elementow parzystych.\n";
  }

  std::cout << "Liczba elementow podzielnych przez 3: "
            << std::count_if(
                 v.begin(), v.end(), [](auto x) { return x % 3 == 0; })
            << '\n';

  std::cout << "Minimum: " << *std::min_element(v.begin(), v.end()) << '\n';
  std::cout << "Maksimum: " << *std::max_element(v.begin(), v.end()) << '\n';

  std::reverse(v.begin(), v.end());
  print_container(std::cout, "Kontener po odwroceniu zawartosci", v);

  std::partition(v.begin(), v.end(), [](auto x) { return x % 2 == 0; });
  print_container(std::cout, "Kontener po partycjonowaniu (parzystosc)", v);

  std::sort(v.begin(), v.end());
  print_container(std::cout, "Kontener po sortowaniu", v);

  std::shuffle(v.begin(), v.end(), engine);
  print_container(std::cout, "Kontener po losowej zmianie kolejnosci", v);
}
```

> Poczatkowa zawartosc kontenera: 0 0 0 0 0 0 0 0 0 0   
> Kontener po losowaniu zawartosci: 7 4 9 2 8 8 8 2 6 2   
> W kontenerze jest co najmniej jeden element parzysty.  
> Liczba elementow podzielnych przez 3: 2  
> Minimum: 2  
> Maksimum: 9  
> Kontener po odwroceniu zawartosci: 2 6 2 8 8 8 2 9 4 7   
> Kontener po partycjonowaniu (parzystosc): 2 6 2 8 8 8 2 4 9 7   
> Kontener po sortowaniu: 2 2 2 4 6 7 8 8 8 9   
> Kontener po losowej zmianie kolejnosci: 9 8 6 2 4 8 7 8 2 2 

Uwaga: `std::for_each` aplikuje dany obiekt funkcyjny do każdego elemenentu
wskazywanego przez zakres.

Uwaga: `std::generate` przypisuje każdemu elementowi zakresu wynik otrzymany
przez dany obiekt funkcyjny.

Uwaga: (i) `std::all_of`, (ii) `std::any_of`, (iii) `std::none_of` sprawdzają
czy predykat podany jako obiekt funkcyjny jest spełniony dla odpowiednio
(i) wszystkich, (ii) co najmniej jednego lub (iii) żadnego elementu zakresu.

Uwaga: (i) `std::count` oraz (ii) `std::count_if` zliczają elementy zakresu
odpowiednio (i) równe danemu lub (ii) spełniające warunek dany przez obiekt
funkcyjny.

Uwaga: `std::max_element` oraz `std::min_element` zwracają iterator (uogólniony
wskaźnik) do pierszego odpowiednio największego i najmniejszego elementu
w zakresie.

Uwaga: `std::reverse` odwraca kolejność elementów w zakresie.

Uwaga: `std::partition` zmienia kolejność elementów w zakresie w taki sposób,
aby elementy spełniające predykat dany przez obiekt funkcyjny znalazły się przed
pozostałymi elementami.

Uwaga: `std::sort` sortuje elementy w zakresie w porządku niemalejącym.
W przeszłości `std::sort` był implementowany z użyciem algorytmu *Quicksort*,
który jest wydajnym sposobem sortowania. Jednak dzięki postępowi w algorytmice
zasadnym była zmiana implementacji `std::sort` na jeszcze wydajnieszą hybrydową
metodę sortowania *Introsort*.
O ile nie ma się uzasadnionego powodu to we własnych programach warto
stosować `std::sort`. Przytaczany w skrypcie algorytm sortowania bąbelkowego ma
wartość dydaktyczną, ale nie jest wydajny i dlatego nie należy go stosować
w profesjonalny rozwiązaniach programistycznych.

Uwaga: `std::shuffle` zmienia kolejność elementów w zakresie w sposób losowy.

### Obliczenia numeryczne

Uwaga: Materiał z podpunktu *Obliczenia numeryczne* nie wchodzi w skład egzaminu
końcowego.

TODO: `std::valarray`, `std::accumulate`, `std::inner_product`,
`std::adjacent_difference`, `std::partial_sum`, `std::reduce`,
`std::transform_reduce`, `<cmath>`, `<numbers>`, `<random>`, `std::complex`

## Dodatki

Uwaga: Materiał z *Dodatków* nie wchodzi w skład egzaminu końcowego.

### Problem skoczka szachowego

Poniżej znajduje się rozwiązanie problemu skoczka szachowego z wykorzystaniem
rekurencji oraz programowania obiektowego.

Sformułowanie problemu skoczka szachowego można znaleźć np. na stronie
<https://en.wikipedia.org/wiki/Knight's_tour>.

Uwaga: Dla niewielkiego uproszczenia przyjęto w rozwiązaniu, że skoczek
rozpoczyna swoją drogę w jednym z wierzchołków szachownicy.

Przykład (pełny przykład znajduje się w pliku
[knights-tour/knights-tour.cc](/podstawy-programowania/examples/appendix/knights-tour/knights-tour.cc)):
```cpp
#include <cassert>
#include <cstddef>
#include <fstream>
#include <iomanip>
#include <vector>

class knights_tour_problem
{
  using row_t = std::vector<int>;
  using chessboard_t = std::vector<row_t>;
  using solutions_t = std::vector<chessboard_t>;

public:
  explicit knights_tour_problem(int size)
    : size_{ size }
  {
  }

  bool solved() const { return solved_; }

  knights_tour_problem& find_all_solutions()
  {
    if (!solved_) {
      search(1, 0, 0);
      solved_ = true;
    }
    return *this;
  }

  std::ostream& print_all_solutions(std::ostream& os) const
  {
    assert(solved());
    if (!solutions_.size()) {
      os << "\nBrak rozwiazan\n";
    } else {
      for (std::size_t i = 0; i < solutions_.size(); ++i) {
        print_solution(os << '\n', i);
      }
    }
    return os << std::flush;
  }

private:
  // Rekurencyjne rozwiązanie problemu skoczka szachowego.
  void search(int move, int i, int j) const
  {
    const int nd = 8;
    const int delta_i[nd] = { -2, -2, -1, -1, +1, +1, +2, +2 };
    const int delta_j[nd] = { -1, +1, -2, +2, -2, +2, -1, +1 };

    board_[i][j] = move;
    if (is_solution()) {
      solutions_.push_back(board_);
    } else {
      for (int k = 0; k < nd; ++k)
        if (is_on_board(i + delta_i[k], j + delta_j[k]) &&
            !was_visited(i + delta_i[k], j + delta_j[k]))
          search(move + 1, i + delta_i[k], j + delta_j[k]);
    }
    board_[i][j] = 0; // Zastosowanie techniki wycofywania (ang. backtracking).
    return;
  }

  bool is_solution() const
  {
    for (int i = 0; i < size_; i++)
      for (int j = 0; j < size_; j++)
        if (!board_[i][j])
          return false;
    return true;
  }

  std::ostream& print_solution(std::ostream& os, std::size_t number) const
  {
    auto& board = solutions_[number];
    os << "Rozwiazanie #" << number + 1;
    for (int i = 0; i < size_; i++) {
      os << '\n';
      for (int j = 0; j < size_; j++) {
        os << std::setw(2) << board[i][j] << ' ';
      }
    }
    return os << '\n';
  }

  bool is_on_board(int pos_i, int pos_j) const
  {
    return pos_i >= 0 && pos_i < size_ && pos_j >= 0 && pos_j < size_;
  }

  bool was_visited(int i, int j) const { return board_[i][j] > 0; }

private:
  int size_;
  mutable chessboard_t board_ = { static_cast<std::size_t>(size_),
                                  row_t(static_cast<std::size_t>(size_), 0) };
  mutable solutions_t solutions_ = {};
  bool solved_ = false;
};

std::ostream&
operator<<(std::ostream& os, const knights_tour_problem& rhs)
{
  rhs.print_all_solutions(os);
  return os;
}

int
main()
{
  std::ofstream file{ "solutions.txt" };
  for (int i = 1; i < 6; ++i) {
    file << "> Szachownica " << i << " x " << i << std::endl
         << knights_tour_problem{ i }.find_all_solutions() << std::endl;
  }
}
```

## Bibliografia

Wolfgang Bangerth. *MATH 676: Finite element methods in scientific computing*.
<https://www.math.colostate.edu/~bangerth/videos.html>.

Cornell University. *CS 3110. Data Structures and Functional Programming*.
<https://www.cs.cornell.edu/courses/cs3110/>.

cppreference.com:
  * <https://en.cppreference.com/w/cpp/language/history>
  * <https://en.cppreference.com/w/cpp/language/statements>
  * <https://en.cppreference.com/w/cpp/language/expressions>
  * <https://en.cppreference.com/w/cpp/language/if>
  * <https://en.cppreference.com/w/cpp/language/switch>
  * <https://en.cppreference.com/w/cpp/language/declarations>
  * <https://en.cppreference.com/w/cpp/language/types>
  * <https://en.cppreference.com/w/cpp/container/vector>
  * <https://en.cppreference.com/w/cpp/language/functions>
  * <https://en.cppreference.com/w/cpp/language/function>
  * <https://en.cppreference.com/w/cpp/language/scope>
  * <https://en.cppreference.com/w/cpp/language/pointer>
  * <https://en.cppreference.com/w/cpp/language/reference>
  * <https://en.cppreference.com/w/cpp/language/classes>
  * <https://en.cppreference.com/w/cpp/language/class>
  * <https://en.cppreference.com/w/cpp/language/access>
  * <https://en.cppreference.com/w/cpp/language/constructor>
  * <https://en.cppreference.com/w/cpp/language/member_functions>
  * <https://en.cppreference.com/w/cpp/language/destructor>
  * <https://en.cppreference.com/w/cpp/language/this>
  * <https://en.cppreference.com/w/cpp/language/friend>
  * <https://en.cppreference.com/w/cpp/header/fstream>
  * <https://en.cppreference.com/w/cpp/io/manip/skipws>
  * <https://en.cppreference.com/w/cpp/io/ios_base/openmode>
  * <https://en.cppreference.com/w/cpp/io/basic_istream/tellg>
  * <https://en.cppreference.com/w/cpp/io/basic_ostream/tellp>
  * <https://en.cppreference.com/w/cpp/io/basic_istream/seekg>
  * <https://en.cppreference.com/w/cpp/io/basic_ostream/seekp>
  * <https://en.cppreference.com/w/cpp/language/templates>
  * <https://en.cppreference.com/w/cpp/language/function_template>
  * <https://en.cppreference.com/w/cpp/language/class_template>
  * <https://en.cppreference.com/w/cpp/error/assert>
  * <https://en.cppreference.com/w/cpp/language/cv>
  * <https://en.cppreference.com/w/cpp/language/lambda>
  * <https://en.cppreference.com/w/cpp/container>
  * <https://en.cppreference.com/w/cpp/container/set>

Maurizio Gabbrielli & Simone Martini. *Programming Languages: Principles and
Paradigms*. Springer-Verlag London Limited, 2010. DOI:
[10.1007/978-1-84882-914-5](https://doi.org/10.1007/978-1-84882-914-5).

David Goldberg. *What Every Computer Scientist Should Know about Floating-Point
Arithmetic*. ACM Computing Surveys **23**, 5-48 (1991). DOI:
[10.1145/103162.103163](https://doi.org/10.1145/103162.103163).

Scott Meyers. <https://www.aristeia.com/>.

Bjarne Stroustrup. *A History of C++: 1979–1991*. History of Programming
Languages—II 699 (1996). DOI:
[10.1145/234286.1057836](https://doi.org/10.1145/234286.1057836).

Bjarne Stroustrup. *Bjarne Stroustrup's homepage*. <https://stroustrup.com/>.

Herb Sutter. *Sutter’s Mill. Herb Sutter on software development*.
<https://herbsutter.com/>.

Maciej Ślusarek, Przemysław Broniek, Grzegorz Gutowski, Jan Jeżabek. *Złożoność
obliczeniowa*. <https://wazniak.mimuw.edu.pl/>.

Ray Toal. *Classifying Programming Languages*.
<https://cs.lmu.edu/~ray/notes/pltypes/>.

Silicon Graphics Computer Systems, Inc. *Standard Template Library Programmer's
Guide*. <https://www.boost.org/sgi/stl/index.html>.

stackoverflow.com:
  * <https://stackoverflow.com/questions/98650/what-is-the-strict-aliasing-rule>

Tomasz R. Werner. *Programowanie 2. Język C++*.
<https://www.fuw.edu.pl/~werner/pmn/CPP_HTML/CPP.html>.

wikibooks.org:
  * <https://en.wikibooks.org/wiki/C%2B%2B_Programming>
  * <https://en.wikibooks.org/wiki/More_C%2B%2B_Idioms>

## Zastrzeżenia

Zobacz plik [LICENSE](/LICENSE).
