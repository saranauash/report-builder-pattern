

public class ReportDirector {

    public void constructMonthlySummary(ReportBuilder builder, String authorName) {
        builder.reset()
                .setTitle("Monthly Performance Summary")
                .setAuthor(authorName)
                .addSection("Overview", "Overall performance was positive with a 15% increase in throughput.")
                .addSection("Key Metrics", "Latency decreased by 20ms across primary services.")
                .setFooter("Confidential - Internal Use Only");
    }

    public void constructQuickDraft(ReportBuilder builder, String title) {
        builder.reset()
                .setTitle(title)
                .addSection("Draft Note", "This is an automatically generated quick draft.");
    }
}