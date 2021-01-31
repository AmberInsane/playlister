public enum MusicType {
    RELAX("/Relax"),
    MEDIUM ("/Medium"),
    JOURNEY("/Journey"),
    HARD("/Hard");

    private static String HARD_MUSIC_FOLDER = "/Hard";

    public final String folderPath;

    private MusicType(String folderPath) {
        this.folderPath = folderPath;
    }
}
