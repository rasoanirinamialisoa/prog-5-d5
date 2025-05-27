# Coffee Machine – Java Project

Bienvenue dans le projet **Coffee Machine**, une application Java qui simule le fonctionnement d'une machine à café. L'utilisateur peut payer, choisir un café, et recevoir sa boisson.

---

## Carte Mentale (logique de base)


---

## Objectif

- Simuler le fonctionnement d'une machine à café en Java
- Gérer les interactions utilisateurs : paiement, sélection, distribution
- Gérer les erreurs et limitations (stock, choix, paiement)
- Offrir des pistes d'optimisation

---

## Cas d’Usage (Use Cases)

### UC1 – Payer
- **Acteur :** Utilisateur
- **Scénario :**
  - L'utilisateur insère 1 unité monétaire
  - Le paiement est validé par la machine

### UC2 – Choisir un café
- **Acteur :** Utilisateur
- **Scénario :**
  - L'utilisateur choisit une boisson :  
    - `C2` → Espresso  
    - `C3` → Latte  
    - `C4` → Cappuccino  
  - La machine vérifie la disponibilité des ingrédients

### UC3 – Obtenir le café
- **Acteur :** Utilisateur
- **Scénario :**
  - La machine prépare la boisson
  - L’utilisateur récupère le café

---

## Erreurs Possibles

| Code | Erreur | Description |
|------|--------|-------------|
| 101  | `InsufficientFundsError` | Paiement insuffisant |
| 102  | `InvalidSelectionError` | Boisson non reconnue |
| 103  | `OutOfIngredientsError` | Ingrédients manquants |
| 104  | `MachineError` | Erreur interne inconnue |

---

## Optimisations Envisagées

-  **Multithreading** pour préparer plusieurs cafés en parallèle  
- Réduction du **temps de préparation**  
-  Système intelligent de gestion de stock  
- Interface utilisateur graphique (JavaFX ou Swing)

---


## Modélisation

### Diagramme de classes (simplifié) :
```plaintext
+---------------+
| CoffeeMachine |
+---------------+
| + pay()       |
| + select()    |
| + dispense()  |
+---------------+

+---------+     
| Coffee  |
+---------+     
      ^
      |------ Latte
      |------ Cappuccino
      |------ Espresso 
```
---

## 💻 Technologies

- Java 17 
- GitHub

---

## À Faire

- [ ] Ajouter des tests unitaires avec JUnit  
- [ ] Gérer les fichiers de configuration (stock initial, prix)  

---

## Démo

---


## 🔗 Auteur

> Projet réalisé par [Rasoanirina Mialisoa Lisa] dans le cadre d’un exercice de modélisation logicielle Java.

       
