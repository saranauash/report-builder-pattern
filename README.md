# Report Builder Pattern

Java 17 implementation of the Builder creational design pattern adhering to Clean Code principles.

## Features
- **Product (`Report`)**: Immutable domain object representing a structured document.
- **Builder Interface (`ReportBuilder`)**: Defines step-by-step construction steps with Fluent API.
- **Concrete Builders**:
  - `PdfReportBuilder`: Formats report elements with PDF-style markers and validates required title.
  - `HtmlReportBuilder`: Generates HTML-tagged report elements.
- **Director (`ReportDirector`)**: Pre-configures standard report layouts (e.g., Monthly Summary, Quick Draft).
- **Client (`Main`)**: Demonstration class showcasing custom construction, director usage, and fail-fast validation.

## How to Run
Open the project in IntelliJ IDEA (JDK 17) and run `Main.java`.
