 

public enum AssetEnum
{
    BOARD("C:\\Users\\travis.grutzner.00\\OneDrive - Department for Education, Children and Young People\\Documents\\GitHub\\monopoly\\images\\Monopoly board.jpg"),
    SPLASHSCREEN("C:\\Users\\travis.grutzner.00\\OneDrive - Department for Education, Children and Young People\\Documents\\GitHub\\monopoly\\images\\startScreen.jpg"),
    PLAYER1("C:\\Users\\travis.grutzner.00\\OneDrive - Department for Education, Children and Young People\\Documents\\GitHub\\monopoly\\images\\player1.jpg"),
    PLAYER2("C:\\Users\\travis.grutzner.00\\OneDrive - Department for Education, Children and Young People\\Documents\\GitHub\\monopoly\\images\\player2.png"),
    PLAYER3("C:\\Users\\travis.grutzner.00\\OneDrive - Department for Education, Children and Young People\\Documents\\GitHub\\monopoly\\images\\player3.png"),
    PLAYER4("C:\\Users\\travis.grutzner.00\\OneDrive - Department for Education, Children and Young People\\Documents\\GitHub\\monopoly\\images\\player4.png"),
    SETTINGS("C:\\Users\\travis.grutzner.00\\OneDrive - Department for Education, Children and Young People\\Documents\\GitHub\\monopoly\\images\\settings.png"),
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
