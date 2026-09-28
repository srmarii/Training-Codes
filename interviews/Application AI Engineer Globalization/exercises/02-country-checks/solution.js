// could be better
// if you have 100 countries, would you do 100 ifs?
class CountryActionChecker {
  check(invoices) {
    const result = [];

    for (const invoice of invoices) {
      if (invoice.country === "BR") {
        if (invoice.status === "REJECTED" || invoice.status === "PENDING") {
          result.push(invoice.invoiceId);
        }
      } else if (invoice.country === "IT") {
        if (invoice.status === "REJECTED") {
          result.push(invoice.invoiceId);
        }
      } else if (invoice.country === "IN") {
        if (invoice.status === "CREATED" || invoice.status === "PENDING") {
          result.push(invoice.invoiceId);
        }
      } else if (invoice.country === "ES") {
        if (invoice.status === "REJECTED" || invoice.status === "CANCELLED") {
          result.push(invoice.invoiceId);
        }
      } else if (invoice.country === "FR") {
        if (invoice.status === "PENDING") {
          result.push(invoice.invoiceId);
        }
      }
    }

    return result;
  }
}

module.exports = { CountryActionChecker };

const invoices = require("./sample-data.json");

const checker = new CountryActionChecker();
const result = checker.check(invoices);
console.log(result);
