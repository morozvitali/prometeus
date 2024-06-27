package prometheus.olimpiatasks.number17;

public class Report {
    private final String createdBy;
    private final String content;
    private final String title;
    private final String description;

    private Report(String createdBy, String content, String title, String description) {
        this.createdBy = createdBy;
        this.content = content;
        this.title = title;
        this.description = description;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public static class ReportBuilder {
        private String createdBy;
        private String content;
        private String title;
        private String description;

        public ReportBuilder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public ReportBuilder content(String content) {
            this.content = content;
            return this;
        }

        public ReportBuilder title(String title) {
            this.title = title;
            return this;
        }

        public ReportBuilder description(String description) {
            this.description = description;
            return this;
        }

        public Report build() {
            return new Report(createdBy, content, title, description);
        }
    }

    public static ReportBuilder builder() {
        return new ReportBuilder();
    }
}