package OOPHomeWork6;

import java.util.Scanner;

import OOPHomeWork6.Interfases.Model;
import OOPHomeWork6.Interfases.View;



public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp866");
        Model model = new StandartModel();
        View view = new StandartView(scanner);
        new Controller(model, view).start();
    }
}
