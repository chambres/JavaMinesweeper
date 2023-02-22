
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MSWindow extends javax.swing.JFrame{




    Image blank;
    Image bombdeath;
    Image bombflagged;
    Image bombmisflagged;
    Image bombrevealed;
    Image facedead;
    Image faceooh;
    Image facesmile;
    Image facewin;
    Image open0;
    Image open1;
    Image open2;
    Image open3;
    Image open4;
    Image open5;
    Image open6;
    Image open7;
    Image open8;
    Image timedash;
    Image time0;
    Image time1;
    Image time2;
    Image time3;
    Image time4;
    Image time5;
    Image time6;
    Image time7;
    Image time8;
    Image time9;

    JPanel panel = new JPanel();
        

    int rows;
    int cols;
    void start(){
        System.out.println("Rows: ");
        rows = Integer.parseInt(System.console().readLine());
        System.out.println("Columns: ");
        cols = Integer.parseInt(System.console().readLine());
        String fold = "images";
        try{
            blank = ImageIO.read(new File(fold, "blank.gif"));
            bombdeath = ImageIO.read(new File(fold, "bombdeath.gif"));
            bombflagged = ImageIO.read(new File(fold, "bombflagged.gif"));
            bombmisflagged = ImageIO.read(new File(fold, "bombmisflagged.gif"));
            bombrevealed = ImageIO.read(new File(fold, "bombrevealed.gif"));
            facedead = ImageIO.read(new File(fold, "facedead.gif"));
            faceooh = ImageIO.read(new File(fold, "faceooh.gif"));
            facesmile = ImageIO.read(new File(fold, "facesmile.gif"));
            facewin = ImageIO.read(new File(fold, "facewin.gif"));
            open0 = ImageIO.read(new File(fold, "open0.gif"));
            open1 = ImageIO.read(new File(fold, "open1.gif"));
            open2 = ImageIO.read(new File(fold, "open2.gif"));
            open3 = ImageIO.read(new File(fold, "open3.gif"));
            open4 = ImageIO.read(new File(fold, "open4.gif"));
            open5 = ImageIO.read(new File(fold, "open5.gif"));
            open6 = ImageIO.read(new File(fold, "open6.gif"));
            open7 = ImageIO.read(new File(fold, "open7.gif"));
            open8 = ImageIO.read(new File(fold, "open8.gif"));
            timedash = ImageIO.read(new File(fold, "time-.gif"));
            time0 = ImageIO.read(new File(fold, "time0.gif"));
            time1 = ImageIO.read(new File(fold, "time1.gif"));
            time2 = ImageIO.read(new File(fold, "time2.gif"));
            time3 = ImageIO.read(new File(fold, "time3.gif"));
            time4 = ImageIO.read(new File(fold, "time4.gif"));
            time5 = ImageIO.read(new File(fold, "time5.gif"));
            time6 = ImageIO.read(new File(fold, "time6.gif"));
            time7 = ImageIO.read(new File(fold, "time7.gif"));
            time8 = ImageIO.read(new File(fold, "time8.gif"));
            time9 = ImageIO.read(new File(fold, "time9.gif"));
    }
        catch(IOException e){
        System.out.println("Error: " + e);
    }
        
        add(panel);
        paint(getGraphics());


    }
    
    static MSGame game;

    public static void main(String[] args) {
        MSWindow window = new MSWindow();        
        window.start();

        
    }

    

    public void paint(Graphics g){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                panel.getGraphics().drawImage(blank, i * 16, j * 16, this);
            }
        }
    }
}
