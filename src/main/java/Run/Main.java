package Run;
import IGU.Formulario;
import com.formdev.flatlaf.FlatLightLaf;

public class Main {
    public static void main(String[] args) {
        FlatLightLaf.setup();

        Formulario Window = new Formulario();
        Window.setVisible(true);
        Window.setResizable(false);
        Window.setLocationRelativeTo(null);
        Window.setTitle("Formulario - Tabla");
    }
}
