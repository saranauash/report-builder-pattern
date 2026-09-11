

public interface ReportBuilder {
    ReportBuilder reset();
    ReportBuilder setTitle(String title);
    ReportBuilder setAuthor(String author);
    ReportBuilder addSection(String sectionTitle, String content);
    ReportBuilder setFooter(String footer);
    Report build();
}