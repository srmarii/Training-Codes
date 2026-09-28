# Exercise 03 — Country checks

## Context

Building on the result of Exercise 02 (reuse the code and file, do not refactor, do not create a new file, just add more methods), we now know the **current status of each invoice**. Before an invoice can move forward, it must pass a **compliance check** that depends on the **country** it belongs to. Each country has its own set of statuses that require an action from our team.

## Task

Given a list of invoices, each with the shape:

```
{ invoiceId, country, status }
```

Return the list of `invoiceId`s that **require an action**, according to the following
country-specific rules.

An invoice requires an action when:

- **BR** (Brazil) — its status is `REJECTED` or `PENDING`.
- **IT** (Italy) — its status is `REJECTED`.
- **IN** (India) — its status is `CREATED` or `PENDING`.
- **ES** (Spain) — its status is `REJECTED` or `CANCELLED`.
- **FR** (France) — its status is `PENDING`.

Invoices from any other country never require an action.

## Example

Input:

```json
[
  { "invoiceId": "A", "country": "BR", "status": "REJECTED" },
  { "invoiceId": "B", "country": "IT", "status": "SENT" },
  { "invoiceId": "C", "country": "IN", "status": "CREATED" },
  { "invoiceId": "D", "country": "FR", "status": "SENT" }
]
```

Expected output (order does not matter):

```
["A", "C"]
```

- `A` — BR invoice with status `REJECTED` → requires an action.
- `B` — IT invoice with status `SENT` → no action.
- `C` — IN invoice with status `CREATED` → requires an action.
- `D` — FR invoice with status `SENT` → no action.

A larger input is available in [`sample-data.json`](sample-data.json).
