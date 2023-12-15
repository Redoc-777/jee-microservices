# 🛒 Application de Commerce avec Java Spring Cloud 🌐

## Introduction 🚀

Cette application de commerce est une plateforme basée sur une architecture de microservices développée avec Java Spring Cloud. Elle facilite la gestion des commandes, des clients et des stocks en utilisant plusieurs services indépendants pour maximiser la scalabilité et la maintenabilité. De plus, elle intègre des outils tels que Consul et Vault pour la gestion de la configuration et des secrets.

## Architecture 🏛️

### Microservices 🌐

- **Config Service :** Gère la configuration globale de l'application et distribue les configurations aux autres services en utilisant Java Spring Cloud Config.
- **Gateway Service :** Agit en tant que point d'entrée pour toutes les requêtes, routant le trafic vers les services appropriés avec Java Spring Cloud Gateway.
- **Order Service :** Gère les commandes des clients, de la création à l'exécution, avec Java Spring Boot.
- **Customer Service :** Gère les informations des clients, y compris la création, la mise à jour et la suppression des profils, avec Java Spring Boot.
- **Inventory Service :** Gère le suivi des stocks des produits disponibles, avec Java Spring Boot.


### Outils 🧰

- **Consul :** Service de découverte et de configuration des services pour assurer la communication entre les microservices.
- **Vault :** Gestionnaire de secrets utilisé pour stocker et distribuer des informations sensibles.


## Frontend 🌐

Le frontend de l'application est développé en Angular. Il offre une interface conviviale pour les utilisateurs finaux, leur permettant de naviguer, de passer des commandes et de gérer leur profil.
