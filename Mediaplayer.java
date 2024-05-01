import java.sql.SQLOutput;

public class Mediaplayer implements Audioplayer,Videoplayer {

    @Override
    public void Volume() {
        System.out.println("Volume ");
    }

    @Override
    public void Speed() {
        System.out.println("Speed Increased");

    }

    @Override
    public void screenratio() {
        System.out.println("Change the screen ratio");

    }

    @Override
    public void Filter() {
        System.out.println("Filter is Classic");

    }
}
