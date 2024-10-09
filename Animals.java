package FinalTest;

public class Animals {
    private String name;
    private String command;
    private String birthDate;

    public Animals(String name, String command, String birthDate) {
        this.name = name;
        this.command = command;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getCommand() {
        return command;
    }
}

class DomesticAnimals extends Animals {
    public DomesticAnimals(String name, String command, String birthDate) {
        super(name, command, birthDate);
    }
}

class PackAnimals extends Animals {
    public PackAnimals(String name, String command, String birthDate) {
        super(name, command, birthDate);
    }
}


