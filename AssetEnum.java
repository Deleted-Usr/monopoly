package Java.MONOPOLY;

public enum AssetEnum
{
    BOARD("C:\\Users\\travi\\IdeaProjects\\monopoly\\images\\Monopoly board.jpg"),
    SPLASHSCREEN("C:\\Users\\travi\\IdeaProjects\\monopoly\\images\\startScreen.jpg"),
    PLAYER1("C:\\Users\\travi\\IdeaProjects\\monopoly\\images\\player1.png"),
    PLAYER2("C:\\Users\\travi\\IdeaProjects\\monopoly\\images\\player2.png"),
    PLAYER3("C:\\Users\\travi\\IdeaProjects\\monopoly\\images\\player3.png"),
    PLAYER4("C:\\Users\\travi\\IdeaProjects\\monopoly\\images\\player4.png"),
    SETTINGS("C:\\Users\\travi\\IdeaProjects\\monopoly\\images\\settings.png"),
    ;
    
    private final String path;
    
    AssetEnum(String path)
    {
        this.path = path;
    }
    
    public String getPath()
    {
        return path;
    }
}