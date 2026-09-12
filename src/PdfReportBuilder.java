

import java.util.ArrayList;
import java.util.List;

public class PdfReportBuilder implements ReportBuilder {
    private String title;
    private String author;
    private List<String> sections = new ArrayList<>();
    private String footer;

    @Override
    public ReportBuilder reset() {
        this.title = null;
        this.author = null;
        this.sections = new ArrayList<>();
        this.footer = null;
        return this;
    }

    @Override
    public ReportBuilder setTitle(String title) {
        this.title = "[PDF-HEADER] " + title;
        return this;
    }

    @Override
    public ReportBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    @Override
    public ReportBuilder addSection(String sectionTitle, String content) {
        String formattedSection = ">> Section: " + sectionTitle.toUpperCase() + "\n   " + content;
        this.sections.add(formattedSection);
        return this;
    }

    @Override
    public ReportBuilder setFooter(String footer) {
        this.footer = "[PDF-FOOTER] " + footer;
        return this;
    }

    @Override
    public Report build() {
        validateState();
        return new Report(title, author, sections, footer);
    }

    private void validateState() {
        if (title == null || title.isBlank()) {
            throw new IllegalStateException("Cannot build PDF Report: Title is required.");
        }
        if (sections.isEmpty()) {
            throw new IllegalStateException("Cannot build PDF Report: At least one section is required.");
        }
    }
}