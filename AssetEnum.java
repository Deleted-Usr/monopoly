package Java.MONOPOLY;

public enum AssetEnum
{
    BOARD("C:\\Users\\travis.grutzner.00\\OneDrive - Department for Education, Children and Young People\\Computer Science\\Monopoly board.jpg"),
    SPLASHSCREEN("C:\\Users\\travis.grutzner.00\\OneDrive - Department for Education, Children and Young People\\Computer Science\\startScreen.jpg"),
    PLAYER1("C:\\Users\\travis.grutzner.00\\OneDrive - Department for Education, Children and Young People\\Computer Science\\player1.png"),
    PLAYER2("C:\\Users\\travis.grutzner.00\\OneDrive - Department for Education, Children and Young People\\Computer Science\\player2.png"),
    PLAYER3("C:\\Users\\travis.grutzner.00\\OneDrive - Department for Education, Children and Young People\\Computer Science\\player3.png"),
    PLAYER4("C:\\Users\\travis.grutzner.00\\OneDrive - Department for Education, Children and Young People\\Computer Science\\player4.png"),
    SETTINGS("C:\\Users\\travis.grutzner.00\\OneDrive - Department for Education, Children and Young People\\Computer Science\\settings.png"),
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