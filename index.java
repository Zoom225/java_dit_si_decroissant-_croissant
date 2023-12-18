import java.util.Scanner;

public class index{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'introduire 10 nombres
        int[] tableau = new int[10];
        System.out.println("Veuillez entrer 10 nombres entiers : ");
        for (int i = 0; i < 10; i++) {
            tableau[i] = scanner.nextInt();
        }

        // Afficher le tableau
        System.out.println("Tableau : ");
        afficherTableau(tableau);

        // Vérifier le type du tableau
        if (estCroissant(tableau)) {
            System.out.println("Le tableau est croissant.");
        } else if (estDecroissant(tableau)) {
            System.out.println("Le tableau est décroissant.");
        } else if (estConstant(tableau)) {
            System.out.println("Le tableau est constant.");
        } else {
            System.out.println("Le tableau est quelconque.");
        }

        // Fermer le scanner
        scanner.close();
    }

    // Méthode pour afficher un tableau
    private static void afficherTableau(int[] tableau) {
        for (int nombre : tableau) {
            System.out.print(nombre + " ");
        }
        System.out.println();
    }

    // Méthode pour vérifier si le tableau est croissant
    private static boolean estCroissant(int[] tableau) {
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < tableau[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Méthode pour vérifier si le tableau est décroissant
    private static boolean estDecroissant(int[] tableau) {
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > tableau[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Méthode pour vérifier si le tableau est constant
    private static boolean estConstant(int[] tableau) {
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] != tableau[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
