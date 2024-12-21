package software.ulpgc;

public class Title {
    public final String id;
    public final String type;
    public final String primaryTitle;
    public final String originalTitle;
    public final boolean isAdult;
    public final int startYear;
    public final int endYear;
    public final int runtimeMinutes;
    public final String genres;

    public Title(String id, String type, String primaryTitle, String originalTitle, boolean isAdult, int startYear, int endYear, int runtimeMinutes, String genres) {
        this.id = id;
        this.type = type;
        this.primaryTitle = primaryTitle;
        this.originalTitle = originalTitle;
        this.isAdult = isAdult;
        this.startYear = startYear;
        this.endYear = endYear;
        this.runtimeMinutes = runtimeMinutes;
        this.genres = genres;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public int getRuntimeMinutes() {
        return runtimeMinutes;
    }

    public String getGenres() {
        return genres;
    }

    @Override
    public String toString() {
        return "Title{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", primaryTitle='" + primaryTitle + '\'' +
                ", originalTitle='" + originalTitle + '\'' +
                ", isAdult=" + isAdult +
                ", startYear=" + startYear +
                ", endYear=" + endYear +
                ", runtimeMinutes=" + runtimeMinutes +
                ", genres='" + genres + '\'' +
                '}';
    }
}
