import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Kitty implements Serializable {
    private String favorite_drink;
    
    public Kitty(String drink) {
        favorite_drink = drink;
    }

    public String get_favorite_drink() {
        return favorite_drink;
    }
}

public class Serialize {
    private static void serialize_kitty(String filename, Kitty kitty)
        throws IOException
    {
        FileOutputStream file_out = new FileOutputStream(filename);
        ObjectOutputStream object_out = new ObjectOutputStream(file_out);
        object_out.writeObject(kitty);
    }

    private static Kitty deserialize_kitty(String filename)
        throws IOException, ClassNotFoundException
    {
        FileInputStream file_in = new FileInputStream(filename);
        ObjectInputStream object_in = new ObjectInputStream(file_in);
        Kitty kitty = (Kitty) object_in.readObject();
        return kitty;
    }
    
    public static void main(String[] args) {
        try {
            String filename = "kitty.bin";
            Kitty kitty = new Kitty("milk, of course");
            serialize_kitty(filename, kitty);
            Kitty clone = deserialize_kitty(filename);
            System.out.println("Kitty's favorite drink: "
                               + clone.get_favorite_drink());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}


