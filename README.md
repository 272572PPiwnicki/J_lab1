# 🎒 Unbounded Knapsack Problem Solver (Java)

Projekt konsolowej aplikacji w języku Java rozwiązującej **problem nieskończonego plecaka** (*Unbounded Knapsack Problem*) za pomocą algorytmu zachłannego.

---

## 📌 Informacje

- **Autor:** *Patryk Piwnicki*
- **Prowadzący:** mgr inż. Michał Jaroszczuk
- **Grupa:** [SR][17:05]
- **Data:** 14 maja 2025

---

## 🔧 Technologie

- Java 24 (OpenJDK 24.0.1)
- Maven
- JUnit 5
- IntelliJ IDEA

---

## ⚙️ Opis Działania

Program:
- Generuje instancję problemu na podstawie liczby przedmiotów i ziarna (seed) losowania.
- Wartości i wagi losowane są w przedziale **[1, 10]**.
- Sortuje przedmioty malejąco według stosunku **wartość/waga** (value/weight).
- **Można wielokrotnie wybierać te same przedmioty** (nieograniczona liczba sztuk).
- Dodaje najbardziej opłacalne przedmioty dopóki ich łączna waga nie przekracza zadanej pojemności.
- Zwraca sumaryczną wartość, wagę oraz indeksy wybranych przedmiotów.
![image](https://github.com/user-attachments/assets/0405bf68-6af3-4d16-814a-9d06212d1307)

---

## 🌲 Drzewo projektu

![image](https://github.com/user-attachments/assets/b9c8252f-f170-40a7-b0c2-da9c77980a4d)

---

## 🔍 Kluczowe klasy

- **Item** – przechowuje wartość, wagę oraz stosunek opłacalności (value/weight).
- **Problem** – generuje dane oraz rozwiązuje problem zachłannie (metoda `solve()`).
![image](https://github.com/user-attachments/assets/ff5ff5f5-1d1d-47bc-8999-e8a9fcac7ef3)

- **Result** – przechowuje wynik: łączną wartość, wagę oraz listę wybranych przedmiotów.
- **ProblemTest** – testy jednostkowe w JUnit5.

---

## ✅ Testy jednostkowe

Testy obejmują następujące funkcjonalności:
- Przynajmniej jeden przedmiot mieści się w plecaku.
- Żaden przedmiot się nie mieści przy za małej pojemności.
- Poprawność zakresu wylosowanych wag i wartości (1–10).
- Poprawność sumy wag i wartości dla znanego zestawu danych.

Testy zostały napisane w bibliotece **JUnit5**.
![image](https://github.com/user-attachments/assets/5a3d8ac8-c43d-4f8d-92d6-098f1249929a)
