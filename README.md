# superapp-api

Backend API for the **CGSEM Club Management System** — a web platform for managing club events, tasks, members, KPIs, and communication.

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 21 |
| Framework | Spring Boot 3.x |
| Auth | Azure Entra ID (MSAL4J) + JWT |
| Database | PostgreSQL |
| Storage | Microsoft OneDrive (metadata + links only) |
| Social | Facebook Graph API (post status sync) |
| Reports | Apache POI (Excel export) |
| Build | Maven |

## Architecture

```
Event (container)
  └── Task (work unit)        ← KPI derived from here
  └── Post (status tracking)  ← synced from Facebook API
  └── Media (OneDrive refs)
```

## Branch Strategy (Trunk-Based Development)

| Branch | Purpose |
|---|---|
| `main` | Trunk — always deployable, this is develop |
| `feat/*` | Short-lived feature branches → PR into `main` |
| `fix/*` | Bug fixes → PR into `main` |
| `stable/vx.x` | Staging promotion from `main` |
| `vx.x.x` (tag) | Production release |

> PRs **must** reference an issue: `closes #N` — this drives the Kanban board automatically.

## Local Development

### Prerequisites

- Java 21+
- Maven 3.9+
- PostgreSQL 15+
- Azure Entra ID app registration (for SSO)

### Run

```bash
# Copy and fill in env vars
cp .env.example .env

# Start
mvn spring-boot:run
```

API runs at `http://localhost:8080`.

## Environment Variables

```env
AZURE_CLIENT_ID=
AZURE_TENANT_ID=
AZURE_CLIENT_SECRET=
DB_URL=jdbc:postgresql://localhost:5432/superapp
DB_USERNAME=
DB_PASSWORD=
ONEDRIVE_CLIENT_ID=
FACEBOOK_APP_SECRET=
```

## Roles

| Role | Access |
|---|---|
| Guest | Public events, posts, media |
| Member | Assigned events, own tasks, personal KPI |
| Admin | Full access — CRUD everything, export reports |
