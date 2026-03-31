# 🧪 QA Testing Portfolio — Aldiyan Muhammad Tanjung

> End-to-end QA portfolio covering manual testing, API testing, and Selenium test automation — built to demonstrate real-world quality assurance practices.

---

## 👋 About Me

I'm a QA Lead with 5+ years of experience in software quality assurance, specialising in **manual testing**, **API testing**, and **test automation** for web applications. I hold a Master's degree in Information Technology from Universitas Indonesia, with a thesis focused on ISO 27001:2022 ISMS maturity auditing.

I'm passionate about building reliable, maintainable test suites that actually catch bugs — not just pass pipelines.

📍 Based in Jakarta, Indonesia
📧 Open to opportunities in NZ, AU, SG, MY & beyond
🔗 [LinkedIn](https://www.linkedin.com/in/aldiyanmt97) <!-- update link if needed -->

---

## 📁 Repository Structure

```
qa-ecommerce-testing-portfolio/
├── manual-testing/           # Test cases & bug reports
├── api-testing/              # Postman collections & API test documentation
└── qa-automation-selenium/   # Selenium + TestNG automation framework (Java)
```

---

## ✅ Test Coverage Summary

### 🖊️ Manual Testing
- E-commerce scenario-based test cases (positive & negative)
- Bug report documentation with severity & priority classification
- Covers: user registration, login, product browsing, cart, checkout

### 🔌 API Testing
- REST API validation using Postman
- Scenarios: GET user, POST create user, login (positive & negative)
- Includes assertions on status codes, response body, and response time

### 🤖 Test Automation (Selenium)
- Automated UI testing using **Selenium WebDriver 4.21** + **TestNG**
- Implements **Page Object Model (POM)** design pattern
- Covers: login positive & negative test cases on [The Internet (Herokuapp)](https://the-internet.herokuapp.com)
- Uses **Explicit Wait** for stable, flake-resistant tests

---

## 🛠️ Tech Stack & Tools

| Category | Tools |
|---|---|
| Language | Java |
| Automation Framework | Selenium WebDriver 4.21, TestNG 7.10 |
| Design Pattern | Page Object Model (POM) |
| Build Tool | Maven |
| API Testing | Postman |
| IDE | IntelliJ IDEA |
| Version Control | Git, GitHub |
| Manual Testing | Excel / Google Sheets |
| Standards | ISO 27001:2022 |

---

## 🚀 How to Run the Automation Tests

### Prerequisites
- Java JDK 11+ installed
- Maven installed
- Google Chrome (latest)

### Steps

**1. Clone the repository**
```bash
git clone https://github.com/aldiyanmt97/qa-ecommerce-testing-portfolio.git
cd qa-ecommerce-testing-portfolio/qa-automation-selenium
```

**2. Install dependencies**
```bash
mvn clean install -DskipTests
```

**3. Run all tests**
```bash
mvn test
```

**4. Run a specific test class**
```bash
mvn test -Dtest=LoginTest
```

### Expected Output
```
Total tests run: 2, Passes: 2, Failures: 0, Skips: 0
```

> ⚠️ Note: You may see a CDP version warning (`Unable to find CDP implementation matching 146`) — this is a known compatibility notice between Selenium 4.21 and newer Chrome builds. It does **not** affect test execution.

---

## 🗺️ Roadmap

- [ ] Add more automation test scenarios (product search, cart, checkout)
- [ ] Integrate Extent Reports for HTML test reporting
- [ ] Add CI/CD pipeline with GitHub Actions
- [ ] Expand API testing with Newman CLI for automated Postman runs
- [ ] Add cross-browser testing (Firefox, Edge)

---

## 📄 License

This project is open for reference and learning purposes.

---

*Built with ☕ and a genuine love for breaking things (responsibly).*
