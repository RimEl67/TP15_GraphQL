# TP 15 : Service GraphQL avec Spring Boot par: Rim EL ABBASSI

## Objectif
Ce TP vise à implémenter un service GraphQL pour la gestion de comptes et de transactions bancaires en utilisant **Spring Boot**. L'application permet de créer, consulter et analyser les comptes et transactions via des requêtes et mutations GraphQL.

---

## Tests avec GraphiQL

### 1. Récupérer tous les comptes
Permet de vérifier que tous les comptes sont correctement enregistrés et récupérables.
<img width="1366" height="768" alt="4 " src="https://github.com/user-attachments/assets/a527aa42-1e44-4320-ac6c-0088eef7d7d6" />


### 2. Récupérer un compte par identifiant (id)
Permet de s'assurer qu'un compte spécifique peut être retrouvé à partir de son id.
<img width="1366" height="768" alt="5" src="https://github.com/user-attachments/assets/0b10463d-7ecd-4d24-8346-f9627ee5d3f5" />
<img width="1366" height="768" alt="6" src="https://github.com/user-attachments/assets/a27c6d6d-0e46-4113-9182-ac5ded42e5f5" />


### 3. Ajouter un nouveau compte
Valide la création d’un compte via une mutation GraphQL.
<img width="1366" height="768" alt="7" src="https://github.com/user-attachments/assets/46dabd24-914b-490b-8e40-209d5bc23c74" />


### 4. Calculer les statistiques globales des comptes
Retourne le nombre total de comptes, la somme et la moyenne des soldes.
<img width="1366" height="768" alt="8" src="https://github.com/user-attachments/assets/26c041ff-eb24-451f-9ce4-089c5efa37e5" />


### 5. Ajouter une transaction
Permet d’ajouter une transaction à un compte existant.
<img width="1366" height="725" alt="9" src="https://github.com/user-attachments/assets/2389ea5c-ae5a-47cc-958b-a99d84b6537e" />


### 6. Afficher les transactions d’un compte
Permet de récupérer toutes les transactions associées à un compte spécifique.
<img width="1366" height="731" alt="10" src="https://github.com/user-attachments/assets/d071b5c4-baae-400d-8a22-819f7349978b" />


### 7. Calculer les statistiques globales des transactions
Retourne le nombre total de transactions, la somme des dépôts et la somme des retraits.
<img width="1366" height="768" alt="111" src="https://github.com/user-attachments/assets/c4994cd9-6e29-4f16-89f9-1f3cfa223c11" />
