// 1.a Lav en klasse, Customer, med attributterne (felterne/instansvariablene):
// String firstName, String lastName, String username, int id

public class Customer {

    private String firstName;
    private String lastName;
    private String userName;
    private int id;

// 1.b Klassen skal have en konstruktør, der tager kundens navn og brugernavn som parametre.
// Giv klassen en toString() metode, der printer kundens detaljer pænt ud.
// Gør alle klassens felter private, og tilføj getters().
    public Customer (String firstName, String lastName, String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    @Override
    public String toString() {
        String s = "Firstname and lastname: " + this.firstName + ", " + this.lastName + "\n" + "Username: " + this.userName;
        return s;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getUserName(){
        return userName;
    }

    public int getId(){
        return id;
    }
}
