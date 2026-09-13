

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. Custom Fluent API Construction (PDF) ===");
        ReportBuilder pdfBuilder = new PdfReportBuilder();
        Report pdfReport = pdfBuilder.setTitle("Design Patterns Architecture")
                .setAuthor("Sara Nauash")
                .addSection("Introduction", "Overview of Creational Design Patterns.")
                .addSection("Builder Pattern", "Separates construction from representation.")
                .setFooter("Page 1 of 1")
                .build();
        System.out.println(pdfReport);

        System.out.println("=== 2. Director Standard Workflow (HTML) ===");
        ReportDirector director = new ReportDirector();
        ReportBuilder htmlBuilder = new HtmlReportBuilder();

        director.constructMonthlySummary(htmlBuilder, "Sara Nauash");
        Report htmlReport = htmlBuilder.build();
        System.out.println(htmlReport);

        System.out.println("=== 3. Validation Demonstration ===");
        try {
            ReportBuilder invalidBuilder = new PdfReportBuilder();
            invalidBuilder.build();
        } catch (IllegalStateException e) {
            System.out.println("Validation caught expected error: " + e.getMessage());
        }
    }
}