

import java.util.ArrayList;
import java.util.List;

public class HtmlReportBuilder implements ReportBuilder {
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
        this.title = "<h1>" + title + "</h1>";
        return this;
    }

    @Override
    public ReportBuilder setAuthor(String author) {
        this.author = "<meta name=\"author\" content=\"" + author + "\">";
        return this;
    }

    @Override
    public ReportBuilder addSection(String sectionTitle, String content) {
        String htmlSection = "<section><h2>" + sectionTitle + "</h2><p>" + content + "</p></section>";
        this.sections.add(htmlSection);
        return this;
    }

    @Override
    public ReportBuilder setFooter(String footer) {
        this.footer = "<footer><p>" + footer + "</p></footer>";
        return this;
    }

    @Override
    public Report build() {
        validateState();
        return new Report(title, author, sections, footer);
    }

    private void validateState() {
        if (title == null || title.isBlank()) {
            throw new IllegalStateException("Cannot build HTML Report: Title is required.");
        }
    }
}