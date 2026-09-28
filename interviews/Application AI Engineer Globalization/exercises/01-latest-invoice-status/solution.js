class LatestInvoiceStatusResolver {
  resolve(events) {
    const latestByInvoice = new Map();

    for (const event of events) {
      if (!latestByInvoice.has(event.invoiceId)) {
        latestByInvoice.set(event.invoiceId, event);
      } else {
        const current = latestByInvoice.get(event.invoiceId);
        if (event.timestamp > current.timestamp) {
          latestByInvoice.set(event.invoiceId, event);
        }
      }
    }

    const results = [];
    for (const [invoiceId, event] of latestByInvoice) {
      results.push({ invoiceId, status: event.status });
    }

    return results;
  }
}

module.exports = { LatestInvoiceStatusResolver };

const events = require("./sample-data.json");

const resolver = new LatestInvoiceStatusResolver();
const result = resolver.resolve(events);
console.log(result);
