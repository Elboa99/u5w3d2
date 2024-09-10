package kennyboateng.u5w3d2.Excepions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("Elemento con ID " + id + " non trovato");
    }
}
