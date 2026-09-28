const { test } = require("node:test");
const assert = require("node:assert/strict");
const { CountryActionChecker } = require("./solution");

const checker = new CountryActionChecker();
const result = checker.check(invoices);
test("BR - requires action for REJECTED and PENDING", () => {
  const invoices = [
    { invoiceId: "A", country: "BR", status: "REJECTED" },
    { invoiceId: "B", country: "BR", status: "PENDING" },
    { invoiceId: "C", country: "BR", status: "SENT" },
  ];

  const result = checker.check(invoices);

  assert.ok(result.includes("A"));
  assert.ok(result.includes("B"));
  assert.ok(!result.includes("C"));
});

test("IT - requires action only for REJECTED", () => {
  const invoices = [
    { invoiceId: "A", country: "IT", status: "REJECTED" },
    { invoiceId: "B", country: "IT", status: "PENDING" },
    { invoiceId: "C", country: "IT", status: "CREATED" },
  ];

  const result = checker.check(invoices);

  assert.ok(result.includes("A"));
  assert.ok(!result.includes("B"));
  assert.ok(!result.includes("C"));
});

test("IN - requires action for CREATED and PENDING", () => {
  const invoices = [
    { invoiceId: "A", country: "IN", status: "CREATED" },
    { invoiceId: "B", country: "IN", status: "PENDING" },
    { invoiceId: "C", country: "IN", status: "SENT" },
  ];

  const result = checker.check(invoices);

  assert.ok(result.includes("A"));
  assert.ok(result.includes("B"));
  assert.ok(!result.includes("C"));
});

test("ES - requires action for REJECTED and CANCELLED", () => {
  const invoices = [
    { invoiceId: "A", country: "ES", status: "REJECTED" },
    { invoiceId: "B", country: "ES", status: "CANCELLED" },
    { invoiceId: "C", country: "ES", status: "SENT" },
  ];

  const result = checker.check(invoices);

  assert.ok(result.includes("A"));
  assert.ok(result.includes("B"));
  assert.ok(!result.includes("C"));
});

test("FR - requires action only for PENDING", () => {
  const invoices = [
    { invoiceId: "A", country: "FR", status: "PENDING" },
    { invoiceId: "B", country: "FR", status: "SENT" },
    { invoiceId: "C", country: "FR", status: "REJECTED" },
  ];

  const result = checker.check(invoices);

  assert.ok(result.includes("A"));
  assert.ok(!result.includes("B"));
  assert.ok(!result.includes("C"));
});

test("unknown country never requires action", () => {
  const invoices = [
    { invoiceId: "A", country: "DE", status: "REJECTED" },
    { invoiceId: "B", country: "DE", status: "PENDING" },
    { invoiceId: "C", country: "US", status: "CANCELLED" },
  ];

  const result = checker.check(invoices);

  assert.equal(result.length, 0);
});

test("returns empty array when given no invoices", () => {
  const result = checker.check([]);

  assert.equal(result.length, 0);
});

test("mixed countries return only invoices that require action", () => {
  const invoices = [
    { invoiceId: "A", country: "BR", status: "REJECTED" },
    { invoiceId: "B", country: "IT", status: "SENT" },
    { invoiceId: "C", country: "IN", status: "CREATED" },
    { invoiceId: "D", country: "FR", status: "SENT" },
  ];

  const result = checker.check(invoices);

  assert.deepEqual(result.sort(), ["A", "C"]);
});
