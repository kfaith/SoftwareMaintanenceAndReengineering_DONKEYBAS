package SoundFX;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class Sounds {
    private String Filepath = "src/SoundFX/Music.wav";
    private String Filepath2 = "src/SoundFX/Donkey.wav";
    private String Filepath3 = "src/SoundFX/YouWin.wav";
    private  String Filepath4 = "src/SoundFX/YouLose.wav";
    private String Filepath5 = "src/SoundFX/LaneChange.wav" ;

    /**
     This method reads in the music file provided by the main and checks if it exists
     in the file. If it does then it plays the song forever until the program is
     closed
     */
    public void playMusic() {
        try {
            File mFile = new File(Filepath);
            if (mFile.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(mFile);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                gainControl.setValue(-25.0f); //reduces the volume by 25 decibels
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);

            } else {
                System.out.println("Music File not found"); // will be thrown if music file is not in the file
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     This method reads in the donkey file provided by the Game class and checks if it exists
     in the file. If it does then it plays the sound when a donkey appears.
     */
    public  void playDonkeySounds(){
        try {
            File mFile = new File(Filepath2);
            if (mFile.exists()) {
                AudioInputStream audioInput3 = AudioSystem.getAudioInputStream(mFile);
                Clip clip3 = AudioSystem.getClip();
                clip3.open(audioInput3);
                FloatControl gainControl3 = (FloatControl) clip3.getControl(FloatControl.Type.MASTER_GAIN);
                gainControl3.setValue(-10.0f); //reduces the volume by 10 decibels
                clip3.start();

            } else {
                System.out.println("Music File not found"); // will be thrown if music file is not in the file
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     This method reads in the win sound file provided by the Game class and checks if it exists
     in the file. If it does then it plays the song for a short while when the player wins.
     */
    public void playWinSounds(){
        try {
            File mFile = new File(Filepath3);
            if (mFile.exists()) {
                AudioInputStream audioInput4 = AudioSystem.getAudioInputStream(mFile);
                Clip clip4 = AudioSystem.getClip();
                clip4.open(audioInput4);
                FloatControl gainControl4 = (FloatControl) clip4.getControl(FloatControl.Type.MASTER_GAIN);
                gainControl4.setValue(-10.0f); //reduces the volume by 10 decibels
                clip4.start();
            } else {
                System.out.println("Music File not found"); // will be thrown if music file is not in the file
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     This method reads in the you lose sound file provided by the Game class and checks if it exists
     in the file. If it does then it plays the song when the player loses the game i.e. when the player
     crashes into the donkey.
     */
    public void playLoseSounds(){
        try {
            File mFile = new File(Filepath4);
            if (mFile.exists()) {
                AudioInputStream audioInput5 = AudioSystem.getAudioInputStream(mFile);
                Clip clip5 = AudioSystem.getClip();
                clip5.open(audioInput5);
                FloatControl gainControl5 = (FloatControl) clip5.getControl(FloatControl.Type.MASTER_GAIN);
                gainControl5.setValue(-8.0f); //reduces the volume by 8 decibels
                clip5.start();
            } else {
                System.out.println("Music File not found"); // will be thrown if music file is not in the file
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     This method reads in the sound file for changing lanes provided by the Game class and checks if it exists
     in the file. If it does then it plays the sound when the player changes lanes.
     */
    public void playLaneSounds(){
        try {
            File mFile = new File(Filepath5);
            if (mFile.exists()) {
                AudioInputStream audioInput6 = AudioSystem.getAudioInputStream(mFile);
                Clip clip6 = AudioSystem.getClip();
                clip6.open(audioInput6);
                FloatControl gainControl6 = (FloatControl) clip6.getControl(FloatControl.Type.MASTER_GAIN);
                gainControl6.setValue(-10.0f); //reduces the volume by 10 decibels
                clip6.start();
            } else {
                System.out.println("Music File not found"); // will be thrown if music file is not in the file
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
