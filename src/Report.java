

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Report {
    private final String title;
    private final String author;
    private final List<String> sections;
    private final String footer;

    public Report(String title, String author, List<String> sections, String footer) {
        this.title = title;
        this.author = author;
        this.sections = Collections.unmodifiableList(new ArrayList<>(sections));
        this.footer = footer;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getSections() {
        return sections;
    }

    public String getFooter() {
        return footer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- ").append(title).append(" ---\n");
        sb.append("Author: ").append(author != null ? author : "N/A").append("\n\n");
        for (String section : sections) {
            sb.append(section).append("\n");
        }
        if (footer != null) {
            sb.append("\nFooter: ").append(footer).append("\n");
        }
        return sb.toString();
    }
}