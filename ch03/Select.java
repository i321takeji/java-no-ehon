package ch03;

/**
 * switch 文, p.61
 */

class Select {
    public static void main(String[] args) {
        for (int a = 5; a <= 8; a++) {
            System.out.print(a + " ÷ 3 = " + a / 3);

            switch (a % 3) {
                case 1:
                    System.out.println(" : あまりは 1 です．");
                    break;
                case 2:
                    System.out.println(" : あまりは 2 です．");
                    break;
                default:
                    System.out.println(" : あまりは 0 です．");
                    break;
            }
        }
    }
}
