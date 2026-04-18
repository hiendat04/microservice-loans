# microservice-loans

Loan service in my microservices system (work in progress).

## Overview
`microservice-loans` is intended to handle loan-related capabilities (loan details, status, and lifecycle operations) within my microservices ecosystem.

This repository is still evolving while I build the full system.

## Current Status
- Active development (WIP)

## Current Tech Stack (so far)
- Java

## Planned / Future Tech Stack (will be added progressively)
The service is expected to grow into a full production-style microservice with:
- **Spring Boot** for REST APIs
- **Spring Data JPA** + service-owned database
- **Configuration management** (externalized config / config server)
- **Service discovery** for internal networking
- **API Gateway** as the system entry point
- **Resilience patterns** (retry/timeouts/circuit breakers)
- **Observability** (logs + metrics + traces)
- **Security** (OAuth2 / OpenID Connect pattern)
- **Docker** images + **Docker Compose** local stack
- **Kubernetes** + **Helm** deployment packaging
- Optional: **event-driven architecture** for async workflows

## How to Run
This will be updated with exact commands once the build and runtime approach is finalized.

Typical local workflow targets:
- Run service locally from IDE
- Run service + dependencies using Docker Compose
- Run the whole system via gateway

## API Docs
- Run the project and go to this link to open Swagger/ OpenAPI docs: http://localhost:8090/swagger-ui/index.html

## Project Approach / Plan
1. Implement core loan APIs and business rules
2. Add validation + consistent error responses
3. Add persistence + migrations
4. Integrate with other services through gateway + discovery
5. Add resilience + observability
6. Add authentication/authorization
7. Containerize and deploy (Compose → Kubernetes)

## Related Repositories
- `microservice-accounts`
- `microservice-cards`

## Notes
This README is a placeholder and will be improved as development progresses.
