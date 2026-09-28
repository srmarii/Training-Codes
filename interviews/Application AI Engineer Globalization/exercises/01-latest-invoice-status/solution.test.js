const { test } = require("node:test");
const assert = require("node:assert/strict");
const { LatestInvoiceStatusResolver } = require("./solution");

const resolver = new LatestInvoiceStatusResolver();

test("returns the latest status for a single invoice", () => {
  const events = [
    { invoiceId: "A", status: "CREATED", timestamp: 1 },
    { invoiceId: "A", status: "SENT",    timestamp: 2 },
  ];

  const result = resolver.resolve(events);

  assert.equal(result.length, 1);
  assert.equal(result[0].invoiceId, "A");
  assert.equal(result[0].status, "SENT");
});

test("returns the latest status for multiple invoices", () => {
  const events = [
    { invoiceId: "A", status: "SENT",     timestamp: 2 },
    { invoiceId: "A", status: "CREATED",  timestamp: 1 },
    { invoiceId: "B", status: "REJECTED", timestamp: 5 },
  ];

  const result = resolver.resolve(events);
  const byId = Object.fromEntries(result.map((r) => [r.invoiceId, r.status]));

  assert.equal(result.length, 2);
  assert.equal(byId["A"], "SENT");
  assert.equal(byId["B"], "REJECTED");
});

test("picks the event with the highest timestamp when duplicates exist", () => {
  const events = [
    { invoiceId: "A", status: "SENT",     timestamp: 3 },
    { invoiceId: "A", status: "SENT",     timestamp: 3 },
    { invoiceId: "A", status: "PENDING",  timestamp: 2 },
    { invoiceId: "A", status: "REJECTED", timestamp: 4 },
  ];

  const result = resolver.resolve(events);

  assert.equal(result.length, 1);
  assert.equal(result[0].status, "REJECTED");
});

test("returns an empty array when given no events", () => {
  const result = resolver.resolve([]);

  assert.equal(result.length, 0);
});

test("handles a single event correctly", () => {
  const events = [
    { invoiceId: "Z", status: "CREATED", timestamp: 1 },
  ];

  const result = resolver.resolve(events);

  assert.equal(result.length, 1);
  assert.equal(result[0].invoiceId, "Z");
  assert.equal(result[0].status, "CREATED");
});
