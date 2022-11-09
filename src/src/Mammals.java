abstract class Mammals implements Animals, Name {
    abstract int paws();

    public String voice() {
        return "Голос!";
    }
}


class Wolf extends Mammals {
    public String nameOfAnimal() {
        return "Wolf";
    }

    @Override
    public String voice() {
        return "Wooo!";
    }

    public boolean canBite() {
        return true;
    }

    int paws() {
        return 4;
    }

    public void info() {
        System.out.println("Name: " + this.nameOfAnimal());
        System.out.println("Can bite: " + this.canBite());
        System.out.println("Has " + this.paws() + " paws.");
        System.out.println("Voice: " + this.voice());
    }


    public Wolf clone() {
        try {
            Wolf clone = (Wolf) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}


class Fox extends Mammals {


    public String nameOfAnimal() {
        return "Fox";
    }

    @Override
    public String voice() {
        return "What does the fox say?";
    }


    public boolean canBite() {
        return true;
    }


    int paws() {
        return 4;
    }

    public void info() {
        System.out.println("Name: " + this.nameOfAnimal());
        System.out.println("Can bite: " + this.canBite());
        System.out.println("Has " + this.paws() + " paws.");
        System.out.println("Voice: " + this.voice());
    }
}