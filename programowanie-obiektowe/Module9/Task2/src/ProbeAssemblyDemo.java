// Interfejsy reprezentujące podzespoły sondy
interface Engine {
    void assemble();
}

interface ReplicatorMechanism {
    void assemble();
}

interface MiningTool {
    void assemble();
}

// Implementacje podzespołów dla firmy A
class EngineA implements Engine {
    @Override
    public void assemble() {
        System.out.println("Assembling Engine A");
    }
}

class ReplicatorMechanismA implements ReplicatorMechanism {
    @Override
    public void assemble() {
        System.out.println("Assembling Replicator Mechanism A");
    }
}

class MiningToolA implements MiningTool {
    @Override
    public void assemble() {
        System.out.println("Assembling Mining Tool A");
    }
}

// Implementacje podzespołów dla firmy B
class EngineB implements Engine {
    @Override
    public void assemble() {
        System.out.println("Assembling Engine B");
    }
}

class ReplicatorMechanismB implements ReplicatorMechanism {
    @Override
    public void assemble() {
        System.out.println("Assembling Replicator Mechanism B");
    }
}

class MiningToolB implements MiningTool {
    @Override
    public void assemble() {
        System.out.println("Assembling Mining Tool B");
    }
}

// Implementacje podzespołów dla firmy C
class EngineC implements Engine {
    @Override
    public void assemble() {
        System.out.println("Assembling Engine C");
    }
}

class ReplicatorMechanismC implements ReplicatorMechanism {
    @Override
    public void assemble() {
        System.out.println("Assembling Replicator Mechanism C");
    }
}

class MiningToolC implements MiningTool {
    @Override
    public void assemble() {
        System.out.println("Assembling Mining Tool C");
    }
}

// Interfejs fabryki abstrakcyjnej
interface ProbeFactory {
    Engine createEngine();
    ReplicatorMechanism createReplicatorMechanism();
    MiningTool createMiningTool();
}

// Fabryki konkretne dla każdej firmy
class CompanyAFactory implements ProbeFactory {
    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public ReplicatorMechanism createReplicatorMechanism() {
        return new ReplicatorMechanismA();
    }

    @Override
    public MiningTool createMiningTool() {
        return new MiningToolA();
    }
}

class CompanyBFactory implements ProbeFactory {
    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public ReplicatorMechanism createReplicatorMechanism() {
        return new ReplicatorMechanismB();
    }

    @Override
    public MiningTool createMiningTool() {
        return new MiningToolB();
    }
}

class CompanyCFactory implements ProbeFactory {
    @Override
    public Engine createEngine() {
        return new EngineC();
    }

    @Override
    public ReplicatorMechanism createReplicatorMechanism() {
        return new ReplicatorMechanismC();
    }

    @Override
    public MiningTool createMiningTool() {
        return new MiningToolC();
    }
}

// Klasa główna do testowania
public class ProbeAssemblyDemo {
    public static void main(String[] args) {
        ProbeFactory factory;
        String company = "A"; // Można zmienić na B lub C w zależności od wyboru użytkownika

        switch (company) {
            case "A":
                factory = new CompanyAFactory();
                break;
            case "B":
                factory = new CompanyBFactory();
                break;
            case "C":
                factory = new CompanyCFactory();
                break;
            default:
                throw new IllegalArgumentException("Unknown company: " + company);
        }

        Engine engine = factory.createEngine();
        ReplicatorMechanism replicator = factory.createReplicatorMechanism();
        MiningTool tool = factory.createMiningTool();

        engine.assemble();
        replicator.assemble();
        tool.assemble();
    }
}
