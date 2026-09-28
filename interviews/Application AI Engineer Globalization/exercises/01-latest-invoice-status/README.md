# Exercise 02 — Latest Invoice Status

## Context

Each invoice moves through several statuses over its lifetime (for example
`CREATED` → `SENT` → `REJECTED`). Every status change is recorded as an **event**.

## Task

Given a list of events, each with the shape:

```
{ invoiceId, status, timestamp }
```

Return the **current status of each invoice**.

## Example

Input:

```json
[
  { "invoiceId": "A", "status": "SENT",     "timestamp": 2 },
  { "invoiceId": "A", "status": "CREATED",  "timestamp": 1 },
  { "invoiceId": "A", "status": "SENT",     "timestamp": 2 },
  { "invoiceId": "B", "status": "REJECTED", "timestamp": 5 }
]
```

Expected output (order of invoices does not matter):

```
[
  { "invoiceId": "A", "status": "SENT" },
  { "invoiceId": "B", "status": "REJECTED" }
]
```

A larger input is available in [`sample-data.json`](sample-data.json).