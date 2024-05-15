package javaapplication21;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaApplication21 {

    ArrayList listaPersonas = new ArrayList<Persona>();

    public static void main(String[] args) {
        JavaApplication21 prog = new JavaApplication21();
        int op;
        do {
            op = prog.menu();
            switch (op) {
                case 1:
                    prog.agregarJackie();
                    break;
                case 2:
                    prog.agregarOtro();
                    break;

            }

        } while (op != 3);

        prog.imprimirPersonas();
    }

    public int menu() {
        System.out.println("1. Agregar Jackie");
        System.out.println("2. Agregar otra persona");
        System.out.println("3. Salir");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void agregarJackie() {
        Scanner sc = new Scanner(System.in);
        ClassYakieAriza oJackie = new ClassYakieAriza();
        System.out.println("Indique el numero de cedula: ");
        oJackie.setId(sc.nextInt());
        this.setPersona(oJackie);
    }

    public void agregarOtro() {
        classPepito oOtro = new classPepito();
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el pseudonimo de la persona: ");
        oOtro.setPseudonimo(sc.nextLine());
        System.out.println("Indique el numero de cedula: ");
        oOtro.setId(sc.nextInt());
        this.setPersona(oOtro);
    }

    public void imprimirPersonas() {
        Persona oP;
        for (int i = 0; i < this.listaPersonas.size(); i++) {
            oP = (Persona) this.listaPersonas.get(i);
            System.out.println(oP);

        }
    }

    public void setPersona(Persona oPersona) {
        this.listaPersonas.add(oPersona);
    }

}
