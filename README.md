# 🌐 Spring Cloud Config Repository

This Git repository provides **centralized configuration** for a Spring Boot microservices system using **Spring Cloud Config Server**.

## 📦 Services Overview

The project includes the following services:

- 🧑 **User Service** – A microservice that handles user-related operations.
- 💳 **Payment Service** – A microservice that manages payment processing.
- 🛠️ **Config Server** – Central configuration server that serves externalized configuration to all client services.

## 🗂️ Repository Structure

This repository contains the configuration files for each microservice:

├── application.yml # (Optional) Shared global configuration
├── user-service.yml # Configuration for User Service
└── payment-service.yml # Configuration for Payment Service

Each file contains service-specific properties such as ports, messages, or database settings.

## 🚀 Features

- ✅ Centralized management of configuration for multiple services
- 🔁 Dynamic configuration updates without restarting services
- 🔧 Runtime refresh via `/actuator/refresh` endpoint (enabled using **Spring Boot Actuator**)
- 🗃️ Version-controlled configuration with Git history

## 🔄 How Config Refresh Works

1. Update the relevant `.yml` file in this repo.
2. Commit and push changes to GitHub.
3. Trigger a refresh from the client service:
   - Send a `POST` request to:
     ```
     http://localhost:{service-port}/actuator/refresh
     ```
   - This makes the service reload its configuration without a restart.

## 🛠️ Tech Stack

- Spring Boot
- Spring Cloud Config
- Spring Boot Actuator
- Git (as the config source)
