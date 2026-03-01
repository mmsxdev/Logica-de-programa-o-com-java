package br.com.ex_30set2;

public class Zoologico {
    public static void main(String[] args) {
        Animal[] animais = {
                new Cachorro("Rex", 3, "Mamifero" ,"Labrador"),
                new Gato("Josoarez", 2, "Mamifero",true),
                new Passaro("Piupiu", 1, "Aves",15.5),
                new Peixe("Nemo", 1, "Peixe", 1.2,"Danionella cerebrum",true)
        };

        System.out.println("=== SOM DOS ANIMAIS ===");
        for (Animal animal : animais) {
            animal.emitirSom(); // Polimorfismo em ação
        }

        System.out.println("\n=== MOVIMENTO ===");
        for (Animal animal : animais) {
            animal.mover();
        }

        System.out.println("\n=== INFORMACOES DETALHADAS ===");
        for (Animal animal : animais) {
            animal.exibirInfo();

            // Downcasting seguro
            if (animal instanceof Cachorro) {
                ((Cachorro) animal).abanarRabo();
            }
            System.out.println("---");
        }
    }
}