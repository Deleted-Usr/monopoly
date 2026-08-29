package Java.MONOPOLY;
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;
import java.io.File; 
import java.io.IOException; 
import javax.sound.sampled.*;
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;  

public class BoardPanel extends JPanel implements ActionListener{
    int margin = 50;
    int cornerSize = 162;
    int boardsize = 792;
    int propertyHeight = cornerSize;
    int propertyWidth = (boardsize - (2*cornerSize))/9;;
    int pieceSize = 50;
    int start = 742;
    boolean playing = false;
    boolean settings = false;
    JButton startButton;
    JButton settingsButton;
    JButton backButton;

    private Board board;
    private player player;

    String imagePath; 
    BufferedImage bgImage;
    BufferedImage scImage;
    BufferedImage seImage;
    BufferedImage p1Image;
    BufferedImage p2Image;
    BufferedImage p3Image;
    BufferedImage p4Image;

    public BoardPanel() {
        board = new Board();
        try
        {
            loadImage();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        this.setLayout(null);
        startButton = new JButton("Start Game"); 
        add(startButton); 
        startButton.addActionListener(this); 
        settingsButton = new JButton("Settings");
        add(settingsButton);
        settingsButton.addActionListener(this);
        backButton = new JButton("\u21D0");
        add(backButton);
        backButton.addActionListener(this);
    }
    
    
    
    public JButton setPlayButton()
    {
        JButton button = new JButton("Play");
        
        
        
        return button;
    }

    public void loadImage() throws IOException {
        try {
            bgImage = AssetManager.loadImage(AssetEnum.BOARD);
            scImage = AssetManager.loadImage(AssetEnum.SPLASHSCREEN);
            seImage = AssetManager.loadImage(AssetEnum.SETTINGS);            
            p1Image = AssetManager.loadImage(AssetEnum.PLAYER1);
            p2Image = AssetManager.loadImage(AssetEnum.PLAYER2);
            p3Image = AssetManager.loadImage(AssetEnum.PLAYER3);
            p4Image = AssetManager.loadImage(AssetEnum.PLAYER4);
        } catch (IOException e) {
            System.out.println("Error loading image. Check path and filename.");
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) 
    { 
        if(e.getSource() == startButton){
            playing = true;  
        }
        if(e.getSource() == settingsButton){
            settings = true;        
        }
        if(e.getSource() == backButton) {
            settings = false;
        }
        repaint();
    } 

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        //board
        startButton.setVisible(!playing);
        settingsButton.setVisible(!playing);
        
        backButton.setVisible(settings);

        if(!playing){
            if (scImage != null) {
                g.drawImage(scImage, 0, 0, 900, 900, this);
            }
            
            startButton.setLocation(350,550); 
            startButton.setSize(200,60); 
            
            startButton.setOpaque(false);
            startButton.setContentAreaFilled(false);
            startButton.setFocusPainted(false);
            startButton.setForeground(Color.WHITE);
            startButton.setFont(new Font("Arial", Font.BOLD, 16));
        
            settingsButton.setLocation(350, 610);
            settingsButton.setSize(200, 60);
            settingsButton.setOpaque(false);
            settingsButton.setContentAreaFilled(false);
            settingsButton.setFocusPainted(false);
            settingsButton.setForeground(Color.WHITE);
            settingsButton.setFont(new Font("Arial", Font.BOLD, 16));
            
            backButton.setLocation(0, 0);
            backButton.setSize(100, 100);
            backButton.setOpaque(false);
            backButton.setContentAreaFilled(false);
            backButton.setBorderPainted(false);
            backButton.setFocusPainted(false);
            backButton.setForeground(Color.WHITE);
            backButton.setFont(new Font("Segoe UI Symbol", Font.BOLD, 50));
        }
        if(settings){
            g.drawImage(seImage, 0, 0, 900, 900, this);
            startButton.setVisible(false);
            settingsButton.setVisible(false);
        }
        if(playing){
            g.setColor(Color.white);
            g.fillRect(0, 0, getWidth(), getHeight());

            if (bgImage != null) {
                g.drawImage(bgImage, margin, margin, boardsize, boardsize, this);
            }
            if (p1Image != null){
                g.drawImage(p1Image, start, start, pieceSize, pieceSize, this);
            }

        }
        //Icons
    }
}